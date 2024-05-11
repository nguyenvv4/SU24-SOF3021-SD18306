package com.example.sd18306.controller;

import com.example.sd18306.model.SinhVien;
import com.example.sd18306.service.SinhVienService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class SinhVienController {

    @Autowired
    SinhVienService sinhVienService;

    @GetMapping("/sinh-vien")
    public String sinhVien(Model model) {
        ArrayList<SinhVien> list = sinhVienService.getList();
        model.addAttribute("listSinhVien", list);
        model.addAttribute("message", "Xin chao");
        return "sinh-vien";
    }

    @PostMapping("/sinh-vien")
    public String add(Model model, HttpServletRequest request,
                      @ModelAttribute("sinhVien") SinhVien sinhVien) {
//        Integer id = Integer.parseInt(request.getParameter("id"));
//        String hoTen = request.getParameter("hoTen");
//        String diaChi = request.getParameter("diaChi");
//        String gioiTinh = request.getParameter("gioiTinh");
//        String trangThai = request.getParameter("trangThai");
//        SinhVien sinhVien = new SinhVien(id, hoTen, diaChi, gioiTinh, trangThai);
        sinhVienService.add(sinhVien);
        return "redirect:/sinh-vien";
    }

    @GetMapping("/sinh-vien/delete")
    public String delete(@RequestParam("id") Integer id) {
        System.out.println("id la: " + id);
        sinhVienService.delete(id);
        return "redirect:/sinh-vien";
    }
}
