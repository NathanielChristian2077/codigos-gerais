/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package me.interfacegrafica;

/**
 *
 * @author alunolages
 */
public class exercicio4 extends javax.swing.JFrame {

    /**
     * Creates new form exercicio4
     */
    public exercicio4() {
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

        textFieldsPane = new javax.swing.JPanel();
        labelCalculadora = new java.awt.Label();
        textFieldInput = new javax.swing.JTextField();
        textFieldOutput = new javax.swing.JTextField();
        buttonsPane = new javax.swing.JPanel();
        button7 = new javax.swing.JButton();
        button8 = new javax.swing.JButton();
        button9 = new javax.swing.JButton();
        buttonSum = new javax.swing.JButton();
        button4 = new javax.swing.JButton();
        button5 = new javax.swing.JButton();
        button6 = new javax.swing.JButton();
        buttonSubt = new javax.swing.JButton();
        button1 = new javax.swing.JButton();
        button2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        buttonMp = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonEquals = new javax.swing.JButton();
        buttonDiv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora DOO");
        setBounds(new java.awt.Rectangle(0, 0, 300, 400));
        setLocation(new java.awt.Point(0, 0));
        setName("mainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(300, 400));
        setResizable(false);

        textFieldsPane.setPreferredSize(new java.awt.Dimension(300, 120));
        textFieldsPane.setLayout(new java.awt.GridLayout(3, 0, 0, 8));

        labelCalculadora.setAlignment(java.awt.Label.CENTER);
        labelCalculadora.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        labelCalculadora.setForeground(new java.awt.Color(255, 255, 255));
        labelCalculadora.setText("Calculadora");
        textFieldsPane.add(labelCalculadora);

        textFieldInput.setName(""); // NOI18N
        textFieldInput.setPreferredSize(new java.awt.Dimension(30, 22));
        textFieldInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldInputActionPerformed(evt);
            }
        });
        textFieldInput.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                textFieldInputPropertyChange(evt);
            }
        });
        textFieldsPane.add(textFieldInput);

        textFieldOutput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textFieldOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldOutputActionPerformed(evt);
            }
        });
        textFieldsPane.add(textFieldOutput);

        buttonsPane.setLayout(new java.awt.GridLayout(4, 4, 2, 2));

        button7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        button7.setText("7");
        button7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button7ActionPerformed(evt);
            }
        });
        buttonsPane.add(button7);

        button8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        button8.setText("8");
        button8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button8ActionPerformed(evt);
            }
        });
        buttonsPane.add(button8);

        button9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        button9.setText("9");
        button9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button9ActionPerformed(evt);
            }
        });
        buttonsPane.add(button9);

        buttonSum.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        buttonSum.setText("+");
        buttonSum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSumActionPerformed(evt);
            }
        });
        buttonsPane.add(buttonSum);

        button4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        button4.setText("4");
        button4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        buttonsPane.add(button4);

        button5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        button5.setText("5");
        button5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });
        buttonsPane.add(button5);

        button6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        button6.setText("6");
        button6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });
        buttonsPane.add(button6);

        buttonSubt.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        buttonSubt.setText("-");
        buttonSubt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonSubt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubtActionPerformed(evt);
            }
        });
        buttonsPane.add(buttonSubt);

        button1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        button1.setText("1");
        button1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        buttonsPane.add(button1);

        button2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        button2.setText("2");
        button2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        buttonsPane.add(button2);

        button3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        button3.setText("3");
        button3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        buttonsPane.add(button3);

        buttonMp.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        buttonMp.setText("*");
        buttonMp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonMp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMpActionPerformed(evt);
            }
        });
        buttonsPane.add(buttonMp);

        button0.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        button0.setText("0");
        button0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button0ActionPerformed(evt);
            }
        });
        buttonsPane.add(button0);

        buttonClear.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        buttonClear.setText("C");
        buttonClear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });
        buttonsPane.add(buttonClear);

        buttonEquals.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        buttonEquals.setText("=");
        buttonEquals.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEqualsActionPerformed(evt);
            }
        });
        buttonsPane.add(buttonEquals);

        buttonDiv.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        buttonDiv.setText("/");
        buttonDiv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDivActionPerformed(evt);
            }
        });
        buttonsPane.add(buttonDiv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textFieldsPane, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
            .addComponent(buttonsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(textFieldsPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addToTextField(String s) {
        String txt = textFieldInput.getText();
        textFieldInput.setText(txt + s);
    }
    
    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button9ActionPerformed
        addToTextField("9");
    }//GEN-LAST:event_button9ActionPerformed

    private void button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button0ActionPerformed
        addToTextField("0");
    }//GEN-LAST:event_button0ActionPerformed

    private void buttonSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSumActionPerformed
        addToTextField("+");
    }//GEN-LAST:event_buttonSumActionPerformed

    private void textFieldInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldInputActionPerformed

    private void textFieldOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldOutputActionPerformed

    private void textFieldInputPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_textFieldInputPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldInputPropertyChange

    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button8ActionPerformed
        addToTextField("8");
    }//GEN-LAST:event_button8ActionPerformed

    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button7ActionPerformed
        addToTextField("7");
    }//GEN-LAST:event_button7ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        addToTextField("1");
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        addToTextField("2");
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        addToTextField("3");
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        addToTextField("4");
    }//GEN-LAST:event_button4ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        addToTextField("5");
    }//GEN-LAST:event_button5ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        addToTextField("6");
    }//GEN-LAST:event_button6ActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        textFieldInput.setText("");
        textFieldOutput.setText("");
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEqualsActionPerformed
        String expressao = textFieldInput.getText().trim();
        String op = "";
        
        if(expressao.contains("+")) op ="+";
        if(expressao.contains("-")) op ="-";
        if(expressao.contains("/")) op ="/";
        if(expressao.contains("*")) op ="*";
        
        if(!op.isEmpty()) {
            String[] partes = expressao.split("\\"+op);
            
            if(partes.length == 2) {
                try{
                    double x = Double.parseDouble(partes[0]);
                    double y = Double.parseDouble(partes[1]);
                    double result = 0;
                    
                    switch(op) {
                        case "+": result = x + y; break;
                        case "-": result = x - y; break;
                        case "*": result = x * y; break;
                        case "/": 
                            if(y != 0) {
                                result = x/y;
                            } else {
                                textFieldOutput.setText("Err");
                                return;
                            }
                            break;
                    }
                    
                    if(result == (int) result) {
                        textFieldOutput.setText(String.valueOf((int)result));
                    } else {
                        textFieldOutput.setText(String.valueOf(result));
                    }
                } catch (NumberFormatException e) {
                    textFieldOutput.setText("Erro");
                }
            } else {
                textFieldOutput.setText("Erro");
            }
        } else {
            textFieldOutput.setText("Erro");
        }
    }//GEN-LAST:event_buttonEqualsActionPerformed

    private void buttonSubtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubtActionPerformed
        addToTextField("-");
    }//GEN-LAST:event_buttonSubtActionPerformed

    private void buttonMpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMpActionPerformed
        addToTextField("*");
    }//GEN-LAST:event_buttonMpActionPerformed

    private void buttonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDivActionPerformed
        addToTextField("/");
    }//GEN-LAST:event_buttonDivActionPerformed

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
            java.util.logging.Logger.getLogger(exercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(exercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(exercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(exercicio4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exercicio4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button0;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JButton button3;
    private javax.swing.JButton button4;
    private javax.swing.JButton button5;
    private javax.swing.JButton button6;
    private javax.swing.JButton button7;
    private javax.swing.JButton button8;
    private javax.swing.JButton button9;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonDiv;
    private javax.swing.JButton buttonEquals;
    private javax.swing.JButton buttonMp;
    private javax.swing.JButton buttonSubt;
    private javax.swing.JButton buttonSum;
    private javax.swing.JPanel buttonsPane;
    private java.awt.Label labelCalculadora;
    private javax.swing.JTextField textFieldInput;
    private javax.swing.JTextField textFieldOutput;
    private javax.swing.JPanel textFieldsPane;
    // End of variables declaration//GEN-END:variables
}
