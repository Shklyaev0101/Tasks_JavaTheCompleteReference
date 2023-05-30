public class NestVar {
    //*** Эта программа не пройдет компиляцию ***

    public static void main(String[] args) {
        int count;

        for (count = 0; count < 10;count++) {
            System.out.println("Значение count: " + count);
        }

        //int count;  //Недопустимо!!! (т.к. ранее уже была объявлена)
        for (count = 0; count < 2; count++) {
            System.out.println("В этой программе есть ошибка!");
        }
    }
}
