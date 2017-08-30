//2005. Ветвления, циклы. Индекс первого минимума
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        int min = scanner.nextInt();
        int imin = 1;
        int c;

        for (int i = 2; i <= count; i++) {
            c = scanner.nextInt();
            if (min > c){
                min = c;
                imin = i;
            }
        }

        System.out.println(imin);
    }
}
