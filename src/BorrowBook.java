
import javax.swing.JOptionPane;
import javax.swing.*;

public class BorrowBook extends javax.swing.JFrame {

    public BorrowBook() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtStudentID = new javax.swing.JTextField();
        txtBookID = new javax.swing.JTextField();
        btnVerify = new javax.swing.JButton();
        btnConfirmBorrowing = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtReturnDate = new javax.swing.JTextField();
        lblStudentID = new javax.swing.JLabel();
        lblBookID = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenILogout = new javax.swing.JMenuItem();
        MenIExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenISearch = new javax.swing.JMenuItem();
        MenIAddBook = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library System");

        txtStudentID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtBookID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnVerify.setBackground(new java.awt.Color(51, 102, 255));
        btnVerify.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVerify.setForeground(new java.awt.Color(255, 255, 255));
        btnVerify.setText("Verify");
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
            }
        });

        btnConfirmBorrowing.setBackground(new java.awt.Color(51, 102, 255));
        btnConfirmBorrowing.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConfirmBorrowing.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmBorrowing.setText("Confirm Borrowing");
        btnConfirmBorrowing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmBorrowingActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Titel", "Borrowing Date", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        txtReturnDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtReturnDate.setText("Return Date :");

        lblStudentID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStudentID.setText("Student ID :");

        lblBookID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBookID.setText("Book ID :");

        jMenu1.setText("File");

        MenILogout.setText("Logout");
        MenILogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenILogoutActionPerformed(evt);
            }
        });
        jMenu1.add(MenILogout);

        MenIExit.setText("Exit");
        MenIExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenIExitActionPerformed(evt);
            }
        });
        jMenu1.add(MenIExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Books");

        MenISearch.setText("Search");
        MenISearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenISearchActionPerformed(evt);
            }
        });
        jMenu2.add(MenISearch);

        MenIAddBook.setText("Add Book");
        MenIAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenIAddBookActionPerformed(evt);
            }
        });
        jMenu2.add(MenIAddBook);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmBorrowing, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStudentID)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBookID))
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblStudentID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblBookID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(txtReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnConfirmBorrowing, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyActionPerformed
       if(txtStudentID.getText().isEmpty()){
       JOptionPane.showMessageDialog(null, "Please Enter Student ID");
       }else{
        JOptionPane.showMessageDialog(null, "Student Verified Successfully");
       }
    }//GEN-LAST:event_btnVerifyActionPerformed

    private void btnConfirmBorrowingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmBorrowingActionPerformed
       JOptionPane.showMessageDialog(null, "Borrowing Confirmed");
    }//GEN-LAST:event_btnConfirmBorrowingActionPerformed

    private void MenISearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenISearchActionPerformed
      Search S=new Search();
        S.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenISearchActionPerformed

    private void MenIAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenIAddBookActionPerformed
      AddBook A=new AddBook();
       A.setVisible(true);
       dispose();
    }//GEN-LAST:event_MenIAddBookActionPerformed

    private void MenILogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenILogoutActionPerformed
      Login L=new Login();
      L.setVisible(true);
      dispose();
    }//GEN-LAST:event_MenILogoutActionPerformed

    private void MenIExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenIExitActionPerformed
      System.exit(0);
    }//GEN-LAST:event_MenIExitActionPerformed

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
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrowBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenIAddBook;
    private javax.swing.JMenuItem MenIExit;
    private javax.swing.JMenuItem MenILogout;
    private javax.swing.JMenuItem MenISearch;
    private javax.swing.JButton btnConfirmBorrowing;
    private javax.swing.JButton btnVerify;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBookID;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JTextField txtBookID;
    private javax.swing.JTextField txtReturnDate;
    private javax.swing.JTextField txtStudentID;
    // End of variables declaration//GEN-END:variables
}
