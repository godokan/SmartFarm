package com.ccsyasu.smartfarm.Service;

import org.springframework.stereotype.Service;
import static com.ccsyasu.smartfarm.HumidityINFO.getHUMIDITY;
import static com.ccsyasu.smartfarm.HumidityINFO.setSTATUS;

@Service
public class HumidityService {
    public void initStatus() {
        Integer current = getHUMIDITY();

        if (current>90) setSTATUS("수분 과도");
        else if (current>30) setSTATUS("수분 적당");
        else setSTATUS("수분 결핍");
    }
}
