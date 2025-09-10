/* 
8. Write a Java Program to get the following O/p.

*
* * *
* * * * *
* * * * * * *
* * * * * * * * *
* * * * * * *
* * * * *
* * *
*
 */
class Pattern {
    public static void main(String[] args) {
        for(int i=1;i<=9;i+=2){for(int j=1;j<=i;j++) System.out.print("* ");System.out.println();}
        for(int i=7;i>=1;i-=2){for(int j=1;j<=i;j++) System.out.print("* ");System.out.println();}
    }
}
