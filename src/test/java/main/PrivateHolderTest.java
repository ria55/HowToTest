package main;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class PrivateHolderTest {

    @Test
    void test_getGreeting() {
        PrivateHolder holder = new PrivateHolder();
        Method method = getClassMethod("getGreeting");

        Object result1 = invokeMethod(holder, method, 0);
        assertEquals("Hello", result1.toString());

        Object result2 = invokeMethod(holder, method, -1);
        assertEquals("Hello", result2.toString());

        Object result3 = invokeMethod(holder, method, 200);
        assertEquals("Hello", result3.toString());

        Object result4 = invokeMethod(holder, method, 1);
        assertEquals("Welcome", result4.toString());
    }

    @Test
    void test_addGreeting() {
        PrivateHolder holder = new PrivateHolder();
        Method method = getClassMethod("addGreeting");

        assertEquals(5, holder.getGreetings().length);

        invokeMethod(holder, method, "Meow!");
        assertEquals(6, holder.getGreetings().length);
        assertEquals("Meow!", holder.getGreetings()[5]);

        invokeMethod(holder, method, "Welcome to Hell");
        assertEquals(7, holder.getGreetings().length);
        assertEquals("Welcome to Hell", holder.getGreetings()[6]);
    }

    /**
     * Ez a tesztek segédmetódusa, maga nem tesztel semmit.
     * Kikeresi a tesztelendő osztály (PrivateHolder) adott nevű metódusát,
     * és visszatér magával a metódussal.
     * A "getDeclaredMethods()" minden metódust (legyen az public vagy private)
     * visszaad. Azaz jelen esetben 3 eleme van:
     *      getGreetings
     *      getGreeting
     *      addGreeting
     * Azonban nem biztos, hogy ugyanebben a sorrendben.
     */
    private Method getClassMethod(String methodName) {
        Method[] methods = PrivateHolder.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                return method;
            }
        }

        return null;
    }

    /**
     * Szintén a tesztek segédmetódusa, maga nem tesztel.
     * A metódus objektumának (Method method nevű bemeneti paraméter) átállítja a
     * láthatóságát - private metódusokat ugyanis nem lehet "kívülről" végrehajtani,
     * ugyebár. Ezután az "invoke()" metódussal végrehajtja a metódust.
     * (Nem baj, ha nem teljesen érted. Csak gondoltam, mutatom, hogy ilyet is lehet. ;) )
     */
    private Object invokeMethod(PrivateHolder clazz, Method method, Object methodArg) {
        try {
            method.setAccessible(true);
            return method.invoke(clazz, methodArg);
        } catch (Exception e) {
            throw new RuntimeException("Cannot invoke method.");
        }
    }

}