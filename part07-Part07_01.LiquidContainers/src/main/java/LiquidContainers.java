
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0;
        int container2 = 0;
        int containerMax = 100;


        while (true) {
            System.out.println("First: " + container1 + "/" + containerMax );
            System.out.println("Second: " + container2 + "/" + containerMax );
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            int amount =  Integer.valueOf(parts[1]);

            if (parts[0].equals("add")) {
                if (amount > 0) {
                    if (container1 + amount >= 100) {
                        container1 = 100;
                        continue;
                    } else {
                        container1 += amount;
                        continue;
                    }
                }
            } else if (parts[0].equals("move")) {
                if (amount > 0) {
                    if (container1 >= amount && container2 + amount <= 100) {
                        container1 -= amount;
                        container2 += amount;
                        continue;
                    } else if (container2 + amount >= 100){
                        container2 = 100;
                        container1 = 0;
                        continue;
                    } else {
                        container2 += container1;
                        container1 = 0;
                        continue;
                    }
                }
            } else if (parts[0].equals("remove")) {
                if (amount > 0) {
                    if (container2 >= amount) {
                        container2 -= amount;
                        continue;
                    } else {
                        container2 = 0;
                    }
                }
            }
        }
    }

}
