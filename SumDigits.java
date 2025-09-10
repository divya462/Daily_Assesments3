/*
7.Sum of Digits

Question: Write a Java program that asks the user to enter an integer. The program should then calculate and print the sum of the digits of the entered number.
Expected Output: If the user inputs "1234", the program should output: "The sum of the digits is 10."
*/
import java.util.*;
class SumDigits {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt(), sum=0;
        while(n>0){sum+=n%10;n/=10;}
        System.out.println("The sum of the digits is "+sum);
    }
}
