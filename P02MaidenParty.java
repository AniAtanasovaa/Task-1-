import java.util.Scanner;

public class P02MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceParty = Double.parseDouble(scanner.nextLine());
        int loveLetters = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int keys = Integer.parseInt(scanner.nextLine());
        int pics = Integer.parseInt(scanner.nextLine());
        int lucks = Integer.parseInt(scanner.nextLine());
//•	Любовно послание - 0.60 лв.
//•	Восъчна роза - 7.20 лв.
//•	Ключодържател - 3.60 лв.
//•	Карикатура - 18.20 лв.
//•	Късмет изненада - 22 лв.
//Ако поръчаните артикули са 25 или повече магазинът прави отстъпка 35% от общата цена. От спечелените пари Михаела
// трябва да предвиди и 10% разход за хостинг.
// Да се пресметне дали парите ще й стигнат да си плати моминското парти.

double allSum = loveLetters*0.6+roses*7.2+keys*3.6+pics*18.2+lucks*22;
double countTings = loveLetters+roses+keys+pics+lucks;

if (countTings>=25) {
    allSum = allSum-(allSum*0.35);
}

double hosting = (allSum*0.1);

double all = allSum-hosting;

if (all>=priceParty) {
    double leftMoney = all - priceParty;
    System.out.printf("Yes! %.2f lv left.", leftMoney);
} else {
    double diff = priceParty - all;
    System.out.printf("Not enough money! %.2f lv needed.", diff);
}
    }
}
