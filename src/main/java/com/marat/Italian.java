package com.marat;

import java.util.List;

public class Italian extends MachineData {

    public Italian(String machineName, List<Integer> volumePerDay) {
        super(machineName, volumePerDay);
    }

    @Override
    int calculateTools() {
        int sum = 0;
        for (int j : getVolumePerDay()) {
            sum += j;
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
