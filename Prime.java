/*
6. Prime Number Check

Question: Write a Java program that prompts the user to enter an integer. The program should then determine whether the number is prime and print the result. A prime number is a number that is greater than 1 and has no positive divisors other than 1 and itself.
Expected Output: If the user inputs "7", the program should output: "7 is a prime number." If the user inputs "10", the program should output: "10 is not a prime number."
*/
import java.util.*;
class Prime {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        boolean f=n>1;
        for(int i=2;i<=Math.sqrt(n)&&f;i++) if(n%i==0) f=false;
        System.out.println(n+(f?" is a prime number.":" is not a prime number."));
    }
}

