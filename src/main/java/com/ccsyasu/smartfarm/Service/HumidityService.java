package com.ccsyasu.smartfarm.Service;

import org.springframework.stereotype.Service;
import static com.ccsyasu.smartfarm.HumidityINFO.getHUMIDITY;
import static com.ccsyasu.smartfarm.HumidityINFO.setSTATUS;

@Service
public class HumidityService {
    public void initStatus() {
        Integer current = getHUMIDITY();

        if (current < 20) setSTATUS("물 보충 필요함");
        else if (current < 50) setSTATUS("마름");
        else if (current < 90) setSTATUS("촉촉함");
        else setSTATUS("충분함");
    }
}
