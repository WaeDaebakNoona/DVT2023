/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Backend.Validator;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Naritaa
 */
public class GUI extends javax.swing.JFrame {

    private int point = 0;
    

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        setLocationRelativeTo(null);
        
        nameLabel.setText(" ");
        ageLabel.setText(" ");
        dateLabel.setText(" ");
        creditLabel.setText(" ");
        finalText.setText(" ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        spinnerAgeInput = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateInput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        finalText = new javax.swing.JLabel();
        yesButt = new javax.swing.JRadioButton();
        noButt = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        creditNumberInput = new javax.swing.JTextField();
        creditLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(200, 63, 65));

        jPanel1.setBackground(new java.awt.Color(220, 223, 225));
        jPanel1.setForeground(new java.awt.Color(220, 223, 225));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Register: Karen's Church Services");

        nameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameInputActionPerformed(evt);
            }
        });
        nameInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameInputKeyTyped(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name:");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        spinnerAgeInput.setModel(new javax.swing.SpinnerNumberModel(0, 0, 120, 1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Age:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Have you heard about our lord and saviour, Jesus Christ?");

        dateInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateInputActionPerformed(evt);
            }
        });
        dateInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dateInputKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dateInputKeyTyped(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Date of birth:");

        jLabel7.setText("Format: dd-MM-yyyy");

        nameLabel.setText("dfdsfdf");

        finalText.setText("cvvfv");

        buttonGroup1.add(yesButt);
        yesButt.setForeground(new java.awt.Color(0, 0, 0));
        yesButt.setText("YES");

        buttonGroup1.add(noButt);
        noButt.setForeground(new java.awt.Color(0, 0, 0));
        noButt.setText("NO");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Name");

        dateLabel.setText("dfdfdf");

        ageLabel.setText("ddfgfg");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Credit card:");

        creditNumberInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                creditNumberInputKeyTyped(evt);
            }
        });

        creditLabel.setText("dvffd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(creditLabel)
                            .addComponent(creditNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateLabel)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(dateInput, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel7))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel2))
                                            .addComponent(ageLabel))
                                        .addGap(235, 235, 235)
                                        .addComponent(jLabel6))
                                    .addComponent(spinnerAgeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(submitButton)
                                .addGap(82, 82, 82)
                                .addComponent(finalText))
                            .addComponent(jLabel4))))
                .addGap(0, 198, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(yesButt)
                        .addGap(79, 79, 79)
                        .addComponent(noButt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameLabel)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spinnerAgeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ageLabel)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(dateLabel)
                        .addGap(24, 24, 24)
                        .addComponent(creditNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(creditLabel)))
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesButt)
                    .addComponent(noButt))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(finalText))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:

        String name = nameInput.getText();
        int age = (Integer) spinnerAgeInput.getValue();
        String dateStr = dateInput.getText();
        String creditNum = creditNumberInput.getText();


        if (point > 5) {
            finalText.setText("Data Validates: You are now Karen's salve");
            System.out.println(point);
        } else {
            finalText.setText("Data Does Not Validates: You are Free");
            System.out.println(point);
        }

        if (yesButt.equals(true)) {
            point++;
        }


    }//GEN-LAST:event_submitButtonActionPerformed

    private void nameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameInputActionPerformed
        // TODO add your handling code here:
        spinnerAgeInput.requestFocus();
    }//GEN-LAST:event_nameInputActionPerformed

    private void dateInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateInputActionPerformed

    private void nameInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameInputKeyTyped
        // TODO add your handling code here:
        String name = nameInput.getText();
        boolean checkName = Validator.checkNamePresence(name);
        if (checkName) {
            nameLabel.setText("Valid");
            point++;
        } else {
            nameLabel.setText("Invalid");
        }
    }//GEN-LAST:event_nameInputKeyTyped

    private void dateInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateInputKeyTyped
        // TODO add your handling code here:


    }//GEN-LAST:event_dateInputKeyTyped

    private void creditNumberInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_creditNumberInputKeyTyped
        // TODO add your handling code here:
        String creditNum = creditNumberInput.getText();
        boolean checkCard = Validator.lengthCheck(creditNum);
        if (checkCard == false) {
            creditLabel.setText("Valid");
            
        } else {
            creditLabel.setText("Must be more than 16 & less than 19 characters");
            point++;
        }
    }//GEN-LAST:event_creditNumberInputKeyTyped

    private void dateInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateInputKeyReleased
        // TODO add your handling code here:
        int age = (Integer) spinnerAgeInput.getValue();
        String dateStr = dateInput.getText();
        try {
            boolean checkForm = Validator.checkDateFormat(dateStr);

            if (checkForm) {
                dateLabel.setText("valid"); //just a check not final message
                point++;
            } else {
                dateLabel.setText("invalid");

            }
        } catch (java.time.format.DateTimeParseException e) {

            dateLabel.setText("Format Error");
        }
        
        try {
            boolean checkAge = Validator.checkAge(age, dateStr);

            if (checkAge) {
                ageLabel.setText("valid"); //just a check not final message
                point++;
            } else {
                ageLabel.setText("invalid");

            }
        } catch (java.time.format.DateTimeParseException e) {

            dateLabel.setText("Format Error");
        }


    }//GEN-LAST:event_dateInputKeyReleased

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel creditLabel;
    private javax.swing.JTextField creditNumberInput;
    private javax.swing.JTextField dateInput;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel finalText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameInput;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JRadioButton noButt;
    private javax.swing.JSpinner spinnerAgeInput;
    private javax.swing.JButton submitButton;
    private javax.swing.JRadioButton yesButt;
    // End of variables declaration//GEN-END:variables
}
