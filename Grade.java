/*
1) Write a Java program that prompts the user to enter their score (an integer between 0 and 100). The program should then print the corresponding grade based on the following criteria:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59
Expected Output: If the user inputs "85", the program should output: "Your grade is B."
*/
import java.util.*;
class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        if(s>=90) System.out.println("Your grade is A.");
        else if(s>=80) System.out.println("Your grade is B.");
        else if(s>=70) System.out.println("Your grade is C.");
        else if(s>=60) System.out.println("Your grade is D.");
        else System.out.println("Your grade is F.");
    }
}
