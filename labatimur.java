import java.math.BigInteger;
import java.util.Scanner;
public class labatimur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array the first positive number: ");
        int start = input.nextInt();

        System.out.println("Enter array the final positive number (final > first): ");
        int finish = input.nextInt();

        System.out.println("Enter C number (C > first num)");
        int c = input.nextInt();
        while (c <= start) {
            System.out.println("Invalid number, enter d number again (C > first num):");
            c = input.nextInt();
        }
        System.out.println("Enter D number (D > first num)");
        int d = input.nextInt();
        while (d <= start) {
            System.out.println("Invalid number, enter d number again (D > first num):");
            d = input.nextInt();
        }

        if (c >= finish | d >= finish) {
            System.out.println("The array does not contain numbers greater than C or D");


        } else {

            int[] nums;
            nums = new int[finish - start + 1];
            int num = start;
            for (int i = 0; i < finish - start + 1; i++) { // цикл заполнения массива
                nums[i] = num;
                num++;
            }
            for (int i = 0; i < nums.length + 1; i++) {  // диапазон
                if (i >= c & i <= d){
                    System.out.print(i + " ");
                }
            }

        }
    }
}

