package com.example.sd18306.service.impl;

import com.example.sd18306.model.SinhVien;
import com.example.sd18306.service.SinhVienService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SinhVienServiceImpl implements SinhVienService {

    ArrayList<SinhVien> list = new ArrayList<>();

    public SinhVienServiceImpl() {
        list.add(new SinhVien(1, "Nguyen Van A", "Ha Noi", "Nam", "Hoat dong"));
        list.add(new SinhVien(2, "Nguyen Van A", "Ha Noi", "Nam", "Hoat dong"));
        list.add(new SinhVien(3, "Nguyen Van A", "Ha Noi", "Nam", "Hoat dong"));
    }

    @Override
    public ArrayList<SinhVien> getList() {
        return list;
    }

    @Override
    public void add(SinhVien sinhVien) {
        list.add(sinhVien);
    }

    @Override
    public void delete(Integer id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                SinhVien sinhVien = list.get(i);
                list.remove(sinhVien);
            }
        }

    }

    abcd1234598A@a1
}
