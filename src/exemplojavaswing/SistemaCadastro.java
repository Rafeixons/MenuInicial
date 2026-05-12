package exemplojavaswing;

import javax.swing.JOptionPane;

public class SistemaCadastro extends javax.swing.JFrame {

    public SistemaCadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.ButtonGroup btg_Turno = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txf_Nome = new javax.swing.JTextField();
        cb_Cargos = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        rb_Manhã = new javax.swing.JRadioButton();
        rb_Tarde = new javax.swing.JRadioButton();
        rb_Noite = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        cb_ValeAlimentacao = new javax.swing.JCheckBox();
        cb_Plano = new javax.swing.JCheckBox();
        cb_ValeTransportes = new javax.swing.JCheckBox();
        cb_HomeOffice = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        js_Nivelexperiência = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder()));

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Nome do Funcionário");

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Cargo");

        txf_Nome.setBackground(new java.awt.Color(204, 204, 204));
        txf_Nome.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        txf_Nome.setForeground(new java.awt.Color(0, 0, 0));
        txf_Nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txf_NomeActionPerformed(evt);
            }
        });

        cb_Cargos.setBackground(new java.awt.Color(204, 204, 204));
        cb_Cargos.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        cb_Cargos.setForeground(new java.awt.Color(0, 0, 0));
        cb_Cargos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Auxiliar Administrativo", "Auxiliar de Limpeza", "Coordenador de TI", "Diretor", "Gerente" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_Cargos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txf_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_Cargos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Turno de Trabalho", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Fax", 1, 14), new java.awt.Color(0, 102, 255))); // NOI18N

        btg_Turno.add(rb_Manhã);
        rb_Manhã.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        rb_Manhã.setForeground(new java.awt.Color(0, 0, 0));
        rb_Manhã.setText("Manhã");

        btg_Turno.add(rb_Tarde);
        rb_Tarde.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        rb_Tarde.setForeground(new java.awt.Color(0, 0, 0));
        rb_Tarde.setText("Tarde");
        rb_Tarde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_TardeActionPerformed(evt);
            }
        });

        btg_Turno.add(rb_Noite);
        rb_Noite.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        rb_Noite.setForeground(new java.awt.Color(0, 0, 0));
        rb_Noite.setText("Noite");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_Manhã)
                    .addComponent(rb_Tarde)
                    .addComponent(rb_Noite))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(rb_Manhã)
                .addGap(32, 32, 32)
                .addComponent(rb_Tarde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rb_Noite)
                .addGap(34, 34, 34))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Beneficios Desejados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Fax", 1, 14), new java.awt.Color(0, 102, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(0, 102, 255));

        cb_ValeAlimentacao.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        cb_ValeAlimentacao.setForeground(new java.awt.Color(0, 0, 0));
        cb_ValeAlimentacao.setText("Vale Alimentação");

        cb_Plano.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        cb_Plano.setForeground(new java.awt.Color(0, 0, 0));
        cb_Plano.setText("Plano de Saúde");

        cb_ValeTransportes.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        cb_ValeTransportes.setForeground(new java.awt.Color(0, 0, 0));
        cb_ValeTransportes.setText("Vale Transporte");

        cb_HomeOffice.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        cb_HomeOffice.setForeground(new java.awt.Color(0, 0, 0));
        cb_HomeOffice.setText("Home Office");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_ValeAlimentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_ValeTransportes)
                    .addComponent(cb_HomeOffice)
                    .addComponent(cb_Plano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(cb_ValeAlimentacao)
                .addGap(17, 17, 17)
                .addComponent(cb_Plano)
                .addGap(17, 17, 17)
                .addComponent(cb_ValeTransportes)
                .addGap(17, 17, 17)
                .addComponent(cb_HomeOffice)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Nível de Experiência", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Fax", 1, 14), new java.awt.Color(0, 102, 255))); // NOI18N

        js_Nivelexperiência.setBackground(new java.awt.Color(0, 0, 0));
        js_Nivelexperiência.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        js_Nivelexperiência.setForeground(new java.awt.Color(0, 102, 255));
        js_Nivelexperiência.setMajorTickSpacing(2);
        js_Nivelexperiência.setMaximum(10);
        js_Nivelexperiência.setPaintLabels(true);
        js_Nivelexperiência.setSnapToTicks(true);
        js_Nivelexperiência.setToolTipText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(js_Nivelexperiência, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(js_Nivelexperiência, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Cadastro de Funcionários");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon de cadastro.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 102, 255));
        jButton1.setText("Salvar Cadastro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rb_TardeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_TardeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_TardeActionPerformed

    private void txf_NomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txf_NomeActionPerformed

    }//GEN-LAST:event_txf_NomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String mensagem = "";
        String nome = txf_Nome.getText();
        String turno = "";
        String beneficio = "";
        if (rb_Manhã.isSelected()) {
            turno = "Manhã.";
        } else if (rb_Noite.isSelected()) {
            turno = "Noite.";
        } else if (rb_Tarde.isSelected()) {
            turno = "Tarde.";
        }

        if (cb_HomeOffice.isSelected()) {
            beneficio += "Home Office.\n";
        }

        if (cb_Plano.isSelected()) {
            beneficio += "Plano de Saúde.\n";
        }

        if (cb_ValeAlimentacao.isSelected()) {
            beneficio += "Vale Alimentação.\n";
        }

        if (cb_ValeTransportes.isSelected()) {
            beneficio += "Vale Transporte.\n";
        }

        mensagem += "Nome: " + nome + ".\n";
        mensagem += "Cargo: " + cb_Cargos.getSelectedItem().toString() + ".\n";
        mensagem += "Turno: " + turno + ".\n\n";

        mensagem += "Beneficios: " + beneficio + ".\n\n";

        mensagem += "Nível de Experiência: " + js_Nivelexperiência.getValue();

        JOptionPane.showMessageDialog(null, mensagem);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SistemaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_Cargos;
    private javax.swing.JCheckBox cb_HomeOffice;
    private javax.swing.JCheckBox cb_Plano;
    private javax.swing.JCheckBox cb_ValeAlimentacao;
    private javax.swing.JCheckBox cb_ValeTransportes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSlider js_Nivelexperiência;
    private javax.swing.JRadioButton rb_Manhã;
    private javax.swing.JRadioButton rb_Noite;
    private javax.swing.JRadioButton rb_Tarde;
    private javax.swing.JTextField txf_Nome;
    // End of variables declaration//GEN-END:variables
}
