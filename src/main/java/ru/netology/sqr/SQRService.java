package ru.netology.sqr;

public class SQRService {

    // Как вариант этот код имеет право на жизнь и даже работает, выводит все шоколадно мол только числа 15,16,17 подходят, но мне нужно написать автотест и избегать метода main :(
//    public static void main(String[] args) {
//        for (int i = 10; i < 100; i++) {
//            if (i * i > 200 && i * i < 300)
//            System.out.println("Квадрат" + i + "больше 200 но меньше 300");
//        }
//        System.out.println("Вышли из цикла");
    //Пример с занятия который работает но не выполняет условий, попробую включить голову тк нелюблю выносить мозги преподавателям фразой "у меня тут что то не получается..."
//    public int sqrt(int num){
//        for (int i = 10; i < num ; i++) {
//            if (i * i == num) {
//                return i;
//            }
//        }
//            return 0;
    //надеюсь тут правильно описал все условия.
    public int sqrt(int num){
        for (int i = 10; i < num && i < 100; i++) {
            if (i * i == num && i * i < 300 && i * i > 200) {
                return i;
            }
        }
            return 0;
    }
}
