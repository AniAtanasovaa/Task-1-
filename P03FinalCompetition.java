import java.util.Scanner;

public class P03FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double score = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String pleace = scanner.nextLine();

        double money = score*people;

//3.	Сезон –  текст със следните възможности - "summer" или "winter"
//4.	Място – текст със следните възможности - "Bulgaria" или "Abroad"

//•	Ако се е провело в чужбина –
// се умножават броя участници по броя точки и към тях се добавя 50% от получената сума

        if (pleace.equals("Bulgaria")) {
            money = score*people;

            if (season.equals("summer")) {
                money = money - (money * 0.05);
            }
                else if (season.equals("winter")) {
                money = money - (money * 0.08);
                }

        }

        else if (pleace.equals("Abroad")) {
            money = money+(money/2);

            if (season.equals("summer")) {
                money = money - (money * 0.10);
            }
            else if (season.equals("winter")) {
                money = money - (money * 0.15);
            }
        }

double charity = money*0.75;
double left = money-charity;

double perPerson = left / people;

        System.out.printf("Charity - %.2f%n", charity);
        System.out.printf("Money per dancer - %.2f", perPerson);


    }
}
