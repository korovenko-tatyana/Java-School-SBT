//2003. Ветвления, циклы. Альтернированная сумма чисел

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int sum = 0;
        int z = 1;

        for (int i = 0; i < count; i++) {
            sum += z * scanner.nextInt();
            z = -z;
        }

        System.out.println(sum);
    }
}
