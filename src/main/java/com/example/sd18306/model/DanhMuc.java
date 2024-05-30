package com.example.sd18306.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "danh_muc")
@AllArgsConstructor
@NoArgsConstructor
public class DanhMuc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String maDanhMuc;

    private String tenDanhMuc;

    private Date ngayTao;

    private Date ngaySua;

    private String trangThai;

    @Override
    public String toString() {
        return "DanhMuc{" +
                "id=" + id +
                ", maDanhMuc='" + maDanhMuc + '\'' +
                ", tenDanhMuc='" + tenDanhMuc + '\'' +
                ", ngayTao=" + ngayTao +
                ", ngaySua=" + ngaySua +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }
}
