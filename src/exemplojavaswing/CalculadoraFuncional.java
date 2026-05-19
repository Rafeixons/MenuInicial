package exemplojavaswing;

public class CalculadoraFuncional extends javax.swing.JFrame {

    public CalculadoraFuncional() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jb_soma = new javax.swing.JButton();
        jb_subtracao = new javax.swing.JButton();
        jb_divisão = new javax.swing.JButton();
        txf_resultado = new javax.swing.JTextField();
        jb_multiplicacao = new javax.swing.JButton();
        jb_igual = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculadora Funcional");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(153, 204, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/num_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 204, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/num_2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 204, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/num_3.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(153, 204, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/num_8.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 204, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/num_4.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 204, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/num_5.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 204, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/num_6.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(153, 204, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/num_7.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(153, 204, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/num_9.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jb_soma.setBackground(new java.awt.Color(255, 204, 153));
        jb_soma.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jb_soma.setForeground(new java.awt.Color(255, 255, 255));
        jb_soma.setText("+");
        jb_soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_somaActionPerformed(evt);
            }
        });

        jb_subtracao.setBackground(new java.awt.Color(255, 204, 153));
        jb_subtracao.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jb_subtracao.setForeground(new java.awt.Color(255, 255, 255));
        jb_subtracao.setText("-");
        jb_subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_subtracaoActionPerformed(evt);
            }
        });

        jb_divisão.setBackground(new java.awt.Color(255, 204, 153));
        jb_divisão.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jb_divisão.setForeground(new java.awt.Color(255, 255, 255));
        jb_divisão.setText("/");
        jb_divisão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_divisãoActionPerformed(evt);
            }
        });

        txf_resultado.setEditable(false);
        txf_resultado.setBackground(new java.awt.Color(255, 204, 153));
        txf_resultado.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        txf_resultado.setForeground(new java.awt.Color(0, 0, 0));
        txf_resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_resultadoActionPerformed(evt);
            }
        });

        jb_multiplicacao.setBackground(new java.awt.Color(255, 204, 153));
        jb_multiplicacao.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jb_multiplicacao.setForeground(new java.awt.Color(255, 255, 255));
        jb_multiplicacao.setText("*");
        jb_multiplicacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jb_multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_multiplicacaoActionPerformed(evt);
            }
        });

        jb_igual.setBackground(new java.awt.Color(153, 204, 255));
        jb_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botão =.png"))); // NOI18N
        jb_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_igualActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(153, 204, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Limpa.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(153, 204, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/num_0.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton7)
                                    .addComponent(jButton10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jb_igual)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton11))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton9))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(txf_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jb_divisão)
                        .addGap(34, 34, 34)
                        .addComponent(jb_subtracao)
                        .addGap(42, 42, 42)
                        .addComponent(jb_soma)
                        .addGap(26, 26, 26)
                        .addComponent(jb_multiplicacao)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txf_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_soma)
                    .addComponent(jb_subtracao)
                    .addComponent(jb_divisão)
                    .addComponent(jb_multiplicacao))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_igual)
                    .addComponent(jButton11)
                    .addComponent(jButton10))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 360, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    double valor1 = 0;
    double valor2 = 0;
    double resultado = 0;
    String visor = "";
    String op = "";

    public void visor(String valor) {
        txf_resultado.setText(valor);
    }

    public void conta(String conta) {
        txf_resultado.setText("");
        op = conta;
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        visor(visor += "1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        visor(visor += "2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        visor(visor += "3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        visor(visor += "4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        visor(visor += "5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        visor(visor += "6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        visor(visor += "7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        visor(visor += "8");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        visor(visor += "9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void txf_resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_resultadoActionPerformed

    }//GEN-LAST:event_txf_resultadoActionPerformed

    private void jb_divisãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_divisãoActionPerformed
        visor = "";
        valor1 = Double.parseDouble(txf_resultado.getText());
        conta("/");

    }//GEN-LAST:event_jb_divisãoActionPerformed

    private void jb_subtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_subtracaoActionPerformed
        visor = "";
        valor1 = Double.parseDouble(txf_resultado.getText());
        conta("-");
    }//GEN-LAST:event_jb_subtracaoActionPerformed

    private void jb_somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_somaActionPerformed
        valor1 = Double.parseDouble(txf_resultado.getText());
        visor = "";
        conta("+");
        System.out.println("VALORRRR 1: "+valor1);
    }//GEN-LAST:event_jb_somaActionPerformed

    private void jb_multiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_multiplicacaoActionPerformed
        visor = "";
        valor1 = Double.parseDouble(txf_resultado.getText());
        conta("*");
    }//GEN-LAST:event_jb_multiplicacaoActionPerformed

    private void jb_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_igualActionPerformed
        valor2 = Double.parseDouble(txf_resultado.getText());

        switch (op) {
            case "+":
                txf_resultado.setText("");
                resultado = valor1 + valor2;
                txf_resultado.setText(String.valueOf(resultado));
                break;
            case "-":
                txf_resultado.setText("");
                resultado = valor1 - valor2;
                txf_resultado.setText(String.valueOf(resultado));
                break;
            case "*":
                txf_resultado.setText("");
                resultado = valor1 * valor2;
                txf_resultado.setText(String.valueOf(resultado));
                break;
            case "/":
                txf_resultado.setText("");
                resultado = valor1 / valor2;
                txf_resultado.setText(String.valueOf(resultado));
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_jb_igualActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        txf_resultado.setText("");
        valor1 = 0;
        valor2 = 0;
        resultado = 0;
        visor = "";
        op = "";
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        visor(visor += "0");
    }//GEN-LAST:event_jButton11ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraFuncional().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb_divisão;
    private javax.swing.JButton jb_igual;
    private javax.swing.JButton jb_multiplicacao;
    private javax.swing.JButton jb_soma;
    private javax.swing.JButton jb_subtracao;
    private javax.swing.JTextField txf_resultado;
    // End of variables declaration//GEN-END:variables
}
