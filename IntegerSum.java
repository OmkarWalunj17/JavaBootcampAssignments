import java.util.Scanner;

class IntegerSum{
    public static void main(String args[]){

        // Write a function that takes a positive integer n and returns the sum of all integers from 1 to n.

        // User Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        // Temp Variable
        int temp = n*(n+1);
        int sum = temp/2;
        
        // Output 
        System.out.println("Sum from 1 to " + n + " is: " + sum);

    }

}