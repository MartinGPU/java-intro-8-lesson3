package com.marat;

import java.util.Map;

public class Italian extends MachineData {


    public Italian(String machineName, Map<String, Integer> volumePerDay) {
        super(machineName, volumePerDay);
    }

    @Override
    int calculateTools() {
        int sum = 0;

        for(Map.Entry<String, Integer> e : getVolumePerDay().entrySet()){
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
