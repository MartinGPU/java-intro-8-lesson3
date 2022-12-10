package com.marat;

import java.util.Map;

public abstract class MachineData {

    private final String machineName;
    private final Map<String, Integer> volumePerDay;

    public MachineData(String machineName, Map<String, Integer> volumePerDay) {
        this.machineName = machineName;
        this.volumePerDay = volumePerDay;
    }

    abstract int calculateTools(Map<String, Integer> map);

    public String getMachineName() {
        return machineName;
    }

    public Map<String, Integer> getVolumePerDay() {
        return volumePerDay;
    }
}

