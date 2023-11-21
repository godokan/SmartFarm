package com.ccsyasu.smartfarm;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HumidityINFO {
    private static Integer HUMIDITY = 0;
    private static String STATUS = "";

    public static Integer getHUMIDITY() {
        return HUMIDITY;
    }

    public static String getSTATUS() {
        return STATUS;
    }

    public static void setHUMIDITY(Integer HUMIDITY) {
        HumidityINFO.HUMIDITY = HUMIDITY;
    }

    public static void setSTATUS(String STATUS) {
        HumidityINFO.STATUS = STATUS;
    }
}
