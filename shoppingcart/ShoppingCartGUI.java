package my.shoppingcart;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
import javax.swing.event.*;
/**
 *
 * @author colet
 */
public class ShoppingCartGUI extends javax.swing.JFrame {

    /**
     * Creates new form ShoppingCartGUI
     */
    public ShoppingCartGUI() {
        initComponents();
        createPanel(jPanel1);
        createEmptyPanel(jPanel2);
        createEmptyPanel(jPanel3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        tabPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        tabPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        tabPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane(jPanel3);
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 800));

        jTabbedPane2.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        tabPanel1.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        tabPanel1.add(jScrollPane1, "card2");

        jTabbedPane2.addTab("Items", tabPanel1);

        tabPanel2.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel2);

        tabPanel2.add(jScrollPane2, "card2");

        jTabbedPane2.addTab("Wishlist", tabPanel2);

        tabPanel3.setPreferredSize(new java.awt.Dimension(900, 20));

        jPanel4.setMaximumSize(new java.awt.Dimension(32414, 32414));
        jPanel4.setPreferredSize(new java.awt.Dimension(1150, 750));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.X_AXIS));

        jScrollPane3.setHorizontalScrollBar(null);
        jScrollPane3.setViewportView(jPanel3);

        jPanel3.setLayout(new java.awt.CardLayout());
        jScrollPane3.setViewportView(jPanel3);

        jPanel4.add(jScrollPane3);

        jPanel5.setBackground(new java.awt.Color(248, 248, 248));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setPreferredSize(new java.awt.Dimension(2, 2));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Your total:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel6.setText(setTotalValue());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(530, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel5);

        tabPanel3.add(jPanel4);

        jTabbedPane2.addTab("Cart", tabPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ShoppingCartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShoppingCartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShoppingCartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShoppingCartGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShoppingCartGUI().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel tabPanel1;
    private javax.swing.JPanel tabPanel2;
    private javax.swing.JPanel tabPanel3;
    // End of variables declaration//GEN-END:variables

    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton wishlistButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton cartButton;
    private javax.swing.JButton removeFromCartButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JLabel emptyLabel;
    
//Initializes driver object for list manipulation and initial lists for all panes
    
    Driver driver = new Driver();
    LinkedList list = driver.createTestList();
    LinkedList wishlist = driver.createEmptyList();
    LinkedList cartList = driver.createEmptyList();
    
//Creates initial panel for full shopping list
    
    public void createPanel(JPanel panel) {
        int count = driver.countNodes(list);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        for (int i = 1; i < count + 1; i++) {
            final int index = i;
            JPanel jp = new JPanel();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jSeparator1 = new javax.swing.JSeparator();
            jComboBox1 = new javax.swing.JComboBox<>();
            wishlistButton = new javax.swing.JButton();
            cartButton = new javax.swing.JButton();
            emptyLabel = new javax.swing.JLabel();

            jp.setBackground(Color.WHITE);
            jp.setLayout(new GridLayout(1, 0, 25, 0));
            
            jLabel1.setText("Name: " + driver.getNameAt(list, i));
            jp.add(jLabel1);
            
            double price = driver.returnNodeAt(list, i).getPrice();
            String priceString = String.format("Price: $%.2f", price);
            jLabel2.setText(priceString);
            jp.add(jLabel2);
            
            
            if (driver.returnNodeAt(list, i).hasColor) {
                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(driver.returnNodeAt(list, i).getAvailableColors()));
                jp.add(jComboBox1);
            }
            
            wishlistButton.setText("Wishlist");
            wishlistButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    wishlistButtonActionPerformed(evt, index);
                }
            });
            jp.add(wishlistButton);
            
            cartButton.setText("Add to Cart");
            cartButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cartButtonActionPerformed(evt, list, index);
                }
            });
            jp.add(cartButton);
            
            panel.add(jp);
            panel.add(jSeparator1);
        }
    }
    
//Initializes empty panels for wishlist and cart
    
    public void createEmptyPanel(JPanel panel) {
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JPanel jp = new JPanel();
        jp.setBackground(Color.WHITE);
        jp.setLayout(new FlowLayout());
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setText("Uh oh! No items found.");
        jp.add(jLabel1);
        panel.add(jp);
    }
    
//Updates wishlist panel when items are added/removed
//Rebuilds panel from scratch with a new sub-panel created for each node in the list
    
    public void updateWishlistPanel(JPanel panel) {
        int count = driver.countNodes(wishlist);
        panel.removeAll();
        if (wishlist.head == null) {
            createEmptyPanel(jPanel2);
            return;
        }
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        for (int i = 1; i < count + 1; i++) {
            final int index = i;
            JPanel jp = new JPanel();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jSeparator1 = new javax.swing.JSeparator();
            jComboBox1 = new javax.swing.JComboBox<>();
            removeButton = new javax.swing.JButton();
            cartButton = new javax.swing.JButton();
            
            jp.setBackground(Color.WHITE);
            jp.setLayout(new GridLayout(1, 0, 25, 0));
            
            jLabel1.setText("Name: " + driver.getNameAt(wishlist, i));
            jp.add(jLabel1);
            
            double price = driver.returnNodeAt(wishlist, i).getPrice();
            String priceString = String.format("Price: $%.2f", price);
            jLabel2.setText(priceString);
            jp.add(jLabel2);
            
            if (driver.returnNodeAt(wishlist, i).hasColor) {
                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(driver.returnNodeAt(list, i).getAvailableColors()));
                jp.add(jComboBox1);
            }
            
            removeButton.setText("Remove");
            removeButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    removeButtonActionPerformed(evt, index);
                }
            });
            jp.add(removeButton);
             
            cartButton.setText("Add to Cart");
            cartButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cartButtonActionPerformed(evt, wishlist, index);
                }
            });
            jp.add(cartButton);
            
            panel.add(jp);
            panel.add(jSeparator1);
        }
    }
    
//Updates cart panel and total display when items are added/removed
//Rebuilds panel from scratch with a new sub-panel created for each node in the list
    public void updateCartPanel(JPanel panel) {
        int count = driver.countNodes(cartList);
        panel.removeAll();
        if (cartList.head == null) {
            createEmptyPanel(jPanel3);
            jLabel6.setText(setTotalValue());
            return;
        }
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        for (int i = 1; i < count + 1; i++) {
            final int index = i;
            JPanel jp = new JPanel();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabelColor = new javax.swing.JLabel();
            jSeparator1 = new javax.swing.JSeparator();
            removeFromCartButton = new javax.swing.JButton();
            jComboBox1 = new javax.swing.JComboBox();
            
            jp.setBackground(Color.WHITE);
            jp.setLayout(new GridLayout(1, 0, 25, 0));
      
            jLabel1.setText("Name: " + driver.getNameAt(cartList, i));
            jp.add(jLabel1);
            
            double price = driver.returnNodeAt(cartList, i).getPrice();
            String priceString = String.format("Price: $%.2f", price);
            jLabel2.setText(priceString);
            jp.add(jLabel2);
            
            if (driver.returnNodeAt(cartList, i).hasColor) {
                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(driver.returnNodeAt(list, i).getAvailableColors()));
                jp.add(jComboBox1);
            }
            
            removeFromCartButton.setText("Remove");
            removeFromCartButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    removeFromCartButtonActionPerformed(evt, index);
                }
            });
            jp.add(removeFromCartButton);
            
            panel.add(jp);
            panel.add(jSeparator1);
            jLabel6.setText(setTotalValue());
        }
    }
    
    
//Event handlers go here
    
    
    private void wishlistButtonActionPerformed(java.awt.event.ActionEvent evt, int pos) {                                         
        Node currentNode = driver.returnNodeAt(list, pos);
        driver.pushBack(wishlist, currentNode);
        updateWishlistPanel(jPanel2);
        jPanel2.updateUI();
    }
    
    private void cartButtonActionPerformed(java.awt.event.ActionEvent evt, LinkedList list, int pos) {                                         
        Node currentNode = driver.returnNodeAt(list, pos);
        if (list == wishlist) {
            driver.removeNodeAt(wishlist, pos);
            updateWishlistPanel(jPanel2);
        }
        driver.pushBack(cartList, currentNode);
        updateCartPanel(jPanel3);
        jPanel3.updateUI();
    }
    
    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt, int pos) {                                         
        driver.removeNodeAt(wishlist, pos);
        updateWishlistPanel(jPanel2);
        jPanel2.updateUI();
    } 
    
    private void removeFromCartButtonActionPerformed(java.awt.event.ActionEvent evt, int pos) {                                         
        System.out.println(pos);
        driver.removeNodeAt(cartList, pos);
        updateCartPanel(jPanel3);
        jPanel3.updateUI();
    } 
    
    private String setTotalValue() {
        if (cartList.head == null) {
            return "$0.00";
        }
        String totalValue = String.format("$%.2f", driver.getTotalValue(cartList));
        return totalValue;
    }
}
