package edu.course.Lab01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command;
        command = scanner.nextLine();
        switch (command) {
            case "fizzbuzz":
                FizzBuzz fizzBuzz = new FizzBuzz();
                break;
            case "quadratic":
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                QuadraticEducation quadratic = new QuadraticEducation(a, b, c);
                break;
            case "palindrome":
                String palindrome_string = scanner.nextLine();
                TextTasks palindrome = new TextTasks();
                palindrome.isPalindrome(palindrome_string);
                break;
            case "reverse":
                String reverse_string = scanner.nextLine();
                TextTasks reverse = new TextTasks();
                reverse.reverse(reverse_string);
                break;
            case "series":
                SeriesCalculator calc = new SeriesCalculator();
                calc.run();
                break;
            default:
                System.out.println("Нет такой команды");
                break;
        }
    }
}
