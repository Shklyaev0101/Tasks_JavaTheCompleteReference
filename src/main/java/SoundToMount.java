public class SoundToMount {
    //Рассчитать скорость звука до гор
    //хлопаем в ладоши и считаем время до эхо
    //делим на 2 и получаем количество секунд достижения звуком в одну сторону до гор

    public static void main(String[] args) {

        double soundTimeToMountTB = 3.4;    //время туда и обратно звука
        double soundT;
        int sound = 343;

        soundT = soundTimeToMountTB / 2;
        System.out.println("Время прохождения звука до объекта в прямом и обратном направлении: " + soundTimeToMountTB);
        System.out.println("Время прохождения звука до объекта в одну сторону: " + soundT);

        double dist = soundT * sound;
        System.out.println("Расстояние до объекта: " + dist + " метра.");
    }
}
