import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String item;
        double price;
        int quantity;

        Scanner scanner = new Scanner(System.in);

        // Menu of Food;

        System.out.println("Pizza : 18.3$");
        System.out.println("Sandwich : 70$");
        System.out.println("Burger : 90$");
        System.out.println("Noodles : 87.32$");
        System.out.println("Chicken : 180$");
        System.out.println("Rajama : 170$");

        // User Choose Making
        System.out.print("What you Want to Eat? :");
        item = scanner.nextLine();

        switch (item) {

            case "Pizza":
                System.out.print("Enter here Quantity: ");
                quantity = scanner.nextInt();
                price = 18.3 * quantity;
                System.out.print("Your Total Amount to pay: $" + price);
                break;

            case "Sandwich":
                System.out.print("Enter here Quantity: ");
                quantity = scanner.nextInt();
                price = 70 * quantity;
                System.out.print("Your Total Amount to pay: $" + price);
                break;

            case "Burger":
                System.out.print("Enter here Quantity: ");
                quantity = scanner.nextInt();
                price = 90 * quantity;
                System.out.print("Your Total Amount to pay: $" + price);
                break;

            case "Noodles":
                System.out.print("Enter here Quantity: ");
                quantity = scanner.nextInt();
                price = 87.32 * quantity;
                System.out.print("Your Total Amount to pay: $" + price);
                break;

            case "Chicken":
                System.out.print("Enter here Quantity: ");
                quantity = scanner.nextInt();
                price = 180 * quantity;
                System.out.print("Your Total Amount to pay: $" + price);
                break;

            case "Rajama":
                System.out.print("Enter here Quantity: ");
                quantity = scanner.nextInt();
                price = 170 * quantity;
                System.out.print("Your Total Amount to pay: $" + price);
                break;

            default:
                break;
        }

        scanner.close();
    }
}