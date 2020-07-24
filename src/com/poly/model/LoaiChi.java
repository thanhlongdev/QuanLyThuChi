package com.poly.model;
// Generated Dec 7, 2019 5:52:52 PM by Hibernate Tools 4.3.1

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * LoaiChi generated by hbm2java
 */
@Entity
@Table(name = "LoaiChi",
         schema = "dbo",
         catalog = "DuAn1"
)
public class LoaiChi implements java.io.Serializable {

    private int maloaichi;
    private String mota;
    private String tenloai;
    private Set<ChiTietChi> chiTietChis = new HashSet<ChiTietChi>(0);

    public LoaiChi() {
    }

    public LoaiChi(int maloaichi) {
        this.maloaichi = maloaichi;
    }

    public LoaiChi(int maloaichi, String mota, String tenloai, Set<ChiTietChi> chiTietChis) {
        this.maloaichi = maloaichi;
        this.mota = mota;
        this.tenloai = tenloai;
        this.chiTietChis = chiTietChis;
    }

    @Id

    @Column(name = "maloaichi", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getMaloaichi() {
        return this.maloaichi;
    }

    public void setMaloaichi(int maloaichi) {
        this.maloaichi = maloaichi;
    }

    @Column(name = "mota")
    public String getMota() {
        return this.mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    @Column(name = "tenloai")
    public String getTenloai() {
        return this.tenloai;
    }

    public void setTenloai(String tenloai) {
        this.tenloai = tenloai;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "loaiChi")
    public Set<ChiTietChi> getChiTietChis() {
        return this.chiTietChis;
    }

    public void setChiTietChis(Set<ChiTietChi> chiTietChis) {
        this.chiTietChis = chiTietChis;
    }

}
