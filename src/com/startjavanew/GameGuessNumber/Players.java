package com.startjavanew.GameGuessNumber;
//Класс описания игроков-объектов.

import java.util.Arrays;

public class Players {
    private int[] attempts = new int[10];//поле-массив для хранения введенных чисел

    private String name;// имя игроков

    private int numberOfAttempt;//номер варианта(попытки)

    public Players(String name) {
        this.name = name;
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, numberOfAttempt);
    }

    //возвращает последнее введенное игроком число:
    public int getAttempt() {
        return attempts[numberOfAttempt - 1];
    }

    public void setAttempt(int number) {
        attempts[numberOfAttempt] = number;
        numberOfAttempt++;
    }

    public String getName() {
        return name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfAttempt() {
        return numberOfAttempt;
    }

    public void setNumberOfAttempt(int numberOfAttempt) {
        this.numberOfAttempt = numberOfAttempt;
    }

    //очистка заполненных вариантов
    public void clearNumbers(Players players) {
        Arrays.fill(players.attempts, 0, numberOfAttempt, 0);
    }
}