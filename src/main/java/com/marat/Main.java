package com.marat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        German german = new German("немец", new ArrayList<>(Arrays.asList(20, 9, 5, 12, 4, 17, 3)));
        List<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(10);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(10);
        Italian italian = new Italian("итальянец", list);

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
