package com.marat;

public class Italian extends MachineData {

    public Italian(String machineName, int[] volumePerDay) {
        super(machineName, volumePerDay);
    }

    @Override
    int calculateTools() {
        int sum = 0;
        for (int j : volumePerDay) {
            sum += j;
        }
        if (sum < 70) {
            System.out.println("план на станке " + machineName + " не выполнен");
        } else if (sum == 70) {
            System.out.println("план на станке " + machineName + " выполнен");
        } else {
            System.out.println("план на станке " + machineName + " ПЕРЕвыполнен");
        }
        return sum;
    }
}
