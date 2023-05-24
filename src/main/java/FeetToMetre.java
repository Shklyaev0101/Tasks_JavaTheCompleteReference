public class FeetToMetre {
    //Таблица перевода дюймов в метры

    public static void main(String[] args) {
        double feet, metre;
        int counter;

        counter = 0;
        for (feet = 1; feet <= 100; feet++) {
            metre = feet * 39.37;
            System.out.println(feet + " дюймам соответствует " + metre + " метров.");
            counter++;

            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
