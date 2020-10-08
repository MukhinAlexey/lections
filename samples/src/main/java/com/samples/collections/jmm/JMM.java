package com.samples.collections.jmm;

public class JMM {

    public static void main(String[] args) {
        Thread thread1 = new Thread();
        Thread thread2 = new Thread();
    }

    public int findResult(int n) {
        int number = 0;
        for (int i = 0; i < n; i+=2) {
            for (int j = 0; j < i; j++) {
                number++;
            }
        }
        return number;
    }

}
