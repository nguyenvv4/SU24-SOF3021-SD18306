package com.example.sd18306.repository;

import com.example.sd18306.model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Integer> {

    ArrayList<SanPham> findAllByOrderByNgayTaoDesc();
}
