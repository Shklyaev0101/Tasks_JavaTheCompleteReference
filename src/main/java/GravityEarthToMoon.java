public class GravityEarthToMoon {
    /*
    Программа вычисляющая вес человека на луне.
    Сила тяжести на Луне составляет около 17 % земной.
    */

    public static void main(String[] args) {
        double weightHumanInEarth = 96.3;
        double weightHumanInMoon = weightHumanInEarth * 0.17;

        System.out.println("Когда вес человека на земле равен: " + weightHumanInEarth +
                            " ,то вес человека на Луне равен: " + weightHumanInMoon);
    }
}
