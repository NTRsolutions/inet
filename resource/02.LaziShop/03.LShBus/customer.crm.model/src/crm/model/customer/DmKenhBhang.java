package crm.model.customer;
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
import javax.persistence.Temporal;

/**
 * DmKenhBhang generated by hbm2java
 */
@Entity
@Table(name = "DM_KENH_BHANG")
public class DmKenhBhang implements java.io.Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "DM_KENH_BHANG_gen")
    @SequenceGenerator(name = "DM_KENH_BHANG_gen", sequenceName = "DM_KENH_BHANG_SEQ")
    @Column(name = "ID")
    private long id;
    @Column(name = "MA_KENH")
    private String maKenh;
    @Column(name = "KENH_BHANG")
    private String kenhBhang;
    @Column(name = "TTHAI_BGHI")
    private String tthaiBghi;
    @Column(name = "TTHAI_NVU")
    private String tthaiNvu;
    @Column(name = "MA_DVI_QLY")
    private String maDviQly;
    @Column(name = "NGAY_NHAP")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ngayNhap;
    @Column(name = "NGUOI_NHAP")
    private String nguoiNhap;
    @Column(name = "NGAY_CNHAT")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ngayCnhat;
    @Column(name = "NGUOI_CNHAT")
    private String nguoiCnhat;

    public DmKenhBhang() {
    }

    public DmKenhBhang(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaKenh() {
        return maKenh;
    }

    public void setMaKenh(String maKenh) {
        this.maKenh = maKenh;
    }

    public String getKenhBhang() {
        return kenhBhang;
    }

    public void setKenhBhang(String kenhBhang) {
        this.kenhBhang = kenhBhang;
    }

    public String getTthaiBghi() {
        return tthaiBghi;
    }

    public void setTthaiBghi(String tthaiBghi) {
        this.tthaiBghi = tthaiBghi;
    }

    public String getTthaiNvu() {
        return tthaiNvu;
    }

    public void setTthaiNvu(String tthaiNvu) {
        this.tthaiNvu = tthaiNvu;
    }

    public String getMaDviQly() {
        return maDviQly;
    }

    public void setMaDviQly(String maDviQly) {
        this.maDviQly = maDviQly;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getNguoiNhap() {
        return nguoiNhap;
    }

    public void setNguoiNhap(String nguoiNhap) {
        this.nguoiNhap = nguoiNhap;
    }

    public Date getNgayCnhat() {
        return ngayCnhat;
    }

    public void setNgayCnhat(Date ngayCnhat) {
        this.ngayCnhat = ngayCnhat;
    }

    public String getNguoiCnhat() {
        return nguoiCnhat;
    }

    public void setNguoiCnhat(String nguoiCnhat) {
        this.nguoiCnhat = nguoiCnhat;
    }
    
}
