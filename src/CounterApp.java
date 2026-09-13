import java.util.Scanner;

public class CounterApp {

    static int count = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("\nCurrent count: " + count);
            System.out.println("1. Increment");
            System.out.println("2. Decrement");
            System.out.println("3. Reset");
            System.out.println("4. Exit");

            System.out.print("Choose option: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    count++;
                    break;

                case 2:
                    count--;
                    break;

                case 3:
                    count = 0;
                    break;

                case 4:
                    System.out.println("Exiting now");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option");


                    hehehehehehehehheheheh
            }
        }
    }
}