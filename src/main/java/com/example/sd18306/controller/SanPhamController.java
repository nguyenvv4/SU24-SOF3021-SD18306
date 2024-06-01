package com.example.sd18306.controller;

import com.example.sd18306.model.DanhMuc;
import com.example.sd18306.model.SanPham;
import com.example.sd18306.repository.DanhMucRepository;
import com.example.sd18306.repository.SanPhamRepository;
import com.oracle.wls.shaded.org.apache.xpath.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
public class SanPhamController {

    @Autowired
    SanPhamRepository sanPhamRepository;

    @Autowired
    DanhMucRepository danhMucRepository;

    @GetMapping("/san-pham/hien-thi")
    public String hienThi(Model model) {
        List<SanPham> list = sanPhamRepository.findAllByOrderByNgayTaoDesc();
        model.addAttribute("listSanPham", list);

        return "san-pham";
    }

    @ModelAttribute("lopDM")
    public List<DanhMuc> getDanhMuc() {
        return danhMucRepository.findAll();
    }

    @PostMapping("/san-pham/add")
    public String add(@ModelAttribute("sanPham") SanPham sanPham) {
        sanPham.setNgayTao(new Date());
        sanPham.setNgaySua(new Date());
        sanPhamRepository.save(sanPham);
        return "redirect:/san-pham/hien-thi";
    }

    @GetMapping("/san-pham/delete")
    public String delete(@RequestParam("id") Integer id) {
        sanPhamRepository.deleteById(id);
        return "redirect:/san-pham/hien-thi";
    }

    @GetMapping("/san-pham/detail")
    public String detail(@RequestParam("id") Integer id, Model model) {
        SanPham sanPham = sanPhamRepository.getReferenceById(id);
        model.addAttribute("sanPham", sanPham);
        return "detail-san-pham";
    }

    @PostMapping("/san-pham/update")
    public String update(SanPham sanPham) {
        SanPham sanPhamDetail = sanPhamRepository.getReferenceById(sanPham.getId());
        if (sanPhamDetail != null) {
            sanPham.setNgayTao(sanPhamDetail.getNgayTao());
            sanPham.setNgaySua(new Date());
            sanPhamRepository.save(sanPham);
        }
        return "redirect:/san-pham/hien-thi";
    }

}
