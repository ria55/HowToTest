package main;

/**
 * Ez az osztály azért tartalmaz private metódusokat, hogy kiderüljön,
 * milyen módszerrel lehet ezeket (is) tesztelni. Lásd a teszt osztályt!
 */
public class PrivateHolder {

    private String[] greetings;

    public PrivateHolder() {
        greetings = new String[]{"Hello", "Welcome", "Welcome here", "Hi", "Nice to meet you"};
    }

    public String[] getGreetings() {
        return greetings;
    }

    private String getGreeting(int index) {
        if (index >= 0 && index < greetings.length) {
            return greetings[index];
        }

        return greetings[0];
    }

    private void addGreeting(String greeting) {
        String[] temp = new String[greetings.length + 1];

        for (int i = 0; i < greetings.length; i++) {
            temp[i] = greetings[i];
        }

        temp[greetings.length] = greeting;

        greetings = temp;
    }

}
