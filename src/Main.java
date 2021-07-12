import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number,tempNumber,howManyDigits= 0,sum=0;

        System.out.print("Enter a number:");
        number = scanner.nextInt();

        tempNumber = number;

        while (tempNumber > 0){

            tempNumber = tempNumber / 10;
            howManyDigits++;

        }

        System.out.println("\n--> There is/are "+howManyDigits+" digit places in this number.\n");

        for (int i=0;i<howManyDigits;i++){

            sum = sum + (number % 10);
            number = number / 10;

        }

        System.out.println("--> Sum of this number's digits equals " + sum);









    }
}
