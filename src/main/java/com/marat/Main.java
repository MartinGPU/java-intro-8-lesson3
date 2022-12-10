package com.marat;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("немец 1", 16);
        map.put("немец 2", 11);
        map.put("немец 3", 10);
        map.put("немец 4", 9);
        map.put("немец 5", 4);
        map.put("немец 6", 7);
        map.put("немец 7", 8);
        German german = new German("немец", map);

        Map<String, Integer> map2 = new HashMap<>();
        map.put("итальянец 1", 16);
        map.put("итальянец 2", 11);
        map.put("итальянец 3", 10);
        map.put("итальянец 4", 9);
        map.put("итальянец 5", 4);
        map.put("итальянец 6", 7);
        map.put("итальянец 7", 8);
        Italian italian = new Italian("итальянец", map2);

        int germanSum = german.calculateTools();
        int italianSum = italian.calculateTools();

        if (germanSum + italianSum == 140) {
            System.out.println("итоговый план выполнен");
        } else if (germanSum + italianSum < 140) {
            System.out.println("итоговый план НЕ выполнен");
        } else {
            System.out.println("итоговый план ПЕРЕвыполнен");
        }
    }
}
