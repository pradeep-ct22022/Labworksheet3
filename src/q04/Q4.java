package q04;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year :");
        int year = sc.nextInt();

        if(year%4 == 0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println("Its a leap Year");
                }else {
                    System.out.println("its no a leap year");
                }

            }else{
                System.out.println("It's a leap Year");
            }

        }else{
            System.out.println("It's not a leap Year");
        }
    }

}
