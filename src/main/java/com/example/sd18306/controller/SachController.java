package com.example.sd18306.controller;

import com.example.sd18306.model.Sach;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class SachController {


    ArrayList<Sach> list = new ArrayList<>();

    public SachController() {
        list.add(new Sach("1", "Ty quay 1", "Nguyen Van A", 100000, "Con hang"));
        list.add(new Sach("2", "Ty quay 2", "Nguyen Van A", 100000, "Con hang"));
        list.add(new Sach("3", "Ty quay 3", "Nguyen Van A", 100000, "Con hang"));
        list.add(new Sach("4", "Conan", "Nguyen Van A", 100000, "Con hang"));
        list.add(new Sach("5", "Dark", "Nguyen Van A", 100000, "Con hang"));
    }

    @GetMapping("/sach")
    public String index(Model model) {
        model.addAttribute("list", list);
        return "sach";
    }

    @PostMapping("/sach/search")
    public String search(@RequestParam("tenSach") String tenSach, Model model) {
        ArrayList<Sach> search = new ArrayList<>();
        for (Sach sach: list){
            if (sach.getTenSach().contains(tenSach)){
                search.add(sach);
            }
        }
        model.addAttribute("list", search);
        return "sach";
    }
}
