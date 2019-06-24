package com.wildcodeschool.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyprojectApplication.class, args);
	}
	@RequestMapping("/")
    @ResponseBody
    public String index() {
        return "<ul>" + 
        "<li><a href='/doctor/10'>doctor10</a></li>" + 
        "<li><a href='/doctor/11'>doctor10</a></li>" + 
        "<li><a href='/doctor/12'>doctor10</a></li>" + 
        "<li><a href='/doctor/13'>doctor10</a></li>" + 
        "</ul>" ;   
    }

    @RequestMapping("/doctor/10")
    @ResponseBody
    public String doc10() {
        return "David Tennant";
    }

    @RequestMapping("/doctor/11")
    @ResponseBody
    public String doc11() {
        return "Matt Smith";
    }

    @RequestMapping("/doctor/12")
    @ResponseBody
    public String doc12() {
        return "Peter Capaldi";
    }

    @RequestMapping("/doctor/13")
    @ResponseBody
    public String doc13() {
        return "Jodie Whittaker";
    }





}
