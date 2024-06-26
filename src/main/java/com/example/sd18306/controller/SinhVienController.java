package com.example.sd18306.controller;

import com.example.sd18306.model.SinhVien;
import com.example.sd18306.repository.SinhVienRepository;
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
    SinhVienRepository sinhVienRepository; // tuong duong A a = new A

    @GetMapping("/sinh-vien")
    public String sinhVien(Model model) {
        model.addAttribute("listSinhVien", sinhVienRepository.findAll());
        model.addAttribute("message", "Xin chao");
        return "sinh-vien";
    }

//    @PostMapping("/sinh-vien")
//    public String add(
//            @ModelAttribute("sinhVien") SinhVien sinhVien) {
//        list.add(sinhVien);
//        return "redirect:/sinh-vien";
//    }
//
//    @GetMapping("/sinh-vien/delete")
//    public String delete(@RequestParam("id") Integer id) {
//        System.out.println("id la: " + id);
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getId().equals(id)) {
//                SinhVien sinhVien = list.get(i);
//                list.remove(sinhVien);
//            }
//        }
//        return "redirect:/sinh-vien";
//    }
//
//    @GetMapping("/sinh-vien/edit")
//    public String detail(@RequestParam("id") Integer id,
//                         Model model) {
//        SinhVien sinhVien = new SinhVien();
//        for (SinhVien sv : list) {
//            if (sv.getId().equals(id)) {
//                sinhVien = sv;
//            }
//        }
//        model.addAttribute("sinhVien", sinhVien);
//        return "edit";
//    }
//
//    @PostMapping("/sinh-vien/update")
//    public String update(@ModelAttribute("sinhVien") SinhVien sinhVien) {
//        for (SinhVien sv : list) {
//            if (sv.getId().equals(sinhVien.getId())) {
//                sv.setDiaChi(sinhVien.getDiaChi());
//                sv.setHoTen(sinhVien.getHoTen());
//                sv.setGioiTinh(sinhVien.getGioiTinh());
//                sv.setTrangThai(sinhVien.getTrangThai());
//            }
//        }
//        return "redirect:/sinh-vien";
//
//    }
}
