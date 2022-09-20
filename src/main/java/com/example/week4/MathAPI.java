package com.example.week4;

import org.springframework.web.bind.annotation.*;

@RestController
public class MathAPI {
    @RequestMapping(value = "/plus/{num1}/{num2}", method = RequestMethod.GET)
    public String myPlus(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
        return Double.toString(num1 + num2);
    }
    @RequestMapping(value = "/minus/{num1}/{num2}", method = RequestMethod.GET)
    public String myMinus(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
        return Double.toString(num1 - num2);
    }
    @RequestMapping(value = "/divide/{num1}/{num2}", method = RequestMethod.GET)
    public String myDivide(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
        return Double.toString(num1 / num2);
    }
    @RequestMapping(value = "/multi/{num1}/{num2}", method = RequestMethod.GET)
    public String myMulti(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
        return Double.toString(num1 * num2);
    }
    @RequestMapping(value = "/mod/{num1}/{num2}", method = RequestMethod.GET)
    public String myMod(@PathVariable("num1") Double num1, @PathVariable("num2") Double num2) {
        return Double.toString(num1 % num2);
    }
    @RequestMapping(value = "/max", method = RequestMethod.POST)
    public String myMax(@RequestParam("n1") Double num1, @RequestParam("n2") Double num2) {
        return Double.toString(Math.max(num1, num2));
    }

}