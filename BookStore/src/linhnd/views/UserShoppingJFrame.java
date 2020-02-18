/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linhnd.views;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import linhnd.daos.BookDAO;
import linhnd.dtos.BookDTO;

/**
 *
 * @author Duc Linh
 */
public class UserShoppingJFrame extends javax.swing.JFrame {

    DefaultTableModel tableModelBook = null;

    /**
     * Creates new form WelcomeJFrame
     */
    public UserShoppingJFrame() {
        initComponents();
        tableModelBook = (DefaultTableModel) tableViewBook.getModel();
        firstController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JFrameDetailBook = new javax.swing.JFrame();
        imagerBook = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_titleBook = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_author = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_descriptionBook = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txt_Price = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        JFrameCart = new javax.swing.JFrame();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txt_Search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableViewBook = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        imagerBook.setBackground(new java.awt.Color(0, 0, 0));
        imagerBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imager/1.jpg"))); // NOI18N

        jLabel3.setText("Name:");

        txt_titleBook.setText("name");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linhnd/icon/icons8_add_shopping_cart_30px_1.png"))); // NOI18N
        jButton4.setText("ADD to Cart");

        jLabel4.setText("Author :");

        txt_author.setText("author");

        jLabel5.setText("Description Book :");

        txt_descriptionBook.setColumns(20);
        txt_descriptionBook.setRows(5);
        jScrollPane2.setViewportView(txt_descriptionBook);

        jLabel6.setText("Price :");

        txt_Price.setText("price");

        jLabel7.setText("BOOK DETAIL");

        jLabel8.setText("Quantity :");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setText("1");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linhnd/icon/icons8_plus_20px.png"))); // NOI18N

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linhnd/icon/icons8_plus_20px.png"))); // NOI18N

        javax.swing.GroupLayout JFrameDetailBookLayout = new javax.swing.GroupLayout(JFrameDetailBook.getContentPane());
        JFrameDetailBook.getContentPane().setLayout(JFrameDetailBookLayout);
        JFrameDetailBookLayout.setHorizontalGroup(
            JFrameDetailBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JFrameDetailBookLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(imagerBook, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JFrameDetailBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JFrameDetailBookLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(JFrameDetailBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JFrameDetailBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JFrameDetailBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_author, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                .addComponent(txt_titleBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JFrameDetailBookLayout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addGap(8, 8, 8)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5))))
                    .addGroup(JFrameDetailBookLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jButton4)))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(JFrameDetailBookLayout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JFrameDetailBookLayout.setVerticalGroup(
            JFrameDetailBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JFrameDetailBookLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JFrameDetailBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JFrameDetailBookLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(imagerBook, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(JFrameDetailBookLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(71, 71, 71)
                        .addGroup(JFrameDetailBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_titleBook, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(JFrameDetailBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_author, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JFrameDetailBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JFrameDetailBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(JFrameDetailBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JFrameDetailBookLayout.createSequentialGroup()
                                .addComponent(jTextField1)
                                .addGap(18, 18, 18))
                            .addGroup(JFrameDetailBookLayout.createSequentialGroup()
                                .addGroup(JFrameDetailBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jButton6)
                                    .addComponent(jButton5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jButton4)
                        .addGap(51, 51, 51))))
        );

        javax.swing.GroupLayout JFrameCartLayout = new javax.swing.GroupLayout(JFrameCart.getContentPane());
        JFrameCart.getContentPane().setLayout(JFrameCartLayout);
        JFrameCartLayout.setHorizontalGroup(
            JFrameCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        JFrameCartLayout.setVerticalGroup(
            JFrameCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linhnd/icon/icons8_shopping_cart_30px.png"))); // NOI18N
        jButton1.setText("CART");

        jLabel1.setText("WELCOME ");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/linhnd/icon/icons8_search_30px.png"))); // NOI18N
        jButton2.setText("SEARCH");

        tableViewBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BookID", "Title", "ImagerName", "Description", "Price", "Author"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableViewBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableViewBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableViewBook);
        if (tableViewBook.getColumnModel().getColumnCount() > 0) {
            tableViewBook.getColumnModel().getColumn(0).setPreferredWidth(20);
            tableViewBook.getColumnModel().getColumn(4).setPreferredWidth(25);
        }

        jLabel2.setText("Input name's book :");

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(txt_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton2)
                .addGap(35, 35, 35)
                .addComponent(jButton3)
                .addGap(93, 93, 93))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(txt_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(43, 43, 43)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFrameDetailBook.setSize(720, 550);
        JFrameDetailBook.setVisible(true);
        txt_descriptionBook.disable();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tableViewBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableViewBookMouseClicked
        int row = tableViewBook.getSelectedRow();
        String bookId = (String) tableModelBook.getValueAt(row, 0);
        if (row >= 0) {
            JFrameDetailBook.setSize(720, 550);
            JFrameDetailBook.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tableViewBookMouseClicked
    private void viewTableBook(List<BookDTO> list) throws Exception {
        tableModelBook.setRowCount(0);
        for (BookDTO bookDTO : list) {
            tableModelBook.addRow(bookDTO.toVectorBookView());
        }
    }

    private void firstController() {
        try {
            BookDAO dao = new BookDAO();
            List<BookDTO> list = dao.getAllBook();
            viewTableBook(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
            java.util.logging.Logger.getLogger(UserShoppingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserShoppingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserShoppingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserShoppingJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserShoppingJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame JFrameCart;
    private javax.swing.JFrame JFrameDetailBook;
    private javax.swing.JLabel imagerBook;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tableViewBook;
    private javax.swing.JLabel txt_Price;
    private javax.swing.JTextField txt_Search;
    private javax.swing.JLabel txt_author;
    private javax.swing.JTextArea txt_descriptionBook;
    private javax.swing.JLabel txt_titleBook;
    // End of variables declaration//GEN-END:variables
}