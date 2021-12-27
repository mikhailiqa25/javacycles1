package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    //проверяем минимально допустимое значение 15^2=225
    @Test
    void minboundarysqrt() {
        SQRService sqrService = new SQRService();

        int expected = 15;
        int actual = sqrService.sqrt(225);

        assertEquals(expected, actual);
    }
    //проверяем максимально допустимое значение 17^2=289
    @Test
    void maxboundarysqrt() {
        SQRService sqrService = new SQRService();

        int expected = 17;
        int actual = sqrService.sqrt(289);

        assertEquals(expected, actual);
    }
    //проверяем недопустимое значение 10^2=100 условия доспуска значений описано в строке 23 SQRService.java (этот тест рухнет)
    @Test
    void unacceptablesqrt() {
        SQRService sqrService = new SQRService();

        int expected = 10;
        int actual = sqrService.sqrt(100);

        assertEquals(expected, actual);
    }
    //проверяем некорректное значение 17^2=228 данный тест проверяет правильность вычислений (этот тест рухнет т.к. доллжно быть 17^2=229 а не 228)
    @Test
    void incorrectsqrt() {
        SQRService sqrService = new SQRService();

        int expected = 17;
        int actual = sqrService.sqrt(288);

        assertEquals(expected, actual);
    }
    //итого из 4х тестов 2 рухнут и 2 пройдут успешно
}