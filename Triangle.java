/*
3) Triangle Type
Question: Write a Java program that asks the user to enter the lengths of three sides of a triangle. The program should then determine whether the triangle is equilateral, isosceles, or scalene. An equilateral triangle has all three sides equal, an isosceles triangle has two sides equal, and a scalene triangle has all sides different.
Expected Output: If the user inputs "5", "5", and "5", the program should output: "The triangle is equilateral." If the user inputs "5", "5", and "7", the program should output: "The triangle is isosceles." If the user inputs "3", "4", and "5", the program should output: "The triangle is scalene."

*/
import java.util.*;
class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
        if(a==b && b==c) System.out.println("The triangle is equilateral.");
        else if(a==b||b==c||a==c) System.out.println("The triangle is isosceles.");
        else System.out.println("The triangle is scalene.");
    }
}
