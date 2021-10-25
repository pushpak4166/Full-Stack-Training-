package com.mohsinkd786.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("sayHello")
    public String sayHello(){
        return "Hello Spring!";
    }

    @GetMapping("/message/{msg}")
    public String getMessage(@PathVariable String msg){
        return "Welcome to : "+msg;
    }

    //Query Parameters
    @GetMapping("/calculate/add")
    public double add(@RequestParam(defaultValue = "0") int i, @RequestParam(defaultValue = "0") int j){
        return i + j;
    }
    @GetMapping("/calculate/sub")
    public double sub(@RequestParam(defaultValue = "0") int i, @RequestParam(defaultValue = "0") int j){
        return i - j;
    }
    @GetMapping("/calculate/mul")
    public double mul(@RequestParam(defaultValue = "0") int i, @RequestParam(defaultValue = "0") int j){
        return i * j;
    }
    @GetMapping("/calculate/div")
    public double div(@RequestParam(defaultValue = "0") double i, @RequestParam(defaultValue = "0") double j){
        return i / j;
    }
    @GetMapping("/calculate/power")
    public double power(@RequestParam(defaultValue = "0") int i, @RequestParam(defaultValue = "0") int j){
        return Math.pow(i,j);
    }
    @GetMapping("/calculate/root")
    public double squareRoot(@RequestParam(defaultValue = "0.0") int i){
        return Math.sqrt((double) i);
    }
}

/*
* Pass Data in URL :
* 1. Path Param : /1/Mohsin
* 2. Query Param : ?id=1&name=Mohsin
*
* */
