package telas;

import acessoADados.Servico;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import modelo.Estudante;
import modelo.Professor;
import modelo.Gerencia;

public class telaLogin extends javax.swing.JFrame{

    telaMenu MenuChamar;
    Servico S = new Servico();

    public telaLogin() {
        initComponents();
        setLocationRelativeTo(null);
        
        MenuChamar = new telaMenu();
        
        painelLogin.setVisible(true);
        painelLogin.setEnabled(true);
        painelGerencia.setVisible(false);
        painelGerencia.setEnabled(false);
        
        jErrro.setVisible(false);
        jErrro1.setVisible(false);
        jErrro2.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        painelLogin = new javax.swing.JPanel();
        jEntrar = new javax.swing.JButton();
        jEmail1 = new javax.swing.JTextField();
        botaoGerencia = new javax.swing.JButton();
        jSenha1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jErrro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        painelGerencia = new javax.swing.JPanel();
        jEmail2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSenha2 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jErrro2 = new javax.swing.JLabel();
        jErrro1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Academic Life");
        setMinimumSize(new java.awt.Dimension(320, 340));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(330, 350));
        jPanel1.setMinimumSize(new java.awt.Dimension(330, 350));
        jPanel1.setPreferredSize(new java.awt.Dimension(320, 340));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelLogin.setMaximumSize(new java.awt.Dimension(300, 320));
        painelLogin.setMinimumSize(new java.awt.Dimension(300, 320));
        painelLogin.setOpaque(false);
        painelLogin.setPreferredSize(new java.awt.Dimension(300, 320));
        painelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jEntrar.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jEntrar.setForeground(new java.awt.Color(0, 0, 0));
        jEntrar.setText("Entrar");
        jEntrar.setBorder(null);
        jEntrar.setBorderPainted(false);
        jEntrar.setContentAreaFilled(false);
        jEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jEntrarMouseExited(evt);
            }
        });
        jEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEntrarActionPerformed(evt);
            }
        });
        painelLogin.add(jEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 300, 50));

        jEmail1.setBackground(new java.awt.Color(204, 204, 204));
        jEmail1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jEmail1.setForeground(java.awt.Color.gray);
        jEmail1.setToolTipText("");
        jEmail1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jEmail1.setName(""); // NOI18N
        jEmail1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEmail1MouseClicked(evt);
            }
        });
        painelLogin.add(jEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 220, 25));

        botaoGerencia.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botaoGerencia.setForeground(new java.awt.Color(204, 204, 204));
        botaoGerencia.setText("Gerência");
        botaoGerencia.setToolTipText("");
        botaoGerencia.setBorder(null);
        botaoGerencia.setBorderPainted(false);
        botaoGerencia.setContentAreaFilled(false);
        botaoGerencia.setFocusPainted(false);
        botaoGerencia.setFocusable(false);
        botaoGerencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoGerenciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoGerenciaMouseExited(evt);
            }
        });
        botaoGerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerenciaActionPerformed(evt);
            }
        });
        painelLogin.add(botaoGerencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 300, 30));

        jSenha1.setBackground(new java.awt.Color(204, 204, 204));
        jSenha1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jSenha1.setForeground(java.awt.Color.gray);
        jSenha1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jSenha1.setPreferredSize(new java.awt.Dimension(220, 25));
        jSenha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSenha1MouseClicked(evt);
            }
        });
        painelLogin.add(jSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Academic ");
        painelLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("E-Mail");
        painelLogin.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 115, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Senha");
        painelLogin.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 155, -1, -1));

        jErrro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jErrro.setForeground(new java.awt.Color(255, 0, 0));
        jErrro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jErrro.setText("E-mail ou senha incorreto");
        painelLogin.add(jErrro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 300, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("life");
        painelLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 300, -1));

        jPanel1.add(painelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        painelGerencia.setMaximumSize(new java.awt.Dimension(300, 320));
        painelGerencia.setMinimumSize(new java.awt.Dimension(300, 320));
        painelGerencia.setOpaque(false);
        painelGerencia.setPreferredSize(new java.awt.Dimension(300, 320));
        painelGerencia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jEmail2.setBackground(new java.awt.Color(204, 204, 204));
        jEmail2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jEmail2.setForeground(java.awt.Color.gray);
        jEmail2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jEmail2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEmail2MouseClicked(evt);
            }
        });
        jEmail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmail2ActionPerformed(evt);
            }
        });
        painelGerencia.add(jEmail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 220, 25));

        jButton1.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Confirmar");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        painelGerencia.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 300, 50));

        jSenha2.setBackground(new java.awt.Color(204, 204, 204));
        jSenha2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jSenha2.setForeground(java.awt.Color.gray);
        jSenha2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jSenha2.setPreferredSize(new java.awt.Dimension(220, 25));
        jSenha2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSenha2MouseClicked(evt);
            }
        });
        painelGerencia.add(jSenha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 0));
        jButton2.setText("Voltar");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPreferredSize(new java.awt.Dimension(100, 25));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        painelGerencia.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 295, 100, 25));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("para a gerência");
        painelGerencia.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 34, 300, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("E-Mail");
        painelGerencia.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 75, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Senha");
        painelGerencia.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 115, -1, -1));

        jErrro2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jErrro2.setForeground(new java.awt.Color(255, 0, 0));
        jErrro2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jErrro2.setText("Senha incorreta para registro de gerencia");
        painelGerencia.add(jErrro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 275, 300, -1));

        jErrro1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jErrro1.setForeground(new java.awt.Color(255, 0, 0));
        jErrro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jErrro1.setText("E-mail já existente");
        painelGerencia.add(jErrro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 300, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Nome");
        painelGerencia.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 155, -1, -1));

        jNome.setBackground(new java.awt.Color(204, 204, 204));
        jNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jNome.setForeground(java.awt.Color.gray);
        jNome.setToolTipText("");
        jNome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jNome.setPreferredSize(new java.awt.Dimension(220, 25));
        painelGerencia.add(jNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Registro");
        painelGerencia.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        jPanel1.add(painelGerencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparCaixas(){
        jEmail1.setText("");
        jSenha1.setText("");
        jEmail2.setText("");
        jSenha2.setText("");
        jNome.setText("");
        jErrro.setVisible(false);
        jErrro1.setVisible(false);
        jErrro2.setVisible(false);
        
    }
    
    private void jEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEntrarActionPerformed
        List<Estudante> checarLoginE = new ArrayList<>();
        checarLoginE = S.listarEstudantesCadastradas();
        List<Professor> checarLoginP = new ArrayList<>();
        checarLoginP = S.listarProfessorCadastradas();
        List<Gerencia> checarLoginG = new ArrayList<>();
        checarLoginG = S.listarGerenciaCadastradas();
        
        String senha = new String(jSenha1.getPassword());
        
        for(Estudante ce: checarLoginE){
            if((ce.geteMailE().equalsIgnoreCase(jEmail1.getText())) && (ce.getSenhaE().equals(senha))){
                MenuChamar.setUsuario(0);
                MenuChamar.setEmail(jEmail1.getText());
                MenuChamar.setNome(ce.getNomeE());
                MenuChamar.setVisible(true);
                MenuChamar.setEnabled(true);
                jErrro.setVisible(false);
                this.dispose();
            }
        }
        for(Professor cp: checarLoginP){
            if((cp.getEmailP().equalsIgnoreCase(jEmail1.getText())) && (cp.getSenhaP().equals(senha))){
                MenuChamar.setUsuario(1);
                MenuChamar.setEmail(jEmail1.getText());
                MenuChamar.setNome(cp.getNomeP());
                MenuChamar.setVisible(true);
                MenuChamar.setEnabled(true);
                jErrro.setVisible(false);
                this.dispose();
            }
        }
        for(Gerencia cg: checarLoginG){
            if((cg.geteMailG().equalsIgnoreCase(jEmail1.getText())) && (cg.getSenhaG().equals(senha))){
                MenuChamar.setUsuario(2);
                MenuChamar.setEmail(jEmail1.getText());
                MenuChamar.setNome(cg.getNomeG());
                MenuChamar.setVisible(true);
                MenuChamar.setEnabled(true);
                jErrro.setVisible(false);
                this.dispose();
            }
        }
        jErrro.setVisible(true);
    }//GEN-LAST:event_jEntrarActionPerformed

    private void jEmail2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmail2ActionPerformed
        
    }//GEN-LAST:event_jEmail2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        List<Gerencia> checarLoginG = new ArrayList<>();
        checarLoginG = S.listarGerenciaCadastradas();
        int cont = 0;
        for(Gerencia cg: checarLoginG){
            if(jEmail2.getText().equalsIgnoreCase(cg.geteMailG())){
                cont = 1;
            }
        }
        if(cont == 1){
            jErrro1.setVisible(true);
        }else{
            registrar();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void registrar(){
        
        String senha = new String(jSenha2.getPassword());
        if(senha.equals("adm123")){
            painelLogin.setVisible(true);
            painelLogin.setEnabled(true);
            painelGerencia.setVisible(false);
            painelGerencia.setEnabled(false);
            Gerencia gerencia = new Gerencia(jEmail2.getText(), senha,jNome.getText());
            S.inserirGerencia(gerencia);
            System.out.println(gerencia);
            limparCaixas();
        }else{
            jErrro2.setVisible(true);
        }
        
    }
    
    private void botaoGerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGerenciaActionPerformed
        limparCaixas();
        painelLogin.setVisible(false);
        painelLogin.setEnabled(false);
        painelGerencia.setVisible(true);
        painelGerencia.setEnabled(true);
    }//GEN-LAST:event_botaoGerenciaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limparCaixas();
        painelLogin.setVisible(true);
        painelLogin.setEnabled(true);
        painelGerencia.setVisible(false);
        painelGerencia.setEnabled(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jEmail1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEmail1MouseClicked
        jErrro.setVisible(false);
    }//GEN-LAST:event_jEmail1MouseClicked

    private void jSenha1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSenha1MouseClicked
        jErrro.setVisible(false);
    }//GEN-LAST:event_jSenha1MouseClicked

    private void jEmail2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEmail2MouseClicked
        jErrro1.setVisible(false);
        jErrro2.setVisible(false);
    }//GEN-LAST:event_jEmail2MouseClicked

    private void jSenha2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSenha2MouseClicked
        jErrro2.setVisible(false);
    }//GEN-LAST:event_jSenha2MouseClicked

    private void jEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEntrarMouseEntered
        jEntrar.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_jEntrarMouseEntered

    private void jEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEntrarMouseExited
        jEntrar.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jEntrarMouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setForeground(new Color(255,102,102));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setForeground(new Color(153,0,0));
    }//GEN-LAST:event_jButton2MouseExited

    private void botaoGerenciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoGerenciaMouseEntered
        botaoGerencia.setForeground(new Color(204,204,204));
    }//GEN-LAST:event_botaoGerenciaMouseEntered

    private void botaoGerenciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoGerenciaMouseExited
        botaoGerencia.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_botaoGerenciaMouseExited
 
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoGerencia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jEmail1;
    private javax.swing.JTextField jEmail2;
    private javax.swing.JButton jEntrar;
    private javax.swing.JLabel jErrro;
    private javax.swing.JLabel jErrro1;
    private javax.swing.JLabel jErrro2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jSenha1;
    private javax.swing.JPasswordField jSenha2;
    private javax.swing.JPanel painelGerencia;
    private javax.swing.JPanel painelLogin;
    // End of variables declaration//GEN-END:variables
}
