package com.example.sd18306.controller;

import com.example.sd18306.model.SanPham;
import com.example.sd18306.repository.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SanPhamController {

    @Autowired
    SanPhamRepository sanPhamRepository;

    @GetMapping("/san-pham/hien-thi")
    public String hienThi(Model model){
        List<SanPham> list = sanPhamRepository.findAllByOrderByNgayTaoDesc();
        model.addAttribute("listSanPham", list);
        return "san-pham";

    }
}
