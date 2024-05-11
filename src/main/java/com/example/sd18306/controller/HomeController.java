package com.example.sd18306.controller;

import com.example.sd18306.model.SinhVien;
import com.example.sd18306.service.SinhVienService;
import com.example.sd18306.service.impl.SinhVienServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class HomeController {

    @Autowired
    SinhVienService sinhVienService;

    @GetMapping("/")
//    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
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
