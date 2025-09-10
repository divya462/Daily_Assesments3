/*
4) Password Strength

Question: Write a Java program that prompts the user to enter a password. The program should then determine the strength of the password based on the following criteria:
Strong: At least 8 characters, contains both uppercase and lowercase letters, and includes at least one digit and one special character.
Medium: At least 6 characters, contains both uppercase and lowercase letters, and includes at least one digit.
Weak: Does not meet the above criteria.
Expected Output: If the user inputs "P@ssw0rd", the program should output: "Password strength: Strong." If the user inputs "Pass123", the program should output: "Password strength: Medium." If the user inputs "pass", the program should output: "Password strength: Weak."
Reverse a Number
*/
import java.util.*;
class Password {
    public static void main(String[] args) {
        String p=new Scanner(System.in).next();
        boolean up=p.matches(".*[A-Z].*"), low=p.matches(".*[a-z].*"), dig=p.matches(".*\\d.*"), sp=p.matches(".*\\W.*");
        if(p.length()>=8 && up&&low&&dig&&sp) System.out.println("Password strength: Strong.");
        else if(p.length()>=6 && up&&low&&dig) System.out.println("Password strength: Medium.");
        else System.out.println("Password strength: Weak.");
    }
}
