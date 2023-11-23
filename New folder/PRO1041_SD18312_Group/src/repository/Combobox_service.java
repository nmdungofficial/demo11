/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import DBConnect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Giay;
import model.HinhAnh;

/**
 *
 * @author Nguyen Manh Dung
 */
public class Combobox_service {

    public ArrayList<Giay> getCBOdanhmuc() {
        ArrayList<Giay> lst = new ArrayList<>();
        String sql = "select * from DanhMuc";
        //Tạo kết nối
        Connection cn = DBConnect.getConnection();
        try {
            //Tạo statement
            PreparedStatement pstm = cn.prepareStatement(sql);
            //Thi hành Statement=> dùng Resultset nhận kq
            ResultSet rs = pstm.executeQuery();
            //xử lý kq: duyệt rs => đổ dữ liệu vào lst
            while (rs.next()) {
                Giay n = new Giay();
                n.setId_DanhMuc(rs.getInt("ID_DanhMuc"));
                n.setTenDanhMuc(rs.getString("Ten_DanhMuc"));
                lst.add(n);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return lst;
    }

    public ArrayList<Giay> getCBOxuatxu() {
        ArrayList<Giay> lst = new ArrayList<>();
        String sql = "select * from XuatXu";
        //Tạo kết nối
        Connection cn = DBConnect.getConnection();
        try {
            //Tạo statement
            PreparedStatement pstm = cn.prepareStatement(sql);
            //Thi hành Statement=> dùng Resultset nhận kq
            ResultSet rs = pstm.executeQuery();
            //xử lý kq: duyệt rs => đổ dữ liệu vào lst
            while (rs.next()) {
                Giay n = new Giay();
                n.setId_XuatXu(rs.getInt("ID_XuatXu"));
                n.setTenXuatXu(rs.getString("Ten_XuatXu"));
                lst.add(n);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return lst;
    }

    public ArrayList<Giay> getCBOmausac() {
        ArrayList<Giay> lst = new ArrayList<>();
        String sql = "select * from MauSac";
        //Tạo kết nối
        Connection cn = DBConnect.getConnection();
        try {
            //Tạo statement
            PreparedStatement pstm = cn.prepareStatement(sql);
            //Thi hành Statement=> dùng Resultset nhận kq
            ResultSet rs = pstm.executeQuery();
            //xử lý kq: duyệt rs => đổ dữ liệu vào lst
            while (rs.next()) {
                Giay n = new Giay();
                n.setId_mauSac(rs.getInt("ID_MauSac"));
                n.setTenMauSac(rs.getString("Ten_MauSac"));
                lst.add(n);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return lst;
    }

    public ArrayList<Giay> getCBOkichthuoc() {
        ArrayList<Giay> lst = new ArrayList<>();
        String sql = "select * from KichThuoc";
        //Tạo kết nối
        Connection cn = DBConnect.getConnection();
        try {
            //Tạo statement
            PreparedStatement pstm = cn.prepareStatement(sql);
            //Thi hành Statement=> dùng Resultset nhận kq
            ResultSet rs = pstm.executeQuery();
            //xử lý kq: duyệt rs => đổ dữ liệu vào lst
            while (rs.next()) {
                Giay n = new Giay();
                n.setId_Kichthuoc(rs.getInt("ID_KichThuoc"));
                n.setTenKichThuoc(rs.getInt("Ten_KichThuoc"));
                lst.add(n);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return lst;
    }

    public ArrayList<Giay> getCBOchatlieu() {
        ArrayList<Giay> lst = new ArrayList<>();
        String sql = "select * from ChatLieu";
        //Tạo kết nối
        Connection cn = DBConnect.getConnection();
        try {
            //Tạo statement
            PreparedStatement pstm = cn.prepareStatement(sql);
            //Thi hành Statement=> dùng Resultset nhận kq
            ResultSet rs = pstm.executeQuery();
            //xử lý kq: duyệt rs => đổ dữ liệu vào lst
            while (rs.next()) {
                Giay n = new Giay();
                n.setId_ChatLieu(rs.getInt("ID_ChatLieu"));
                n.setTenChatLieu(rs.getString("Ten_ChatLieu"));
                lst.add(n);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return lst;
    }

    public ArrayList<Giay> getCBOkieude() {
        ArrayList<Giay> lst = new ArrayList<>();
        String sql = "select * from KieuDe";
        //Tạo kết nối
        Connection cn = DBConnect.getConnection();
        try {
            //Tạo statement
            PreparedStatement pstm = cn.prepareStatement(sql);
            //Thi hành Statement=> dùng Resultset nhận kq
            ResultSet rs = pstm.executeQuery();
            //xử lý kq: duyệt rs => đổ dữ liệu vào lst
            while (rs.next()) {
                Giay n = new Giay();
                n.setId_KieuDe(rs.getInt("ID_KieuDe"));
                n.setTenKieuDe(rs.getString("Ten_KieuDe"));
                lst.add(n);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return lst;
    }

    public ArrayList<Giay> getCBOkieumui() {
        ArrayList<Giay> lst = new ArrayList<>();
        String sql = "select * from KieuMui";
        //Tạo kết nối
        Connection cn = DBConnect.getConnection();
        try {
            //Tạo statement
            PreparedStatement pstm = cn.prepareStatement(sql);
            //Thi hành Statement=> dùng Resultset nhận kq
            ResultSet rs = pstm.executeQuery();
            //xử lý kq: duyệt rs => đổ dữ liệu vào lst
            while (rs.next()) {
                Giay n = new Giay();
                n.setId_KieuMui(rs.getInt("ID_KieuMui"));
                n.setTenKieuMui(rs.getString("Ten_KieuMui"));
                lst.add(n);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return lst;
    }

    public ArrayList<Giay> getCBOloplot() {
        ArrayList<Giay> lst = new ArrayList<>();
        String sql = "select * from LopLot";
        //Tạo kết nối
        Connection cn = DBConnect.getConnection();
        try {
            //Tạo statement
            PreparedStatement pstm = cn.prepareStatement(sql);
            //Thi hành Statement=> dùng Resultset nhận kq
            ResultSet rs = pstm.executeQuery();
            //xử lý kq: duyệt rs => đổ dữ liệu vào lst
            while (rs.next()) {
                Giay n = new Giay();
                n.setId_LopLot(rs.getInt("ID_LopLot"));
                n.setTenLopLot(rs.getString("Ten_LopLot"));
                lst.add(n);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return lst;
    }

    public ArrayList<HinhAnh> getCBOHinhAnh() {
        ArrayList<HinhAnh> lst = new ArrayList<>();
        String sql = "select * from HinhAnh";
        //Tạo kết nối
        Connection cn = DBConnect.getConnection();
        try {
            //Tạo statement
            PreparedStatement pstm = cn.prepareStatement(sql);
            //Thi hành Statement=> dùng Resultset nhận kq
            ResultSet rs = pstm.executeQuery();
            //xử lý kq: duyệt rs => đổ dữ liệu vào lst
            while (rs.next()) {
                HinhAnh ha = new HinhAnh();
//                Giay n = new Giay();
                ha.setIdHinhAnh(rs.getInt("ID_HinhAnh"));
                ha.setTen_HinhAnh(rs.getString("IMG"));
                lst.add(ha);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return lst;
    }
}
