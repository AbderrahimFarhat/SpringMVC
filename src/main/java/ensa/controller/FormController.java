package ensa.controller;

import ensa.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FormController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView showForm() {

        System.out.println( "test");
        return new ModelAndView("studentHome", "student", new Student());
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String submit(@ModelAttribute("student")Student student,
                         BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("name", student.getName());
        model.addAttribute("email", student.getEmail());
        model.addAttribute("city", student.getCity());
        model.addAttribute("zip", student.getZip());
        return "studentView";
    }
}
