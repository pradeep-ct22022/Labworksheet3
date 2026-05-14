package q01;

import java.util.Scanner;

public class Q1 {
    static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the 1st number :");
            int num1 = sc.nextInt();
            System.out.println("Enter the 2nd number :");
            int num2 = sc.nextInt();
            System.out.println("Enter the 3rd number :");
            int num3 = sc.nextInt();
            int smallest = num1;
            if(num1>num2){
                smallest=num2;

            }else if(num2>num3){
                smallest = num3;
            }
            System.out.println("The Smallest Number is :"+smallest);

    }
}
