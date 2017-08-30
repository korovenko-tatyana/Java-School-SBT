//2036. Странные слова

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a;
        int n = scanner.nextInt();
        boolean flag;
        for (int i = 0; i < n; i++){
            a = scanner.next();
            char[] arr = a.toCharArray();
            flag = true;
            if (a.length() > 2){
                for (int j = 0; j < a.length()-2; j++){
                    if ((arr[j] == 'e' || arr[j] == 'y' || arr[j] == 'u' || arr[j] == 'i' || arr[j] == 'o' || arr[j] == 'a') && (arr[j+1] == 'e' || arr[j+1] == 'y' || arr[j+1] == 'u' || arr[j+1] == 'i' || arr[j+1] == 'o' || arr[j+1] == 'a')&&(arr[j+2] == 'e' || arr[j+2] == 'y' || arr[j+2] == 'u' || arr[j+2] == 'i' || arr[j+2] == 'o' || arr[j+2] == 'a')){
                        flag = false;
                    }
                }
                if (flag){
                    System.out.println(a);
                }
            }
            else{
                System.out.println(a);
            }
        }
    }
}
