package Test;
/*
* 1.???
* 2.??
* 3.??
* 4.??
* 5.??
* */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LandLordBattle {
    public static void main(String[] args) {
        HashMap<Integer, String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        List<String> colors = List.of("红桃", "黑桃", "梅花", "方块");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        int index =0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index, "小王");
        pokerIndex.add(index);
        index++;
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index, color+number);
                pokerIndex.add(index);
                index++;

            }

        }
        System.out.println(pokerIndex);
        System.out.println(poker);
        Collections.shuffle(pokerIndex);
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> landlordpoker = new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            if(i>=51){
                landlordpoker.add(in);
            }else if(i%3==0){
                player01.add(in);
            }else if(i%3==1){
                player02.add(in);
            }else if(i%3==2){
                player03.add(in);
            }

        }
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(landlordpoker);
        lookpoker("nss", poker,player01);
        lookpoker("hgf", poker,player02);
        lookpoker("yjh", poker,player03);
        lookpoker("nhe", poker,landlordpoker);


    }
    public static void lookpoker(String name,HashMap<Integer,String> poker, ArrayList<Integer> list){
        System.out.print(name+":");
        for (Integer key : list) {
            String value = poker.get(key);
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
