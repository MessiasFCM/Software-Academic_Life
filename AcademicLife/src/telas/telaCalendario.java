package telas;

import acessoADados.Servico;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import modelo.Calendario;

public class telaCalendario extends javax.swing.JFrame {

    telaMenu MenuChamar;
    
    public String email, nome;
    public int usuario;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        System.out.println("Email - " + email);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("Nome - " + nome);
    }

    
    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
        System.out.println("Usuario - " + usuario);
    }

    
    public telaCalendario() {
        initComponents();
        setLocationRelativeTo(null);
        
        painelCodigo.setVisible(true);
        painelCodigo.setEnabled(true);
        painelCalendario.setVisible(false);
        painelCalendario.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        painelCodigo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jIdConfimar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        painelCalendario = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Academic Life");
        setMinimumSize(new java.awt.Dimension(320, 340));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(320, 340));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelCodigo.setOpaque(false);
        painelCodigo.setPreferredSize(new java.awt.Dimension(300, 320));
        painelCodigo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Insira o ID do calendário");
        painelCodigo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 300, -1));

        jButton5.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Confirmar");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setPreferredSize(new java.awt.Dimension(220, 25));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        painelCodigo.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 205, 300, 40));

        jButton7.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jButton7.setForeground(new java.awt.Color(153, 0, 0));
        jButton7.setText("Voltar");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setPreferredSize(new java.awt.Dimension(220, 25));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        painelCodigo.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jIdConfimar.setBackground(new java.awt.Color(204, 204, 204));
        jIdConfimar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jIdConfimar.setForeground(java.awt.Color.gray);
        jIdConfimar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jIdConfimar.setPreferredSize(new java.awt.Dimension(220, 25));
        painelCodigo.add(jIdConfimar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Calendário");
        painelCodigo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, -1));

        jPanel1.add(painelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        painelCalendario.setOpaque(false);
        painelCalendario.setPreferredSize(new java.awt.Dimension(300, 320));
        painelCalendario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Atividades");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        painelCalendario.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 100, 25));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Provas");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        painelCalendario.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 100, 25));

        jButton3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Feriados");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        painelCalendario.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 90, 25));

        jButton4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Férias");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        painelCalendario.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 90, 25));

        jButton6.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jButton6.setForeground(new java.awt.Color(153, 0, 0));
        jButton6.setText("Voltar");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setPreferredSize(new java.awt.Dimension(220, 25));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        painelCalendario.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 90, 30));

        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(300, 275));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton15.setText("jButton8");
        jPanel4.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 30, -1));

        jButton16.setText("jButton9");
        jPanel4.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 30, -1));

        jButton17.setText("jButton10");
        jPanel4.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 30, -1));

        jButton18.setText("jButton11");
        jPanel4.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 30, -1));

        jButton19.setText("jButton12");
        jPanel4.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 30, -1));

        jButton20.setText("jButton13");
        jPanel4.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 30, -1));

        jButton21.setText("jButton14");
        jPanel4.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 30, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel10.setText(".");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 50));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel12.setText(".");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 50));

        jButton8.setText("jButton8");
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 30, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel3.setText(".");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 50));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel8.setText(".");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 50));

        jButton22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton22.setForeground(new java.awt.Color(0, 0, 0));
        jButton22.setText("Avancar");
        jButton22.setBorder(null);
        jButton22.setBorderPainted(false);
        jButton22.setContentAreaFilled(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 160, 90, -1));

        jButton23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton23.setForeground(new java.awt.Color(0, 0, 0));
        jButton23.setText("Voltar");
        jButton23.setBorder(null);
        jButton23.setBorderPainted(false);
        jButton23.setContentAreaFilled(false);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 60, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel11.setText(".");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, 50));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel9.setText(".");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, 50));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel13.setText(".");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, 50));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel14.setText(".");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, 50));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel15.setText(".");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, 50));

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel16.setText(".");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, 50));

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel17.setText(".");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, 50));

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel18.setText(".");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, 50));

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel19.setText(".");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, 50));

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel20.setText(".");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, 50));

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel21.setText(".");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, 50));

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel22.setText(".");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, 50));

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel23.setText(".");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, 50));

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel24.setText(".");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, 50));

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel25.setText(".");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, 50));

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel26.setText(".");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, 50));

        jLabel27.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel27.setText(".");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, 50));

        jLabel28.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel28.setText(".");
        jPanel4.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, 50));

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel29.setText(".");
        jPanel4.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, 50));

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel30.setText(".");
        jPanel4.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, 50));

        jLabel31.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel31.setText(".");
        jPanel4.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, 50));

        jLabel32.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel32.setText(".");
        jPanel4.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, 50));

        jLabel33.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel33.setText(".");
        jPanel4.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, 50));

        jLabel34.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabel34.setText(".");
        jPanel4.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, 50));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Calendário 2021/01");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, -1));

        painelCalendario.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 220));

        getContentPane().add(painelCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        MenuChamar = new telaMenu();
        MenuChamar.setUsuario(usuario);
        MenuChamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Servico S = new Servico();
        List<Calendario> checarId = new ArrayList<>();
        checarId = S.listarCalendarioCadastrado();
        for(Calendario c: checarId){
            if(jIdConfimar.getText().equals(c.getIdC())){
                painelCodigo.setVisible(false);
                painelCodigo.setEnabled(false);
                painelCalendario.setVisible(true);
                painelCalendario.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        MenuChamar = new telaMenu();
        
        MenuChamar.setUsuario(getUsuario());
        MenuChamar.setEmail(getEmail());
        MenuChamar.setNome(getNome());
        
        MenuChamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calendario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaCalendario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JTextField jIdConfimar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel painelCalendario;
    private javax.swing.JPanel painelCodigo;
    // End of variables declaration//GEN-END:variables
}
