/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer.app;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.Timer;

public class TimerJFrame extends javax.swing.JFrame {

    /**
     * Creates new form TimerJFrame
     */
    public TimerJFrame() {
        
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButtonOnTime = new javax.swing.JRadioButton();
        jRadioButtonCountdown = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButtonColor = new javax.swing.JButton();
        jLabelColor = new javax.swing.JLabel();
        jLabelSpeed = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox();
        jButtonStart = new javax.swing.JButton();
        jButtonStop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(jRadioButtonOnTime);
        jRadioButtonOnTime.setText("On time (HH:mm:ss):");
        jRadioButtonOnTime.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonOnTimeItemStateChanged(evt);
            }
        });
        jRadioButtonOnTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonOnTimeActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonCountdown);
        jRadioButtonCountdown.setText("Countdown (sec):");
        jRadioButtonCountdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCountdownActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);

        jTextField2.setEditable(false);

        jButtonColor.setText("Choose color");
        jButtonColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonColorActionPerformed(evt);
            }
        });

        jLabelColor.setText("No chosen color");

        jLabelSpeed.setText("Speed:");

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        jButtonStart.setText("Start");
        jButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartActionPerformed(evt);
                jButtonStartActionPerformed1(evt);
            }
        });

        jButtonStop.setText("Stop");
        jButtonStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStopActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonOnTime)
                            .addComponent(jRadioButtonCountdown)
                            .addComponent(jButtonColor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButtonStart, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelColor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonStop, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))))
                    .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonOnTime)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonCountdown)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonColor)
                    .addComponent(jLabelColor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabelSpeed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonStart)
                    .addComponent(jButtonStop))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonOnTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonOnTimeActionPerformed
        jTextField2.setEditable(false);
        jTextField2.setText("");
        jTextField1.setEditable(true);
    }//GEN-LAST:event_jRadioButtonOnTimeActionPerformed

    private void jRadioButtonCountdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCountdownActionPerformed
        jTextField1.setEditable(false);
        jTextField1.setText("");
        jTextField2.setEditable(true);

    }//GEN-LAST:event_jRadioButtonCountdownActionPerformed

    public Color c;
    static Timer t;
    static JFrame f;

    private void jButtonColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonColorActionPerformed

        c = JColorChooser.showDialog(null, "Choose color", Color.red);

        jLabelColor.setText("Chosen color");
        jLabelColor.setForeground(c);
        
    }//GEN-LAST:event_jButtonColorActionPerformed

    private void jButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartActionPerformed

        String value = (String) jComboBox.getSelectedItem();
        int blink = (Integer.parseInt(value)) * 100;

        int sec;

        if (jRadioButtonCountdown.isSelected()) {

            sec = Integer.parseInt(jTextField2.getText()) * 1000;

            t = new Timer(sec, (ActionEvent e) -> {
                
                f = new JFrame();
                f.setLayout(new FlowLayout());
                f.setLocationRelativeTo(null);
                f.setVisible(true);
                f.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
                Timer t1 = new Timer(blink, new ActionListener() {
                    
                    boolean on = false;
                    
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        if (on == true) {
                            
                            f.getContentPane().setBackground(Color.white);
                            
                        } else {
                            f.getContentPane().setBackground(c);
                        }
                        
                        on = !on;
                        
                    }
                });
                t1.start();
                t1.setRepeats(true);
            });

            t.start();
            t.setRepeats(false);

        } else if (jRadioButtonOnTime.isSelected()) {

            String timetxt = jTextField1.getText();

            LocalTime time = LocalTime.parse(timetxt);

            sec = 0;

            t = new Timer(sec, (ActionEvent e) -> {
                if (time.equals(LocalTime.now())) {
                    
                    f = new JFrame();
                    f.setLayout(new FlowLayout());
                    f.setLocationRelativeTo(null);
                    f.setVisible(true);
                    f.setExtendedState(JFrame.MAXIMIZED_BOTH);
                   
                    Timer t1 = new Timer(blink, new ActionListener() {
                        
                        boolean on = false;
                        
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            
                            if (on == true) {
                                
                                f.getContentPane().setBackground(Color.white);
                                
                            } else {
                                f.getContentPane().setBackground(c);
                            }
                            
                            on = !on;
                            
                        }
                    });
                    t1.start();
                    t1.setRepeats(true);
                }
            });

            t.start();

        }

        jRadioButtonOnTime.setEnabled(false);
        jRadioButtonCountdown.setEnabled(false);
        jTextField1.setEnabled(false);
        jTextField2.setEnabled(false);
        jButtonColor.setEnabled(false);
        jLabelColor.setEnabled(false);
        jLabelSpeed.setEnabled(false);
        jComboBox.setEnabled(false);
        jButtonStart.setEnabled(false);


    }//GEN-LAST:event_jButtonStartActionPerformed

    private void jButtonStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStopActionPerformed

        t.stop();
        f.dispose();

        jRadioButtonOnTime.setEnabled(true);
        jRadioButtonCountdown.setEnabled(true);
        jTextField1.setEnabled(true);
        jTextField2.setEnabled(true);
        jButtonColor.setEnabled(true);
        jLabelColor.setEnabled(true);
        jLabelSpeed.setEnabled(true);
        jComboBox.setEnabled(true);
        jButtonStart.setEnabled(true);
    }//GEN-LAST:event_jButtonStopActionPerformed

    private void jRadioButtonOnTimeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonOnTimeItemStateChanged

    }//GEN-LAST:event_jRadioButtonOnTimeItemStateChanged

    private void jButtonStartActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartActionPerformed1

    }//GEN-LAST:event_jButtonStartActionPerformed1

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
            java.util.logging.Logger.getLogger(TimerJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimerJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimerJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimerJFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TimerJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonColor;
    private javax.swing.JButton jButtonStart;
    private javax.swing.JButton jButtonStop;
    private javax.swing.JComboBox jComboBox;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JLabel jLabelSpeed;
    private javax.swing.JRadioButton jRadioButtonCountdown;
    private javax.swing.JRadioButton jRadioButtonOnTime;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
