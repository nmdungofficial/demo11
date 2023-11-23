package view;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Giay;
import model.HinhAnh;
import repository.Combobox_service;
import repository.Service_Giay;

public class View_Giay extends javax.swing.JFrame {

    DefaultComboBoxModel molcboHInhanh = new DefaultComboBoxModel();
    Combobox_service service_cbo = new Combobox_service();
    ArrayList<Giay> list = new ArrayList<>();
    Service_Giay service = new Service_Giay();
    DefaultTableModel mol = new DefaultTableModel();
    DefaultTableModel mol2 = new DefaultTableModel();
    String path = null;
    boolean lockId = false, lockLoad;

    public View_Giay() {
        initComponents();
        setLocationRelativeTo(null);
        loadDataToComboBox();
        loadcbodm();
        loadcboxx();
        loadcbomausac();
        loadcbokichthuoc();
        loadcbochatlieu();
        loadcbokieude();
        loadcbokieumui();
        loadcboloplot();
        loadcbohinhanh();
        showCboSanPham();
        loadData(service.getAll());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QuanLyGiay = new javax.swing.JTabbedPane();
        Pannel_SanPham = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_masanpham = new javax.swing.JTextField();
        txt_tensanpham = new javax.swing.JTextField();
        txt_idsanpham = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbo_xuatxu = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbo_danhmuc = new javax.swing.JComboBox<>();
        cbo_trangthai = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_giay = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txt_timkiem = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        cbo_locdanhmuc = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        cbo_locxuatxu = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        cboTrangThai = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        btn_ShowAllSp = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_chitietsp = new javax.swing.JButton();
        btn_xoa1 = new javax.swing.JButton();
        btn_xuatxu = new javax.swing.JButton();
        btn_danhmuc = new javax.swing.JButton();
        btn_trangthai = new javax.swing.JButton();
        Pannel_SanPhamCT = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_giaychitiet = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txt_maspct = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_tenspct = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_giaban = new javax.swing.JTextField();
        txt_soluong = new javax.swing.JTextField();
        cbo_mausac = new javax.swing.JComboBox<>();
        cbo_kichthuoc = new javax.swing.JComboBox<>();
        cbo_kieude = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cbo_kieumui = new javax.swing.JComboBox<>();
        cbo_loplot = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbo_chatlieu = new javax.swing.JComboBox<>();
        lbl_hinhanh = new javax.swing.JLabel();
        cbo_sanpham = new javax.swing.JComboBox<>();
        cbo_hinhanh = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_addchitiet = new javax.swing.JButton();
        btn_suachitiet = new javax.swing.JButton();
        btn_clearspct = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txt_idsp2 = new javax.swing.JTextField();
        btnRes = new javax.swing.JButton();
        cbo_sanpham1 = new javax.swing.JComboBox<>();
        Pannel_ThuocTinh = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        txt_tenthuoctinh = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Bán Hàng");

        QuanLyGiay.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        QuanLyGiay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuanLyGiayMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("ID Sản phẩm");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Mã sản phẩm");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Tên sản phẩm");

        txt_idsanpham.setEnabled(false);
        txt_idsanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idsanphamActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Xuất xứ");

        cbo_xuatxu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_xuatxuActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Danh mục");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Trạng thái");

        tbl_giay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID sản phẩm", "Mã sản phẩm", "Tên sản phẩm", "Xuất xứ", "Danh mục", "Trạng thái"
            }
        ));
        tbl_giay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_giayMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_giay);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel3.setToolTipText("");
        jPanel3.setName(""); // NOI18N

        txt_timkiem.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_timkiemInputMethodTextChanged(evt);
            }
        });
        txt_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_timkiemActionPerformed(evt);
            }
        });
        txt_timkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_timkiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_timkiem, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bộ Lọc", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbo_locdanhmuc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbo_locdanhmucItemStateChanged(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel20.setText("Danh mục");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbo_locdanhmuc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbo_locdanhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbo_locxuatxu.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbo_locxuatxuItemStateChanged(evt);
            }
        });
        cbo_locxuatxu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_locxuatxuActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel24.setText("Xuất xứ");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbo_locxuatxu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbo_locxuatxu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang Hoạt Động", "Ngưng Hoạt Động" }));
        cboTrangThai.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTrangThaiItemStateChanged(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel25.setText("Trạng thái");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboTrangThai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_ShowAllSp.setText("Hiện Thị Tất Cả");
        btn_ShowAllSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ShowAllSpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 30, Short.MAX_VALUE)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btn_ShowAllSp)
                .addGap(47, 47, 47))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_ShowAllSp)
                .addGap(34, 34, 34))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_them.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_sua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        btn_chitietsp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_chitietsp.setText("Chi tiết ");
        btn_chitietsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chitietspActionPerformed(evt);
            }
        });

        btn_xoa1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_xoa1.setText("Clear");
        btn_xoa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoa1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_chitietsp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_xoa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btn_them)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_sua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_xoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_xoa1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_chitietsp)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        btn_xuatxu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Create.png"))); // NOI18N
        btn_xuatxu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_xuatxuMouseClicked(evt);
            }
        });
        btn_xuatxu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xuatxuActionPerformed(evt);
            }
        });

        btn_danhmuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Create.png"))); // NOI18N
        btn_danhmuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_danhmucActionPerformed(evt);
            }
        });

        btn_trangthai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Create.png"))); // NOI18N
        btn_trangthai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_trangthaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pannel_SanPhamLayout = new javax.swing.GroupLayout(Pannel_SanPham);
        Pannel_SanPham.setLayout(Pannel_SanPhamLayout);
        Pannel_SanPhamLayout.setHorizontalGroup(
            Pannel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pannel_SanPhamLayout.createSequentialGroup()
                .addGroup(Pannel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Pannel_SanPhamLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(Pannel_SanPhamLayout.createSequentialGroup()
                        .addGroup(Pannel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pannel_SanPhamLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(Pannel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Pannel_SanPhamLayout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_idsanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Pannel_SanPhamLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_masanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Pannel_SanPhamLayout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_tensanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(66, 66, 66)
                                .addGroup(Pannel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Pannel_SanPhamLayout.createSequentialGroup()
                                        .addGroup(Pannel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(Pannel_SanPhamLayout.createSequentialGroup()
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbo_xuatxu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(Pannel_SanPhamLayout.createSequentialGroup()
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbo_danhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 36, Short.MAX_VALUE)
                                        .addGroup(Pannel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_xuatxu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_danhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(Pannel_SanPhamLayout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbo_trangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_trangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36))
                            .addGroup(Pannel_SanPhamLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(Pannel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGap(42, 42, 42))
        );
        Pannel_SanPhamLayout.setVerticalGroup(
            Pannel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pannel_SanPhamLayout.createSequentialGroup()
                .addGroup(Pannel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pannel_SanPhamLayout.createSequentialGroup()
                        .addGroup(Pannel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pannel_SanPhamLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(Pannel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pannel_SanPhamLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(Pannel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btn_xuatxu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbo_xuatxu)))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Pannel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(Pannel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbo_danhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_danhmuc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Pannel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_trangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(cbo_trangthai))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(Pannel_SanPhamLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(Pannel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_idsanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(Pannel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_masanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(Pannel_SanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_tensanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(Pannel_SanPhamLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(327, 327, 327))
        );

        jPanel3.getAccessibleContext().setAccessibleName("");

        QuanLyGiay.addTab("Sản phẩm", Pannel_SanPham);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 102));
        jLabel11.setText("Tên sản phẩm");

        tbl_giaychitiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã sản phẩm chi tiết", "Tên sản phẩm chi tiết", "Màu sắc", "Kích thước", "Số lượng", "Giá bán", "Chất liệu", "Kiểu đế", "Kiểu mũi", "Lớp lót", "Hình ảnh"
            }
        ));
        tbl_giaychitiet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_giaychitietMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_giaychitiet);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Mã sản phẩm chi tiết");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Tên sản phẩm chi tiết");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Màu sắc");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Kích thước");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Số lượng");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Giá bán");

        txt_giaban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_giabanActionPerformed(evt);
            }
        });

        cbo_mausac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_mausacActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Kiểu mũi");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Lớp lót");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Chất Liệu");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Kiểu đế");

        lbl_hinhanh.setText("          Hình ảnh");
        lbl_hinhanh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lbl_hinhanh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_hinhanhMouseClicked(evt);
            }
        });

        cbo_sanpham.setEnabled(false);

        cbo_hinhanh.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbo_hinhanhItemStateChanged(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Hình ảnh");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_addchitiet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_addchitiet.setText("Thêm");
        btn_addchitiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addchitietActionPerformed(evt);
            }
        });

        btn_suachitiet.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_suachitiet.setText("Sửa");
        btn_suachitiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suachitietActionPerformed(evt);
            }
        });

        btn_clearspct.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_clearspct.setText("Clear");
        btn_clearspct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearspctActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btn_addchitiet)
                        .addGap(36, 36, 36)
                        .addComponent(btn_suachitiet))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btn_clearspct)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_addchitiet)
                    .addComponent(btn_suachitiet))
                .addGap(18, 18, 18)
                .addComponent(btn_clearspct)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 102, 102));
        jLabel21.setText("ID Sản phẩm");

        txt_idsp2.setEnabled(false);

        btnRes.setText("Reset");
        btnRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResActionPerformed(evt);
            }
        });

        cbo_sanpham1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbo_sanpham1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout Pannel_SanPhamCTLayout = new javax.swing.GroupLayout(Pannel_SanPhamCT);
        Pannel_SanPhamCT.setLayout(Pannel_SanPhamCTLayout);
        Pannel_SanPhamCTLayout.setHorizontalGroup(
            Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pannel_SanPhamCTLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pannel_SanPhamCTLayout.createSequentialGroup()
                        .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cbo_kichthuoc, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(Pannel_SanPhamCTLayout.createSequentialGroup()
                                    .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(28, 28, 28)
                                    .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_soluong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_giaban, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cbo_mausac, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(Pannel_SanPhamCTLayout.createSequentialGroup()
                                .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_maspct, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_tenspct, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbo_sanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_idsp2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(83, 83, 83)
                        .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Pannel_SanPhamCTLayout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbo_loplot, 0, 135, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pannel_SanPhamCTLayout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbo_kieumui, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Pannel_SanPhamCTLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbo_kieude, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Pannel_SanPhamCTLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbo_chatlieu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbo_hinhanh, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_hinhanh, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Pannel_SanPhamCTLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 100, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pannel_SanPhamCTLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(cbo_sanpham1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRes)
                .addGap(90, 90, 90))
        );
        Pannel_SanPhamCTLayout.setVerticalGroup(
            Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pannel_SanPhamCTLayout.createSequentialGroup()
                .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pannel_SanPhamCTLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_chatlieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_kieude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbo_kieumui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbo_loplot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(Pannel_SanPhamCTLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pannel_SanPhamCTLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbo_hinhanh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_hinhanh, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Pannel_SanPhamCTLayout.createSequentialGroup()
                                .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_idsp2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbo_sanpham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_maspct, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_tenspct, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Pannel_SanPhamCTLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(cbo_mausac, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pannel_SanPhamCTLayout.createSequentialGroup()
                                        .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbo_kichthuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pannel_SanPhamCTLayout.createSequentialGroup()
                                        .addComponent(txt_soluong, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_giaban, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Pannel_SanPhamCTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRes)
                    .addComponent(cbo_sanpham1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(206, 206, 206))
        );

        QuanLyGiay.addTab("Sản phẩm chi tiết", Pannel_SanPhamCT);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Thuộc Tính"), "Loại Thuộc Tính"));
        jPanel4.setToolTipText("");

        jRadioButton1.setText("Kích thước");

        jRadioButton2.setText("Màu sắc");

        jRadioButton3.setText("Chất liệu");

        jRadioButton4.setText("Kiểu mũi");

        jRadioButton5.setText("Kiểu đế");

        jRadioButton6.setText("Lớp lót");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton5))
                .addGap(29, 29, 29))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel22.setText("Tên thuộc tính");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_tenthuoctinh, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txt_tenthuoctinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Loại thuộc tính", "Tên thuộc tính"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout Pannel_ThuocTinhLayout = new javax.swing.GroupLayout(Pannel_ThuocTinh);
        Pannel_ThuocTinh.setLayout(Pannel_ThuocTinhLayout);
        Pannel_ThuocTinhLayout.setHorizontalGroup(
            Pannel_ThuocTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pannel_ThuocTinhLayout.createSequentialGroup()
                .addGroup(Pannel_ThuocTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pannel_ThuocTinhLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pannel_ThuocTinhLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        Pannel_ThuocTinhLayout.setVerticalGroup(
            Pannel_ThuocTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pannel_ThuocTinhLayout.createSequentialGroup()
                .addGroup(Pannel_ThuocTinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pannel_ThuocTinhLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pannel_ThuocTinhLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        QuanLyGiay.addTab("Thuộc tính", Pannel_ThuocTinh);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QuanLyGiay)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(QuanLyGiay, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        int checkDelete = service.delete(Integer.valueOf(tbl_giay.getValueAt(tbl_giay.getSelectedRow(), 0).toString()), "Ngừng hoạt động");
        if (checkDelete == 0) {
            JOptionPane.showMessageDialog(this, "Xóa Thất Bại");
        } else {
            JOptionPane.showMessageDialog(this, "Xóa Thành Công");
        }
        loadData(service.getAll());
        clearForm();
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        int checkUpdate = service.updateGiay(getInputForm());
        if (checkUpdate == 0) {
            JOptionPane.showMessageDialog(this, "Sửa Thành Công");
        } else {
            JOptionPane.showMessageDialog(this, "Sửa Thất Bại");
        }
        loadData(service.getAll());
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        try {
            if (service.addGiay(getInputForm()) != null) {
                JOptionPane.showMessageDialog(this, "Thêm Thành Công");
                loadData(service.getAll());

            } else {
                JOptionPane.showMessageDialog(this, "Thêm Thất Bại");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void txt_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_timkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_timkiemActionPerformed

    private void tbl_giayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_giayMouseClicked
        ShowData();
        String namesp = tbl_giay.getValueAt(tbl_giay.getSelectedRow(), 2).toString();
        System.out.println(namesp);
        cbo_sanpham1.setSelectedItem(namesp);
    }//GEN-LAST:event_tbl_giayMouseClicked

    private void cbo_xuatxuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_xuatxuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_xuatxuActionPerformed

    private void cbo_mausacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_mausacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_mausacActionPerformed

    private void txt_idsanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idsanphamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idsanphamActionPerformed

    private void txt_giabanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_giabanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_giabanActionPerformed

    private void tbl_giaychitietMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_giaychitietMouseClicked
        ShowDataCT();
    }//GEN-LAST:event_tbl_giaychitietMouseClicked

    private void btn_chitietspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chitietspActionPerformed
        lockId = false;
        QuanLyGiay.setSelectedComponent(Pannel_SanPhamCT);
    }//GEN-LAST:event_btn_chitietspActionPerformed

    private void btn_xoa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoa1ActionPerformed
        clearForm();

    }//GEN-LAST:event_btn_xoa1ActionPerformed

    private void btn_xuatxuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xuatxuActionPerformed
        new View_SubThuocTinh(0).setVisible(true);
    }//GEN-LAST:event_btn_xuatxuActionPerformed

    private void QuanLyGiayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuanLyGiayMouseClicked
        lockLoad = true;
        if (QuanLyGiay.getSelectedIndex() == 1 && lockLoad) {
            String cbosp;
            if (cbo_sanpham.getSelectedItem() != null) {
                cbosp = cbo_sanpham.getSelectedItem().toString();
            } else {
                cbosp = null;
            }
            showCboSanPham();
            loadDataCt();
            lockLoad = false;
        }
    }//GEN-LAST:event_QuanLyGiayMouseClicked

    private void btn_addchitietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addchitietActionPerformed
        try {
            if (service.addGiayChiTiet(getInputFormSPCT()) != null) {
                JOptionPane.showMessageDialog(this, "Thêm Thành Công");
                loadDataCt();

            } else {
                JOptionPane.showMessageDialog(this, "Thêm Thất Bại");
            }
            System.out.println(getInputFormSPCT());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btn_addchitietActionPerformed

    private void btn_clearspctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearspctActionPerformed
        clearForm();
    }//GEN-LAST:event_btn_clearspctActionPerformed

    private void btn_suachitietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suachitietActionPerformed
        try {
            if (service.updateGiayChiTiet(getInputFormSPCT()) != null) {
                JOptionPane.showMessageDialog(this, "Sửa Thành Công");
                loadDataCt();
            } else {
                JOptionPane.showMessageDialog(this, "Sửa Thất Bại");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_suachitietActionPerformed

    private void txt_timkiemInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_timkiemInputMethodTextChanged
//        txt_timkiem.getText();
//        loadData(service.timKiem(txt_timkiem.getText()));
    }//GEN-LAST:event_txt_timkiemInputMethodTextChanged

    private void txt_timkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_timkiemKeyReleased

        txt_timkiem.getText();
        loadData(service.timKiem(txt_timkiem.getText()));
    }//GEN-LAST:event_txt_timkiemKeyReleased

    private void cbo_locxuatxuItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbo_locxuatxuItemStateChanged
        loadData(service.timKiemSp(0, cbo_locxuatxu.getSelectedIndex() + 1));
    }//GEN-LAST:event_cbo_locxuatxuItemStateChanged

    private void btn_xuatxuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_xuatxuMouseClicked
//        setVisible(View_SubThuocTinh1);

    }//GEN-LAST:event_btn_xuatxuMouseClicked

    private void lbl_hinhanhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_hinhanhMouseClicked
        JFileChooser jf = new JFileChooser("E:\\CAO_DANG_FPT\\Fall 2023\\Du_An_1\\Giao_Dien (1) (1) (1)\\src\\avatar");
        int result = jf.showSaveDialog(this);
        path = jf.getSelectedFile().getPath();
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                lbl_hinhanh.setIcon(new ImageIcon(path));
                lbl_hinhanh.setText("" + jf.getSelectedFile().getName());
//                lbl_hinhanh.setToolTipText(new ImageIcon(path).getDescription());
                JOptionPane.showMessageDialog(this, "Them anh thanh cong");

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Chua chon anh de sua");
        }
    }//GEN-LAST:event_lbl_hinhanhMouseClicked

    private void btnResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResActionPerformed
        loadDataCt();
        lockId = true;
    }//GEN-LAST:event_btnResActionPerformed

    private void cbo_sanpham1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbo_sanpham1ItemStateChanged
        lockId = false;
        for (Giay giay : service.getAllCT()) {
            if (giay.getTenGiay().equals(cbo_sanpham1.getSelectedItem())) {
                loadDataCtForId(giay.getId_giay().toString());
                txt_idsp2.setText(giay.getId_giay().toString());
                return;
            }
        }

    }//GEN-LAST:event_cbo_sanpham1ItemStateChanged

    private void cbo_hinhanhItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbo_hinhanhItemStateChanged
        lbl_hinhanh.setIcon(new ImageIcon("src/avatar/" + cbo_hinhanh.getSelectedItem()));

    }//GEN-LAST:event_cbo_hinhanhItemStateChanged

    private void cbo_locdanhmucItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbo_locdanhmucItemStateChanged
        loadData(service.timKiemSp(1, cbo_locdanhmuc.getSelectedIndex() + 1));
    }//GEN-LAST:event_cbo_locdanhmucItemStateChanged

    private void cboTrangThaiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTrangThaiItemStateChanged
        if (cboTrangThai.getSelectedIndex() == 0) {
            loadData(service.timKiemSp(2, 0));
        } else {
            loadData(service.timKiemSp(3, 0));
        }
    }//GEN-LAST:event_cboTrangThaiItemStateChanged

    private void btn_ShowAllSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ShowAllSpActionPerformed
        loadData(service.getAll());
    }//GEN-LAST:event_btn_ShowAllSpActionPerformed

    private void btn_danhmucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_danhmucActionPerformed
        new View_SubThuocTinh(1).setVisible(true);
    }//GEN-LAST:event_btn_danhmucActionPerformed

    private void btn_trangthaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_trangthaiActionPerformed
        new View_SubThuocTinh(2).setVisible(true);
    }//GEN-LAST:event_btn_trangthaiActionPerformed

    private void cbo_locxuatxuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_locxuatxuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_locxuatxuActionPerformed

    private Giay getModelGiayCT() {
        Giay g = new Giay();
        g.setMa_giayChiTiet(txt_maspct.getText());
        return g;

    }

    private void showCboSanPham() {
        cbo_sanpham.removeAllItems();
        cbo_sanpham1.removeAllItems();
        for (String o : service.Combox_SanPham()) {
            cbo_sanpham.addItem(o);
            cbo_sanpham1.addItem(o);
        }

    }

    private void showCombox_LocXuatXu() {
//        for (String o : service.Combox_LocXuatXu()) {
//            cbo_locxuatxu.addItem(o);
//        }
//        
    }

    private void loadData(ArrayList<Giay> list) {
        mol = (DefaultTableModel) tbl_giay.getModel();
        mol.setRowCount(0);
        for (Giay o : list) {
            mol.addRow(new Object[]{
                o.getId_giay(), o.getMa_giay(), o.getTenGiay(), o.getTenXuatXu(), o.getTenDanhMuc(), o.getTrangThai()
            });
        }

    }

    private void loadDataCt() {
        mol2 = (DefaultTableModel) tbl_giaychitiet.getModel();
        mol2.setRowCount(0);
        list = service.getAllCT();
        for (Giay o : list) {
            mol2.addRow(new Object[]{
                o.getMa_giayChiTiet(), o.getTen_GiayChiTiet(), o.getTenMauSac(), o.getTenKichThuoc(), o.getSoLuong(), o.getGiaBan(),
                o.getTenChatLieu(), o.getTenKieuDe(), o.getTenKieuMui(), o.getTenLopLot(), o.getImg()
            });
        }
    }

    private void loadDataCtForId(String id) {
        mol2 = (DefaultTableModel) tbl_giaychitiet.getModel();
        mol2.setRowCount(0);
        System.out.println("1:" + id);
        list = service.getAllForID(Integer.valueOf(id));
        for (Giay o : list) {
            mol2.addRow(new Object[]{
                o.getMa_giayChiTiet(), o.getTen_GiayChiTiet(), o.getTenMauSac(), o.getTenKichThuoc(), o.getSoLuong(), o.getGiaBan(),
                o.getTenChatLieu(), o.getTenKieuDe(), o.getTenKieuMui(), o.getTenLopLot(), o.getImg()
            });
        }
    }

    private void ShowData() {
        int index = tbl_giay.getSelectedRow();
        txt_idsanpham.setText(tbl_giay.getValueAt(index, 0).toString());
        txt_masanpham.setText(tbl_giay.getValueAt(index, 1).toString());
        txt_tensanpham.setText(tbl_giay.getValueAt(index, 2).toString());
        cbo_xuatxu.setSelectedItem(tbl_giay.getValueAt(index, 3));
        cbo_danhmuc.setSelectedItem(tbl_giay.getValueAt(index, 4));
        cbo_trangthai.setSelectedItem(tbl_giay.getValueAt(index, 5));

    }

    private void ShowDataCT() {
        int index = tbl_giaychitiet.getSelectedRow();

        Giay o = service.getAllCT().get(index);
        if (lockId == true) {
            txt_idsp2.setText(o.getId_giay().toString());
            cbo_sanpham.setSelectedItem(o.getTenGiay());
        }
        txt_maspct.setText(o.getMa_giayChiTiet());
        txt_tenspct.setText(o.getTen_GiayChiTiet());
        txt_maspct.setText(tbl_giaychitiet.getValueAt(index, 0).toString());
        txt_tenspct.setText(tbl_giaychitiet.getValueAt(index, 1).toString());
        cbo_mausac.setSelectedItem(tbl_giaychitiet.getValueAt(index, 2));
        cbo_kichthuoc.setSelectedItem(tbl_giaychitiet.getValueAt(index, 3).toString());
        txt_soluong.setText(tbl_giaychitiet.getValueAt(index, 4).toString());
        txt_giaban.setText(tbl_giaychitiet.getValueAt(index, 5).toString());
        cbo_chatlieu.setSelectedItem(tbl_giaychitiet.getValueAt(index, 6));
        cbo_kieude.setSelectedItem(tbl_giaychitiet.getValueAt(index, 7));
        cbo_kieumui.setSelectedItem(tbl_giaychitiet.getValueAt(index, 8));
        cbo_loplot.setSelectedItem(tbl_giaychitiet.getValueAt(index, 9));
        lbl_hinhanh.setIcon(new ImageIcon("E:\\CAO_DANG_FPT\\Fall 2023\\Du_An_1\\Giao_Dien (1) (1)\\src\\avatar\\" + tbl_giaychitiet.getValueAt(index, 10).toString()));

    }

    private void ShowDataCTForId() {
        int index = tbl_giaychitiet.getSelectedRow();

        Giay o = service.getAllForID(Integer.valueOf(tbl_giaychitiet.getValueAt(index, 0).toString())).get(index);

        lockId = false;
        if (lockId == true) {
            txt_idsp2.setText(o.getId_giay().toString());
            cbo_sanpham.setSelectedItem(o.getTenGiay());
        }

        txt_maspct.setText(o.getMa_giayChiTiet());
        txt_tenspct.setText(o.getTen_GiayChiTiet());
        txt_giaban.setText(String.valueOf(o.getGiaBan()));
        txt_soluong.setText(o.getSoLuong().toString());

        cbo_mausac.setSelectedItem(o.getTenMauSac());
        cbo_kichthuoc.setSelectedItem(o.getTenKichThuoc());
        cbo_chatlieu.setSelectedItem(o.getTenChatLieu());
        cbo_kieude.setSelectedItem(o.getTenKieuDe());
        cbo_kieumui.setSelectedItem(o.getId_KieuMui());
        cbo_loplot.setSelectedItem(o.getTenLopLot());
        lbl_hinhanh.setIcon(new ImageIcon("E:\\CAO_DANG_FPT\\Fall 2023\\Du_An_1\\Giao_Dien (1) (1)\\src\\avatar\\" + o.getImg()));

    }

    public void loadDataToComboBox() {
        cbo_trangthai.addItem("Đang hoạt động");
        cbo_trangthai.addItem("Ngừng hoạt động");

        cbo_sanpham.addItem(null);
    }

    private void loadcbodm() {
        cbo_danhmuc.removeAllItems();
        List<Giay> list = new ArrayList<>();
        list = service_cbo.getCBOdanhmuc();
        list.forEach(o -> {
            cbo_danhmuc.addItem(o.getTenDanhMuc());
        });
        list.forEach(o -> {
            cbo_locdanhmuc.addItem(o.getTenDanhMuc());
        });

    }

    private void loadcboxx() {
        cbo_xuatxu.removeAllItems();
        List<Giay> list = new ArrayList<>();
        list = service_cbo.getCBOxuatxu();
        list.forEach(o -> {
            cbo_xuatxu.addItem(o.getTenXuatXu());
        });
        list.forEach(o -> {
            cbo_locxuatxu.addItem(o.getTenXuatXu());
        });

    }

    private void loadcbomausac() {
        cbo_mausac.removeAllItems();
        List<Giay> list = new ArrayList<>();
        list = service_cbo.getCBOmausac();
        list.forEach(o -> {
            cbo_mausac.addItem(o.getTenMauSac());
        });
//        list.forEach(o -> {
//            cbo_locxuatxu.addItem(o.getTenXuatXu());
//        });

    }

    private void loadcbokichthuoc() {
        cbo_kichthuoc.removeAllItems();
        List<Giay> list = new ArrayList<>();
        list = service_cbo.getCBOkichthuoc();
        list.forEach(o -> {
            cbo_kichthuoc.addItem(o.getTenKichThuoc().toString());
        });
//        list.forEach(o -> {
//            cbo_locxuatxu.addItem(o.getTenXuatXu());
//        });

    }

    private void loadcbochatlieu() {
        cbo_chatlieu.removeAllItems();
        List<Giay> list = new ArrayList<>();
        list = service_cbo.getCBOchatlieu();
        list.forEach(o -> {
            cbo_chatlieu.addItem(o.getTenChatLieu());
        });
//        list.forEach(o -> {
//            cbo_locxuatxu.addItem(o.getTenXuatXu());
//        });

    }

    private void loadcbokieude() {
        cbo_kieude.removeAllItems();
        List<Giay> list = new ArrayList<>();
        list = service_cbo.getCBOkieude();
        list.forEach(o -> {
            cbo_kieude.addItem(o.getTenKieuDe());
        });
//        list.forEach(o -> {
//            cbo_locxuatxu.addItem(o.getTenXuatXu());
//        });

    }

    private void loadcbokieumui() {
        cbo_kieumui.removeAllItems();
        List<Giay> list = new ArrayList<>();
        list = service_cbo.getCBOkieumui();
        list.forEach(o -> {
            cbo_kieumui.addItem(o.getTenKieuMui());
        });
//        list.forEach(o -> {
//            cbo_locxuatxu.addItem(o.getTenXuatXu());
//        });

    }

    private void loadcboloplot() {
        cbo_loplot.removeAllItems();
        List<Giay> list = new ArrayList<>();
        list = service_cbo.getCBOloplot();
        list.forEach(o -> {
            cbo_loplot.addItem(o.getTenLopLot());
        });
//        list.forEach(o -> {
//            cbo_locxuatxu.addItem(o.getTenXuatXu());
//        });

    }

    private void loadcbohinhanh() {
        cbo_hinhanh.setModel(molcboHInhanh);
        molcboHInhanh.removeAllElements();
//        cbo_hinhanh.removeAllItems();
        List<HinhAnh> list = new ArrayList<>();
        list = service_cbo.getCBOHinhAnh();
        list.forEach(o -> {
//            cbo_hinhanh.addItem(o.getImg());
            molcboHInhanh.addElement(o);
        });

    }

    public void updateHinh(String image) {
        ImageIcon icon1 = new ImageIcon("E:\\CAO_DANG_FPT\\Fall 2023\\Du_An_1\\Giao_Dien (1) (1) (1)\\src\\avatar" + image);
        Image im = icon1.getImage();
        ImageIcon icon = new ImageIcon(im.getScaledInstance(lbl_hinhanh.getWidth(), lbl_hinhanh.getHeight(), im.SCALE_SMOOTH));
        lbl_hinhanh.setIcon(icon);
    }

    private void clearForm() {
        txt_idsanpham.setText("");
        txt_masanpham.setText("");
        txt_tensanpham.setText("");
        txt_giaban.setText("");
        txt_soluong.setText("");
        txt_maspct.setText("");
        txt_tenspct.setText("");
        txt_idsp2.setText("");
        cbo_xuatxu.setSelectedItem("");
        cbo_trangthai.setSelectedItem("");
        cbo_danhmuc.setSelectedItem("");
        cbo_sanpham.setSelectedItem(" ");
        cbo_chatlieu.setSelectedItem("");
        cbo_kichthuoc.setSelectedItem("");
        cbo_kieude.setSelectedItem("");
        cbo_kieumui.setSelectedItem("");
        cbo_loplot.setSelectedItem("");
        cbo_mausac.setSelectedItem("");
        cbo_sanpham.setSelectedItem("");

        lbl_hinhanh.setIcon(null);
    }

    private Giay getInputForm() {
        Giay nv = new Giay();
        nv.setId_giay(Integer.valueOf(txt_idsanpham.getText()));
        nv.setMa_giay(txt_masanpham.getText());
        nv.setTenGiay(txt_tensanpham.getText());
        nv.setId_XuatXu(cbo_xuatxu.getSelectedIndex() + 1);
        nv.setId_DanhMuc(cbo_danhmuc.getSelectedIndex() + 1);
        nv.setTrangThai((String) cbo_trangthai.getSelectedItem());

        return nv;

    }

    private Giay getInputFormSPCT() {
        Giay nv = new Giay();
        nv.setId_giay(Integer.valueOf(txt_idsp2.getText()));
        nv.setId_giayChiTiet(service.getAllCT().get(tbl_giaychitiet.getSelectedRow()).getId_giayChiTiet());
        nv.setMa_giayChiTiet(txt_maspct.getText());
        nv.setTen_GiayChiTiet(txt_tenspct.getText());
        nv.setSoLuong(Integer.valueOf(txt_soluong.getText()));
        nv.setGiaBan(Float.parseFloat(txt_giaban.getText()));

        nv.setId_XuatXu(cbo_xuatxu.getSelectedIndex() + 1);
        nv.setId_DanhMuc(cbo_danhmuc.getSelectedIndex() + 1);
        nv.setTrangThai((String) cbo_trangthai.getSelectedItem());
        nv.setId_ChatLieu(cbo_chatlieu.getSelectedIndex() + 1);
        nv.setId_Kichthuoc(cbo_kichthuoc.getSelectedIndex() + 1);
        nv.setId_KieuDe(cbo_kieude.getSelectedIndex() + 1);
        nv.setId_KieuMui(cbo_loplot.getSelectedIndex() + 1);
        nv.setId_LopLot(cbo_loplot.getSelectedIndex() + 1);
        nv.setId_mauSac(cbo_mausac.getSelectedIndex() + 1);
        HinhAnh ha = (HinhAnh) cbo_hinhanh.getSelectedItem();
        nv.setId_HinhAnh(ha.getIdHinhAnh());
//        nv.setImg(lbl_hinhanh.getIcon().toString());

//        nv.setId_HinhAnh(1);
        nv.setImg(path);

//
//        nv.setGiaBan(Float.parseFloat(txt_giaban.getText()));
//        nv.setSoLuong(Integer.valueOf(txt_soluong.getText()));
//
//
//
//        nv.setId_HinhAnh(1);
//        nv.setId_giayChiTiet(Integer.parseInt(tbl_giay.getValueAt(tbl_giay.getSelectedRow(), 0).toString()));
//        nv.setImg(lbl_hinhanh.getText());
//        if (path == null) {
//            JOptionPane.showMessageDialog(this, "Ban chua chon hinh anh");
//            JFileChooser jf = new JFileChooser("E:\\CAO_DANG_FPT\\Fall 2023\\Du_An_1\\Giao_Dien\\src\\avatar");
//            int result = jf.showOpenDialog(null);
//            if (result == JFileChooser.APPROVE_OPTION) {
//                try {
//
//                    nv.setImg(jf.getSelectedFile().getPath());
//                    System.out.println(nv.getImg());
//                    JOptionPane.showMessageDialog(this, "Chon anh thanh cong");
//
//                } catch (HeadlessException e) {
//                }
//            } else {
//                JOptionPane.showMessageDialog(this, "Chua chon anh de sua");
//
//            }
//        } else {
//            nv.setImg(path);
//        }
        return nv;

    }

    public static void main(String args[]) {
        new View_Giay().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pannel_SanPham;
    private javax.swing.JPanel Pannel_SanPhamCT;
    private javax.swing.JPanel Pannel_ThuocTinh;
    private javax.swing.JTabbedPane QuanLyGiay;
    private javax.swing.JButton btnRes;
    private javax.swing.JButton btn_ShowAllSp;
    private javax.swing.JButton btn_addchitiet;
    private javax.swing.JButton btn_chitietsp;
    private javax.swing.JButton btn_clearspct;
    private javax.swing.JButton btn_danhmuc;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_suachitiet;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_trangthai;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JButton btn_xoa1;
    private javax.swing.JButton btn_xuatxu;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JComboBox<String> cbo_chatlieu;
    private javax.swing.JComboBox<Object> cbo_danhmuc;
    private javax.swing.JComboBox<String> cbo_hinhanh;
    private javax.swing.JComboBox<String> cbo_kichthuoc;
    private javax.swing.JComboBox<String> cbo_kieude;
    private javax.swing.JComboBox<String> cbo_kieumui;
    private javax.swing.JComboBox<String> cbo_locdanhmuc;
    private javax.swing.JComboBox<String> cbo_locxuatxu;
    private javax.swing.JComboBox<String> cbo_loplot;
    private javax.swing.JComboBox<String> cbo_mausac;
    private javax.swing.JComboBox<String> cbo_sanpham;
    private javax.swing.JComboBox<String> cbo_sanpham1;
    private javax.swing.JComboBox<String> cbo_trangthai;
    private javax.swing.JComboBox<String> cbo_xuatxu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_hinhanh;
    private javax.swing.JTable tbl_giay;
    private javax.swing.JTable tbl_giaychitiet;
    private javax.swing.JTextField txt_giaban;
    private javax.swing.JTextField txt_idsanpham;
    private javax.swing.JTextField txt_idsp2;
    private javax.swing.JTextField txt_masanpham;
    private javax.swing.JTextField txt_maspct;
    private javax.swing.JTextField txt_soluong;
    private javax.swing.JTextField txt_tensanpham;
    private javax.swing.JTextField txt_tenspct;
    private javax.swing.JTextField txt_tenthuoctinh;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
}
