public class Inches {
    //Расчет числа кубических дюймов в кубе объемом в 1 куб. милю.

    public static void main(String[] args) {
        long a;
        long b;

        b = 5280 * 12;
        a = b * b * b;

        System.out.println("В одной кубической мили содержится " + a + " кубических дюймов");
    }
}
