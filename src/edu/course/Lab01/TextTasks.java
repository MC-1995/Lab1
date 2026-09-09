package edu.course.Lab01;

public class TextTasks {

    public static String reverse(String s) {
        char[] reversed = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            reversed[i] = s.charAt(s.length() - 1 - i);
        }
        String result = "";
        for (char c : reversed) result += c;
        System.out.println(result);
        return result;
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }

            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                System.out.println("Не палиндром");
                return false;
            }

            left++;
            right--;
        }
        System.out.println("Палиндром");
        return true;

    }



}
