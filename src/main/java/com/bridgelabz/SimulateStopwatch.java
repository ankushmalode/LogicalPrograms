package com.bridgelabz;

import java.util.Scanner;

public class SimulateStopwatch {
    long startTime = 0;
    long stopTime = 0;
    long elapsedTime = 0;

    public void startT() {
        startTime = System.currentTimeMillis();
//        System.out.println("Stopwatch start time is " + startTime);

    }

    public long stopT() {
        stopTime = System.currentTimeMillis();
//        System.out.println("Stopwatch stop time is " + stopTime);

        elapsedTime = stopTime - startTime;
        return elapsedTime;
    }

    public static void main(String[] args) {
        Scanner watch = new Scanner(System.in);
        SimulateStopwatch stopwatch = new SimulateStopwatch();
        System.out.println("To start the StopWatch please enter 1");
        int start = watch.nextInt();
        if (start == 1) {
            stopwatch.startT();
            System.out.println("To stop the StopWatch please enter 2");
            int stop = watch.nextInt();
            if (stop == 2) {
                stopwatch.stopT();
                long time = stopwatch.stopT();
                System.out.println("Total Time Elapsed(in millisec) is: " + time);
                System.out.println("Total Time Elapsed(in second) is: " + (time / 1000));
            }
        } else
            System.out.println("you have to enter 1 to start the stopwatch.");
    }
}
