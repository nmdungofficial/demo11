/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import DBConnect.DBConnect;
import java.util.ArrayList;
import model.KhachHang;
import java.sql.*;
import javax.swing.JTextField;

/**
 *
 * @author Fpt06
 */
public class KhachHangDAO implements NewInterface1 {

    @Override
    public ArrayList<KhachHang> getAllKhachHang() {
        ArrayList<KhachHang> lst = new ArrayList<>();
        String sql = "select * from KHACHHANG";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString("ID_KhachHang"), rs.getString("TenKH"),
                        rs.getBoolean("GioiTinh"), rs.getInt("SoDT"),
                        rs.getString("Email"), rs.getString("DiaChi"), rs.getBoolean("TrangThai"));
                lst.add(kh);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lst;
    }

    public ArrayList<KhachHang> getAllKhachHangNam() {
        ArrayList<KhachHang> lst = new ArrayList<>();
        String sql = "select * from KHACHHANG\n"
                + "where GioiTinh ='1'";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString("IDKhachHang"), rs.getString("TenKH"),
                        rs.getBoolean("GioiTinh"), rs.getInt("SoDT"),
                        rs.getString("Email"), rs.getString("DiaChi"), rs.getBoolean("TrangThai"));
                lst.add(kh);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lst;
    }

    public ArrayList<KhachHang> getAllKhachHangNu() {
        ArrayList<KhachHang> lst = new ArrayList<>();
        String sql = "select * from KHACHHANG\n"
                + "where GioiTinh ='0'";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString("ID_KH"), rs.getString("TenKH"),
                        rs.getBoolean("GioiTinh"), rs.getInt("SoDT"),
                        rs.getString("Email"), rs.getString("DiaChi"), rs.getBoolean("TrangThai"));
                lst.add(kh);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lst;
    }

    public ArrayList<KhachHang> getAllKhachHangHD() {
        ArrayList<KhachHang> lst = new ArrayList<>();
        String sql = "select * from KHACHHANG\n"
                + "where TrangThai ='1'";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString("ID_KhachHang"), rs.getString("TenKH"),
                        rs.getBoolean("GioiTinh"), rs.getInt("SoDT"),
                        rs.getString("Email"), rs.getString("DiaChi"), rs.getBoolean("TrangThai"));
                lst.add(kh);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lst;
    }

     public ArrayList<KhachHang> getAllKhachHangKHD() {
        ArrayList<KhachHang> lst = new ArrayList<>();
        String sql = "select * from KHACHHANG\n"
                + "where TrangThai ='0'";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString("MaKhachHang"), rs.getString("TenKH"),
                        rs.getBoolean("GioiTinh"), rs.getInt("SDT"),
                        rs.getString("Email"), rs.getString("DiaChi"), rs.getBoolean("TrangThai"));
                lst.add(kh);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lst;
    }
    public static ArrayList<KhachHang> getAllTimKiem(JTextField txt) {
        ArrayList<KhachHang> lst = new ArrayList<>();
        String text = txt.getText();
        String sql = """
                     SELECT * FROM KHACHHANG
                     WHERE SoDT = '"""+text+"'";
        Connection cn = DBConnect.getConnection();
        try {
//            PreparedStatement pstm = cn.prepareStatement(sql);
//            pstm.setInt(1, id);
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                String ma = rs.getString(1);
                String ten = rs.getString(2);
                boolean gt = rs.getBoolean(3);
                int sdt = rs.getInt(5);
                String em = rs.getString(6);
                String dc = rs.getString(7);
                boolean tt = rs.getBoolean(10);
                KhachHang kh = new KhachHang(ma, ten, gt, sdt, em, dc, tt);
                lst.add(kh);
            }
        } catch (SQLException e) {
            System.out.println("loi");
            
        }
        return lst;
    }
//    public static void main(String[] args) {
//        
//    }

//    @Override
    public static void insert(KhachHang kh) {
//        Integer row = null;
        String sql = """
                     insert into KHACHHANG(TenKH, GioiTinh, SoDT, Email, DiaChi, TrangThai)
                     values  (?,?,?,?,?,?)""";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
//            pstm.setString(1, kh.getMaKhachHang());
            pstm.setString(5, kh.getDiaChi());
            pstm.setString(1, kh.getTenKhachHang());
            pstm.setBoolean(2, kh.isGioiTinh());
            pstm.setString(4, kh.getEmail());
            pstm.setInt(3, kh.getSdt());
            pstm.setBoolean(6, kh.isTrangThai());
//            row = pstm.executeUpdate();
            pstm.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
//        return row;
    }

    @Override
    public Integer update(KhachHang kh) {
        Integer row = null;
        String sql = "update KHACHHANG\n"
                + "set DiaChi =?,TenKH=?,GioiTinh=?,Email=?,SoDT=?,TrangThai=?\n"
                + "where ID_KhachHang=?";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(7, kh.getMaKhachHang());
            pstm.setString(1, kh.getDiaChi());
            pstm.setString(2, kh.getTenKhachHang());
            pstm.setBoolean(3, kh.isGioiTinh());
            pstm.setString(4, kh.getEmail());
            pstm.setInt(5, kh.getSdt());
            pstm.setBoolean(6, kh.isTrangThai());
            row = pstm.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }
    public Integer delete(KhachHang kh) {
        Integer row = null;
        String sql = "delete from KHACHHANG "
                  + "where ID_KhachHang like ?";
        Connection cn = DBConnect.getConnection();
        try {
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, kh.getMaKhachHang());
//            pstm.setString(1, kh.getDiaChi());
//            pstm.setString(2, kh.getTenKhachHang());
//            pstm.setBoolean(3, kh.isGioiTinh());
//            pstm.setString(4, kh.getEmail());
//            pstm.setInt(5, kh.getSdt());
//            pstm.setBoolean(6, kh.isTrangThai());
           row = pstm.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
        return row;
    }
    @Override
    public int find(String id) {
        int a = -1;
        for (int i = 0; i < getAllKhachHang().size(); i++) {
            if (getAllKhachHang().get(i).getMaKhachHang().equalsIgnoreCase(id) || getAllKhachHang().get(i).getMaKhachHang() == id) {
                a = i;
                break;
            }
        }
        return a;
    }

}
