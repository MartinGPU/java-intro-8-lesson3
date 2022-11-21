package com.marat;

public class German extends MachineData {

    public German(String machineName, int[] volumePerDay) {
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