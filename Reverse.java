/*
5) Question: Write a Java program that asks the user to enter an integer. The program should then reverse the digits of the number and print the reversed number.
Expected Output: If the user inputs "1234", the program should output: "The reversed number is 4321."
*/
import java.util.*;
class Reverse {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt(), rev=0;
        while(n>0){rev=rev*10+n%10;n/=10;}
        System.out.println("The reversed number is "+rev);
    }
}
