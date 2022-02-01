package main;

public class TasksForIfAndSwitch {

    /**
     * A condition nevű változó az if elágazás feltétele.
     * <br>
     * Add meg ennek a változónak az adattípusát!
     */
    public static String practiceIf(int number) {
        boolean condition = number == 42;

        if (condition) {
            return "This is The Number!";
        }

        return "";
    }

    /**
     * A decreaseNumber nevű metódus kivonja a number nevű bemeneti paraméter értékéből a decreaseBy értékét,
     * ha a number nagyobb decreaseBy-nál. Máskülönben nullával tér vissza.
     */
    public static int decreaseNumber(int number, int decreaseBy) {
        if (number > decreaseBy) {
            return number - decreaseBy;
        }
        return 0;
    }

    /**
     * A divideNumber nevű metódus elosztja a bemeneti paraméterként kapott number nevű változót a divisor nevűvel,
     * ha divisor értéke nem nulla. (Nem osztunk nullával, ugyebár.)<br>
     * Ha divisor mégis nulla, akkor a metódus is nullával tér vissza.
     */
    public static int divideNumber(int number, int divisor) {
        if (divisor != 0) {
            return number / divisor;
        }
        return 0;
    }

    /**
     * A checkIfNegative nevű metódus megvizsgálja a number nevű bemeneti paraméter értékét.
     * <br>
     * Ha az negatív, akkor a "negatív" szöveggel tér vissza. Máskülönben a "nem negatív" szöveggel.
     */
    public static String checkIfNegative(int number) {
        if (number < 0) {
            return "negatív";
        }
        return "nem negatív";
    }

    /**
     * A checkDivibleBy3 nevű metódus megvizsgálja, hogy a number nevű bemeneti paraméter értéke osztható-e hárommal vagy sem.
     * <br>
     * Ha osztható, akkor azzal a szöveggel tér vissza, hogy "osztható".
     * <br>
     * Ha pedig nem osztható, akkor azzal, hogy "nem osztható".
     * <br>
     * Oldd meg a feladatot háromlábú operátor használatával!
     */
    public static String checkDivisibleBy3(int number) {
        String result = number % 3 == 0 ? "osztható" : "nem osztható";

        return result;
    }

    /**
     * A checkGender nevű metódus megvizsgálja a gender nevű bemeneti paraméter értékét.
     * <br>
     * Ha az 0, akkor a "nő" szöveggel tér vissza.
     * <br>
     * Ha 1, akkor a "férfi" szöveggel.
     * <br>
     * Máskülönben pedig azzal, hogy "valami más".
     */
    public static String checkGender(int gender) {
        if (gender == 0) {
            return "nő";
        } else if (gender == 1) {
            return "férfi";
        } else {
            return "valami más";
        }
    }

    /**
     * A sayHello nevű metódus megvizsgálja az age nevű bemeneti paraméter értékét.
     * <br>
     * Ha az <strong>0 és 3 közötti</strong> (beleértve a szélső értékeket),
     * akkor a <strong>"Gügyü-bügyü, babuciii!"</strong> szöveggel tér vissza.
     * <br>
     * Ha <strong>3-nál nagyobb és 10-nél kisebb vagy egyenlő</strong>,
     * akkor a <strong>"Szióka!"</strong> szöveggel.
     * <br>
     * Ha <strong>10-nél nagyobb és 17-nél kisebb vagy egyenlő</strong>,
     * akkor a <strong>"Szervusz!"</strong> szöveggel.
     * <br>
     * Ha <strong>18-nál nagyobb vagy egyenlő</strong>,
     * akkor a <strong>"Jó napot kívánok!"</strong> szöveggel.
     * <br>
     * Negatív számok esetén pedig azzal, hogy <strong>"Hello, Marty McFly!"</strong>
     */
    public static String sayHello(int age) {
        if (age < 0) {
            return "Hello, Marty McFly!";
        } else if (age < 4) {
            return "Gügyü-bügyü, babuciii!";
        } else if (age < 11) {
            return "Szióka!";
        } else if (age < 18) {
            return "Szervusz!";
        } else {
            return "Jó napot kívánok!";
        }
    }

    /**
     * A calculate nevű metódus elvégzi a kívánt műveletet a number1 és a number2 nevű bemeneti paraméterek értékeivel.
     * <br>
     * A kívánt műveletet az operation nevű bemeneti paraméter határozza meg az alábbiak szerint:
     *
     * <ul>
     *     <li>ha '+', akkor összeadást végez</li>
     *     <li>ha '-', akkor kivonást végez</li>
     *     <li>ha '*', akkor szorzást végez</li>
     *     <li>ha '/', akkor osztást végez</li>
     * </ul>
     *
     * Más műveleteket nem hajt végre.
     * <br>
     * Az eredményt a result nevű változóban tárolja, és ezt adja vissza.
     */
    public static String calculate(int number1, int number2, char operation) {
        String result;

        switch (operation) {
            case '+':
                result = "" + (number1 + number2);
                break;
            case '-':
                result = "" + (number1 - number2);
                break;
            case '*':
                result = "" + (number1 * number2);
                break;
            case '/':
                result = "" + (number1 / number2);
                break;
            default:
                result = "";
        }

        return result;
    }

    /**
     * Az alábbi két getSeason() metódus ugyanazt csinálja. Az első a hónap nevét kéri, a második a hónap számát.
     * Ezeknek megfelelően adja vissza annak az évszaknak a nevét, amelyhez a hónap tartozik.
     * <br>
     * (Tesztelés szempontjából izgalmas ez a két feladat, lásd: TasksForIfAndSwitchSpecialTest)
     */
    public static String getSeason(String month) {
        String season = "ismeretlen";

        switch (month) {
            case "december":
            case "január":
            case "február":
                season = "tél";
                break;
            case "március":
            case "április":
            case "május":
                season = "tavasz";
                break;
            case "június":
            case "július":
            case "augusztus":
                season = "nyár";
                break;
            case "szeptember":
            case "október":
            case "november":
                season = "ősz";
        }

        return season;
    }

    public static String getSeason(int month) {
        String season = "ismeretlen";

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "tél";
                break;
            case 3:
            case 4:
            case 5:
                season = "tavasz";
                break;
            case 6:
            case 7:
            case 8:
                season = "nyár";
                break;
            case 9:
            case 10:
            case 11:
                season = "ősz";
        }

        return season;
    }

}
