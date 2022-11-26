package com.mycompany.kcr_picko;

import java.text.DecimalFormat;
import javax.swing.DefaultListModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author yannick97
 */
public class MainMenu extends javax.swing.JFrame {
    
    public static DefaultListModel<String> model = new DefaultListModel<>();
    public static ArrayList<Pizza> pizzaObjList = new ArrayList<Pizza>();
    
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        
        this.getContentPane().setBackground(new java.awt.Color(236, 164, 66));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        imeTextField = new javax.swing.JTextField();
        priimekTextField = new javax.swing.JTextField();
        naslovTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        pizzaList = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        skupnaCena = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        odstraniPicoButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        nacinPlacilaComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(236, 164, 66));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(97, 18, 14));
        jLabel1.setText("Picko");

        jButton1.setBackground(new java.awt.Color(165, 167, 154));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(97, 18, 14));
        jButton1.setText("Dodaj Pico");
        jButton1.setToolTipText("Odpre dialog za dodajanje pic.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(97, 18, 14));
        jLabel2.setText("Ime:");

        jLabel3.setForeground(new java.awt.Color(97, 18, 14));
        jLabel3.setText("Priimek:");
        jLabel3.setToolTipText("");

        jLabel4.setForeground(new java.awt.Color(97, 18, 14));
        jLabel4.setText("Naslov:");

        imeTextField.setBackground(new java.awt.Color(165, 167, 154));
        imeTextField.setForeground(new java.awt.Color(202, 37, 33));
        imeTextField.setToolTipText("Vnseite ime naročnika.");
        imeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imeTextFieldActionPerformed(evt);
            }
        });

        priimekTextField.setBackground(new java.awt.Color(165, 167, 154));
        priimekTextField.setForeground(new java.awt.Color(202, 37, 33));
        priimekTextField.setToolTipText("Vnseite priimek naročnika.");
        priimekTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priimekTextFieldActionPerformed(evt);
            }
        });

        naslovTextField.setBackground(new java.awt.Color(165, 167, 154));
        naslovTextField.setForeground(new java.awt.Color(202, 37, 33));
        naslovTextField.setToolTipText("Vnseite naslov naročnika.");
        naslovTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naslovTextFieldActionPerformed(evt);
            }
        });

        pizzaList.setBackground(new java.awt.Color(165, 167, 154));
        pizzaList.setForeground(new java.awt.Color(97, 18, 14));
        pizzaList.setToolTipText("Seznam pic. Za odstranitev morate eno izbrati in klikniti gumb Odstrani pico.");
        jScrollPane1.setViewportView(pizzaList);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(97, 18, 14));
        jLabel5.setText("Skupna Cena:");

        skupnaCena.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        skupnaCena.setForeground(new java.awt.Color(202, 37, 33));
        skupnaCena.setText("0.00");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(202, 37, 33));
        jLabel7.setText(" €");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(97, 18, 14));
        jLabel6.setText("Študentski Bon:");

        jCheckBox1.setBackground(new java.awt.Color(236, 164, 66));
        jCheckBox1.setForeground(new java.awt.Color(202, 37, 33));
        jCheckBox1.setToolTipText("Ali želite koristiti študentski bon?");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        odstraniPicoButton.setBackground(new java.awt.Color(165, 167, 154));
        odstraniPicoButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        odstraniPicoButton.setForeground(new java.awt.Color(97, 18, 14));
        odstraniPicoButton.setText("Odstrani Pico");
        odstraniPicoButton.setToolTipText("Odstrani izbrano pico iz naročila.");
        odstraniPicoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odstraniPicoButtonActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(165, 167, 154));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(97, 18, 14));
        jButton2.setToolTipText("Zaključi naročilo.");
        jButton2.setLabel("Naroči");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(165, 167, 154));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(97, 18, 14));
        jButton3.setText("Prekliči");
        jButton3.setToolTipText("Prekliči naročilo.");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(97, 18, 14));
        jLabel8.setText("Način Plačila:");
        jLabel8.setToolTipText("Izberite gotovino ali kartico.");

        nacinPlacilaComboBox.setBackground(new java.awt.Color(165, 167, 154));
        nacinPlacilaComboBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nacinPlacilaComboBox.setForeground(new java.awt.Color(202, 37, 33));
        nacinPlacilaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gotovina", "Kartica" }));
        nacinPlacilaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacinPlacilaComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(imeTextField))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(priimekTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(naslovTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(skupnaCena)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nacinPlacilaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(odstraniPicoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(imeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(priimekTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(naslovTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(odstraniPicoButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jCheckBox1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(nacinPlacilaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(skupnaCena)
                            .addComponent(jLabel7))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jButton1.getAccessibleContext().setAccessibleName("DodajPicoButton");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new AddNewPizza().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void imeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imeTextFieldActionPerformed

    private void priimekTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priimekTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priimekTextFieldActionPerformed

    private void naslovTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naslovTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_naslovTextFieldActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void odstraniPicoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odstraniPicoButtonActionPerformed
        int selectedIndex = pizzaList.getSelectedIndex();
        
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(null, "Ne morem odstranit pice. Seznam je prazen.");
            return;
        }
        
        double cenaSelected = pizzaObjList.get(selectedIndex).getCena();
        double trenutnaSkupnaCena = Double.parseDouble(MainMenu.skupnaCena.getText());
        
        skupnaCena.setText(df.format(trenutnaSkupnaCena - cenaSelected));
        
        model.remove(selectedIndex);
        pizzaObjList.remove(selectedIndex);
    }//GEN-LAST:event_odstraniPicoButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ime = imeTextField.getText().trim();
        String priimek = priimekTextField.getText().trim();
        String naslov = naslovTextField.getText().trim();
        String nacinPlacila = nacinPlacilaComboBox.getSelectedItem().toString().trim();
        
        if (ime.length() <= 0){
            JOptionPane.showMessageDialog(null, "Naročilo ni možno. Prosim vnesite Ime.");
            return;
        }
        
        if (priimek.length() <= 0){
            JOptionPane.showMessageDialog(null, "Naročilo ni možno. Prosim vnesite Priimek.");
            return;
        }
        
        if (naslov.length() <= 0){
            JOptionPane.showMessageDialog(null, "Naročilo ni možno. Prosim vnesite Naslov.");
            return;
        }
        
        if (pizzaObjList.size() <= 0){
            JOptionPane.showMessageDialog(null, "Prosim dodajte pice.");
            return;
        }
        
        Narocilo narocilo = new Narocilo(ime, priimek, naslov, nacinPlacila, pizzaObjList);
        
        JOptionPane.showMessageDialog(null, "Pice uspešno naročene. Pričakovan čas dostave 45 minut.");
        
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nacinPlacilaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacinPlacilaComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacinPlacilaComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField imeTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> nacinPlacilaComboBox;
    private javax.swing.JTextField naslovTextField;
    private javax.swing.JButton odstraniPicoButton;
    public static javax.swing.JList<String> pizzaList;
    private javax.swing.JTextField priimekTextField;
    public static javax.swing.JLabel skupnaCena;
    // End of variables declaration//GEN-END:variables
}
