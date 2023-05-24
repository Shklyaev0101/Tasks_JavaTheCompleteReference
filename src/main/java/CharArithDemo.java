public class CharArithDemo {
    //С символьными переменными можно обращаться, как с целочисленными

    public static void main(String[] args) {
        char a = 'X';
        System.out.println("a содержит " + a);

        a++;    //переменную а можно инкрементировать
        System.out.println("теперь а содержит " + a);

        a = 90; //присвоить переменной целочисленное значение Z
        System.out.println("теперь а содержит " + a);
    }
}
