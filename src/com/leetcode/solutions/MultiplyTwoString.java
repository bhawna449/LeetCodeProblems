package com.leetcode.solutions;

public class MultiplyTwoString {

    public static void main(String[] args) {
        System.out.println(multiply("123456789", "987654321"));
    }

    public static String multiply(String num1, String num2) {

        
        if (num1.equals("0") || num2.equals("0"))
            return "0";

        StringBuilder finalValue = new StringBuilder();
        int couteri = 0;
        int couterj = 0;
        int zeroCouter = 0;
        int carry = 0;

        int length = num1.length() + num2.length();
        int[][] result = new int[length][length];

        for (int i = num2.length() - 1; i >= 0; i--) {
            
            couterj = 0;
            for (int k =0; k < zeroCouter; k++) {
                result[couteri][couterj] = 0;
                couterj++;
            }
            carry =0;
            int posNum2 = num2.charAt(i) - '0';
            for (int j = num1.length() - 1; j >= 0; j--) {
                int posNum1 = num1.charAt(j) - '0';
                int mul = Integer.valueOf(posNum1) * Integer.valueOf(posNum2);
                result[couteri][couterj] = j == '0' ? mul + carry : (mul +carry) %10;
                carry = mul / 10;
                couterj++;
            }
            couteri++;
            zeroCouter++;
        }
        
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                 sum = sum +result[j][i];
            }
            finalValue.append(sum %10);
            sum = sum /10;
        }
        return finalValue.reverse().toString().replaceFirst("^0*", "");

    }
}
