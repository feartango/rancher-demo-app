package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class ApiController {

    @Resource
    HttpServletRequest request;

    @Resource
    SystemInfo systemInfo;

    @ResponseBody
    @RequestMapping(value = "/get/hello", method = RequestMethod.GET)
    public String hello() {
        return "(" + systemInfo.toString() + ") request-header-service-code:" + request.getHeader("SERVICE-CODE");
    }

    @ResponseBody
    @RequestMapping(value = "/post/hello", method = RequestMethod.POST)
    public String postHello(@RequestBody Map map) {
        return "(" + systemInfo.toString() + ") request-body-service-code:" + map.get("serviceCode") + ";request-header-service-code:" + request.getHeader("SERVICE-CODE");
    }

}
