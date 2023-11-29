package com.ccsyasu.smartfarm;

import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
public class HumidityINFO {
    private static Integer HUMIDITY = 0;
    private static String STATUS = "알 수 없음";

    private static LocalDateTime updateDate = LocalDateTime.now();

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

    public static LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public static void updateDate() {
        HumidityINFO.updateDate = LocalDateTime.now();
    }
}
