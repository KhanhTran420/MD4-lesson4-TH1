package com.codegym.controller;

import com.codegym.model.Employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@Controller
@RequestMapping("")
public class EmployeeController {
    @RequestMapping(value = "/showForm", method = RequestMethod.GET)
    public String showForm(ModelMap model) {
        model.addAttribute("employee", new Employee());
        return "/create";
    }

//    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
//    public ModelAndView submit(Employee employee) {
//        ModelAndView modelAndView = new ModelAndView("info");
//        modelAndView.addObject("information", employee);
//        return modelAndView;
//    }

    @RequestMapping(value = "/addEmployee",method = RequestMethod.POST)
    public String submit(@ModelAttribute("employee") Employee employee, ModelMap model){
        model.addAttribute("name",employee.getName());
        model.addAttribute("contactNumber",employee.getContactNumber());
        model.addAttribute("id",employee.getId());
        return "/info";
    }
}
