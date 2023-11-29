package com.ccsyasu.smartfarm.Controller;

import com.ccsyasu.smartfarm.Service.HumidityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

import static com.ccsyasu.smartfarm.HumidityINFO.*;
import static com.ccsyasu.smartfarm.HumidityINFO.getUpdateDate;

@Controller
public class ClientController {
    @Autowired
    HumidityService humidityService;
    @RequestMapping("/")
    public String toIndex() {
        return "redirect:index";
    }
    @GetMapping("/index")
    public String index(Model model) {
        LocalDateTime dateTime = getUpdateDate();
        String nowDate = dateTime.getYear()+"년 "+dateTime.getMonthValue()+"월 "+dateTime.getDayOfMonth()+"일";
        String nowTime = dateTime.getHour()+"시 "+dateTime.getMinute()+"분 "+dateTime.getSecond()+"초";

        model.addAttribute("name", "바모 (스위트 바질)");
        model.addAttribute("proper_name", "바모");
        model.addAttribute("humidity", getHUMIDITY());
        model.addAttribute("status", getSTATUS());
        model.addAttribute("d-day", humidityService.D_DAY());
        model.addAttribute("update-date", nowDate);
        model.addAttribute("update-time", nowTime);

        return "index";
    }
}
