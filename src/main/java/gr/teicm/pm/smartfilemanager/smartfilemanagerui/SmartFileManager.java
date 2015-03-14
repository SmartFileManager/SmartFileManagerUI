/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.pm.smartfilemanager.smartfilemanagerui;

import org.apache.commons.lang3.SystemUtils;

/**
 *
 * @author user
 */
public class SmartFileManager extends javax.swing.JFrame {

    /**
     * Creates new form SmartFileManager
     */
    public SmartFileManager() {
        initComponents();
        //JXTaskPane pane = new JXTaskPane("lol");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navigationPanel = new javax.swing.JPanel();
        forwardButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        UpButton = new javax.swing.JButton();
        webPathField1 = new com.alee.extended.filechooser.WebPathField();
        jComboBox1 = new javax.swing.JComboBox();
        jSplitPane1 = new javax.swing.JSplitPane();
        jXTaskPaneContainer1 = new org.jdesktop.swingx.JXTaskPaneContainer();
        jXTaskPane1 = new org.jdesktop.swingx.JXTaskPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jXHyperlink1 = new org.jdesktop.swingx.JXHyperlink();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        showHideNavigationBar = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        navigationPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                navigationPanelComponentShown(evt);
            }
        });

        forwardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/go-next.png"))); // NOI18N
        forwardButton.setFocusable(false);
        forwardButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        forwardButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/go-previous.png"))); // NOI18N

        UpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/go-up.png"))); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout navigationPanelLayout = new javax.swing.GroupLayout(navigationPanel);
        navigationPanel.setLayout(navigationPanelLayout);
        navigationPanelLayout.setHorizontalGroup(
            navigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forwardButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(webPathField1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        navigationPanelLayout.setVerticalGroup(
            navigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationPanelLayout.createSequentialGroup()
                .addGroup(navigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(forwardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(webPathField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jSplitPane1.setResizeWeight(0.1);

        jXTaskPaneContainer1.setBackground(new java.awt.Color(117, 150, 227));

        jXTaskPane1.setBackground(new java.awt.Color(214, 223, 247));
        jXTaskPane1.setForeground(new java.awt.Color(255, 19, 15));
        jXTaskPane1.setTitle("Places");
        jXTaskPane1.setToolTipText("");
        jXTaskPane1.setOpaque(true);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        jXHyperlink1.setText("jXHyperlink1");
        jPanel1.add(jXHyperlink1, java.awt.BorderLayout.PAGE_START);

        jButton1.setText("jButton1");
        jPanel1.add(jButton1, java.awt.BorderLayout.PAGE_END);

        jXTaskPane1.getContentPane().add(jPanel1);

        jXTaskPaneContainer1.add(jXTaskPane1);

        jSplitPane1.setLeftComponent(jXTaskPaneContainer1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jSplitPane1.setRightComponent(jScrollPane1);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        viewMenu.setText("View");

        showHideNavigationBar.setText("Hide navigation bar");
        showHideNavigationBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showHideNavigationBarMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showHideNavigationBarMouseClicked(evt);
            }
        });
        showHideNavigationBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showHideNavigationBarActionPerformed(evt);
            }
        });
        viewMenu.add(showHideNavigationBar);

        menuBar.add(viewMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(navigationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navigationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void showHideNavigationBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showHideNavigationBarActionPerformed
        if (!navigationPanel.isShowing()) {
            navigationPanel.setVisible(true);
            showHideNavigationBar.setText("Hide navigation toolbar");
        } else {
            navigationPanel.setVisible(false);
            showHideNavigationBar.setText("Show navigation toolbar");
        }
        

    }//GEN-LAST:event_showHideNavigationBarActionPerformed

    private void navigationPanelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_navigationPanelComponentShown

    }//GEN-LAST:event_navigationPanelComponentShown

    private void showHideNavigationBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showHideNavigationBarMouseClicked

    }//GEN-LAST:event_showHideNavigationBarMouseClicked

    private void showHideNavigationBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showHideNavigationBarMousePressed

    }//GEN-LAST:event_showHideNavigationBarMousePressed

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
                if (SystemUtils.IS_OS_LINUX) {
                    javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
                }
                if (SystemUtils.IS_OS_WINDOWS) {
                    javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                }
                if (SystemUtils.IS_OS_MAC_OSX || SystemUtils.IS_OS_MAC) {
                    javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SmartFileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SmartFileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SmartFileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SmartFileManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SmartFileManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpButton;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton backButton;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton forwardButton;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea jTextArea1;
    private org.jdesktop.swingx.JXHyperlink jXHyperlink1;
    private org.jdesktop.swingx.JXTaskPane jXTaskPane1;
    private org.jdesktop.swingx.JXTaskPaneContainer jXTaskPaneContainer1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel navigationPanel;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenuItem showHideNavigationBar;
    private javax.swing.JMenu viewMenu;
    private com.alee.extended.filechooser.WebPathField webPathField1;
    // End of variables declaration//GEN-END:variables

}
