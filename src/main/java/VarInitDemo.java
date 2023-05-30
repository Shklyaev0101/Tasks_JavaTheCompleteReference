public class VarInitDemo {
    //Демонстрация времени жизни переменной

    public static void main(String[] args) {
        int x;

        for (x = 0;  x < 3; x++) {
            int y = -1; //переменная "у" инициализируется при каждом входе в блок
            System.out.println("y: " + y);  //всегда вводится значение -1
            y = 100;
            System.out.println("Изменение значение у: " + y);
        }
    }
}
