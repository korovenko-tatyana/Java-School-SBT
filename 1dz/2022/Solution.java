//2022. Массивы. Делящиеся пары

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int intArray[] = new int[n];

        for (int i = 0; i < n; i++){
            intArray[i] = scanner.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                if (i != j && intArray[j] % intArray[i] == 0)
                    count++;
            }
        }

        System.out.println(count);
    }
}
