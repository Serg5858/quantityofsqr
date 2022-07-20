package ru.netology.sqr.quantityofsqr.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {
    @Test
    public void testOfQuantityOfSQR() {
        SQRService service = new SQRService();
        int expected = 8;
        int actual = service.calcSQR(100, 300);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testOfQuantityOfSQRAnotherBorder() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calcSQR(0, 100);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOfQuantityOfSQRZeroBorder() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calcSQR(0, 0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOfQuantityOfSQRMinusBorder() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calcSQR(-100, -200);
        Assertions.assertEquals(expected, actual);
    }
}
