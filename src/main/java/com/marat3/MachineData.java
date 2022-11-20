package com.marat3;

public abstract class MachineData {

    String machineName;
    int[] volumePerDay;

    public MachineData(String machineName, int[] volumePerDay) {
        this.machineName = machineName;
        this.volumePerDay = volumePerDay;
    }

    abstract int calculateTools();
}
