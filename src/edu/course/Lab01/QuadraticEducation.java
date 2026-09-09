package edu.course.Lab01;

public class QuadraticEducation {

    private int disksr;
    private int a, b, c;
    private float x = 0.0f, x1 = 0.0f, x2 = 0.0f;

    public QuadraticEducation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.solve();
    }

    public void setDiskr() {
        this.disksr = b * b - 4 * a * c;
    }

    public void solve() {
        if (a == 0) {
            System.out.println("Ошибка: уравнение не квадратное (a = 0).");
            return;
        }

        setDiskr();

        if (disksr < 0) {
            System.out.println("Вещественных корней нет.");
        } else if (disksr == 0) {
            x = -b / (2 * a);
            System.out.println("Один корень:");
            System.out.println("x = " + getX());
        } else {
            double sqrtD = Math.sqrt(disksr);
            x1 = (float) (-b + sqrtD) / (2 * a);
            x2 = (float) (-b - sqrtD) / (2 * a);
            System.out.println("Два корня:");
            System.out.println("x1 = " + getX1());
            System.out.println("x2 = " + getX2());
        }
    }

    public float getX() {return x;}
    public float getX1() {return x1;}
    public float getX2() {return x2;}
}
