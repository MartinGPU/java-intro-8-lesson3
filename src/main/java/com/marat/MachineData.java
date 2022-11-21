package com.marat;

public abstract class MachineData {

    private final String machineName;
    private final int[] volumePerDay;

    public MachineData(String machineName, int[] volumePerDay) {
        this.machineName = machineName;
        this.volumePerDay = volumePerDay;
    }

    abstract int calculateTools();

    public String getMachineName() {
        return machineName;
    }

    public int[] getVolumePerDay() {
        return volumePerDay;
    }
}

