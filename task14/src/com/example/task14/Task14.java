package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        StringBuilder valueInString = new StringBuilder(Integer.toString(value));
        return Integer.parseInt(valueInString.reverse().toString());
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }


}
