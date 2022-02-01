package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TasksForIfAndSwitchTest {

    @Test
    void test_practiceIf() {
        String result1 = TasksForIfAndSwitch.practiceIf(0);
        assertEquals("", result1);

        String result2 = TasksForIfAndSwitch.practiceIf(42);
        assertEquals("This is The Number!", result2);
    }

    @Test
    void test_decreaseNumber() {
        int result1 = TasksForIfAndSwitch.decreaseNumber(6, 5);
        assertEquals(1, result1);

        int result2 = TasksForIfAndSwitch.decreaseNumber(5, 5);
        assertEquals(0, result2);

        int result3 = TasksForIfAndSwitch.decreaseNumber(0, 5);
        assertEquals(0, result3);
    }

    @Test
    void test_divideNumber() {
        int result1 = TasksForIfAndSwitch.divideNumber(10, 5);
        assertEquals(2, result1);

        int result2 = TasksForIfAndSwitch.divideNumber(10, -5);
        assertEquals(-2, result2);

        int result3 = TasksForIfAndSwitch.divideNumber(0, 0);
        assertEquals(0, result3);

        int result4 = TasksForIfAndSwitch.divideNumber(0, 5);
        assertEquals(0, result4);

        int result5 = TasksForIfAndSwitch.divideNumber(10, 0);
        assertEquals(0, result5);
    }

    @Test
    void test_checkIfNegative() {
        String result1 = TasksForIfAndSwitch.checkIfNegative(-10);
        assertEquals("negatív", result1);

        String result2 = TasksForIfAndSwitch.checkIfNegative(0);
        assertEquals("nem negatív", result2);

        String result3 = TasksForIfAndSwitch.checkIfNegative(10);
        assertEquals("nem negatív", result3);
    }

    @Test
    void test_checkDivisibleBy3() {
        String result1 = TasksForIfAndSwitch.checkDivisibleBy3(0);
        assertEquals("osztható", result1);

        String result2 = TasksForIfAndSwitch.checkDivisibleBy3(1);
        assertEquals("nem osztható", result2);

        String result3 = TasksForIfAndSwitch.checkDivisibleBy3(3);
        assertEquals("osztható", result3);

        String result4 = TasksForIfAndSwitch.checkDivisibleBy3(10);
        assertEquals("nem osztható", result4);

        String result5 = TasksForIfAndSwitch.checkDivisibleBy3(30);
        assertEquals("osztható", result5);
    }

    @Test
    void test_checkGender() {
        String result1 = TasksForIfAndSwitch.checkGender(0);
        assertEquals("nő", result1);

        String result2 = TasksForIfAndSwitch.checkGender(1);
        assertEquals("férfi", result2);

        String result3 = TasksForIfAndSwitch.checkGender(-1);
        assertEquals("valami más", result3);

        String result4 = TasksForIfAndSwitch.checkGender(2);
        assertEquals("valami más", result4);
    }

    @Test
    void test_sayHello() {
        String negative1 = TasksForIfAndSwitch.sayHello(-1);
        assertEquals("Hello, Marty McFly!", negative1);
        String negative2 = TasksForIfAndSwitch.sayHello(-33);
        assertEquals("Hello, Marty McFly!", negative2);

        String baby1 = TasksForIfAndSwitch.sayHello(0);
        assertEquals("Gügyü-bügyü, babuciii!", baby1);
        String baby2 = TasksForIfAndSwitch.sayHello(2);
        assertEquals("Gügyü-bügyü, babuciii!", baby2);
        String baby3 = TasksForIfAndSwitch.sayHello(3);
        assertEquals("Gügyü-bügyü, babuciii!", baby3);

        String younger1 = TasksForIfAndSwitch.sayHello(4);
        assertEquals("Szióka!", younger1);
        String younger2 = TasksForIfAndSwitch.sayHello(7);
        assertEquals("Szióka!", younger2);
        String younger3 = TasksForIfAndSwitch.sayHello(10);
        assertEquals("Szióka!", younger3);

        String older1 = TasksForIfAndSwitch.sayHello(11);
        assertEquals("Szervusz!", older1);
        String older2 = TasksForIfAndSwitch.sayHello(13);
        assertEquals("Szervusz!", older2);
        String older3 = TasksForIfAndSwitch.sayHello(17);
        assertEquals("Szervusz!", older3);

        String adult1 = TasksForIfAndSwitch.sayHello(18);
        assertEquals("Jó napot kívánok!", adult1);
        String adult2 = TasksForIfAndSwitch.sayHello(108);
        assertEquals("Jó napot kívánok!", adult2);
    }

    @Test
    void test_calculate() {
        String result1 = TasksForIfAndSwitch.calculate(10, 3, '+');
        assertEquals("13", result1);

        String result2 = TasksForIfAndSwitch.calculate(10, 3, '-');
        assertEquals("7", result2);

        String result3 = TasksForIfAndSwitch.calculate(10, 3, '*');
        assertEquals("30", result3);

        String result4 = TasksForIfAndSwitch.calculate(10, 3, '/');
        assertEquals("3", result4);

        String result5 = TasksForIfAndSwitch.calculate(10, 3, 'a');
        assertEquals("", result5);
    }

}