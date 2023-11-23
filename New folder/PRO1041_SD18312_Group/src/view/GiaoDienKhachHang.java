/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.KhachHang;
import model.LichSuGiaoDich;
import DBConnect.DBConnect;
import repository.KhachHangDAO;
import repository.LichSuGiaoDichDAO;

/**
 *
 *  
 * @author Fpt06
 */
public class GiaoDienKhachHang extends javax.swing.JFrame {

    /**
     * Creates new form GiaoDienKhachHang
     */
    public GiaoDienKhachHang() {
        initComponents();
        setLocationRelativeTo(null);
        fillTable();
       fillTableLichSu();
    }

    DefaultTableModel model = new DefaultTableModel();
    KhachHangDAO dao = new KhachHangDAO();

    public void fillTable() {
        model = (DefaultTableModel) tbBangKhachHang.getModel();
        model.setRowCount(0);
        ArrayList<KhachHang> lst = dao.getAllKhachHang();
        for (KhachHang kh : lst) {
            model.addRow(new Object[]{kh.getMaKhachHang(), kh.getTenKhachHang(), kh.isGioiTinh() ? "Nam" : "Nữ",
                 kh.getSdt(), kh.getEmail(), kh.getDiaChi(), kh.isTrangThai() ? "Lâu năm" : "Mới"});
        }

    }

    public KhachHang getModel() {
        KhachHang kh = new KhachHang();
        kh.setMaKhachHang(txtMaKhachHang.getText());
        kh.setTenKhachHang(txtTenKhachHang.getText());

        if (rdoNam.isSelected()) {
            kh.setGioiTinh(true);
        } else {
            kh.setGioiTinh(false);
        }
        kh.setSdt(Integer.parseInt(txtSoDt.getText()));
        kh.setEmail(txtEmail.getText());
        kh.setDiaChi(txtDiaChi.getText());
        if (rdoConHD.isSelected()) {
            kh.setTrangThai(true);
        } else {
            kh.setTrangThai(false);
        }

        return kh;
    }

    public void setModel(KhachHang kh) {
        txtMaKhachHang.setText(kh.getMaKhachHang());
        txtTenKhachHang.setText(kh.getTenKhachHang());
        if (kh.isGioiTinh() == true) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        txtSoDt.setText(kh.getSdt() + "");
        txtEmail.setText(kh.getEmail());
        txtDiaChi.setText(kh.getDiaChi());
        if (kh.isTrangThai() == true) {
            rdoConHD.setSelected(true);
        } else {
            rdoNGungHD.setSelected(true);
        }
    }

    public void reset() {
        txtMaKhachHang.setText("");
        txtTenKhachHang.setText("");
        buttonGroup1.clearSelection();
        txtSoDt.setText("");
        txtEmail.setText("");
        txtDiaChi.setText("");
        buttonGroup2.clearSelection();
    }

    public boolean checkform() {
        if (txtMaKhachHang.getText().isEmpty() || txtTenKhachHang.getText().isEmpty() || txtSoDt.getText().isEmpty()
                || txtEmail.getText().isEmpty() || txtDiaChi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hãy điền đầy đủ thông tin");
            return false;
        }
        try {
            int so = Integer.parseInt(txtSoDt.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "số điện thoại phải là số");
            return false;
        }
        if (txtSoDt.getText().length() < 10 || txtSoDt.getText().length() > 11) {
            JOptionPane.showMessageDialog(this, "SDT thì 10 hoặc 11 số ");
            return false;
        }
        return true;
    }
//    public boolean checktimkiem(){
//        if (txtTimKiem.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Hãy điền thông tin tìm kiếm");
//            return false;
//            
//        } else {
//        }
//        return true;
//    }

    public void fillTableKhachHangNam() {
        model = (DefaultTableModel) tbBangKhachHang.getModel();
        model.setRowCount(0);
        ArrayList<KhachHang> lst = dao.getAllKhachHang();
        for (KhachHang kh : lst) {
            model.addRow(new Object[]{kh.getMaKhachHang(), kh.getTenKhachHang(), kh.isGioiTinh() ? "Nam" : "Nữ",
                 kh.getSdt(), kh.getEmail(), kh.getDiaChi(), kh.isTrangThai() ? "Lâu năm" : "Mới"});
        }

    }

    public void fillTableKhachHangNu() {
        model = (DefaultTableModel) tbBangKhachHang.getModel();
        model.setRowCount(0);
        ArrayList<KhachHang> lst = dao.getAllKhachHangNu();
        for (KhachHang kh : lst) {
            model.addRow(new Object[]{kh.getMaKhachHang(), kh.getTenKhachHang(), kh.isGioiTinh() ? "Nam" : "Nữ",
                 kh.getSdt(), kh.getEmail(), kh.getDiaChi(), kh.isTrangThai() ? "Lâu năm" : "Mới"});
        }

    }

    public void fillTableKhachHangHD() {
        model = (DefaultTableModel) tbBangKhachHang.getModel();
        model.setRowCount(0);
        ArrayList<KhachHang> lst = dao.getAllKhachHangHD();
        for (KhachHang kh : lst) {
            model.addRow(new Object[]{kh.getMaKhachHang(), kh.getTenKhachHang(), kh.isGioiTinh() ? "Nam" : "Nữ",
                 kh.getSdt(), kh.getEmail(), kh.getDiaChi(), kh.isTrangThai() ? "Lâu năm" : "Mới"});
        }

    }

    public void fillTableKhachHangKHD() {
        model = (DefaultTableModel) tbBangKhachHang.getModel();
        model.setRowCount(0);
        ArrayList<KhachHang> lst = dao.getAllKhachHangKHD();
        for (KhachHang kh : lst) {
            model.addRow(new Object[]{kh.getMaKhachHang(), kh.getTenKhachHang(), kh.isGioiTinh() ? "Nam" : "Nữ",
                 kh.getSdt(), kh.getEmail(), kh.getDiaChi(), kh.isTrangThai() ? "Lâu năm" : "Mới"});
        }

    }

    public void fillTableTimKiem() {
//        model = (DefaultTableModel) tbBangKhachHang.getModel();
//        model.setRowCount(0);
//        ArrayList<KhachHang> lst = dao.getAllTimKiem(Integer.parseInt(txtTenKhachHang.getText()));
//        for (KhachHang kh : lst) {
//            model.addRow(new Object[]{kh.getMaKhachHang(), kh.getTenKhachHang(), kh.isGioiTinh() ? "Nam" : "Nữ",
//                 kh.getSdt(), kh.getEmail(), kh.getDiaChi(), kh.isTrangThai() ? "Còn hoạt động" : "Ngừng hoạt động"});
//        }
        model = (DefaultTableModel) tbBangKhachHang.getModel();
        model.setRowCount(0);
//        ArrayList<KhachHang> lst = dao.getAllKhachHang();
        
        for (KhachHang kh : KhachHangDAO.getAllTimKiem(txtTimKiem)) {
            model.addRow(new Object[]{kh.getMaKhachHang(), kh.getTenKhachHang(), kh.isGioiTinh() ? "Nam" : "Nữ",
                 kh.getSdt(), kh.getEmail(), kh.getDiaChi(), kh.isTrangThai() ? "Lâu năm" : "Mới"});
        }
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        txtTenKhachHang = new javax.swing.JTextField();
        txtSoDt = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiaChi = new javax.swing.JTextArea();
        rdoNu = new javax.swing.JRadioButton();
        rdoNam = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        rdoNGungHD = new javax.swing.JRadioButton();
        rdoConHD = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        btnSUa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tblLichSu = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbBangKhachHang = new javax.swing.JTable();
        btnDau = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnCuoi = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboTrangThai = new javax.swing.JComboBox<>();
        cboGioiTinh = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbBangLichSu = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        txtTimKiemLichSu = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lí khách hàng");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Thiết lập thông tin khách hàng"));

        jLabel2.setText("Mã Khách hàng");

        jLabel3.setText("Tên Khách hàng");

        jLabel4.setText("Địa chỉ");

        jLabel5.setText("Giới tính");

        jLabel6.setText("Số điện thoại");

        jLabel7.setText("Email");

        txtDiaChi.setColumns(20);
        txtDiaChi.setRows(5);
        jScrollPane1.setViewportView(txtDiaChi);

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");
        rdoNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNamActionPerformed(evt);
            }
        });

        jLabel8.setText("Trạng Thái");

        buttonGroup2.add(rdoNGungHD);
        rdoNGungHD.setText("Mới");
        rdoNGungHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNGungHDActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdoConHD);
        rdoConHD.setText("Lâu năm ");
        rdoConHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoConHDActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSUa.setText("Sửa");
        btnSUa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSUaActionPerformed(evt);
            }
        });

        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rdoNam, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoNu, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(rdoConHD, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoNGungHD, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(131, 131, 131)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoDt, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSUa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoDt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSUa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdoNam)
                                    .addComponent(rdoNu))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdoConHD)
                                    .addComponent(rdoNGungHD)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoa)
                        .addGap(29, 29, 29)
                        .addComponent(btnMoi)
                        .addGap(34, 34, 34))))
        );

        tblLichSu.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông tin khách hàng"));

        tbBangKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã KH", "Tên KH", "Giới tính", "sdt", "Email", "Địa chỉ", "Trạng thái"
            }
        ));
        tbBangKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBangKhachHangMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbBangKhachHang);

        btnDau.setText("|<");
        btnDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDauActionPerformed(evt);
            }
        });

        btnBack.setText("<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnCuoi.setText(">|");
        btnCuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuoiActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Lọc"));

        jLabel1.setText("giới tính");

        jLabel9.setText("Trạng thái");

        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Lâu năm", "Mới" }));
        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Lâu năm", "Mới" }));
        cboTrangThai.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cboTrangThaiAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cboTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTrangThaiActionPerformed(evt);
            }
        });

        cboGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Nam", "Nữ" }));
        cboGioiTinh.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboGioiTinhItemStateChanged(evt);
            }
        });
        cboGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGioiTinhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboGioiTinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cboTrangThai, 0, 140, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(cboGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm Kiếm"));

        txtTimKiem.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTimKiemCaretUpdate(evt);
            }
        });
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });
        txtTimKiem.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtTimKiemPropertyChange(evt);
            }
        });

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnTimKiem)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnDau)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBack)
                        .addGap(18, 18, 18)
                        .addComponent(btnNext)
                        .addGap(18, 18, 18)
                        .addComponent(btnCuoi)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDau)
                    .addComponent(btnBack)
                    .addComponent(btnNext)
                    .addComponent(btnCuoi))
                .addGap(14, 14, 14))
        );

        tblLichSu.addTab("Thông tin cá nhân", jPanel4);

        tbBangLichSu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tên khách hàng", "Tên sản phẩm", "SDT", "Số lượng", "Tổng tiền", "Trạng thái"
            }
        ));
        jScrollPane2.setViewportView(tbBangLichSu);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm Kiếm"));

        txtTimKiemLichSu.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtTimKiemLichSuCaretUpdate(evt);
            }
        });
        txtTimKiemLichSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemLichSuActionPerformed(evt);
            }
        });
        txtTimKiemLichSu.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtTimKiemLichSuPropertyChange(evt);
            }
        });
        txtTimKiemLichSu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemLichSuKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiemLichSu))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtTimKiemLichSu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        tblLichSu.addTab("Lịch sử giao dịch", jPanel5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tblLichSu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tblLichSu, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdoNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNamActionPerformed

    private void rdoNGungHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNGungHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNGungHDActionPerformed

    private void rdoConHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoConHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoConHDActionPerformed

    private void tbBangKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBangKhachHangMouseClicked
        int row = tbBangKhachHang.getSelectedRow();
        try {
            setModel(dao.getAllKhachHang().get(row));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tbBangKhachHangMouseClicked

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        reset();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        if (checkform()) {
//            dao.insert(getModel());
            KhachHangDAO.insert(getModel());
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            fillTable();
            reset();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDauActionPerformed
        setModel(dao.getAllKhachHang().get(0));
    }//GEN-LAST:event_btnDauActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        int row = dao.find(txtMaKhachHang.getText());
        if (row == 0) {
            setModel(dao.getAllKhachHang().get(dao.getAllKhachHang().size() - 1));
        } else {
            setModel(dao.getAllKhachHang().get(row - 1));
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        int row = dao.find(txtMaKhachHang.getText());
        if (row == dao.getAllKhachHang().size() - 1) {
            setModel(dao.getAllKhachHang().get(0));
        } else {
            setModel(dao.getAllKhachHang().get(row + 1));
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnCuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuoiActionPerformed
        setModel(dao.getAllKhachHang().get(dao.getAllKhachHang().size() - 1));
    }//GEN-LAST:event_btnCuoiActionPerformed

    private void btnSUaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUaActionPerformed
        if (checkform()) {
            dao.update(getModel());
            JOptionPane.showMessageDialog(this, "Sửa thành công");
            fillTable();
            reset();
        }
    }//GEN-LAST:event_btnSUaActionPerformed

    private void cboGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGioiTinhActionPerformed
        String gioiTinh = (String) cboGioiTinh.getSelectedItem();
        if (gioiTinh.equalsIgnoreCase("Nam")) {
            fillTableKhachHangNam();
        } else if (gioiTinh.equalsIgnoreCase("Nữ")) {
            fillTableKhachHangNu();
        } else {
            fillTable();
        }
        

    }//GEN-LAST:event_cboGioiTinhActionPerformed

    private void cboGioiTinhItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboGioiTinhItemStateChanged

    }//GEN-LAST:event_cboGioiTinhItemStateChanged

    private void cboTrangThaiAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cboTrangThaiAncestorAdded

    }//GEN-LAST:event_cboTrangThaiAncestorAdded

    private void cboTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTrangThaiActionPerformed
        String trangThai = (String) cboTrangThai.getSelectedItem();
        if (trangThai.equalsIgnoreCase("Lâu năm")) {
            fillTableKhachHangHD();
        }else if(trangThai.equalsIgnoreCase("Mới")){
            fillTableKhachHangKHD();
        }else{
            fillTable();
        }
        
    }//GEN-LAST:event_cboTrangThaiActionPerformed

    private void txtTimKiemCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTimKiemCaretUpdate
        //fillTableTimKiem();
    }//GEN-LAST:event_txtTimKiemCaretUpdate

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        if (txtTimKiem.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hãy điền thông tin tìm kiếm");
           
            
        } else {
        }
        
        fillTableTimKiem();
    
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void txtTimKiemPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtTimKiemPropertyChange
       
        System.out.println(txtTimKiem.getText());
        //cho tôi code ví dụ về JTextField DocumentListener
    }//GEN-LAST:event_txtTimKiemPropertyChange

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
         try {
            int chon = JOptionPane.showConfirmDialog(this, "Ban co muon xoa khong");
            if(chon != JOptionPane.YES_OPTION) return;
            else {
//                KhachHang kh = getModel();
//                KhachHangDAO.insert(kh);
//                String MaKhachHang = kh.getMaKhachHang();
String maKH = txtMaKhachHang.getText();
        KhachHang kh = getModel();
//                String MaKhachHang = txtMaKhachHang.getText();
            if( dao.delete(kh)!= null){
                
                JOptionPane.showMessageDialog(this, "Xoa thanh cong");
                fillTable();
            }else {
                JOptionPane.showMessageDialog(this, "Loi nut xoa");
            }
            }
            
        } catch (Exception e) {
             System.out.println(e);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void txtTimKiemLichSuCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtTimKiemLichSuCaretUpdate
        //fillTableTimKiem();
    }//GEN-LAST:event_txtTimKiemLichSuCaretUpdate

    private void txtTimKiemLichSuPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtTimKiemLichSuPropertyChange

        System.out.println(txtTimKiemLichSu.getText());
        //cho tôi code ví dụ về JTextField DocumentListener
    }//GEN-LAST:event_txtTimKiemLichSuPropertyChange

    private void txtTimKiemLichSuKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemLichSuKeyReleased

       arr.clear();
try {
    Connection cn = DBConnect.getConnection();
    String sql = "SELECT KHACHHANG.TenKH, SanPham_DaMua, KHACHHANG.SoDT, SoLuong, SoTiem_Mua, ThanhToan " +
        "FROM LichSuMuaHang1 " +
        "JOIN KHACHHANG ON LichSuMuaHang1.ID_KhachHang = KHACHHANG.ID_KhachHang " +
        "WHERE SoDT LIKE '%" + txtTimKiemLichSu.getText() + "%'";

    PreparedStatement pstm = cn.prepareStatement(sql);
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
        arr.add(ls);
    }
    cn.close();
    fillArrayListLichSu();
} catch (Exception e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_txtTimKiemLichSuKeyReleased

    private void txtTimKiemLichSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemLichSuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemLichSuActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GiaoDienKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiaoDienKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiaoDienKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiaoDienKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCuoi;
    private javax.swing.JButton btnDau;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSUa;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cboGioiTinh;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rdoConHD;
    private javax.swing.JRadioButton rdoNGungHD;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tbBangKhachHang;
    private javax.swing.JTable tbBangLichSu;
    private javax.swing.JTabbedPane tblLichSu;
    private javax.swing.JTextArea txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtSoDt;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTimKiemLichSu;
    // End of variables declaration//GEN-END:variables
LichSuGiaoDichDAO lsdao = new LichSuGiaoDichDAO();

    public void fillTableLichSu() {
        System.out.println(123);
        model = (DefaultTableModel) tbBangLichSu.getModel();
        model.setRowCount(0);
//        ArrayList<LichSuGiaoDich> lst = lsdao.getAllLichSuGiaoDich();
        for (LichSuGiaoDich ls : lsdao.getAllLichSuGiaoDich()) {
            model.addRow(new Object[]{ls.getTenKH(), ls.getTenSp(), ls.getSdt(), ls.getSoLuong(),
                ls.getTongTien(), ls.isTrangThai() ? "Đã thanh toán" : "Chưa thanh toán"});
        }
    }
     ArrayList<LichSuGiaoDich> arr = new ArrayList<>();

    public void fillArrayListLichSu() {

        model = (DefaultTableModel) tbBangLichSu.getModel();
        model.setRowCount(0);

        for (LichSuGiaoDich ls : arr) {
            model.addRow(new Object[]{ls.getTenKH(), ls.getTenSp(), ls.getSdt(), ls.getSoLuong(),
                ls.getTongTien(), ls.isTrangThai() ? "Đã thanh toán" : "Chưa thanh toán"});
        }
    }

    public void Lichsu() {

        tblLichSu.setSelectedIndex(1);

        arr.clear();
        try {
            Connection cn = DBConnect.getConnection();
            String sql = " SELECT KHACHHANG.TenKH,SanPham_DaMua,KHACHHANG.SoDT,SoLuong,SoTiem_Mua,ThanhToan\n"
                + " FROM LichSuMuaHang1 JOIN KHACHHANG ON LichSuMuaHang1.ID_KhachHang = KHACHHANG.ID_KhachHang"
                + "where IDKhachHang = '" + txtMaKhachHang.getText() + "'";

            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                LichSuGiaoDich ls = new LichSuGiaoDich(rs.getString("TenKH"), rs.getString("TenSp"),
                        rs.getString("SDT"), rs.getFloat("soLuong"), rs.getFloat("tongTien"), rs.getBoolean("ThanhToan"));
                arr.add(ls);
            }
            cn.close();
            fillArrayListLichSu();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
   
}
