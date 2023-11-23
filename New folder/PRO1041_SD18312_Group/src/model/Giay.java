/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Nguyen Manh Dung
 */
public class Giay {

    private Integer id_giay;
    private Integer id_giayChiTiet;
    private String tenGiay;
    private Integer soLuong;
    private float giaNhap;
    private float giaBan;
    private String tenMauSac;
    private Integer id_mauSac;
    private Integer tenKichThuoc;
    private Integer id_Kichthuoc;
    private String tenChatLieu;
    private Integer id_ChatLieu;
    private String tenXuatXu;
    private Integer id_XuatXu;
    private String tenLopLot;
    private Integer id_LopLot;
    private String tenKieuMui;
    private Integer id_KieuMui;
    private String tenKieuDe;
    private Integer id_KieuDe;
    private String tenDanhMuc;
    private Integer id_DanhMuc;
    private String img;
    private Integer id_HinhAnh;
    private String TrangThai;
    private String ma_giay;
    private String ma_giayChiTiet;
    private String ten_GiayChiTiet;

    public Giay() {
    }

    public Giay(Integer id_giay, Integer id_giayChiTiet, String tenGiay, Integer soLuong, float giaNhap, float giaBan, String tenMauSac, Integer id_mauSac, Integer tenKichThuoc, Integer id_Kichthuoc, String tenChatLieu, Integer id_ChatLieu, String tenXuatXu, Integer id_XuatXu, String tenLopLot, Integer id_LopLot, String tenKieuMui, Integer id_KieuMui, String tenKieuDe, Integer id_KieuDe, String tenDanhMuc, Integer id_DanhMuc, String img, Integer id_HinhAnh, String TrangThai, String ma_giay, String ma_giayChiTiet, String ten_GiayChiTiet) {
        this.id_giay = id_giay;
        this.id_giayChiTiet = id_giayChiTiet;
        this.tenGiay = tenGiay;
        this.soLuong = soLuong;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.tenMauSac = tenMauSac;
        this.id_mauSac = id_mauSac;
        this.tenKichThuoc = tenKichThuoc;
        this.id_Kichthuoc = id_Kichthuoc;
        this.tenChatLieu = tenChatLieu;
        this.id_ChatLieu = id_ChatLieu;
        this.tenXuatXu = tenXuatXu;
        this.id_XuatXu = id_XuatXu;
        this.tenLopLot = tenLopLot;
        this.id_LopLot = id_LopLot;
        this.tenKieuMui = tenKieuMui;
        this.id_KieuMui = id_KieuMui;
        this.tenKieuDe = tenKieuDe;
        this.id_KieuDe = id_KieuDe;
        this.tenDanhMuc = tenDanhMuc;
        this.id_DanhMuc = id_DanhMuc;
        this.img = img;
        this.id_HinhAnh = id_HinhAnh;
        this.TrangThai = TrangThai;
        this.ma_giay = ma_giay;
        this.ma_giayChiTiet = ma_giayChiTiet;
        this.ten_GiayChiTiet = ten_GiayChiTiet;
    }

    public Integer getId_giay() {
        return id_giay;
    }

    public void setId_giay(Integer id_giay) {
        this.id_giay = id_giay;
    }

    public Integer getId_giayChiTiet() {
        return id_giayChiTiet;
    }

    public void setId_giayChiTiet(Integer id_giayChiTiet) {
        this.id_giayChiTiet = id_giayChiTiet;
    }

    public String getTenGiay() {
        return tenGiay;
    }

    public void setTenGiay(String tenGiay) {
        this.tenGiay = tenGiay;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public String getTenMauSac() {
        return tenMauSac;
    }

    public void setTenMauSac(String tenMauSac) {
        this.tenMauSac = tenMauSac;
    }

    public Integer getId_mauSac() {
        return id_mauSac;
    }

    public void setId_mauSac(Integer id_mauSac) {
        this.id_mauSac = id_mauSac;
    }

    public Integer getTenKichThuoc() {
        return tenKichThuoc;
    }

    public void setTenKichThuoc(Integer tenKichThuoc) {
        this.tenKichThuoc = tenKichThuoc;
    }

    public Integer getId_Kichthuoc() {
        return id_Kichthuoc;
    }

    public void setId_Kichthuoc(Integer id_Kichthuoc) {
        this.id_Kichthuoc = id_Kichthuoc;
    }

    public String getTenChatLieu() {
        return tenChatLieu;
    }

    public void setTenChatLieu(String tenChatLieu) {
        this.tenChatLieu = tenChatLieu;
    }

    public Integer getId_ChatLieu() {
        return id_ChatLieu;
    }

    public void setId_ChatLieu(Integer id_ChatLieu) {
        this.id_ChatLieu = id_ChatLieu;
    }

    public String getTenXuatXu() {
        return tenXuatXu;
    }

    public void setTenXuatXu(String tenXuatXu) {
        this.tenXuatXu = tenXuatXu;
    }

    public Integer getId_XuatXu() {
        return id_XuatXu;
    }

    public void setId_XuatXu(Integer id_XuatXu) {
        this.id_XuatXu = id_XuatXu;
    }

    public String getTenLopLot() {
        return tenLopLot;
    }

    public void setTenLopLot(String tenLopLot) {
        this.tenLopLot = tenLopLot;
    }

    public Integer getId_LopLot() {
        return id_LopLot;
    }

    public void setId_LopLot(Integer id_LopLot) {
        this.id_LopLot = id_LopLot;
    }

    public String getTenKieuMui() {
        return tenKieuMui;
    }

    public void setTenKieuMui(String tenKieuMui) {
        this.tenKieuMui = tenKieuMui;
    }

    public Integer getId_KieuMui() {
        return id_KieuMui;
    }

    public void setId_KieuMui(Integer id_KieuMui) {
        this.id_KieuMui = id_KieuMui;
    }

    public String getTenKieuDe() {
        return tenKieuDe;
    }

    public void setTenKieuDe(String tenKieuDe) {
        this.tenKieuDe = tenKieuDe;
    }

    public Integer getId_KieuDe() {
        return id_KieuDe;
    }

    public void setId_KieuDe(Integer id_KieuDe) {
        this.id_KieuDe = id_KieuDe;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

    public Integer getId_DanhMuc() {
        return id_DanhMuc;
    }

    public void setId_DanhMuc(Integer id_DanhMuc) {
        this.id_DanhMuc = id_DanhMuc;
    }

    @Override
    public String toString() {
        return tenDanhMuc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getId_HinhAnh() {
        return id_HinhAnh;
    }

    public void setId_HinhAnh(Integer id_HinhAnh) {
        this.id_HinhAnh = id_HinhAnh;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public String getMa_giay() {
        return ma_giay;
    }

    public void setMa_giay(String ma_giay) {
        this.ma_giay = ma_giay;
    }

    public String getMa_giayChiTiet() {
        return ma_giayChiTiet;
    }

    public void setMa_giayChiTiet(String ma_giayChiTiet) {
        this.ma_giayChiTiet = ma_giayChiTiet;
    }

    public String getTen_GiayChiTiet() {
        return ten_GiayChiTiet;
    }

    public void setTen_GiayChiTiet(String ten_GiayChiTiet) {
        this.ten_GiayChiTiet = ten_GiayChiTiet;
    }

}
