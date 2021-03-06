/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.teicm.pm.smartfilemanager.smartfilemanagerui;

import com.alee.extended.list.WebFileList;
import gr.teicm.pm.smartfilemanager.corelibrary.entity.logic.User;
import javax.swing.BorderFactory;
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
        mainPane = new javax.swing.JSplitPane();
        actionsSideBar = new org.jdesktop.swingx.JXTaskPaneContainer();
        placesPane = new org.jdesktop.swingx.JXTaskPane();
        PlacesPanel = new javax.swing.JPanel();
        jXHyperlink1 = new org.jdesktop.swingx.JXHyperlink();
        FilePane = new javax.swing.JPanel();
        computer = new org.jdesktop.swingx.JXTitledPanel();
        computerPanel = new javax.swing.JPanel();
        computerScrollPane = new javax.swing.JScrollPane();
        computerScrollablePane = new javax.swing.JPanel();
        jXTaskPaneContainer2 = new org.jdesktop.swingx.JXTaskPaneContainer();
        userHomePane = new org.jdesktop.swingx.JXTaskPane();
        jPanel1 = new javax.swing.JPanel();
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

        forwardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/navigation/go-next.png"))); // NOI18N
        forwardButton.setFocusable(false);
        forwardButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        forwardButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/navigation/go-previous.png"))); // NOI18N

        UpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/navigation/go-up.png"))); // NOI18N

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
                .addComponent(webPathField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(346, 346, 346))
        );

        mainPane.setResizeWeight(0.1);

        actionsSideBar.setBackground(new java.awt.Color(117, 150, 227));

        placesPane.setToolTipText("");
        placesPane.setTitle("Places");

        PlacesPanel.setOpaque(false);

        jXHyperlink1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/navigation/go-previous.png"))); // NOI18N
        jXHyperlink1.setText("Computer");
        jXHyperlink1.setToolTipText("");

        javax.swing.GroupLayout PlacesPanelLayout = new javax.swing.GroupLayout(PlacesPanel);
        PlacesPanel.setLayout(PlacesPanelLayout);
        PlacesPanelLayout.setHorizontalGroup(
            PlacesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlacesPanelLayout.createSequentialGroup()
                .addComponent(jXHyperlink1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
        );
        PlacesPanelLayout.setVerticalGroup(
            PlacesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlacesPanelLayout.createSequentialGroup()
                .addComponent(jXHyperlink1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 55, Short.MAX_VALUE))
        );

        placesPane.getContentPane().add(PlacesPanel);

        actionsSideBar.add(placesPane);

        mainPane.setLeftComponent(actionsSideBar);

        computer.setTitle("Computer");
        WebFileList wb= new WebFileList();

        computerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(),"Test"));

        userHomePane.setTitle(User.getUsername());

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 671, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        userHomePane.getContentPane().add(jPanel1);

        jXTaskPaneContainer2.add(userHomePane);

        javax.swing.GroupLayout computerScrollablePaneLayout = new javax.swing.GroupLayout(computerScrollablePane);
        computerScrollablePane.setLayout(computerScrollablePaneLayout);
        computerScrollablePaneLayout.setHorizontalGroup(
            computerScrollablePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(computerScrollablePaneLayout.createSequentialGroup()
                .addComponent(jXTaskPaneContainer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        computerScrollablePaneLayout.setVerticalGroup(
            computerScrollablePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(computerScrollablePaneLayout.createSequentialGroup()
                .addComponent(jXTaskPaneContainer2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        computerScrollPane.setViewportView(computerScrollablePane);

        javax.swing.GroupLayout computerPanelLayout = new javax.swing.GroupLayout(computerPanel);
        computerPanel.setLayout(computerPanelLayout);
        computerPanelLayout.setHorizontalGroup(
            computerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(computerScrollPane)
        );
        computerPanelLayout.setVerticalGroup(
            computerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(computerScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout computerLayout = new javax.swing.GroupLayout(computer.getContentContainer());
        computer.getContentContainer().setLayout(computerLayout);
        computerLayout.setHorizontalGroup(
            computerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(computerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        computerLayout.setVerticalGroup(
            computerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(computerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout FilePaneLayout = new javax.swing.GroupLayout(FilePane);
        FilePane.setLayout(FilePaneLayout);
        FilePaneLayout.setHorizontalGroup(
            FilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(computer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FilePaneLayout.setVerticalGroup(
            FilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(computer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        mainPane.setRightComponent(FilePane);

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
            .addComponent(mainPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navigationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPane))
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
    private javax.swing.JPanel FilePane;
    private javax.swing.JPanel PlacesPanel;
    private javax.swing.JButton UpButton;
    private javax.swing.JMenuItem aboutMenuItem;
    private org.jdesktop.swingx.JXTaskPaneContainer actionsSideBar;
    private javax.swing.JButton backButton;
    private org.jdesktop.swingx.JXTitledPanel computer;
    private javax.swing.JPanel computerPanel;
    private javax.swing.JScrollPane computerScrollPane;
    private javax.swing.JPanel computerScrollablePane;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton forwardButton;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel jPanel1;
    private org.jdesktop.swingx.JXHyperlink jXHyperlink1;
    private org.jdesktop.swingx.JXTaskPaneContainer jXTaskPaneContainer2;
    private javax.swing.JSplitPane mainPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JPanel navigationPanel;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private org.jdesktop.swingx.JXTaskPane placesPane;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenuItem showHideNavigationBar;
    private org.jdesktop.swingx.JXTaskPane userHomePane;
    private javax.swing.JMenu viewMenu;
    private com.alee.extended.filechooser.WebPathField webPathField1;
    // End of variables declaration//GEN-END:variables

}
