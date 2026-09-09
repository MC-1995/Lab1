package edu.course.Lab01;

public class SeriesCalculator {
    public static void run() {
        double sum = 0.0;
        int n = 2;
        int count = 0;

        while (true) {
            double term = 1.0 / (n * n + n - 2);
            if (Math.abs(term) < 1e-6) {
                break;
            }
            sum += term;
            count++;
            n++;
        }

        System.out.println(sum);
        System.out.println(n - 1);
        System.out.println(count);
    }
}
