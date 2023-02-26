package ru.hse.edu;

import java.util.List;

public class Counter extends Thread{
    static int iterator;
    static int sum;
    static int length;
    static List<String> data;

    public Counter() {
        if (data == null) {
            throw new RuntimeException("sad");
        }
    }

    public Counter(List<String> data) {
        Counter.data = data;
        Counter.length = data.size();
        Counter.sum = 0;
        Counter.iterator = 0;
    }

    @Override
    public void run() {
        while (iterator < length) {
            synchronized (this) {
                sum += data.get(iterator).length();
                iterator++;
            }
        }
    }
}
