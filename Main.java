import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter Email: ");
        email = scanner.nextLine();

        if (email.isEmpty()) {
            System.out.println("Email is Empty");
        } else if (email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@")+1);
            System.out.println("Your username: "+username);
            System.out.println(domain);
        } else {
            System.out.println("Entered Email is wrong!");
        }

        scanner.close();
    }
}