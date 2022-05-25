import java.util.Scanner;

public class P06MultiplyTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String text = ""+n;

        int sum = 0;

        for (int i = 1; i < text.length(); i++) {

            char letter = text.charAt(i);

            for (int j = 2; j < text.length(); j++) {
                char let1 = text.charAt(1);

                for (int k = 3; k < text.length(); k++) {
                    char let2 = text.charAt(k);

                            sum = i*j*k;
                            System.out.printf("%d * %d * %d = %d; %n", i, j, k, sum);
                }
            }



        }





                }
            }


// for (int i = 1; i <=3; i++) {
//