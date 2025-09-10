/*
2) Largest of Three Numbers

Question: Write a Java program that asks the user to enter three integers. The program should then determine and print the largest of the three numbers.
Expected Output: If the user inputs "12", "7", and "20", the program should output: "The largest number is 20."
*/

import java.util.*;
class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
        System.out.println("The largest number is "+(a>b?(a>c?a:c):(b>c?b:c)));
    }
}
