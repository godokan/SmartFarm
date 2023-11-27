package com.ccsyasu.smartfarm.Controller;

import com.ccsyasu.smartfarm.Service.HumidityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import static com.ccsyasu.smartfarm.HumidityINFO.getHUMIDITY;
import static com.ccsyasu.smartfarm.HumidityINFO.getSTATUS;

@Controller
public class ClientController {
    @Autowired
    HumidityService humidityService;

    @GetMapping("/index")
    public String test(Model model) {

        model.addAttribute("name", "바모 (스위트 바질)");
        model.addAttribute("proper_name", "바모");
        model.addAttribute("humidity", getHUMIDITY());
        model.addAttribute("status", getSTATUS());
        model.addAttribute("d-day", humidityService.D_DAY());

        return "index";
    }
}
