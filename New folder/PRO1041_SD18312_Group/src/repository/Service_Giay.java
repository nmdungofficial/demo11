package repository;

import DBConnect.DBConnect;
import java.util.ArrayList;
import model.Giay;
import java.sql.*;

public class Service_Giay implements Interface_Giayy {

    @Override
    public ArrayList<Giay> getAll() {
        ArrayList<Giay> list = new ArrayList<>();
        Connection con = DBConnect.getConnection();
        var sql = """
                  SELECT 
                      g.ID_Giay,
                      g.Ma_giay,
                      g.Ten_Giay, 
                      xx.Ten_XuatXu,
                      dm.Ten_DanhMuc,
                      g.TrangThai_Giay
                  FROM 
                      Giay g
                  
                  JOIN 
                      XuatXu xx ON g.ID_XuatXu = xx.ID_XuatXu
                  
                  JOIN 
                      DanhMuc dm ON g.ID_DanhMuc = dm.ID_DanhMuc """;
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Giay g = new Giay();
                g.setId_giay(rs.getInt("ID_Giay"));
                g.setMa_giay(rs.getString("Ma_Giay"));
                g.setTenGiay(rs.getString("Ten_Giay"));
                g.setTenXuatXu(rs.getString("Ten_XuatXu"));
                g.setTenDanhMuc(rs.getString("Ten_DanhMuc"));
                g.setTrangThai(rs.getString("TrangThai_Giay"));

                list.add(g);
            }
        } catch (SQLException e) {
        }
        return list;

    }

    public ArrayList<Giay> timKiemSp(int i, int id) {
        ArrayList<Giay> list = new ArrayList<>();
        Connection con = DBConnect.getConnection();
        System.out.println(id);
        var sql = """
                    SELECT 
                        g.ID_Giay,
                        g.Ma_giay,
                        g.Ten_Giay,
                        g.ID_DanhMuc,
                        g.ID_XuatXu,
                        xx.Ten_XuatXu,
                        dm.Ten_DanhMuc,
                        g.TrangThai_Giay
                    FROM 
                        Giay g
                    JOIN 
                        XuatXu xx ON g.ID_XuatXu = xx.ID_XuatXu
                    JOIN 
                        DanhMuc dm ON g.ID_DanhMuc = dm.ID_DanhMuc 
                    """;
        if (i == 0) {
            sql += "WHERE g.ID_XuatXu=" + id;
        } else {
            if (i == 1) {
                sql += "WHERE g.ID_DanhMuc=" + id;
            } else {
                if (i == 2) {
                    sql += "WHERE g.TrangThai_Giay = N'Đang Hoạt Động'";
                } else {
                    sql += "WHERE g.TrangThai_Giay = N'Ngừng Hoạt Động'";
                }
            }
        }

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Giay g = new Giay();
                g.setId_giay(rs.getInt("ID_Giay"));
                g.setMa_giay(rs.getString("Ma_Giay"));
                g.setTenGiay(rs.getString("Ten_Giay"));
                g.setTenXuatXu(rs.getString("Ten_XuatXu"));
                g.setTenDanhMuc(rs.getString("Ten_DanhMuc"));
                g.setTrangThai(rs.getString("TrangThai_Giay"));

                list.add(g);
            }
        } catch (SQLException e) {
            System.out.println("Lỗi :\n" + e.getMessage());
        }
        return list;

    }

    @Override
    public Integer updateGiay(Giay giay
    ) {
        try {
            String sql = "update giay set "
                    + "Ma_Giay = ?"
                    + ", Ten_Giay=?"
                    + ", ID_XuatXu=?"
                    + ", ID_DanhMuc=? "
                    + ", TrangThai_Giay =?"
                    + "Where id_giay = ?";

            Connection con = DBConnect.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, giay.getMa_giay());
            pstm.setString(2, giay.getTenGiay());
            pstm.setInt(3, giay.getId_XuatXu());
            pstm.setInt(4, giay.getId_DanhMuc());
            pstm.setString(5, giay.getTrangThai());
            pstm.setInt(6, giay.getId_giay());
            pstm.executeUpdate();

            pstm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Lỗi " + e.getMessage());
            return 1;
        }
        return 0;
    }

    @Override
    public Integer delete(Integer id_giay, String trangThai
    ) {
        int row = 0;
        try {
            String sql = "update giay set TrangThai_Giay = ? where id_giay = ?";
            Connection con = DBConnect.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, trangThai);
            ps.setInt(2, id_giay);
            row = ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Lỗi" + e.getMessage());
            return 1;
        }
        return row;
    }

    @Override
    public Integer addGiay(Giay giay
    ) {
        Integer row = null;
        Connection con = DBConnect.getConnection();
        String sql = """
                      insert into Giay(Ma_Giay, Ten_Giay, ID_XuatXu, ID_DanhMuc, TrangThai_Giay )
                     values (?, ?, ?, ?, ?)""";
        try {

            PreparedStatement pstm = con.prepareStatement(sql);
//            pstm.setInt(1, giay.getId_giay());
            pstm.setString(1, giay.getMa_giay());
            pstm.setString(2, giay.getTenGiay());
            pstm.setInt(3, giay.getId_XuatXu());
            pstm.setInt(4, giay.getId_DanhMuc());
            pstm.setString(5, giay.getTrangThai());

            row = pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Lỗi" + e.getMessage());
        }
        return row;

    }

    @Override
    public ArrayList<Giay> getAllCT() {
        ArrayList<Giay> list = new ArrayList<>();
        Connection con = DBConnect.getConnection();
        String sql = """
                     SELECT
                         GC.Ma_GiayChiTiet,
                         GC.ID_GIAYCHITIET,
                         G.ID_Giay AS IDGiay,
                         G.Ten_Giay, 
                         GC.Ten_GiayChiTiet,
                         GC.SoLuong,
                         GC.GiaBan,
                         MS.Ten_MauSac AS MauSac,
                         KT.Ten_KichThuoc AS KichThuoc,
                         CL.Ten_ChatLieu AS ChatLieu,
                         KM.Ten_KieuMui AS KieuMui,
                         KD.Ten_KieuDe AS KieuDe,
                         LL.Ten_LopLot AS LopLot,
                         HA.IMG AS HinhAnh
                     FROM
                         Giay_ChiTiet GC
                     INNER JOIN MauSac MS ON GC.ID_MauSac = MS.ID_MauSac
                     INNER JOIN KichThuoc KT ON GC.ID_KichThuoc = KT.ID_KichThuoc
                     INNER JOIN ChatLieu CL ON GC.ID_ChatLieu = CL.ID_ChatLieu
                     INNER JOIN KieuMui KM ON GC.ID_KieuMui = KM.ID_KieuMui
                     INNER JOIN KieuDe KD ON GC.ID_KieuDe = KD.ID_KieuDe
                     INNER JOIN LopLot LL ON GC.ID_LopLot = LL.ID_LopLot
                     INNER JOIN HinhAnh HA ON GC.ID_HinhAnh = HA.ID_HinhAnh
                     LEFT JOIN Giay G ON GC.ID_Giay = G.ID_Giay""";
        try {

            PreparedStatement pstm;
            pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Giay g = new Giay();

                g.setMa_giayChiTiet(rs.getString("Ma_GiayChiTiet"));
                g.setId_giay(rs.getInt("IDGiay"));
                g.setTenGiay(rs.getString("Ten_giay"));
                g.setTen_GiayChiTiet(rs.getString("Ten_GiayChiTiet"));
                g.setSoLuong(rs.getInt("SoLuong"));
                g.setGiaBan(rs.getFloat("GiaBan"));
                g.setTenMauSac(rs.getString("MauSac"));
                g.setTenKichThuoc(rs.getInt("KichThuoc")); // Điều chỉnh để phù hợp với kiểu dữ liệu
                g.setTenChatLieu(rs.getString("ChatLieu"));
                g.setTenKieuMui(rs.getString("KieuMui"));
                g.setTenKieuDe(rs.getString("KieuDe"));
                g.setTenLopLot(rs.getString("LopLot"));
                g.setImg(rs.getString("HinhAnh"));
                g.setId_giayChiTiet(rs.getInt("ID_GIAYCHITIET"));
                list.add(g);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            // Đóng Connection ở đây nếu cần
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return list;
    }

    public ArrayList<String> Combox_SanPham() {
        ArrayList<String> Combox_SanPham = new ArrayList<>();
        String sql = "select Ten_Giay from Giay";
        try {
            Connection con = DBConnect.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Combox_SanPham.add(rs.getString("Ten_Giay"));
            }
        } catch (SQLException e) {
        }
        return Combox_SanPham;

    }

    @Override
    public Integer addGiayChiTiet(Giay giay) {
        Integer row = null;
        Connection con = DBConnect.getConnection();
        String sql = "insert into \n"
                + "                     Giay_ChiTiet(ID_Giay, Ma_GiayChiTiet, Ten_GiayChiTiet, ID_MauSac, ID_KichThuoc,SoLuong, GiaBan ,ID_ChatLieu, ID_KieuDe, ID_LopLot, ID_KieuMui, ID_HinhAnh )\n"
                + "                     values (?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?)";

        try {

            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setInt(1, giay.getId_giay());
            pstm.setString(2, giay.getMa_giayChiTiet());
            pstm.setString(3, giay.getTen_GiayChiTiet());
            pstm.setInt(4, giay.getId_mauSac());
            pstm.setInt(5, giay.getId_Kichthuoc());
            pstm.setInt(6, giay.getSoLuong());
            pstm.setFloat(7, giay.getGiaBan());
            pstm.setInt(8, giay.getId_ChatLieu());
            pstm.setInt(9, giay.getId_KieuDe());
            pstm.setInt(10, giay.getId_LopLot());
            pstm.setInt(11, giay.getId_KieuMui());
            pstm.setInt(12, giay.getId_HinhAnh());

            row = pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Lỗi" + e.getMessage());
        }
        return row;
    }

    @Override
    public Integer updateGiayChiTiet(Giay giay) {
        Integer row = null;
        Connection con = DBConnect.getConnection();
        String sql = "UPDATE Giay_ChiTiet\n"
                + "SET \n"
                + "    Ma_GiayChiTiet = ?,\n"
                + "    Ten_GiayChiTiet = ?,\n"
                + "    ID_Giay = ?,\n"
                + "    SoLuong = ?,\n"
                + "    GiaBan = ?,\n"
                + "    ID_HinhAnh = ?,\n"
                + "    ID_MauSac = ?,\n"
                + "    ID_KichThuoc = ?,\n"
                + "    ID_ChatLieu = ?,\n"
                + "    ID_KieuDe = ?,\n"
                + "    ID_LopLot = ?,\n"
                + "    ID_KieuMui = ?\n"
                + "WHERE ID_GiayChiTiet = ?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);

            pstm.setString(1, giay.getMa_giayChiTiet());
            pstm.setString(2, giay.getTen_GiayChiTiet());
            pstm.setInt(3, giay.getId_giay());
            pstm.setInt(4, giay.getSoLuong());
            pstm.setFloat(5, giay.getGiaBan());
            pstm.setInt(6, giay.getId_HinhAnh());
            pstm.setInt(7, giay.getId_mauSac());
            pstm.setInt(8, giay.getId_Kichthuoc());
            pstm.setInt(9, giay.getId_ChatLieu());
            pstm.setInt(10, giay.getId_KieuDe());
            pstm.setInt(11, giay.getId_LopLot());
            pstm.setInt(12, giay.getId_KieuMui());
            pstm.setInt(13, giay.getId_giayChiTiet());

            row = pstm.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Lỗi" + e.getMessage());
        }
        return row;
    }

    public ArrayList<Giay> timKiem(String timKiem) {
        ArrayList<Giay> list = new ArrayList<>();
        Connection con = DBConnect.getConnection();
        String sql = "SELECT "
                + "    g.ID_Giay, "
                + "    g.Ma_giay, "
                + "    g.Ten_Giay, "
                + "    xx.Ten_XuatXu, "
                + "    dm.Ten_DanhMuc, "
                + "    g.TrangThai_Giay "
                + "FROM "
                + "    Giay g "
                + "JOIN "
                + "    XuatXu xx ON g.ID_XuatXu = xx.ID_XuatXu "
                + "JOIN "
                + "    DanhMuc dm ON g.ID_DanhMuc = dm.ID_DanhMuc "
                + "WHERE "
                + "    g.ID_Giay LIKE ? "
                + "    OR g.Ma_giay LIKE ? "
                + "    OR g.Ten_Giay LIKE ? "
                + "    OR xx.Ten_XuatXu LIKE ? "
                + "    OR dm.Ten_DanhMuc LIKE ? "
                + "    OR g.TrangThai_Giay LIKE ? ";

        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, "%" + timKiem + "%");
            pstm.setString(2, "%" + timKiem + "%");
            pstm.setString(3, "%" + timKiem + "%");
            pstm.setString(4, "%" + timKiem + "%");
            pstm.setString(5, "%" + timKiem + "%");
            pstm.setString(6, "%" + timKiem + "%");

            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Giay g = new Giay();
                g.setId_giay(rs.getInt("ID_Giay"));
                g.setMa_giay(rs.getString("Ma_Giay"));
                g.setTenGiay(rs.getString("Ten_Giay"));
                g.setTenXuatXu(rs.getString("Ten_XuatXu"));
                g.setTenDanhMuc(rs.getString("Ten_DanhMuc"));
                g.setTrangThai(rs.getString("TrangThai_Giay"));
                list.add(g);
            }
        } catch (Exception e) {
            System.out.println("Lỗi" + e.getMessage());
        }
        return list;

    }

    public ArrayList<Giay> getAllForID(Integer IDsp) {
        ArrayList<Giay> list = new ArrayList<>();
        Connection con = DBConnect.getConnection();
        System.out.println("Ser-GetallCt" + IDsp);
        String sql = """
                     SELECT
                         GC.Ma_GiayChiTiet,
                         G.ID_Giay AS IDGiay,
                         G.Ten_Giay, 
                         GC.Ten_GiayChiTiet,
                         GC.SoLuong,
                         GC.GiaBan,
                         MS.Ten_MauSac AS MauSac,
                         KT.Ten_KichThuoc AS KichThuoc,
                         CL.Ten_ChatLieu AS ChatLieu,
                         KM.Ten_KieuMui AS KieuMui,
                         KD.Ten_KieuDe AS KieuDe,
                         LL.Ten_LopLot AS LopLot,
                         HA.IMG AS HinhAnh
                     FROM
                         Giay_ChiTiet GC
                     INNER JOIN MauSac MS ON GC.ID_MauSac = MS.ID_MauSac
                     INNER JOIN KichThuoc KT ON GC.ID_KichThuoc = KT.ID_KichThuoc
                     INNER JOIN ChatLieu CL ON GC.ID_ChatLieu = CL.ID_ChatLieu
                     INNER JOIN KieuMui KM ON GC.ID_KieuMui = KM.ID_KieuMui
                     INNER JOIN KieuDe KD ON GC.ID_KieuDe = KD.ID_KieuDe
                     INNER JOIN LopLot LL ON GC.ID_LopLot = LL.ID_LopLot
                     INNER JOIN HinhAnh HA ON GC.ID_HinhAnh = HA.ID_HinhAnh
                     LEFT JOIN Giay G ON GC.ID_Giay = G.ID_Giay WHERE GC.ID_Giay = """ + IDsp;

        try {

            PreparedStatement pstm;
            pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Giay g = new Giay();

                g.setMa_giayChiTiet(rs.getString("Ma_GiayChiTiet"));
                g.setId_giay(IDsp);
                g.setTenGiay(rs.getString("Ten_giay"));
                g.setTen_GiayChiTiet(rs.getString("Ten_GiayChiTiet"));
                g.setSoLuong(rs.getInt("SoLuong"));
                g.setGiaBan(rs.getFloat("GiaBan"));
                g.setTenMauSac(rs.getString("MauSac"));
                g.setTenKichThuoc(rs.getInt("KichThuoc")); // Điều chỉnh để phù hợp với kiểu dữ liệu
                g.setTenChatLieu(rs.getString("ChatLieu"));
                g.setTenKieuMui(rs.getString("KieuMui"));
                g.setTenKieuDe(rs.getString("KieuDe"));
                g.setTenLopLot(rs.getString("LopLot"));
                g.setImg(rs.getString("HinhAnh"));
                list.add(g);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            // Đóng Connection ở đây nếu cần
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return list;
    }
}
