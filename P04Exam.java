import java.util.Scanner;

public class P04Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int students = Integer.parseInt(scanner.nextLine());
double sumAll = 0;

int countGroup1 = 0;
int countGroup2 = 0;
int countGroup3 = 0;
int countGroup4 = 0;


        for (int i = 1; i <= students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());

           sumAll = sumAll+grade;

            if (grade>=5) {
                countGroup1++;
            } else if (grade>=4&&grade<=4.99) {
                countGroup2++;
            } else if (grade >= 3&&grade<=3.99) {
                countGroup3++;
            } else if (grade<3) {
                countGroup4++;
            }
        }

        double per1 = (countGroup1*1.0/students) * 100;
        double per2 = (countGroup2*1.0/students) * 100;
        double per3 = (countGroup3*1.0/students) * 100;
        double per4 = (countGroup4*1.0/students) * 100;

        double average = (sumAll) / students;

        System.out.printf("Top students: %.2f%%%n", per1);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", per2);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", per3);
        System.out.printf("Fail: %.2f%%%n",per4);
        System.out.printf("Average: %.2f", average);


    }
}
