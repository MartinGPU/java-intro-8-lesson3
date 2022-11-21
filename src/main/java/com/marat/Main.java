package com.marat;

public class Main {

    public static void main(String[] args) {
        German german = new German("немец", new int[]{20, 10, 10, 10, 10, 10, 10});
        Italian italian = new Italian("итальянец", new int[]{9, 10, 10, 10, 10, 10, 10});

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
