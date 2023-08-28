import java.util.Scanner;
public class First {

    static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            boolean swapped = false;
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }
    }

    static int[] reverse(int[] arr){
        int[] reversed = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            reversed[arr.length - 1 - i] = arr[i];
        }
        return reversed;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a list of numbers(separated by space):");
        String input = scanner.nextLine();

        // Split string by space
        String[] tokens = input.split(" ");

        // Parse to int
        int[] numbers = new int[tokens.length];
        for(int i = 0; i < tokens.length; i++){
            numbers[i] = Integer.parseInt(tokens[i]);
        }

        // Sort
        bubbleSort(numbers);
        System.out.print("Smallest to largest: ");
        for (int number : numbers) {
            System.out.print(number);
            System.out.print(" ");
        }

        // Reverse the sorted arr
        int[] reversed = reverse(numbers);
        System.out.print("\nLargest to smallest: ");
        for (int number : reversed) {
            System.out.print(number);
            System.out.print(" ");
        }
    }
}
