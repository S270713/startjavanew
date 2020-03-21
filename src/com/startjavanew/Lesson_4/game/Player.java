package com.startjavanew.Lesson_4.game;

import java.util.Arrays;

public class Player {

    private int[] attempts = new int[10];//поле для хранения введенных чисел
    private String name;
    private int numberOfAttempt;//номер варианта(попытки)

    public Player(String name) {
        this.name = name;
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, numberOfAttempt+1);
    }
    //геттер для очистки массива
    public int[] getAttemptsZero() {
        return attempts;
    }

    public void setAttempts(int index, int number) {
        attempts[index] = number;
    }

    public String getName() {
        return name;
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
}