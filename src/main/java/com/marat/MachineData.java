package com.marat;

import java.util.Set;

public abstract class MachineData {

    private final String machineName;
    private final Set<Integer> volumePerDay;

    public MachineData(String machineName, Set<Integer> volumePerDay) {
        this.machineName = machineName;
        this.volumePerDay = volumePerDay;
    }

    abstract int calculateTools();

    public String getMachineName() {
        return machineName;
    }

    public Set<Integer> getVolumePerDay() {
        return volumePerDay;
    }
}

