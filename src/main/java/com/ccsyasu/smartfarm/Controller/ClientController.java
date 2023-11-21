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

    @GetMapping("/index")
    public String test(Model model) {

        model.addAttribute("name", "부들부들 애기 부들");
        model.addAttribute("humidity", getHUMIDITY());
        model.addAttribute("status", getSTATUS());

        return "index";
    }
}
