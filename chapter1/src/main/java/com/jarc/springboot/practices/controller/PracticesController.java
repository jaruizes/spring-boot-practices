package com.jarc.springboot.practices.controller;

import com.jarc.springboot.practices.domain.Practice;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practices/")
public class PracticesController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Practice getPractice(@PathVariable("id") int id) {
        return new Practice(id, "Practice " + id, "This is the description of the practice");
    }
}
