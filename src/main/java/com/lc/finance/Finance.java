package com.lc.finance;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Indexed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Finance {

    @GetMapping("/find/money")
    public String findMoney(){
        return "计算money";
    }
    @PutMapping("/update/money")

    public String updateMoney(){
        return "修改money";    }
}
