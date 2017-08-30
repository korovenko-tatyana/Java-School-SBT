//2056. Структуры данных. Самое популярное слово

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> slova = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //String s1 = "";
        String s = "";
        int k, c;
        while (scanner.hasNext()) {//scanner.hasNext() //!s.equals("8")
            s = scanner.next();
            s = s.toLowerCase();
            //char[] arr = s.toCharArray();
            if (slova.contains(s)) {
                k = slova.indexOf(s);
                c = count.get(k);
                c++;
                count.set(k, c);
            } else {
                slova.add(s);
                count.add(1);
            }
        }
        //scanner.close();
        int n = slova.size();
        //int[] a = new int[n];
        //for (int i = 0; i < n; i++) {
        //     a[i] = 0;
        //}
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (count.get(i) > max){
                max = count.get(i);
            }
        }
        //for (int i = 0; i < n; i++) {
        //    if (count.get(i) == max)
        //        a[i] = max;
        //}

        ArrayList<String> slovasort = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (count.get(i) == max){
                slovasort.add(slova.get(i));
            }
        }
        Collections.sort(slovasort);

        for (int i = 0; i < slovasort.size(); i++) {
            System.out.println(slovasort.get(i));
        }
    }
}
