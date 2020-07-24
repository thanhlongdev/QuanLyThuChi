package com.poly.model;
// Generated Dec 7, 2019 5:52:52 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ChiTietChi generated by hbm2java
 */
@Entity
@Table(name="ChiTietChi"
    ,schema="dbo"
    ,catalog="DuAn1"
)
public class ChiTietChi  implements java.io.Serializable {


     private ChiTietChiId id;
     private HoaDonChi hoaDonChi;
     private LoaiChi loaiChi;
     private String mota;
     private int sotien;

    public ChiTietChi() {
    }

	
    public ChiTietChi(ChiTietChiId id, HoaDonChi hoaDonChi, LoaiChi loaiChi) {
        this.id = id;
        this.hoaDonChi = hoaDonChi;
        this.loaiChi = loaiChi;
    }
    public ChiTietChi(ChiTietChiId id, HoaDonChi hoaDonChi, LoaiChi loaiChi, String mota, int sotien) {
       this.id = id;
       this.hoaDonChi = hoaDonChi;
       this.loaiChi = loaiChi;
       this.mota = mota;
       this.sotien = sotien;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="mahdchi", column=@Column(name="mahdchi", nullable=false) ), 
        @AttributeOverride(name="loaichi", column=@Column(name="loaichi", nullable=false) ) } )
    public ChiTietChiId getId() {
        return this.id;
    }
    
    public void setId(ChiTietChiId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="mahdchi", nullable=false, insertable=false, updatable=false)
    public HoaDonChi getHoaDonChi() {
        return this.hoaDonChi;
    }
    
    public void setHoaDonChi(HoaDonChi hoaDonChi) {
        this.hoaDonChi = hoaDonChi;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="loaichi", nullable=false, insertable=false, updatable=false)
    public LoaiChi getLoaiChi() {
        return this.loaiChi;
    }
    
    public void setLoaiChi(LoaiChi loaiChi) {
        this.loaiChi = loaiChi;
    }

    
    @Column(name="mota")
    public String getMota() {
        return this.mota;
    }
    
    public void setMota(String mota) {
        this.mota = mota;
    }

    
    @Column(name="sotien", precision=53, scale=0)
    public int getSotien() {
        return this.sotien;
    }
    
    public void setSotien(int sotien) {
        this.sotien = sotien;
    }




}

