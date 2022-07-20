package ru.netology.sqr.quantityofsqr.services;

public class SQRService {
    public int calcSQR(int minBorder, int maxBorder) {
        int count = 0;
        for (int i = 10; i <= 99; i = i + 1) {
            if (i * i < minBorder) {

                continue;
            }
            if (i * i > maxBorder) {
                break;
            }
            count++;
        }
        return count;
    }
}


