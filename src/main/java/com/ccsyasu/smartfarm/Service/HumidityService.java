package com.ccsyasu.smartfarm.Service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.ccsyasu.smartfarm.HumidityINFO.*;

@Service
public class HumidityService {
    public void initStatus() {
        updateDate();

        Integer current = getHUMIDITY();

        if (current < 20) setSTATUS("물 보충 필요함");
        else if (current < 50) setSTATUS("마름");
        else if (current < 90) setSTATUS("촉촉함");
        else setSTATUS("충분함");
    }

    public long D_DAY() {
        LocalDate dPlusDayDate = LocalDate.parse("2023-09-27", DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate currentDate = LocalDate.now();
        return currentDate.toEpochDay() - dPlusDayDate.toEpochDay();
    }
}
