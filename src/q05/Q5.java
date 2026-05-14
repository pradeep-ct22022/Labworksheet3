package q05;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        boolean run = true;

        do {
            System.out.println("\nEnter category number:");
            System.out.println("1. Entree");
            System.out.println("2. Side Dish");
            System.out.println("3. Drink");
            System.out.println("0. Exit");

            int select = sc.nextInt();

            if (select == 0) {
                run = false;
                break;
            }

            switch (select) {
                case 1:
                    System.out.println("\nEntree");
                    System.out.println("1. Tofu Burger    $3.49");
                    System.out.println("2. Cajun Chicken  $4.59");
                    System.out.println("3. Buffalo Wings  $3.99");
                    System.out.println("4. Rainbow Fillet $2.99");
                    break;

                case 2:
                    System.out.println("\nSide Dish");
                    System.out.println("5. Rice Cracker   $0.79");
                    System.out.println("6. No-Salt Fries  $0.69");
                    System.out.println("7. Zucchini       $1.09");
                    System.out.println("8. Brown Rice     $0.59");
                    break;

                case 3:
                    System.out.println("\nDrink");
                    System.out.println("9. Cafe Mocha     $1.99");
                    System.out.println("10. Cafe Latte    $1.90");
                    System.out.println("11. Espresso      $2.49");
                    System.out.println("12. Oolong Tea    $0.99");
                    break;

                default:
                    System.out.println("Invalid category!");
                    continue;
            }

            System.out.print("\nEnter food id: ");
            int food = sc.nextInt();

            System.out.print("Enter quantity: ");
            int count = sc.nextInt();

            double price = 0;
            String item = "";

            switch (food) {
                case 1:
                    item = "Tofu Burger";
                    price = 3.49;
                    break;
                case 2:
                    item = "Cajun Chicken";
                    price = 4.59;
                    break;
                case 3:
                    item = "Buffalo Wings";
                    price = 3.99;
                    break;
                case 4:
                    item = "Rainbow Fillet";
                    price = 2.99;
                    break;
                case 5:
                    item = "Rice Cracker";
                    price = 0.79;
                    break;
                case 6:
                    item = "No-Salt Fries";
                    price = 0.69;
                    break;
                case 7:
                    item = "Zucchini";
                    price = 1.09;
                    break;
                case 8:
                    item = "Brown Rice";
                    price = 0.59;
                    break;
                case 9:
                    item = "Cafe Mocha";
                    price = 1.99;
                    break;
                case 10:
                    item = "Cafe Latte";
                    price = 1.90;
                    break;
                case 11:
                    item = "Espresso";
                    price = 2.49;
                    break;
                case 12:
                    item = "Oolong Tea";
                    price = 0.99;
                    break;
                default:
                    System.out.println("Invalid food id!");
                    continue;
            }

            double cost = price * count;
            total += cost;

            System.out.println("You ordered " + count + " " + item + "(s) - $" + cost);

        } while (run);

        System.out.println("\n====================");
        System.out.println("Total Bill: $" + total);

    }
}

