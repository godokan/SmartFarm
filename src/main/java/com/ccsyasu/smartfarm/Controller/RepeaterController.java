package com.ccsyasu.smartfarm.Controller;

import com.ccsyasu.smartfarm.Service.HumidityService;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static com.ccsyasu.smartfarm.HumidityINFO.setHUMIDITY;

@RestController
public class RepeaterController {
    @Autowired
    HumidityService humidityService;

    @PostMapping("repeater/init")
    public String  streamData(@RequestBody Map<String, Object> json) {
        setHUMIDITY((Integer) json.get("humidity"));
        humidityService.initStatus();
        return "OK";
    }
}
