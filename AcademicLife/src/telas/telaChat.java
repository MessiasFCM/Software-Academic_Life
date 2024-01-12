package telas;

import acessoADados.Servico;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import modelo.Chat;
import modelo.Estudante;
import modelo.Professor;

public class telaChat extends javax.swing.JFrame {
    
    telaMenu MenuChamar;
    DefaultListModel dlm = new DefaultListModel();
    String[] msgs = new String[100];
    String[] separarNome = new String[10];
    
    Servico S = new Servico();
    
    public String nome, email;
    public int usuario, codigo;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        System.out.println("Email - " + email);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    
    public String getNomeSeparado() {
        String n = getNome() + " ";
        separarNome = n.split(" ");
        System.out.println("Nome: " + separarNome[0]);
        return separarNome[0];
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
        
        List<Chat> checarId = new ArrayList<>();
        checarId = S.listarChatCadastradas();
        dlm.clear();
        jList.setModel(dlm);
        
        if(getUsuario() == 0){ // Estudante
            jEstudantes.setVisible(true);
            List<Estudante> checarEstudante= new ArrayList<>();
            checarEstudante = S.listarEstudantesCadastradas();
            for(Estudante e: checarEstudante){
                if(e.geteMailE().equalsIgnoreCase(getEmail())){
                    for(Chat c: checarId){
                        if(e.getCodigoCE() == c.getCodigoC()){
                            if(c.getMensagensC() != null){
                                msgs = c.getMensagensC().split(";");
                                for(String s: msgs){
                                    dlm.addElement(s);
                                }
                                jList.setModel(dlm);
                            }else{
                                jList.setModel(dlm);
                            }
                            setCodigo(c.getCodigoC());
                        }
                    }
                }
            }
        }else if(getUsuario() == 1){ // Professor 
            jProfessores.setVisible(true);
            List<Professor> checarProfessor= new ArrayList<>();
            checarProfessor = S.listarProfessorCadastradas();
            for(Professor p: checarProfessor){
                if(p.getEmailP().equalsIgnoreCase(getEmail())){
                    for(Chat c: checarId){
                        if(p.getCodigoCP()== c.getCodigoC()){
                            if(c.getMensagensC() != null){
                                msgs = c.getMensagensC().split(";");
                                for(String s: msgs){
                                    dlm.addElement(s);
                                }
                                jList.setModel(dlm);
                            }else{
                                jList.setModel(dlm);
                            }
                            setCodigo(c.getCodigoC());
                        }
                    }
                }
            }
        }else if( getUsuario() == 2){ // Gerencia
            jGerencia.setVisible(true);
            for(Chat c: checarId){
                if(3001 == c.getCodigoC()){
                    if(c.getMensagensC() != null){
                        msgs = c.getMensagensC().split(";");
                        for(String s: msgs){
                            dlm.addElement(s);
                        }
                        jList.setModel(dlm);
                    }else{
                        jList.setModel(dlm);
                    }
                    setCodigo(c.getCodigoC());
                }
            }
            
        }
        
    }

    public telaChat() {
        initComponents();
        setLocationRelativeTo(null);
        
        painelConversa.setVisible(true);
        painelConversa.setEnabled(true);
        jEstudantes.setVisible(false);
        jProfessores.setVisible(false);
        jGerencia.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        painelConversa = new javax.swing.JPanel();
        jEnviar = new javax.swing.JButton();
        jMsg = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();
        jAtualizar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jEstudantes = new javax.swing.JLabel();
        jGerencia = new javax.swing.JLabel();
        jProfessores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Academic Life");
        setMinimumSize(new java.awt.Dimension(320, 340));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(320, 340));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelConversa.setOpaque(false);
        painelConversa.setPreferredSize(new java.awt.Dimension(300, 320));
        painelConversa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jEnviar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jEnviar.setForeground(new java.awt.Color(0, 153, 0));
        jEnviar.setText(">");
        jEnviar.setBorder(null);
        jEnviar.setBorderPainted(false);
        jEnviar.setContentAreaFilled(false);
        jEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jEnviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jEnviarMouseExited(evt);
            }
        });
        jEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEnviarActionPerformed(evt);
            }
        });
        painelConversa.add(jEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 30, 25));

        jMsg.setBackground(new java.awt.Color(204, 204, 204));
        jMsg.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMsg.setForeground(java.awt.Color.gray);
        jMsg.setText("Digite sua Mensagem");
        jMsg.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMsg.setCaretPosition(5);
        jMsg.setPreferredSize(new java.awt.Dimension(220, 25));
        jMsg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jMsgFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jMsgFocusLost(evt);
            }
        });
        jMsg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMsgMouseClicked(evt);
            }
        });
        painelConversa.add(jMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jList.setBackground(new java.awt.Color(204, 204, 204));
        jList.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jList.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jList);

        painelConversa.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 260, 240));

        jAtualizar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jAtualizar.setForeground(new java.awt.Color(102, 204, 255));
        jAtualizar.setText("Atualizar");
        jAtualizar.setBorder(null);
        jAtualizar.setBorderPainted(false);
        jAtualizar.setContentAreaFilled(false);
        jAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jAtualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jAtualizarMouseExited(evt);
            }
        });
        jAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAtualizarActionPerformed(evt);
            }
        });
        painelConversa.add(jAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 90, -1));

        jButton5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(153, 0, 0));
        jButton5.setText("Voltar");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setPreferredSize(new java.awt.Dimension(220, 25));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        painelConversa.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, -1));

        jEstudantes.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jEstudantes.setForeground(new java.awt.Color(102, 102, 102));
        jEstudantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jEstudantes.setText("Estudantes");
        painelConversa.add(jEstudantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 140, -1));

        jGerencia.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jGerencia.setForeground(new java.awt.Color(102, 102, 102));
        jGerencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jGerencia.setText("Gerência");
        painelConversa.add(jGerencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 140, -1));

        jProfessores.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jProfessores.setForeground(new java.awt.Color(102, 102, 102));
        jProfessores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jProfessores.setText("Professores");
        painelConversa.add(jProfessores, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 140, -1));

        jPanel1.add(painelConversa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        MenuChamar = new telaMenu();
                  
        MenuChamar.setUsuario(getUsuario());
        MenuChamar.setEmail(getEmail());
        MenuChamar.setNome(getNome());
        
        MenuChamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEnviarActionPerformed
        jEnviar.setEnabled(false);
        if(!jMsg.getText().equals("Digite sua Mensagem") && !jMsg.getText().equals("")){
            List<Chat> checarId = new ArrayList<>();
            checarId = S.listarChatCadastradas();
            Chat chat = new Chat();
            for(Chat c: checarId){
                if(c.getCodigoC() == getCodigo()){
                    if(c.getMensagensC() != null){
                        chat.setCodigoC(c.getCodigoC());
                        chat.setMensagensC(c.getMensagensC() + "<"+getNomeSeparado()+"> "+jMsg.getText()+";");
                        S.atualiarChat(chat);

                        dlm.clear();
                        msgs = c.getMensagensC().split(";");
                        for(String s: msgs){
                            dlm.addElement(s);
                        }
                        dlm.addElement("<"+getNomeSeparado()+"> "+jMsg.getText());
                        jList.setModel(dlm);
                    }else{
                        chat.setCodigoC(c.getCodigoC());
                        chat.setMensagensC("<"+getNomeSeparado()+"> "+jMsg.getText()+";");
                        S.atualiarChat(chat);

                        dlm.clear();
                        dlm.addElement("<"+getNomeSeparado()+"> "+jMsg.getText());
                        jList.setModel(dlm);
                    }
                }
            }
            jMsg.setText("Digite sua Mensagem");
            jMsg.setForeground(Color.gray);
        }
        jEnviar.setEnabled(true);
    }//GEN-LAST:event_jEnviarActionPerformed

    private void jAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAtualizarActionPerformed
        jAtualizar.setEnabled(false);
        List<Chat> checarId = new ArrayList<>();
        checarId = S.listarChatCadastradas();
        dlm.clear();
        for(Chat c: checarId){
            if(c.getCodigoC() == getCodigo()){
                if(c.getMensagensC() != null){
                    msgs = c.getMensagensC().split(";");
                    for(String s: msgs){
                        dlm.addElement(s);
                    }
                    jList.setModel(dlm);
                }else{
                    jList.setModel(dlm);
                }
            }
        }
        jAtualizar.setEnabled(true);
    }//GEN-LAST:event_jAtualizarActionPerformed

    private void jMsgFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jMsgFocusGained
        if(jMsg.getText().equals("Digite sua Mensagem")){
            jMsg.setText("");
            jMsg.setForeground(Color.black);
        }
    }//GEN-LAST:event_jMsgFocusGained

    private void jMsgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jMsgFocusLost
        if(jMsg.getText().equals("")){
            jMsg.setText("Digite sua Mensagem");
            jMsg.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jMsgFocusLost

    private void jMsgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMsgMouseClicked
        if(jMsg.getText().equals("Digite sua Mensagem")){
            jMsg.setText("");
            jMsg.setForeground(Color.black);
        }
    }//GEN-LAST:event_jMsgMouseClicked

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        jButton5.setForeground(new Color(255,102,102));
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        jButton5.setForeground(new Color(153,0,0));
    }//GEN-LAST:event_jButton5MouseExited

    private void jAtualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAtualizarMouseEntered
        jAtualizar.setForeground(new Color(153,255,255));
    }//GEN-LAST:event_jAtualizarMouseEntered

    private void jAtualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAtualizarMouseExited
        jAtualizar.setForeground(new Color(102,204,255));
    }//GEN-LAST:event_jAtualizarMouseExited

    private void jEnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEnviarMouseEntered
        jEnviar.setForeground(new Color(153,255,153));
    }//GEN-LAST:event_jEnviarMouseEntered

    private void jEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEnviarMouseExited
        jEnviar.setForeground(new Color(0,153,0));
    }//GEN-LAST:event_jEnviarMouseExited

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaChat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAtualizar;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jEnviar;
    private javax.swing.JLabel jEstudantes;
    private javax.swing.JLabel jGerencia;
    private javax.swing.JList<String> jList;
    private javax.swing.JTextField jMsg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jProfessores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelConversa;
    // End of variables declaration//GEN-END:variables
}
