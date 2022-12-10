package com.marat;

import java.util.List;

public abstract class MachineData {

    private final String machineName;
    private final List<Integer> volumePerDay;

    public MachineData(String machineName, List<Integer> volumePerDay) {
        this.machineName = machineName;
        this.volumePerDay = volumePerDay;
    }

    abstract int calculateTools();

    public String getMachineName() {
        return machineName;
    }

    public List<Integer> getVolumePerDay() {
        return volumePerDay;
    }
}

