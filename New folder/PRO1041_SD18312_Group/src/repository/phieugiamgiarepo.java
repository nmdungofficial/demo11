/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.phieugiamgia;
import java.sql.*;
import model.loaiphieu;
import model.nhanvien;
import model.phieugiamgiachitiet;
import DBConnect.DBConnect;
/**
 *
 * @author Admin
 */
public class phieugiamgiarepo {
    public List<phieugiamgia> getall(String key){
        List<phieugiamgia> list=new ArrayList<>();
        try {
            Connection conn= DBConnect.getConnection();
            String sql="SELECT magiamgia, tengiamgia,phantrangiam, a.ngaytao,thoigianbatdau,thoigianketthuc,tennhanvien,tenloaigiamgia,id_nhanvien,b.id,id_pgg from phieugiamgia a join LOAIGIAMGIA b on a.IDLOAIGIAMGIA=b.ID join NHANVIEN c on a.IDNHANVIEN=c.ID_nhanvien where magiamgia like ? or tenloaigiamgia like ? or id_pgg like ?";
            PreparedStatement stm=conn.prepareStatement(sql);
            stm.setString(1, "%"+key+"%");
            stm.setString(2, "%"+key+"%");
            stm.setString(3, "%"+key+"%");
            ResultSet rs=stm.executeQuery();
            while (rs.next()) {                
               list.add(new phieugiamgia(rs.getInt(1),
                       rs.getString(2), rs.getInt(3),
                       rs.getString(4),
                       rs.getString(5),
                       rs.getString(6),
                       rs.getString(7),
                       rs.getString(8),
                       rs.getInt(9),
                       rs.getInt(10),
                       rs.getInt(11)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<nhanvien> getnhanvien(String key){
        List<nhanvien> list=new ArrayList<>();
        try {
            Connection conn= DBConnect.getConnection();
            String sql="select id_nhanvien,tennhanvien,tenchucvu from NHANVIEN a join chucvu b on a.id_chucvu=b.id_chucvu where tenchucvu like N'Quản lý' and tennhanvien like ? or id_nhanvien like ?";
            PreparedStatement stm=conn.prepareStatement(sql);
            stm.setString(1, "%"+key+"%");
            stm.setString(2, "%"+key+"%");
            ResultSet rs=stm.executeQuery();
            while (rs.next()) {                
                list.add(new nhanvien(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<phieugiamgiachitiet> getphieugiamgiachitiet(){
        List<phieugiamgiachitiet> list=new ArrayList<>();
        try {
            Connection conn= DBConnect.getConnection();
            String sql="select id_pgg,magiamgia,tengiamgia,phantrangiam,id,tenloaigiamgia, thoigianketthuc, count(magiamgia) from PHIEUGIAMGIA a join LOAIGIAMGIA b on a.IDLOAIGIAMGIA=b.ID where DATEADD(DAY, 0, CURRENT_TIMESTAMP) >= THOIGIANBATDAU and THOIGIANKETTHUC >=  DATEADD(DAY, 0, CURRENT_TIMESTAMP) group by id_pgg,magiamgia,tengiamgia,phantrangiam,id, thoigianketthuc,tenloaigiamgia ";
            PreparedStatement stm=conn.prepareStatement(sql);
          
            ResultSet rs=stm.executeQuery();
            while (rs.next()) {                
                list.add(new phieugiamgiachitiet(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getInt(8)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<phieugiamgia> getdangdienra(String key){
        List<phieugiamgia> list=new ArrayList<>();
        try {
            Connection conn=DBConnect.getConnection();
            String sql="SELECT magiamgia, tengiamgia,phantrangiam, a.ngaytao,thoigianbatdau,thoigianketthuc,tennhanvien,tenloaigiamgia,id_nhanvien,b.id,id_pgg from phieugiamgia a join LOAIGIAMGIA b on a.IDLOAIGIAMGIA=b.ID join NHANVIEN c on a.IDNHANVIEN=c.ID_nhanvien\n" +
"WHERE DATEADD(DAY, 0, CURRENT_TIMESTAMP) >= THOIGIANBATDAU and THOIGIANKETTHUC >=  DATEADD(DAY, 0, CURRENT_TIMESTAMP) and id_pgg like ?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, "%"+key+"%");
            ResultSet rs=stm.executeQuery();
            while (rs.next()) {                
                list.add(new phieugiamgia(rs.getInt(1),
                       rs.getString(2), rs.getInt(3),
                       rs.getString(4),
                       rs.getString(5),
                       rs.getString(6),
                       rs.getString(7),
                       rs.getString(8),
                       rs.getInt(9),
                       rs.getInt(10),
                       rs.getInt(11)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<phieugiamgia> getdaketthuc(String key){
        List<phieugiamgia> list=new ArrayList<>();
        try {
            Connection conn=DBConnect.getConnection();
            String sql="SELECT magiamgia, tengiamgia,phantrangiam, a.ngaytao,thoigianbatdau,thoigianketthuc,tennhanvien,tenloaigiamgia,id_nhanvien,b.id,id_pgg from phieugiamgia a join LOAIGIAMGIA b on a.IDLOAIGIAMGIA=b.ID join NHANVIEN c on a.IDNHANVIEN=c.ID_nhanvien\n" +
"WHERE THOIGIANKETTHUC < DATEADD(DAY, 0, CURRENT_TIMESTAMP) and id_pgg like ?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, "%"+key+"%");
            ResultSet rs=stm.executeQuery();
            while (rs.next()) {                
                list.add(new phieugiamgia(rs.getInt(1),
                       rs.getString(2), rs.getInt(3),
                       rs.getString(4),
                       rs.getString(5),
                       rs.getString(6),
                       rs.getString(7),
                       rs.getString(8),
                       rs.getInt(9),
                       rs.getInt(10),
                       rs.getInt(11)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<phieugiamgia> getsapdienra(String key){
        List<phieugiamgia> list=new ArrayList<>();
        try {
            Connection conn=DBConnect.getConnection();
            String sql="SELECT magiamgia, tengiamgia,phantrangiam, a.ngaytao,thoigianbatdau,thoigianketthuc,tennhanvien,tenloaigiamgia,id_nhanvien,b.id,id_pgg from phieugiamgia a join LOAIGIAMGIA b on a.IDLOAIGIAMGIA=b.ID join NHANVIEN c on a.IDNHANVIEN=c.ID_nhanvien\n" +
"WHERE DATEADD(DAY, 0, CURRENT_TIMESTAMP) < THOIGIANBATDAU and THOIGIANKETTHUC >  DATEADD(DAY, 0, CURRENT_TIMESTAMP) and id_pgg like ?";
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, "%"+key+"%");
            ResultSet rs=stm.executeQuery();
            while (rs.next()) {                
                list.add(new phieugiamgia(rs.getInt(1),
                       rs.getString(2), rs.getInt(3),
                       rs.getString(4),
                       rs.getString(5),
                       rs.getString(6),
                       rs.getString(7),
                       rs.getString(8),
                       rs.getInt(9),
                       rs.getInt(10),
                       rs.getInt(11)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<loaiphieu> getloaiphieu(){
        List<loaiphieu> list=new ArrayList<>();
        try {
            Connection conn=DBConnect.getConnection();
            String sql="select * from loaigiamgia";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs=stm.executeQuery();
            while (rs.next()) {                
                list.add(new loaiphieu(rs.getInt(1), rs.getString(2)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public void insertall(phieugiamgia pgg){
        try {
            Connection conn=DBConnect.getConnection();
            String sql="INSERT INTO PHIEUGIAMGIA \n" +
"(MAGIAMGIA, TENGIAMGIA, PHANTRANGIAM, NGAYTAO, THOIGIANBATDAU, THOIGIANKETTHUC, IDNHANVIEN, IDLOAIGIAMGIA)\n" +
"VALUES\n" +
"(?,?,?,getdate(),?,?,?,?)";
            PreparedStatement stm=conn.prepareStatement(sql);
            stm.setInt(1, pgg.getMaGiamGia());
            stm.setString(2, pgg.getTenGiamGia());
            stm.setInt(3, pgg.getGiaTriGiam());
            stm.setString(4, pgg.getNgayBatDau());
            stm.setString(5, pgg.getNgayKetThuc());
            stm.setInt(6, pgg.getMaNV());
            stm.setInt(7, pgg.getIdLoaiGG());
            stm.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
   public void updateall(phieugiamgia pgg,Integer id){
        try {
            Connection conn=DBConnect.getConnection();
            String sql="update phieugiamgia set magiamgia =?, tengiamgia = ?, phantrangiam =?,ngaytao = getdate(), thoigianbatdau = ?, thoigianketthuc = ?, idnhanvien=?,idloaigiamgia=? where id_pgg=?";
            PreparedStatement stm=conn.prepareStatement(sql);
            stm.setInt(1, pgg.getMaGiamGia());
            stm.setString(2, pgg.getTenGiamGia());
            stm.setInt(3, pgg.getGiaTriGiam());
            stm.setString(4, pgg.getNgayBatDau());
            stm.setString(5, pgg.getNgayKetThuc());
            stm.setInt(6, pgg.getMaNV());
            stm.setInt(7, pgg.getIdLoaiGG());
            stm.setInt(8, id);
            stm.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   public void deleteall(Integer id){
        try {
            Connection conn=DBConnect.getConnection();
            String sql="delete from phieugiamgia where id_pgg=?";
            PreparedStatement stm=conn.prepareStatement(sql);
            stm.setInt(1, id);
            stm.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
