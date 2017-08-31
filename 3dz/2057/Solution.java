//проходят первые 27 тестов, остальные нет по причине нехватки времени (код работает больше трех секунд)

import java.util.Scanner;
import java.util.ArrayList;



public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> multiset = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = 0;
        while(scanner.hasNext()) { //scanner.hasNext()
            a = scanner.nextInt();
            if (a == 2) {
                if (multiset.size() > 0){
                    //index = imin(multiset);
                    //System.out.println(multiset.get(index));
                    System.out.println(multiset.remove(imin(multiset)));
                }
            }
            if (a == 1) {
                multiset.add(scanner.nextInt());
            }
        }
    }
    public static int imin(ArrayList<Integer> multiset) {
        //int imin = 0;
        int min = 1000000000;
        for (Integer i:multiset){
            //for (int i = 1; i < multiset.size(); i++) {
            if (i < min) {
                min = i;
                //System.out.println(min + "min");
            }
        }
        return multiset.indexOf(min);
    }
}

