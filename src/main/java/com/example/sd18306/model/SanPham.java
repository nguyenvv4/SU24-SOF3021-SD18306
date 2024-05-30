package com.example.sd18306.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "san_pham")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String maSanPham;

    private String tenSanPham;

    private String trangThai;

    private Date ngayTao;

    @Column(name = "ngay_sua")
    private Date ngaySua;

    @ManyToOne
    @JoinColumn(name = "id_danh_muc")
    private DanhMuc danhMuc;

    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", trangThai='" + trangThai + '\'' +
                ", ngayTao=" + ngayTao +
                ", ngaySua=" + ngaySua +
                ", danhMuc=" + danhMuc +
                '}';
    }
}
