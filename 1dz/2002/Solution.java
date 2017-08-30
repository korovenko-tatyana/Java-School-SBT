//2002. Ветвления, циклы. Сумма чисел

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < count; i++) {
            sum += scanner.nextInt();
        }

        System.out.println(sum);
    }
}
