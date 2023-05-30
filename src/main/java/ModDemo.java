public class ModDemo {
    /**
     * Демонстрация использования операции %
     */
    public static void main(String[] args) {
        int iresult, irem;
        double dreresult, drem;

        iresult = 10 / 3;
        irem = 10 % 3;

        dreresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;

        System.out.println("Результат и остаток от деления 10 / 3: " + iresult + " " + irem);
        System.out.println("Результать и остаток от деления 10.0 / 3.0: " + dreresult + " " + drem);
    }
}
