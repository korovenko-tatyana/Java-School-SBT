//2021. Массивы. Делим максимум

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int intArray[] = new int[n];

        for (int i = 0; i < n; i++){
            intArray[i] = scanner.nextInt();
        }

        int max;

        for (int j = 0; j< 2; j++){
            max = intArray[0];
            for (int i = 1; i < n; i++) {
                if (max < intArray[i])
                    max = intArray[i];
            }
            for (int i = 0; i < n; i++) {
                if (intArray[i] == max)
                    intArray[i] /= 2;
            }
        }

        for (int i = 0; i < n; i++){
            System.out.println(intArray[i]+" ");
        }

    }
}
