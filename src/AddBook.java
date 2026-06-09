
import javax.swing.JOptionPane;
import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddBook extends javax.swing.JFrame {

    public AddBook() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBookTitel = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        txtAuthorName = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtQuantity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBookDescription = new javax.swing.JTextArea();
        lblBookTitel = new javax.swing.JLabel();
        lblAuthorName = new javax.swing.JLabel();
        lblISBN = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenILogout = new javax.swing.JMenuItem();
        MenIExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenISearch = new javax.swing.JMenuItem();
        MenIBorrowBook = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library System");

        jComboBox1.setBackground(new java.awt.Color(0, 51, 102));
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Type", "Scientific", "History", "Literary", "Religious", "Philosophical", "Educational" }));

        btnSave.setBackground(new java.awt.Color(51, 102, 255));
        btnSave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(51, 102, 255));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtQuantity.setText("Quantity :");
        txtQuantity.setEnabled(false);

        txtBookDescription.setColumns(20);
        txtBookDescription.setRows(5);
        txtBookDescription.setText("Book Description :");
        txtBookDescription.setEnabled(false);
        jScrollPane1.setViewportView(txtBookDescription);

        lblBookTitel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBookTitel.setText("Book Titel :");

        lblAuthorName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAuthorName.setText("Author Name :");

        lblISBN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblISBN.setText("ISBN :");

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

        MenIBorrowBook.setText("Borrow Book");
        MenIBorrowBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenIBorrowBookActionPerformed(evt);
            }
        });
        jMenu2.add(MenIBorrowBook);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAuthorName)
                            .addComponent(lblBookTitel)
                            .addComponent(lblISBN)
                            .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblBookTitel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBookTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAuthorName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblISBN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
   if(txtBookTitel.getText().equalsIgnoreCase("Java Programming")){
   txtQuantity.setText("10");
   txtBookDescription.setText("Java Programming basics and OOP concepts");
   }
    
     try{
     FileWriter fw=new FileWriter("books.txt",true);
     PrintWriter pw=new PrintWriter(fw);
     pw.println(
     txtBookTitel.getText()+","+
     txtAuthorName.getText()+","+
     txtISBN.getText()+","+
     txtQuantity.getText()+","+
     txtBookDescription.getText()
     );
     pw.close();
     JOptionPane.showMessageDialog(this, "Book Saved Seccessfully");
     }  catch (IOException ex) {
            Logger.getLogger(AddBook.class.getName()).log(Level.SEVERE, null, ex);
        }
      Search S=new Search();
     S.setVisible(true);
     dispose();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
     txtBookTitel.setText("");
     txtAuthorName.setText("");
     txtISBN.setText("");
     txtQuantity.setText("");
     txtBookDescription.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void MenISearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenISearchActionPerformed
       Search S=new Search();
       S.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenISearchActionPerformed

    private void MenIBorrowBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenIBorrowBookActionPerformed
        BorrowBook W=new BorrowBook();
     W.setVisible(true);
     dispose();
    }//GEN-LAST:event_MenIBorrowBookActionPerformed

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
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenIBorrowBook;
    private javax.swing.JMenuItem MenIExit;
    private javax.swing.JMenuItem MenILogout;
    private javax.swing.JMenuItem MenISearch;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAuthorName;
    private javax.swing.JLabel lblBookTitel;
    private javax.swing.JLabel lblISBN;
    private javax.swing.JTextField txtAuthorName;
    private javax.swing.JTextArea txtBookDescription;
    private javax.swing.JTextField txtBookTitel;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
    

        
