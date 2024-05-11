package com.example.sd18306.service;

import com.example.sd18306.model.SinhVien;

import java.util.ArrayList;

public interface SinhVienService {

    ArrayList<SinhVien> getList();

    void add(SinhVien sinhVien);

    void delete(Integer id);
}
