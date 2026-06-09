
import javax.swing.JOptionPane;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Search extends javax.swing.JFrame {

    public Search() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSearchbyISBN = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtBorrowedBooks = new javax.swing.JTextField();
        txtTotalBooks = new javax.swing.JTextField();
        btnAddNewBook = new javax.swing.JButton();
        btnNewBorrowing = new javax.swing.JButton();
        lbltxtSearchbyISBN = new javax.swing.JLabel();
        lblBorrowedBooks = new javax.swing.JLabel();
        lblTotalBooks = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        MenILogout = new javax.swing.JMenuItem();
        MenIExit = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        MenIAddBook = new javax.swing.JMenuItem();
        MenIBorrowBook = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library System");

        txtSearchbyISBN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnSearch.setBackground(new java.awt.Color(51, 102, 255));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtBorrowedBooks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBorrowedBooks.setEnabled(false);

        txtTotalBooks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTotalBooks.setEnabled(false);

        btnAddNewBook.setBackground(new java.awt.Color(51, 102, 255));
        btnAddNewBook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddNewBook.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNewBook.setText("Add New Book");
        btnAddNewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewBookActionPerformed(evt);
            }
        });

        btnNewBorrowing.setBackground(new java.awt.Color(51, 102, 255));
        btnNewBorrowing.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNewBorrowing.setForeground(new java.awt.Color(255, 255, 255));
        btnNewBorrowing.setText("New Borrowing");
        btnNewBorrowing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewBorrowingActionPerformed(evt);
            }
        });

        lbltxtSearchbyISBN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbltxtSearchbyISBN.setText("Search by ISBN");

        lblBorrowedBooks.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBorrowedBooks.setText("Borrowed Books :");

        lblTotalBooks.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotalBooks.setText("Total Books :");

        jMenu2.setText("File");

        MenILogout.setText("Logout");
        MenILogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenILogoutActionPerformed(evt);
            }
        });
        jMenu2.add(MenILogout);

        MenIExit.setText("Exit");
        MenIExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenIExitActionPerformed(evt);
            }
        });
        jMenu2.add(MenIExit);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Books ");

        MenIAddBook.setText("Add Book");
        MenIAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenIAddBookActionPerformed(evt);
            }
        });
        jMenu1.add(MenIAddBook);

        MenIBorrowBook.setText("Borrow Book");
        MenIBorrowBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenIBorrowBookActionPerformed(evt);
            }
        });
        jMenu1.add(MenIBorrowBook);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtSearchbyISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lbltxtSearchbyISBN))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(btnAddNewBook, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtBorrowedBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblBorrowedBooks)))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotalBooks)
                            .addComponent(txtTotalBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNewBorrowing, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lbltxtSearchbyISBN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchbyISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBorrowedBooks)
                    .addComponent(lblTotalBooks))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBorrowedBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddNewBook, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewBorrowing, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNewBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewBookActionPerformed
        AddBook A=new AddBook();
        A.setVisible(true);
    }//GEN-LAST:event_btnAddNewBookActionPerformed

    private void btnNewBorrowingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewBorrowingActionPerformed
      BorrowBook W=new BorrowBook();
      W.setVisible(true);
    }//GEN-LAST:event_btnNewBorrowingActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
     String ISBN=txtSearchbyISBN.getText();
     if(ISBN.equals("123")){
     txtTotalBooks.setText("35");
     txtBorrowedBooks.setText("9");
     }else{
     JOptionPane.showMessageDialog(null,"Book not found");
     }
        try{
        
     File f=new File("books.txt");
     if(!f.exists()){
     JOptionPane.showMessageDialog(null, "No books available");
     return;
     }
     Scanner sc=new Scanner(f);
     boolean found=false;
     
     while(sc.hasNextLine()){
     String line=sc.nextLine();
     String[] data=line.split(",");
        if(data[0].equals(ISBN)){
        txtTotalBooks.setText(data[1]);
        txtBorrowedBooks.setText(data[2]);
            found=true;
            break;}
     }sc.close();
     if(!found){
     JOptionPane.showMessageDialog(null, "Book not found");
     txtTotalBooks.setText("");
     txtBorrowedBooks.setText("");
     }
        } catch (IOException ex) {
               Logger.getLogger(AddBook.class.getName()).log(Level.SEVERE, null, ex);
           }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void MenIAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenIAddBookActionPerformed
       AddBook A=new AddBook();
        A.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenIAddBookActionPerformed

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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenIAddBook;
    private javax.swing.JMenuItem MenIBorrowBook;
    private javax.swing.JMenuItem MenIExit;
    private javax.swing.JMenuItem MenILogout;
    private javax.swing.JButton btnAddNewBook;
    private javax.swing.JButton btnNewBorrowing;
    private javax.swing.JButton btnSearch;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblBorrowedBooks;
    private javax.swing.JLabel lblTotalBooks;
    private javax.swing.JLabel lbltxtSearchbyISBN;
    private javax.swing.JTextField txtBorrowedBooks;
    private javax.swing.JTextField txtSearchbyISBN;
    private javax.swing.JTextField txtTotalBooks;
    // End of variables declaration//GEN-END:variables
}
