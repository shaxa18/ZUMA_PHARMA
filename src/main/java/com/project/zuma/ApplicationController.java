package com.project.zuma;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class ApplicationController {

    @GetMapping("/index")
    public String home() {
        return "index";
    }

    @GetMapping("/_layout")
    public String layout() {
        return "_layout";
    }

    @GetMapping("/hr")
    public String hr() {
        return "/hr/index";
    }

    @GetMapping("/fleet")
    public String fleet() {
        return "/fleet/index";
    }

    @GetMapping("/parameters")
    public String parameters() {
        return "/parameters/index";
    }

    @GetMapping("/security")
    public String security() {
        return "/security/index";
    }

    @GetMapping("/accounting")
    public String accounting() {
        return "/accounting/index";
    }

    @GetMapping("/canteen")
    public String canteen() {
        return "/canteen/index";
    }

    @GetMapping("/engineering")
    public String engineering() {
        return "/engineering/index";
    }

    @GetMapping("/production")
    public String production() {
        return "/production/index";
    }

    @GetMapping("/purchase")
    public String purchase() {
        return "/purchase/index";
    }

    @GetMapping("/qa")
    public String qa() {
        return "/qa/index";
    }

    @GetMapping("/qc")
    public String qc() {
        return "/qc/index";
    }

    @GetMapping("/warehouse")
    public String warehouse() {
        return "/warehouse/index";
    }

}
