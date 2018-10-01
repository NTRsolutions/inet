package lazi.model.customer;
// Generated Mar 23, 2017 3:00:59 PM by Hibernate Tools 3.6.0

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * KhKhachHangTtinh generated by hbm2java
 */
@Entity
@Table(name = "KH_LSU_MUAHANG")
public class KhLsuMuahang implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "KH_LSU_MUAHANG_GEN")
    @SequenceGenerator(name = "KH_LSU_MUAHANG_GEN", sequenceName = "KH_LSU_MUAHANG_SEQ")
    @Column(name = "ID")
    private long id;
    @Column(name = "ID_KHANG")
    private long idKhang;
    @Column(name = "MA_KHANG")
    private String maKhang;
    @Column(name = "LOAI_GIAODICH")
    private String loaiGiaodich;
    @Column(name = "ID_GIAODICH")
    private long idGiaodich;
    @Column(name = "MA_GIAODICH")
    private String maGiaodich;
    @Column(name = "SO_DIEM")
    private long soDiem;
    @Column(name = "SO_TIEN")
    private double soTien;
    @Column(name = "NGAY_GIAODICH")
    private Date ngayGdich;
    @Column(name = "MA_DVI_GDICH")
    private String maDviGdich;
    @Column(name = "MA_DVI_QLY")
    private String maDviQly;

    @Transient
    private String trangThai;
    
    public KhLsuMuahang() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdKhang() {
        return idKhang;
    }

    public void setIdKhang(long idKhang) {
        this.idKhang = idKhang;
    }

    public String getMaKhang() {
        return maKhang;
    }

    public void setMaKhang(String maKhang) {
        this.maKhang = maKhang;
    }

    public String getLoaiGiaodich() {
        return loaiGiaodich;
    }

    public void setLoaiGiaodich(String loaiGiaodich) {
        this.loaiGiaodich = loaiGiaodich;
    }

    public long getIdGiaodich() {
        return idGiaodich;
    }

    public void setIdGiaodich(long idGiaodich) {
        this.idGiaodich = idGiaodich;
    }

    public String getMaGiaodich() {
        return maGiaodich;
    }

    public void setMaGiaodich(String maGiaodich) {
        this.maGiaodich = maGiaodich;
    }

    public long getSoDiem() {
        return soDiem;
    }

    public void setSoDiem(long soDiem) {
        this.soDiem = soDiem;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public Date getNgayGdich() {
        return ngayGdich;
    }

    public void setNgayGdich(Date ngayGdich) {
        this.ngayGdich = ngayGdich;
    }

    public String getMaDviGdich() {
        return maDviGdich;
    }

    public void setMaDviGdich(String maDviGdich) {
        this.maDviGdich = maDviGdich;
    }

    public String getMaDviQly() {
        return maDviQly;
    }

    public void setMaDviQly(String maDviQly) {
        this.maDviQly = maDviQly;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
}