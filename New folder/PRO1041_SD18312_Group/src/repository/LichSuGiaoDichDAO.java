/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import DBConnect.DBConnect;
import java.sql.*;
import java.util.ArrayList;
import model.LichSuGiaoDich;

/**
 *
 *
 * @author Fpt06
 */
public class LichSuGiaoDichDAO {

   public ArrayList<LichSuGiaoDich> getAllLichSuGiaoDich() {
    ArrayList<LichSuGiaoDich> lst = new ArrayList<>();
   
    try {
        Connection cn = DBConnect.getConnection();
        PreparedStatement pstm = cn.prepareStatement(
            "SELECT KHACHHANG.TenKH, LichSuMuaHang1.SanPham_DaMua, KHACHHANG.SoDT, LichSuMuaHang1.SoLuong, LichSuMuaHang1.SoTiem_Mua, LichSuMuaHang1.ThanhToan " +
            "FROM LichSuMuaHang1 " +
            "JOIN KHACHHANG ON LichSuMuaHang1.ID_KhachHang = KHACHHANG.ID_KhachHang"
        );

        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            LichSuGiaoDich ls = new LichSuGiaoDich(
                rs.getString("TenKH"),
                rs.getString("SanPham_DaMua"),
                rs.getString("SoDT"),
                rs.getFloat("SoLuong"),
                rs.getFloat("SoTiem_Mua"),
                rs.getBoolean("ThanhToan")
            );
            lst.add(ls);
        }
    } catch (Exception e) {
        System.out.println(e);
    }
    return lst;
}

}
