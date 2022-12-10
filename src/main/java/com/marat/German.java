package com.marat;

import java.util.Map;

public class German extends MachineData {

    public German(String machineName, Map<String, Integer> volumePerDay) {
        super(machineName, volumePerDay);
    }

    @Override
    int calculateTools(Map<String, Integer> map) {
        int sum = 0;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            sum += e.getValue();
        }

        if (sum < 70) {
            System.out.println("план на станке " + getMachineName() + " не выполнен");
        } else if (sum == 70) {
            System.out.println("план на станке " + getMachineName() + " выполнен");
        } else {
            System.out.println("план на станке " + getMachineName() + " ПЕРЕвыполнен");
        }
        return sum;
    }
}