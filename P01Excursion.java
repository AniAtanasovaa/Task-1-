import java.util.Scanner;

public class P01Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int people = Integer.parseInt(scanner.nextLine());
int nights = Integer.parseInt(scanner.nextLine());
int busCards = Integer.parseInt(scanner.nextLine());
int tickets = Integer.parseInt(scanner.nextLine());

//•	Нощувка - 20 лв.
//•	Карта за транспорт - 1.60 лв.
//•	Билет за музей - 6 лв.
//Към крайната сума се начислява допълнително 25% за непредвидени разходи.
//Да се напише програма, която изчислява общата сумата, която групата трябва да плати.

        double nightsPerOne = nights*20;
        double busCardsPerOne = busCards*1.60;
        double ticketsPerOne = tickets*6;

        double allSumPerOne = nightsPerOne+busCardsPerOne+ticketsPerOne;
        double allSumPerGroup = allSumPerOne*people;

        double all = allSumPerGroup+(allSumPerGroup*0.25);

        System.out.printf("%.2f", all);




    }
}
