import java.util.Scanner;

public class Second {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int input = scanner.nextInt();

        boolean isLeapYear = false;

        // Input is century year: 2000, 1900, ... need to be divisible by 400
        if(input % 100 == 0) {
            if (input % 400 == 0) {
                isLeapYear = true;
            }
        } else {
            // Input is not century year: 2014, 1990, ... need to be divisible by 4
            if (input % 4 == 0) {
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.println("Year " + input + " is a leap year");
        } else {
            System.out.println("Year " + input + " is not a leap year");
        }


    }
}
