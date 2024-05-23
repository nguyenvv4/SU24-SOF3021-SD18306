package com.example.sd18306.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {


    @GetMapping("/")
//    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        return "sach";
    }

    @GetMapping("/login")
    public String showLogin() {
        System.out.println("Da chay vao get");
        return "index";
    }

    @PostMapping("/login")
    public String login(HttpServletRequest request, Model model) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("admin")) {
            return "home";
        }
        model.addAttribute("error", "Login that bai");
        return "index";
    }

    // tao doi tuong sinh vien gom: id, hoten, diachi, gioitinh, trangthai


}
