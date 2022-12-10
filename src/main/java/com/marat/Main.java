package com.marat;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(16);
        set.add(11);
        set.add(10);
        set.add(9);
        set.add(4);
        set.add(7);
        set.add(8);
        German german = new German("немец", set);

        Set<Integer> set2 = new HashSet<>();
        set.add(18);
        set.add(12);
        set.add(10);
        set.add(9);
        set.add(3);
        set.add(7);
        set.add(4);
        Italian italian = new Italian("итальянец", set2);

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
