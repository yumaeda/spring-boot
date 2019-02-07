package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
public class HomeController {
    @RequestMapping(method=GET, value="/")
    public String index() {
	return "index";
    }
}
