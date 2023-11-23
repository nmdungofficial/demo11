package view;


public class View_SubThuocTinh extends javax.swing.JFrame {
    public View_SubThuocTinh(int Status) {
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        setStatus(Status);
        loadFromThuocTinh();
    }
    
    
    public static void main(String[] args) {
        new View_SubThuocTinh(0).setVisible(true);
    }
    
    void loadFromThuocTinh(){
        if(Status==0){
            this.setTitle("Xuất Xứ");
            lblTenThuocTinh.setText("Nơi Xuất Xứ");
            tblListsThuocTinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "STT",
                "Nơi Xuất Xứ"
            }
        ));
        }
        if(Status==1){
            this.setTitle("Danh Mục");            
            lblTenThuocTinh.setText("Tên Danh Mục");
            tblListsThuocTinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "STT",
                "Tên Danh Mục"
            }
        ));
        }
        if(Status==2){
            this.setTitle("Trạng Thái");
            lblTenThuocTinh.setText("Tên Trạng Thái");
            tblListsThuocTinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "STT",
                "Tên Trạng Thái"
            }
        ));
        }
    }
    
    private int Status;
    
    private void setStatus(int Status){
        this.Status=Status;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblTenThuocTinh = new javax.swing.JLabel();
        txtThuocTinh = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblListsThuocTinh = new javax.swing.JTable();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 30));

        jPanel2.setBackground(new java.awt.Color(225, 226, 226));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTenThuocTinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTenThuocTinh.setText("Tên màu sắc");

        txtThuocTinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtThuocTinh.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtThuocTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThuocTinhActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRemove.setText("Xóa");

        btnNew.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNew.setText("Mới");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 102, 204));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tblListsThuocTinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "STT"
            }
        ));
        jScrollPane3.setViewportView(tblListsThuocTinh);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N
        btnClose.setText("Đóng");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnRemove)
                                .addGap(18, 18, 18)
                                .addComponent(btnNew))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate))
                            .addComponent(lblTenThuocTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtThuocTinh, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnClose)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnClose)
                        .addGap(2, 2, 2)
                        .addComponent(lblTenThuocTinh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtThuocTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRemove)
                            .addComponent(btnNew)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtThuocTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThuocTinhActionPerformed
        
    }//GEN-LAST:event_txtThuocTinhActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed

    }//GEN-LAST:event_btnNewActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTenThuocTinh;
    private javax.swing.JTable tblListsThuocTinh;
    private javax.swing.JTextField txtThuocTinh;
    // End of variables declaration//GEN-END:variables
}
