/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import Model.Staff;
import Model.StaffList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class StaffDialog extends javax.swing.JDialog {
    SimpleDateFormat date_format = new SimpleDateFormat("dd/MM/yyyy");
    StaffList sl = new StaffList();
    /**
     * Creates new form StaffDialog
     */
    public StaffDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void fillDataTable(){
        DefaultTableModel model = (DefaultTableModel)tblStaff.getModel();
        model.setRowCount(0); //Clear table
        for(Staff stf:sl.getAllStaff()){
            Object rowData[] = new Object[7];
            rowData[0] = stf.getId();
            rowData[1] = stf.getFullname();
            rowData[2] = date_format.format(stf.getBirthday());
            rowData[3] = stf.isSex()?"Nam":"Nữ";
            rowData[4] = stf.getPhoneNumber();
            rowData[5] = stf.getPosition();
            rowData[6] = stf.getCa();
            model.addRow(rowData);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBirthday = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPosition = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCa = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStaff = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quản lý nhân sự");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN Y TẾ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Họ tên*");

        txtFullname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ngày sinh*");

        txtBirthday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Giới tính*");

        buttonGroup1.add(rdNam);
        rdNam.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdNam.setSelected(true);
        rdNam.setText("Nam");

        buttonGroup1.add(rdNu);
        rdNu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdNu.setText("Nữ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Số điện thoại*");

        txtPhoneNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Chức vụ*");

        txtPosition.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Ca làm việc*");

        txtCa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Save-icon.png"))); // NOI18N
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Actions-document-edit-icon-16.png"))); // NOI18N
        btnEdit.setText("Cập nhật");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/new-icon-16.png"))); // NOI18N
        btnReset.setText("Nhập mới");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        tblStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Họ tên", "Ngày sinh", "Giới tính", "Số điện thoại", "Chức vụ", "Ca làm việc"
            }
        ));
        tblStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStaffMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStaff);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("ID*");

        txtId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Search.png"))); // NOI18N
        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPosition, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                                            .addComponent(txtPhoneNumber)
                                            .addComponent(txtBirthday)
                                            .addComponent(txtFullname)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rdNam)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rdNu)))
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCa, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnSearch)
                                .addGap(18, 18, 18)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnReset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEdit)))
                        .addGap(0, 59, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdNam)
                    .addComponent(rdNu)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnReset)
                        .addComponent(btnDelete)
                        .addComponent(btnEdit)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void reset(){
        txtId.setText("");
        txtFullname.setText("");
        txtBirthday.setText("");
        rdNam.isSelected();
        txtPhoneNumber.setText("");
        txtPosition.setText("");
        txtCa.setText("");
    }
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnResetActionPerformed
    
    public boolean validateForm(){
        if(txtFullname.getText().isEmpty()||txtBirthday.getText().isEmpty()){
            return false;
        }
        return true;
    }
    public Staff getModel() throws ParseException{
        Staff stf = new Staff();
        stf.setId(txtId.getText());
        stf.setFullname(txtFullname.getText());
        stf.setBirthday(date_format.parse(txtBirthday.getText()));
        boolean gt = false;//Mặc định là nữ
        if(rdNam.isSelected()){
            gt = true;
        }
        stf.setSex(gt);
        stf.setPhoneNumber(txtPhoneNumber.getText());
        stf.setPosition(txtPosition.getText());
        stf.setCa(txtCa.getText());
        return stf;
    }
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(validateForm()){
            try {
                Staff stf = getModel();
                if(sl.add(stf)>0){
                    JOptionPane.showMessageDialog(this, "Lưu thành công");
                    fillDataTable(); //Thêm dữ liệu vào bảng
                }
            } catch (ParseException ex) {
                Logger.getLogger(StaffDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Thông tin nhập chưa đầy đủ");
        }
    }//GEN-LAST:event_btnSaveActionPerformed
    
    public void setModel(Staff stf){
        //Đổ ngược dữ liệu từ bảng lên form
        txtId.setText(stf.getId());
        txtFullname.setText(stf.getFullname());
        txtBirthday.setText(date_format.format(stf.getBirthday()));
        if(stf.isSex()){
            rdNam.isSelected();
        }else{
            rdNu.isSelected();
        }
        txtPhoneNumber.setText(stf.getPhoneNumber());
        txtPosition.setText(stf.getPosition());
        txtCa.setText(stf.getCa());
    }
    private void tblStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStaffMouseClicked
        // TODO add your handling code here:
        int location = tblStaff.rowAtPoint(evt.getPoint());
        String id = tblStaff.getValueAt(location, 0).toString();
        Staff stf = sl.getStaffById(id);
        setModel(stf);
    }//GEN-LAST:event_tblStaffMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if(validateForm()){
            try {
                Staff stf = getModel();
                if(sl.updateStaffbyId(stf)>0){
                    JOptionPane.showMessageDialog(this, "Cập nhật thành công");
                    fillDataTable();
                }
            } catch (ParseException ex) {
                Logger.getLogger(StaffDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            JOptionPane.showMessageDialog(this, "Thông tin chưa được nhập đầy đủ");
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if(txtFullname.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên để xóa");
        }else{
            if(sl.delStaffByID(txtId.getText())>0){
                JOptionPane.showMessageDialog(this, "Xóa thành công");
                fillDataTable();
            }else{
                JOptionPane.showMessageDialog(this, "Không tìm thấy dữ liệu để xóa");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String id_search = txtId.getText();
        if(id_search.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nhập ID của nhân viên bạn muốn tìm kiếm !");
        }else{
            Staff stf = sl.getStaffById(id_search);
            setModel(stf); 
        }            
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(StaffDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StaffDialog dialog = new StaffDialog(new javax.swing.JFrame(), true);
                dialog.fillDataTable();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.fillDataTable();
                dialog.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tblStaff;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtCa;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtPosition;
    // End of variables declaration//GEN-END:variables
}
