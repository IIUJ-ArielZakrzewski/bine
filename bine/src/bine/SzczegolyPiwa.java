/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bine;

/**
 *
 * @author Ariel
 */
public class SzczegolyPiwa extends javax.swing.JDialog {

    /**
     * Creates new form DodawanieWina
     */
    public SzczegolyPiwa(java.awt.Frame parent, boolean modal, boolean edycja) {
        super(parent, modal);
        initComponents();
        errorLabel.setVisible(false);
        if(!edycja)
        {
            jLabel11.setText("Informacje o piwie");
            jLabel1.setText("Nazwa:");
            jLabel2.setText("Browar:");
            jLabel3.setText("Kraj pochodzenia:");
            jLabel4.setText("Rodzaj piwa:");
            jLabel14.setVisible(false);
            wyczyscButton.setVisible(false);
            zatwierdzButton.setVisible(false);
            anulujButton.setText("OK");
            nazwaTextField.setEditable(false);
            browarTextField.setEditable(false);
            krajTextField.setEditable(false);
            rodzajTextField.setEditable(false);
            alkoholTextField.setEditable(false);
            ekstraktTextField.setEditable(false);
            chmielTextField.setEditable(false);
            opisTextField.setEditable(false);
            nazwaTextField.setBorder(null);
            browarTextField.setBorder(null);
            krajTextField.setBorder(null);
            rodzajTextField.setBorder(null);
            alkoholTextField.setBorder(null);
            ekstraktTextField.setBorder(null);
            chmielTextField.setBorder(null);
            opisTextField.setBorder(null);
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

        anulujButton = new javax.swing.JButton();
        wyczyscButton = new javax.swing.JButton();
        zatwierdzButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        krajTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ekstraktTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nazwaTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        browarTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        alkoholTextField = new javax.swing.JTextField();
        opisTextField = new javax.swing.JTextField();
        chmielTextField = new javax.swing.JTextField();
        rodzajTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        anulujButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        anulujButton.setText("Anuluj");
        anulujButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anulujButtonActionPerformed(evt);
            }
        });

        wyczyscButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wyczyscButton.setText("Wyczyść pola");
        wyczyscButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wyczyscButtonActionPerformed(evt);
            }
        });

        zatwierdzButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        zatwierdzButton.setText("Zatwierdź");
        zatwierdzButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zatwierdzButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("Edycja informacji o piwie");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel14.setText("Pola oznaczone * są wymagane!");

        errorLabel.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setText("errorLabel");

        jLabel3.setText("*Kraj pochodzenia:");

        jLabel2.setText("*Browar:");

        jLabel4.setText("*Rodzaj piwa:");

        jLabel5.setText("Alkohol:");

        jLabel6.setText("Ekstrakt:");

        jLabel7.setText("Gatunki chmielu:");

        jLabel10.setText("Opis:");

        jLabel1.setText("*Nazwa:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(wyczyscButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(anulujButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(zatwierdzButton)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(chmielTextField)
                                .addComponent(alkoholTextField)
                                .addComponent(ekstraktTextField)
                                .addComponent(rodzajTextField)
                                .addComponent(krajTextField)
                                .addComponent(browarTextField)
                                .addComponent(nazwaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(opisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nazwaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(browarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(krajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rodzajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ekstraktTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alkoholTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chmielTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(opisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wyczyscButton)
                    .addComponent(anulujButton)
                    .addComponent(zatwierdzButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anulujButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anulujButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_anulujButtonActionPerformed

    private void zatwierdzButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zatwierdzButtonActionPerformed
        this.dispose();
        //################DO MODYFIKACJII######################
    }//GEN-LAST:event_zatwierdzButtonActionPerformed

    private void wyczyscButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wyczyscButtonActionPerformed
        nazwaTextField.setText("");
        browarTextField.setText("");
        krajTextField.setText("");
        rodzajTextField.setText("");
        alkoholTextField.setText("");
        ekstraktTextField.setText("");
        chmielTextField.setText("");
        opisTextField.setText("");
    }//GEN-LAST:event_wyczyscButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alkoholTextField;
    private javax.swing.JButton anulujButton;
    private javax.swing.JTextField browarTextField;
    private javax.swing.JTextField chmielTextField;
    private javax.swing.JTextField ekstraktTextField;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField krajTextField;
    private javax.swing.JTextField nazwaTextField;
    private javax.swing.JTextField opisTextField;
    private javax.swing.JTextField rodzajTextField;
    private javax.swing.JButton wyczyscButton;
    private javax.swing.JButton zatwierdzButton;
    // End of variables declaration//GEN-END:variables
}