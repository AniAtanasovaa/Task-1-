import java.util.Scanner;

public class P05HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        int sum = 0;
       int price = 0;

        Boolean ok = false;

while (!command.equals("closed")) {



    if (command.equals("closed")) {
        break;
    }

    if (command.equals("haircut")) {
        command = scanner.nextLine();
        if (command.equals("mens")) {
            price = 15;
        } else if (command.equals("ladies")) {
            price = 20;
        } else if (command.equals("kids")) {
            price = 10;
        }
    } else if (command.equals("color")) {
        command = scanner.nextLine();
        if (command.equals("touch up")) {
            price = 20;
        } else if (command.equals("full color")) {
            price = 30;
        }
    }
    sum = sum+price;
    if (sum>=target){
        ok = true;
        break;
    }
    command = scanner.nextLine();

}

if (ok == true) {
    System.out.printf("You have reached your target for the day!%n");
    System.out.printf("Earned money: %dlv.", sum);
} else {
    int diff = target - sum;
    System.out.printf("Target not reached! You need %dlv. more.%n", diff);
    System.out.printf("Earned money: %dlv.", sum);
}

    }
}
