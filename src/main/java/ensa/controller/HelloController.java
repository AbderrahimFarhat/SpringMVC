package ensa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String display(HttpServletRequest req, Model m) {
        String msg = req.getParameter("message");
        if (msg != null) {
            m.addAttribute("message", msg);
        } else {
            m.addAttribute("message", "Empty message");
        }
        return "hello";
    }
}
