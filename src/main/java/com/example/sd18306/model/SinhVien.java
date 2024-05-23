package com.example.sd18306.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "sinh_vien")
@Entity
public class SinhVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
//    @Column(name = "ho_ten")
    private String hoTen;
//    @Column(name = "dia_chi")
    private String diaChi;
//    @Column(name = "gioi_tinh")
    private String gioiTinh;
//    @Column(name = "trang_thai")
    private String trangThai;

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }
}
