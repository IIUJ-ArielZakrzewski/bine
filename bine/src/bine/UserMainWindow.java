/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bine;

/**
 *
 * @author Ariel
 */
public class UserMainWindow extends javax.swing.JFrame {

    /**
     * Creates new form UserMainWindow
     */
    public UserMainWindow() {
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

        kontenerWarstw = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        belkaMenu = new javax.swing.JMenuBar();
        plikMenu = new javax.swing.JMenu();
        wylogujMenuItem = new javax.swing.JMenuItem();
        zamknijMenuItem = new javax.swing.JMenuItem();
        edycjaMenu = new javax.swing.JMenu();
        dodajWinoMenuItem = new javax.swing.JMenuItem();
        dodajPiwoMenuItem = new javax.swing.JMenuItem();
        wyszukajMenuItem = new javax.swing.JMenuItem();
        wyswietlMenu = new javax.swing.JMenu();
        twojeWinaMenuItem = new javax.swing.JMenuItem();
        twojePiwaMenuItem = new javax.swing.JMenuItem();
        winaMenuItem = new javax.swing.JMenuItem();
        piwaMenuItem = new javax.swing.JMenuItem();
        oWinachMenuItem = new javax.swing.JMenuItem();
        oPiwachMenuItem = new javax.swing.JMenuItem();
        oProgramieMenu = new javax.swing.JMenu();
        pomocMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        jPanel1.setBounds(0, 0, 705, 345);
        kontenerWarstw.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        jPanel2.setBounds(0, 0, 705, 345);
        kontenerWarstw.add(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        jPanel3.setBounds(0, 0, 705, 345);
        kontenerWarstw.add(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        jPanel4.setBounds(0, 0, 705, 345);
        kontenerWarstw.add(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        jPanel5.setBounds(0, 0, 705, 345);
        kontenerWarstw.add(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 705, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        jPanel6.setBounds(0, 0, 705, 345);
        kontenerWarstw.add(jPanel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        plikMenu.setText("Plik");

        wylogujMenuItem.setText("Wyloguj");
        wylogujMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wylogujMenuItemActionPerformed(evt);
            }
        });
        plikMenu.add(wylogujMenuItem);

        zamknijMenuItem.setText("Zamknij");
        zamknijMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zamknijMenuItemActionPerformed(evt);
            }
        });
        plikMenu.add(zamknijMenuItem);

        belkaMenu.add(plikMenu);

        edycjaMenu.setText("Edycja");

        dodajWinoMenuItem.setText("Dodaj wino");
        edycjaMenu.add(dodajWinoMenuItem);

        dodajPiwoMenuItem.setText("Dodaj piwo");
        edycjaMenu.add(dodajPiwoMenuItem);

        wyszukajMenuItem.setText("Wyszukaj...");
        edycjaMenu.add(wyszukajMenuItem);

        belkaMenu.add(edycjaMenu);

        wyswietlMenu.setText("Wyświetl");

        twojeWinaMenuItem.setText("Twoje wina");
        wyswietlMenu.add(twojeWinaMenuItem);

        twojePiwaMenuItem.setText("Twoje piwa");
        wyswietlMenu.add(twojePiwaMenuItem);

        winaMenuItem.setText("Wina z bazy ogólnej");
        wyswietlMenu.add(winaMenuItem);

        piwaMenuItem.setText("Piwa z bazy ogólnej");
        wyswietlMenu.add(piwaMenuItem);

        oWinachMenuItem.setText("Opinie o winach");
        wyswietlMenu.add(oWinachMenuItem);

        oPiwachMenuItem.setText("Opinie o piwach");
        wyswietlMenu.add(oPiwachMenuItem);

        belkaMenu.add(wyswietlMenu);

        oProgramieMenu.setText("O programie");

        pomocMenuItem.setText("Pomoc");
        oProgramieMenu.add(pomocMenuItem);

        belkaMenu.add(oProgramieMenu);

        setJMenuBar(belkaMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kontenerWarstw, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kontenerWarstw, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zamknijMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zamknijMenuItemActionPerformed
        this.dispose();
    }//GEN-LAST:event_zamknijMenuItemActionPerformed

    private void wylogujMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wylogujMenuItemActionPerformed
        Logowanie logowanie = new Logowanie();
        logowanie.show();
        this.dispose();
    }//GEN-LAST:event_wylogujMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new UserMainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar belkaMenu;
    private javax.swing.JMenuItem dodajPiwoMenuItem;
    private javax.swing.JMenuItem dodajWinoMenuItem;
    private javax.swing.JMenu edycjaMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLayeredPane kontenerWarstw;
    private javax.swing.JMenuItem oPiwachMenuItem;
    private javax.swing.JMenu oProgramieMenu;
    private javax.swing.JMenuItem oWinachMenuItem;
    private javax.swing.JMenuItem piwaMenuItem;
    private javax.swing.JMenu plikMenu;
    private javax.swing.JMenuItem pomocMenuItem;
    private javax.swing.JMenuItem twojePiwaMenuItem;
    private javax.swing.JMenuItem twojeWinaMenuItem;
    private javax.swing.JMenuItem winaMenuItem;
    private javax.swing.JMenuItem wylogujMenuItem;
    private javax.swing.JMenu wyswietlMenu;
    private javax.swing.JMenuItem wyszukajMenuItem;
    private javax.swing.JMenuItem zamknijMenuItem;
    // End of variables declaration//GEN-END:variables
}