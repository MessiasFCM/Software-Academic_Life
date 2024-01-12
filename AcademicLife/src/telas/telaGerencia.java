package telas;

import acessoADados.Servico;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import modelo.Chat;
import modelo.Estudante;
import modelo.Gerencia;
import modelo.Instituicao;
import modelo.Professor;

public class telaGerencia extends javax.swing.JFrame {

    telaMenu MenuChamar;
    
    DefaultListModel dlm = new DefaultListModel();
    DefaultListModel professorLista = new DefaultListModel();
    
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
    
    public telaGerencia() {
        initComponents();
        setLocationRelativeTo(null);
        
        
        painelPrincipal.setVisible(true);
        painelPrincipal.setEnabled(true);
        
        painelPrincipal1.setVisible(false);
        painelPrincipal1.setEnabled(false);
        
        painelEstudante.setVisible(false);
        painelEstudante.setEnabled(false);
        painelEstudanteListar.setVisible(false);
        painelEstudanteListar.setEnabled(false);
        
        painelProfessores.setVisible(false);
        painelProfessores.setEnabled(false);
        painelProfessoresListar.setVisible(false);
        painelProfessoresListar.setEnabled(false);
        
        painelGerencia.setVisible(false);
        painelGerencia.setEnabled(false);
        painelGerenciaListar.setVisible(false);
        painelGerenciaListar.setEnabled(false);
        
        painelInstituicao.setVisible(false);
        painelInstituicao.setEnabled(false);
        
        painelCalendario.setVisible(false);
        painelCalendario.setEnabled(false);
        painelCalendarioListar.setVisible(false);
        painelCalendarioListar.setEnabled(false);
        
        painelChat.setVisible(false);
        painelChat.setEnabled(false);
        painelChatListar.setVisible(false);
        painelChatListar.setEnabled(false);
        
        jPanelChatP.setVisible(false);
        jPanelChatP.setEnabled(false);
        jPanelChatE.setVisible(false);
        jPanelChatE.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        painelEstudante = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jFimE = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jInicioE = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        jCursosE = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jMateriasE = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jInstituicaoE = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jSenhaE = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jEmailE = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jNomeE = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        painelEstudanteListar = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListEstudantes = new javax.swing.JList<>();
        jButton34 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        painelPrincipal1 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        painelPrincipal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jCalendario = new javax.swing.JButton();
        jChat = new javax.swing.JButton();
        jUsuario = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        painelInstituicao = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jContato = new javax.swing.JTextField();
        jIdade = new javax.swing.JTextField();
        jDiretor = new javax.swing.JTextField();
        jLocalizacao = new javax.swing.JTextField();
        jMaterias = new javax.swing.JTextField();
        jCursos = new javax.swing.JTextField();
        jInstituicao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        painelProfessores = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jInstituicaoP = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jSenhaP = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jEmailP = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jNomeP = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jMaterialP = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        painelProfessoresListar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProfessores = new javax.swing.JList<>();
        jButton16 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        painelGerencia = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jEmailG = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jSenhaG = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jNomeG = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        painelGerenciaListar = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListGerencia = new javax.swing.JList<>();
        jButton33 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        painelCalendarioListar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListCalendario = new javax.swing.JList<>();
        jButton36 = new javax.swing.JButton();
        painelCalendario = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jNomeP4 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        painelChatListar = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListChat = new javax.swing.JList<>();
        jButton35 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        painelChat = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jIdAcesso = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jPanelChatE = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jComboBoxE = new javax.swing.JComboBox<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        jListChatE = new javax.swing.JList<>();
        AtualizarE = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jPanelChatP = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jComboBoxP = new javax.swing.JComboBox<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        jListChatP = new javax.swing.JList<>();
        AtualizarP = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Academic Life");
        setMinimumSize(new java.awt.Dimension(320, 340));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(320, 340));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelEstudante.setBackground(new java.awt.Color(255, 255, 255));
        painelEstudante.setMaximumSize(new java.awt.Dimension(300, 320));
        painelEstudante.setMinimumSize(new java.awt.Dimension(300, 320));
        painelEstudante.setOpaque(false);
        painelEstudante.setPreferredSize(new java.awt.Dimension(300, 400));
        painelEstudante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane6.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setToolTipText("");
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane6.setMaximumSize(new java.awt.Dimension(300, 320));
        jScrollPane6.setMinimumSize(new java.awt.Dimension(300, 320));
        jScrollPane6.setOpaque(false);
        jScrollPane6.setPreferredSize(new java.awt.Dimension(300, 320));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 400));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton31.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton31.setForeground(new java.awt.Color(153, 0, 0));
        jButton31.setText("Voltar");
        jButton31.setBorder(null);
        jButton31.setBorderPainted(false);
        jButton31.setContentAreaFilled(false);
        jButton31.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        jButton32.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton32.setForeground(new java.awt.Color(0, 0, 0));
        jButton32.setText("Listar");
        jButton32.setBorder(null);
        jButton32.setBorderPainted(false);
        jButton32.setContentAreaFilled(false);
        jButton32.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jButton30.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton30.setForeground(new java.awt.Color(0, 0, 0));
        jButton30.setText("Remover");
        jButton30.setBorder(null);
        jButton30.setBorderPainted(false);
        jButton30.setContentAreaFilled(false);
        jButton30.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jButton28.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton28.setForeground(new java.awt.Color(0, 0, 0));
        jButton28.setText("Atualizar");
        jButton28.setBorder(null);
        jButton28.setBorderPainted(false);
        jButton28.setContentAreaFilled(false);
        jButton28.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jButton29.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton29.setForeground(new java.awt.Color(0, 0, 0));
        jButton29.setText("Adicionar");
        jButton29.setBorder(null);
        jButton29.setBorderPainted(false);
        jButton29.setContentAreaFilled(false);
        jButton29.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        jFimE.setBackground(new java.awt.Color(204, 204, 204));
        jFimE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jFimE.setForeground(java.awt.Color.gray);
        try {
            jFimE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFimE.setPreferredSize(new java.awt.Dimension(34, 25));
        jPanel2.add(jFimE, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 80, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Data Fim");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 285, -1, -1));

        jInicioE.setBackground(new java.awt.Color(204, 204, 204));
        jInicioE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jInicioE.setForeground(java.awt.Color.gray);
        try {
            jInicioE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jInicioE.setPreferredSize(new java.awt.Dimension(34, 25));
        jPanel2.add(jInicioE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 80, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Data Início");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 285, -1, -1));

        jCursosE.setBackground(new java.awt.Color(204, 204, 204));
        jCursosE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jCursosE.setForeground(java.awt.Color.gray);
        jCursosE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jCursosE.setPreferredSize(new java.awt.Dimension(220, 25));
        jPanel2.add(jCursosE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Curso");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 245, -1, -1));

        jMateriasE.setBackground(new java.awt.Color(204, 204, 204));
        jMateriasE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMateriasE.setForeground(java.awt.Color.gray);
        jMateriasE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jMateriasE.setPreferredSize(new java.awt.Dimension(220, 25));
        jPanel2.add(jMateriasE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Matérias");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 205, -1, -1));

        jInstituicaoE.setBackground(new java.awt.Color(204, 204, 204));
        jInstituicaoE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jInstituicaoE.setForeground(java.awt.Color.gray);
        jInstituicaoE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jInstituicaoE.setPreferredSize(new java.awt.Dimension(220, 25));
        jPanel2.add(jInstituicaoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Instituição");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 165, -1, -1));

        jSenhaE.setBackground(new java.awt.Color(204, 204, 204));
        jSenhaE.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jSenhaE.setForeground(java.awt.Color.gray);
        jSenhaE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jSenhaE.setPreferredSize(new java.awt.Dimension(220, 25));
        jPanel2.add(jSenhaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Senha");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 125, -1, -1));

        jEmailE.setBackground(new java.awt.Color(204, 204, 204));
        jEmailE.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jEmailE.setForeground(java.awt.Color.gray);
        jEmailE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jEmailE.setPreferredSize(new java.awt.Dimension(220, 25));
        jPanel2.add(jEmailE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("E-Mail");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 85, -1, -1));

        jNomeE.setBackground(new java.awt.Color(204, 204, 204));
        jNomeE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jNomeE.setForeground(java.awt.Color.gray);
        jNomeE.setToolTipText("");
        jNomeE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jNomeE.setPreferredSize(new java.awt.Dimension(220, 25));
        jPanel2.add(jNomeE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Nome");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 45, -1, -1));

        jLabel32.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 102, 102));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Estudantes");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        jScrollPane6.setViewportView(jPanel2);

        painelEstudante.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(painelEstudante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        painelEstudanteListar.setMaximumSize(new java.awt.Dimension(300, 320));
        painelEstudanteListar.setMinimumSize(new java.awt.Dimension(300, 320));
        painelEstudanteListar.setOpaque(false);
        painelEstudanteListar.setPreferredSize(new java.awt.Dimension(300, 320));
        painelEstudanteListar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane5.setPreferredSize(new java.awt.Dimension(280, 210));

        jListEstudantes.setBackground(new java.awt.Color(204, 204, 204));
        jListEstudantes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jListEstudantes.setForeground(java.awt.Color.gray);
        jListEstudantes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jListEstudantes);

        painelEstudanteListar.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jButton34.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jButton34.setForeground(new java.awt.Color(153, 0, 0));
        jButton34.setText("Voltar");
        jButton34.setBorder(null);
        jButton34.setBorderPainted(false);
        jButton34.setContentAreaFilled(false);
        jButton34.setPreferredSize(new java.awt.Dimension(300, 30));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        painelEstudanteListar.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        jLabel42.setFont(new java.awt.Font("Georgia", 1, 28)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(102, 102, 102));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Lista de estudantes");
        painelEstudanteListar.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, -1));

        jPanel1.add(painelEstudanteListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        painelPrincipal1.setMaximumSize(new java.awt.Dimension(300, 320));
        painelPrincipal1.setMinimumSize(new java.awt.Dimension(300, 320));
        painelPrincipal1.setOpaque(false);
        painelPrincipal1.setPreferredSize(new java.awt.Dimension(300, 320));
        painelPrincipal1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("Estudantes");
        jButton8.setToolTipText("");
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setMaximumSize(new java.awt.Dimension(220, 30));
        jButton8.setMinimumSize(new java.awt.Dimension(220, 30));
        jButton8.setPreferredSize(new java.awt.Dimension(220, 30));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        painelPrincipal1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jButton9.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 0));
        jButton9.setText("Professores");
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setMaximumSize(new java.awt.Dimension(220, 30));
        jButton9.setMinimumSize(new java.awt.Dimension(220, 30));
        jButton9.setPreferredSize(new java.awt.Dimension(220, 30));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        painelPrincipal1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jButton10.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 0));
        jButton10.setText("Gerência");
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setMaximumSize(new java.awt.Dimension(220, 30));
        jButton10.setMinimumSize(new java.awt.Dimension(220, 30));
        jButton10.setPreferredSize(new java.awt.Dimension(220, 30));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        painelPrincipal1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jButton11.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jButton11.setForeground(new java.awt.Color(153, 0, 0));
        jButton11.setText("Voltar");
        jButton11.setToolTipText("");
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setMaximumSize(new java.awt.Dimension(220, 30));
        jButton11.setMinimumSize(new java.awt.Dimension(220, 30));
        jButton11.setPreferredSize(new java.awt.Dimension(220, 30));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        painelPrincipal1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Usuários");
        painelPrincipal1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 300, -1));

        jPanel1.add(painelPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        painelPrincipal.setMaximumSize(new java.awt.Dimension(300, 320));
        painelPrincipal.setMinimumSize(new java.awt.Dimension(300, 320));
        painelPrincipal.setOpaque(false);
        painelPrincipal.setPreferredSize(new java.awt.Dimension(300, 320));
        painelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gerência");
        painelPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        jCalendario.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jCalendario.setForeground(new java.awt.Color(0, 0, 0));
        jCalendario.setText("Calendario");
        jCalendario.setBorder(null);
        jCalendario.setBorderPainted(false);
        jCalendario.setContentAreaFilled(false);
        jCalendario.setEnabled(false);
        jCalendario.setMaximumSize(new java.awt.Dimension(220, 30));
        jCalendario.setMinimumSize(new java.awt.Dimension(220, 30));
        jCalendario.setPreferredSize(new java.awt.Dimension(220, 30));
        jCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCalendarioActionPerformed(evt);
            }
        });
        painelPrincipal.add(jCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jChat.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jChat.setForeground(new java.awt.Color(0, 0, 0));
        jChat.setText("Chat");
        jChat.setBorder(null);
        jChat.setBorderPainted(false);
        jChat.setContentAreaFilled(false);
        jChat.setMaximumSize(new java.awt.Dimension(220, 30));
        jChat.setMinimumSize(new java.awt.Dimension(220, 30));
        jChat.setPreferredSize(new java.awt.Dimension(220, 30));
        jChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChatActionPerformed(evt);
            }
        });
        painelPrincipal.add(jChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jUsuario.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jUsuario.setText("Usuários");
        jUsuario.setBorder(null);
        jUsuario.setBorderPainted(false);
        jUsuario.setContentAreaFilled(false);
        jUsuario.setMaximumSize(new java.awt.Dimension(220, 30));
        jUsuario.setMinimumSize(new java.awt.Dimension(220, 30));
        jUsuario.setPreferredSize(new java.awt.Dimension(220, 30));
        jUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsuarioActionPerformed(evt);
            }
        });
        painelPrincipal.add(jUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jButton22.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jButton22.setForeground(new java.awt.Color(0, 0, 0));
        jButton22.setText("Instituição");
        jButton22.setBorder(null);
        jButton22.setBorderPainted(false);
        jButton22.setContentAreaFilled(false);
        jButton22.setMaximumSize(new java.awt.Dimension(220, 30));
        jButton22.setMinimumSize(new java.awt.Dimension(220, 30));
        jButton22.setPreferredSize(new java.awt.Dimension(220, 30));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        painelPrincipal.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jButton3.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 0, 0));
        jButton3.setText("Voltar");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setPreferredSize(new java.awt.Dimension(220, 25));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        painelPrincipal.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 110, 30));

        jPanel1.add(painelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        painelInstituicao.setOpaque(false);
        painelInstituicao.setPreferredSize(new java.awt.Dimension(300, 320));
        painelInstituicao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Atualizar");
        jButton1.setToolTipText("");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        painelInstituicao.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jContato.setBackground(new java.awt.Color(204, 204, 204));
        jContato.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jContato.setForeground(java.awt.Color.gray);
        jContato.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jContato.setPreferredSize(new java.awt.Dimension(220, 25));
        painelInstituicao.add(jContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 265, -1, 22));

        jIdade.setBackground(new java.awt.Color(204, 204, 204));
        jIdade.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jIdade.setForeground(java.awt.Color.gray);
        jIdade.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jIdade.setPreferredSize(new java.awt.Dimension(220, 25));
        jIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIdadeActionPerformed(evt);
            }
        });
        painelInstituicao.add(jIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, 22));

        jDiretor.setBackground(new java.awt.Color(204, 204, 204));
        jDiretor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jDiretor.setForeground(java.awt.Color.gray);
        jDiretor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jDiretor.setPreferredSize(new java.awt.Dimension(220, 25));
        painelInstituicao.add(jDiretor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 195, -1, 22));

        jLocalizacao.setBackground(new java.awt.Color(204, 204, 204));
        jLocalizacao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLocalizacao.setForeground(java.awt.Color.gray);
        jLocalizacao.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jLocalizacao.setPreferredSize(new java.awt.Dimension(220, 25));
        painelInstituicao.add(jLocalizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 22));

        jMaterias.setBackground(new java.awt.Color(204, 204, 204));
        jMaterias.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jMaterias.setForeground(java.awt.Color.gray);
        jMaterias.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jMaterias.setPreferredSize(new java.awt.Dimension(220, 25));
        jMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMateriasActionPerformed(evt);
            }
        });
        painelInstituicao.add(jMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 125, -1, 22));

        jCursos.setBackground(new java.awt.Color(204, 204, 204));
        jCursos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jCursos.setForeground(java.awt.Color.gray);
        jCursos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jCursos.setPreferredSize(new java.awt.Dimension(220, 25));
        painelInstituicao.add(jCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 22));

        jInstituicao.setBackground(new java.awt.Color(204, 204, 204));
        jInstituicao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jInstituicao.setForeground(java.awt.Color.gray);
        jInstituicao.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jInstituicao.setPreferredSize(new java.awt.Dimension(220, 25));
        painelInstituicao.add(jInstituicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 55, -1, 22));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Instituição");
        painelInstituicao.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Contato");
        painelInstituicao.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 250, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Idade da Instituição");
        painelInstituicao.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 215, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Diretor");
        painelInstituicao.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Localização");
        painelInstituicao.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 145, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Materiais");
        painelInstituicao.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 110, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Cursos");
        painelInstituicao.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 75, -1, -1));

        jButton21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton21.setForeground(new java.awt.Color(153, 0, 0));
        jButton21.setText("Voltar");
        jButton21.setBorder(null);
        jButton21.setBorderPainted(false);
        jButton21.setContentAreaFilled(false);
        jButton21.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        painelInstituicao.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jLabel40.setFont(new java.awt.Font("Georgia", 1, 28)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(102, 102, 102));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Instituição");
        painelInstituicao.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, -1));

        jPanel1.add(painelInstituicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        painelInstituicao.getAccessibleContext().setAccessibleName("");

        painelProfessores.setMaximumSize(new java.awt.Dimension(300, 320));
        painelProfessores.setMinimumSize(new java.awt.Dimension(300, 320));
        painelProfessores.setOpaque(false);
        painelProfessores.setPreferredSize(new java.awt.Dimension(300, 320));
        painelProfessores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Atualizar");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        painelProfessores.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        jButton4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Adicionar");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        painelProfessores.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        jButton5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Remover");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        painelProfessores.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jButton6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(153, 0, 0));
        jButton6.setText("Voltar");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        painelProfessores.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        jLabel21.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Professores");
        painelProfessores.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        jInstituicaoP.setBackground(new java.awt.Color(204, 204, 204));
        jInstituicaoP.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jInstituicaoP.setForeground(java.awt.Color.gray);
        jInstituicaoP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jInstituicaoP.setPreferredSize(new java.awt.Dimension(220, 25));
        painelProfessores.add(jInstituicaoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Instituição");
        painelProfessores.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 165, -1, -1));

        jSenhaP.setBackground(new java.awt.Color(204, 204, 204));
        jSenhaP.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jSenhaP.setForeground(java.awt.Color.gray);
        jSenhaP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jSenhaP.setPreferredSize(new java.awt.Dimension(220, 25));
        painelProfessores.add(jSenhaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Senha");
        painelProfessores.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 125, -1, -1));

        jEmailP.setBackground(new java.awt.Color(204, 204, 204));
        jEmailP.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jEmailP.setForeground(java.awt.Color.gray);
        jEmailP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jEmailP.setPreferredSize(new java.awt.Dimension(220, 25));
        painelProfessores.add(jEmailP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("E-Mail");
        painelProfessores.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 85, -1, -1));

        jNomeP.setBackground(new java.awt.Color(204, 204, 204));
        jNomeP.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jNomeP.setForeground(java.awt.Color.gray);
        jNomeP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jNomeP.setPreferredSize(new java.awt.Dimension(220, 25));
        painelProfessores.add(jNomeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Nome");
        painelProfessores.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 45, -1, -1));

        jMaterialP.setBackground(new java.awt.Color(204, 204, 204));
        jMaterialP.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jMaterialP.setForeground(java.awt.Color.gray);
        jMaterialP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jMaterialP.setPreferredSize(new java.awt.Dimension(220, 25));
        painelProfessores.add(jMaterialP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Matéria");
        painelProfessores.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 205, -1, -1));

        jButton7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("Listar");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setPreferredSize(new java.awt.Dimension(100, 25));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        painelProfessores.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jPanel1.add(painelProfessores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        painelProfessoresListar.setMaximumSize(new java.awt.Dimension(300, 320));
        painelProfessoresListar.setMinimumSize(new java.awt.Dimension(300, 320));
        painelProfessoresListar.setOpaque(false);
        painelProfessoresListar.setPreferredSize(new java.awt.Dimension(300, 320));
        painelProfessoresListar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jListProfessores.setBackground(new java.awt.Color(204, 204, 204));
        jListProfessores.setForeground(java.awt.Color.gray);
        jListProfessores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListProfessores);

        painelProfessoresListar.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 280, 210));

        jButton16.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jButton16.setForeground(new java.awt.Color(153, 0, 0));
        jButton16.setText("Voltar");
        jButton16.setBorder(null);
        jButton16.setBorderPainted(false);
        jButton16.setContentAreaFilled(false);
        jButton16.setPreferredSize(new java.awt.Dimension(220, 30));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        painelProfessoresListar.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 300, -1));

        jLabel36.setFont(new java.awt.Font("Georgia", 1, 28)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(102, 102, 102));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Lista de professores");
        painelProfessoresListar.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, -1));

        jPanel1.add(painelProfessoresListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        painelGerencia.setMaximumSize(new java.awt.Dimension(300, 320));
        painelGerencia.setMinimumSize(new java.awt.Dimension(300, 320));
        painelGerencia.setOpaque(false);
        painelGerencia.setPreferredSize(new java.awt.Dimension(300, 320));
        painelGerencia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton17.setForeground(new java.awt.Color(0, 0, 0));
        jButton17.setText("Atualizar");
        jButton17.setBorder(null);
        jButton17.setBorderPainted(false);
        jButton17.setContentAreaFilled(false);
        jButton17.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        painelGerencia.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        jButton24.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton24.setForeground(new java.awt.Color(0, 0, 0));
        jButton24.setText("Adicionar");
        jButton24.setBorder(null);
        jButton24.setBorderPainted(false);
        jButton24.setContentAreaFilled(false);
        jButton24.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        painelGerencia.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        jButton25.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton25.setForeground(new java.awt.Color(0, 0, 0));
        jButton25.setText("Remover");
        jButton25.setBorder(null);
        jButton25.setBorderPainted(false);
        jButton25.setContentAreaFilled(false);
        jButton25.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        painelGerencia.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jButton26.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton26.setForeground(new java.awt.Color(153, 0, 0));
        jButton26.setText("Voltar");
        jButton26.setBorder(null);
        jButton26.setBorderPainted(false);
        jButton26.setContentAreaFilled(false);
        jButton26.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton26.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        painelGerencia.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        jLabel31.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Gerência");
        painelGerencia.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        jEmailG.setBackground(new java.awt.Color(204, 204, 204));
        jEmailG.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jEmailG.setForeground(java.awt.Color.gray);
        jEmailG.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jEmailG.setPreferredSize(new java.awt.Dimension(220, 25));
        painelGerencia.add(jEmailG, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Nome");
        painelGerencia.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 85, -1, -1));

        jSenhaG.setBackground(new java.awt.Color(204, 204, 204));
        jSenhaG.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jSenhaG.setForeground(java.awt.Color.gray);
        jSenhaG.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jSenhaG.setPreferredSize(new java.awt.Dimension(220, 25));
        painelGerencia.add(jSenhaG, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Senha");
        painelGerencia.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 165, -1, -1));

        jNomeG.setBackground(new java.awt.Color(204, 204, 204));
        jNomeG.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jNomeG.setForeground(java.awt.Color.gray);
        jNomeG.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jNomeG.setPreferredSize(new java.awt.Dimension(220, 25));
        painelGerencia.add(jNomeG, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("E-Mail");
        painelGerencia.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 125, -1, -1));

        jButton27.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton27.setForeground(new java.awt.Color(0, 0, 0));
        jButton27.setText("Listar");
        jButton27.setBorder(null);
        jButton27.setBorderPainted(false);
        jButton27.setContentAreaFilled(false);
        jButton27.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        painelGerencia.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jPanel1.add(painelGerencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        painelGerenciaListar.setMaximumSize(new java.awt.Dimension(300, 320));
        painelGerenciaListar.setMinimumSize(new java.awt.Dimension(300, 320));
        painelGerenciaListar.setOpaque(false);
        painelGerenciaListar.setPreferredSize(new java.awt.Dimension(300, 320));
        painelGerenciaListar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setPreferredSize(new java.awt.Dimension(280, 210));

        jListGerencia.setBackground(new java.awt.Color(204, 204, 204));
        jListGerencia.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jListGerencia.setForeground(java.awt.Color.gray);
        jListGerencia.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jListGerencia);

        painelGerenciaListar.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 280, 210));

        jButton33.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jButton33.setForeground(new java.awt.Color(153, 0, 0));
        jButton33.setText("Voltar");
        jButton33.setBorder(null);
        jButton33.setBorderPainted(false);
        jButton33.setContentAreaFilled(false);
        jButton33.setPreferredSize(new java.awt.Dimension(300, 30));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        painelGerenciaListar.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        jLabel39.setFont(new java.awt.Font("Georgia", 1, 28)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(102, 102, 102));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Lista de gerência");
        painelGerenciaListar.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, -1));

        jPanel1.add(painelGerenciaListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        painelCalendarioListar.setMaximumSize(new java.awt.Dimension(300, 320));
        painelCalendarioListar.setMinimumSize(new java.awt.Dimension(300, 320));
        painelCalendarioListar.setOpaque(false);
        painelCalendarioListar.setPreferredSize(new java.awt.Dimension(300, 320));
        painelCalendarioListar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jListCalendario.setBackground(new java.awt.Color(204, 204, 204));
        jListCalendario.setForeground(java.awt.Color.gray);
        jListCalendario.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListCalendario);

        painelCalendarioListar.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 270, 190));

        jButton36.setText("jButton36");
        painelCalendarioListar.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jPanel1.add(painelCalendarioListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        painelCalendario.setMaximumSize(new java.awt.Dimension(300, 320));
        painelCalendario.setMinimumSize(new java.awt.Dimension(300, 320));
        painelCalendario.setOpaque(false);
        painelCalendario.setPreferredSize(new java.awt.Dimension(300, 320));
        painelCalendario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton12.setText("Remover");
        painelCalendario.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jButton13.setText("Adicionar");
        painelCalendario.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jButton14.setText("Listar");
        painelCalendario.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jButton15.setText("Voltar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        painelCalendario.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jNomeP4.setBackground(new java.awt.Color(204, 204, 204));
        jNomeP4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jNomeP4.setForeground(java.awt.Color.gray);
        jNomeP4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jNomeP4.setPreferredSize(new java.awt.Dimension(220, 25));
        painelCalendario.add(jNomeP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Id de acesso");
        painelCalendario.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 95, -1, -1));

        jLabel26.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(102, 102, 102));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Calendário");
        painelCalendario.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 300, -1));

        jPanel1.add(painelCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        painelChatListar.setMaximumSize(new java.awt.Dimension(300, 320));
        painelChatListar.setMinimumSize(new java.awt.Dimension(300, 320));
        painelChatListar.setOpaque(false);
        painelChatListar.setPreferredSize(new java.awt.Dimension(300, 320));
        painelChatListar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setPreferredSize(new java.awt.Dimension(280, 210));

        jListChat.setBackground(new java.awt.Color(204, 204, 204));
        jListChat.setForeground(java.awt.Color.gray);
        jListChat.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jListChat);

        painelChatListar.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jButton35.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jButton35.setForeground(new java.awt.Color(153, 0, 0));
        jButton35.setText("Voltar");
        jButton35.setBorder(null);
        jButton35.setBorderPainted(false);
        jButton35.setContentAreaFilled(false);
        jButton35.setPreferredSize(new java.awt.Dimension(300, 30));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        painelChatListar.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        jLabel41.setFont(new java.awt.Font("Georgia", 1, 28)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(102, 102, 102));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Lista de chats");
        painelChatListar.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, -1));

        jPanel1.add(painelChatListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        painelChat.setMaximumSize(new java.awt.Dimension(300, 320));
        painelChat.setMinimumSize(new java.awt.Dimension(300, 320));
        painelChat.setOpaque(false);
        painelChat.setPreferredSize(new java.awt.Dimension(300, 320));
        painelChat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton18.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton18.setForeground(new java.awt.Color(0, 0, 0));
        jButton18.setText("Remover");
        jButton18.setBorder(null);
        jButton18.setBorderPainted(false);
        jButton18.setContentAreaFilled(false);
        jButton18.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        painelChat.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jButton19.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton19.setForeground(new java.awt.Color(0, 0, 0));
        jButton19.setText("Adicionar");
        jButton19.setBorder(null);
        jButton19.setBorderPainted(false);
        jButton19.setContentAreaFilled(false);
        jButton19.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        painelChat.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        jButton20.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton20.setForeground(new java.awt.Color(0, 0, 0));
        jButton20.setText("Listar");
        jButton20.setBorder(null);
        jButton20.setBorderPainted(false);
        jButton20.setContentAreaFilled(false);
        jButton20.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        painelChat.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jButton23.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton23.setForeground(new java.awt.Color(153, 0, 0));
        jButton23.setText("Voltar");
        jButton23.setBorder(null);
        jButton23.setBorderPainted(false);
        jButton23.setContentAreaFilled(false);
        jButton23.setPreferredSize(new java.awt.Dimension(300, 30));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        painelChat.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        jIdAcesso.setBackground(new java.awt.Color(204, 204, 204));
        jIdAcesso.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jIdAcesso.setForeground(java.awt.Color.gray);
        jIdAcesso.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jIdAcesso.setPreferredSize(new java.awt.Dimension(220, 25));
        painelChat.add(jIdAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Adicionar Id de chat");
        painelChat.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel30.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Chat");
        painelChat.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 300, -1));

        jButton37.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton37.setForeground(java.awt.Color.gray);
        jButton37.setText("Estudante");
        jButton37.setBorder(null);
        jButton37.setBorderPainted(false);
        jButton37.setContentAreaFilled(false);
        jButton37.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        painelChat.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jButton38.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton38.setForeground(java.awt.Color.gray);
        jButton38.setText("Professor");
        jButton38.setBorder(null);
        jButton38.setBorderPainted(false);
        jButton38.setContentAreaFilled(false);
        jButton38.setPreferredSize(new java.awt.Dimension(90, 25));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        painelChat.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        jLabel43.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("Id de acesso");
        painelChat.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jPanel1.add(painelChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanelChatE.setOpaque(false);
        jPanelChatE.setPreferredSize(new java.awt.Dimension(300, 320));
        jPanelChatE.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 102, 102));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Estudantes");
        jPanelChatE.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        jComboBoxE.setBackground(new java.awt.Color(204, 204, 204));
        jComboBoxE.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBoxE.setForeground(java.awt.Color.gray);
        jPanelChatE.add(jComboBoxE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 130, -1));

        jScrollPane9.setPreferredSize(new java.awt.Dimension(280, 150));

        jListChatE.setBackground(new java.awt.Color(204, 204, 204));
        jListChatE.setForeground(java.awt.Color.gray);
        jListChatE.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane9.setViewportView(jListChatE);

        jPanelChatE.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        AtualizarE.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        AtualizarE.setForeground(new java.awt.Color(0, 0, 0));
        AtualizarE.setText("Atualizar");
        AtualizarE.setBorder(null);
        AtualizarE.setBorderPainted(false);
        AtualizarE.setPreferredSize(new java.awt.Dimension(90, 25));
        AtualizarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarEActionPerformed(evt);
            }
        });
        jPanelChatE.add(AtualizarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 90, -1));

        jButton43.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton43.setForeground(new java.awt.Color(153, 0, 0));
        jButton43.setText("Voltar");
        jButton43.setBorder(null);
        jButton43.setBorderPainted(false);
        jButton43.setContentAreaFilled(false);
        jButton43.setPreferredSize(new java.awt.Dimension(300, 30));
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        jPanelChatE.add(jButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        jPanel1.add(jPanelChatE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanelChatP.setOpaque(false);
        jPanelChatP.setPreferredSize(new java.awt.Dimension(300, 320));
        jPanelChatP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Professores");
        jPanelChatP.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, -1));

        jComboBoxP.setBackground(new java.awt.Color(204, 204, 204));
        jComboBoxP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jComboBoxP.setForeground(java.awt.Color.gray);
        jPanelChatP.add(jComboBoxP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 130, -1));

        jScrollPane10.setPreferredSize(new java.awt.Dimension(280, 150));

        jListChatP.setBackground(new java.awt.Color(204, 204, 204));
        jListChatP.setForeground(java.awt.Color.gray);
        jListChatP.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane10.setViewportView(jListChatP);

        jPanelChatP.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        AtualizarP.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        AtualizarP.setForeground(new java.awt.Color(0, 0, 0));
        AtualizarP.setText("Atualizar");
        AtualizarP.setBorder(null);
        AtualizarP.setBorderPainted(false);
        AtualizarP.setContentAreaFilled(false);
        AtualizarP.setPreferredSize(new java.awt.Dimension(90, 25));
        AtualizarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarPActionPerformed(evt);
            }
        });
        jPanelChatP.add(AtualizarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        jButton44.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton44.setForeground(new java.awt.Color(153, 0, 0));
        jButton44.setText("Voltar");
        jButton44.setBorder(null);
        jButton44.setBorderPainted(false);
        jButton44.setContentAreaFilled(false);
        jButton44.setPreferredSize(new java.awt.Dimension(300, 30));
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jPanelChatP.add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        jPanel1.add(jPanelChatP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMateriasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMateriasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int idade = Integer.parseInt(jIdade.getText());
        Instituicao instituicao = new Instituicao();
        instituicao.setNomeInstituicaoI(jInstituicao.getText());
        instituicao.setCursosI(jCursos.getText());
        instituicao.setMateriasI(jMaterias.getText());
        instituicao.setLocalizacaoI(jLocalizacao.getText());
        instituicao.setDiretorI(jDiretor.getText());
        instituicao.setAnosDaIntituicaoI(idade);
        instituicao.setContatoI(jContato.getText());
        Servico S = new Servico();
        S.atualiarInstituicao(instituicao);
        System.out.println(instituicao);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MenuChamar = new telaMenu();
        
        MenuChamar.setUsuario(getUsuario());
        MenuChamar.setEmail(getEmail());
        MenuChamar.setNome(getNome());
        
        MenuChamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        List<Instituicao> lerInstituicao = new ArrayList<>();
        Servico S = new Servico();
        lerInstituicao = S.listarInstituicaoCadastradas();
        for(Instituicao i: lerInstituicao){
            jInstituicao.setText(i.getNomeInstituicaoI());
            jCursos.setText(i.getCursosI());
            jMaterias.setText(i.getMateriasI());
            jLocalizacao.setText(i.getLocalizacaoI());
            jDiretor.setText(i.getDiretorI());
            jIdade.setText("" + i.getAnosDaIntituicaoI());
            jContato.setText(i.getContatoI());
        }
        painelPrincipal.setVisible(false);
        painelPrincipal.setEnabled(false);
        painelInstituicao.setVisible(true);
        painelInstituicao.setEnabled(true);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        painelPrincipal.setVisible(true);
        painelPrincipal.setEnabled(true);
        painelInstituicao.setVisible(false);
        painelInstituicao.setEnabled(false);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsuarioActionPerformed
        painelPrincipal.setVisible(false);
        painelPrincipal.setEnabled(false);
        painelPrincipal1.setVisible(true);
        painelPrincipal1.setEnabled(true);
    }//GEN-LAST:event_jUsuarioActionPerformed

    private void jCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalendarioActionPerformed
        painelPrincipal.setVisible(false);
        painelPrincipal.setEnabled(false);
        painelCalendario.setVisible(true);
        painelCalendario.setEnabled(true);
    }//GEN-LAST:event_jCalendarioActionPerformed

    private void jChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChatActionPerformed
        painelPrincipal.setVisible(false);
        painelPrincipal.setEnabled(false);
        painelChat.setVisible(true);
        painelChat.setEnabled(true);
    }//GEN-LAST:event_jChatActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        painelPrincipal1.setVisible(false);
        painelPrincipal1.setEnabled(false);
        painelEstudante.setVisible(true);
        painelEstudante.setEnabled(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        painelPrincipal1.setVisible(false);
        painelPrincipal1.setEnabled(false);
        painelProfessores.setVisible(true);
        painelProfessores.setEnabled(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        painelPrincipal1.setVisible(false);
        painelPrincipal1.setEnabled(false);
        painelGerencia.setVisible(true);
        painelGerencia.setEnabled(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        painelPrincipal1.setVisible(false);
        painelPrincipal1.setEnabled(false);
        painelPrincipal.setVisible(true);
        painelPrincipal.setEnabled(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        painelCalendario.setVisible(false);
        painelCalendario.setEnabled(false);
        painelPrincipal.setVisible(true);
        painelPrincipal.setEnabled(true);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        painelChat.setVisible(false);
        painelChat.setEnabled(false);
        painelPrincipal.setVisible(true);
        painelPrincipal.setEnabled(true);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        painelEstudante.setVisible(false);
        painelEstudante.setEnabled(false);
        painelPrincipal1.setVisible(true);
        painelPrincipal1.setEnabled(true);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        painelGerencia.setVisible(false);
        painelGerencia.setEnabled(false);
        painelPrincipal1.setVisible(true);
        painelPrincipal1.setEnabled(true);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        painelProfessores.setVisible(false);
        painelProfessores.setEnabled(false);
        painelPrincipal1.setVisible(true);
        painelPrincipal1.setEnabled(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        List<Professor> listarProfessor = new ArrayList<>();
        Servico S = new Servico();
        listarProfessor = S.listarProfessorCadastradas();
        dlm.clear();
        for(Professor p: listarProfessor){
            dlm.addElement(p.getNomeP()+ " - " + p.getEmailP() + " - " + p.getSenhaP()+ " - " + p.getNomeInstituicaoP()+ " - " + p.getMateriaP() + " - " + p.getCodigoCP()+ " - " + p.getIdCP());
        }
        jListProfessores.setModel(dlm);
        
        painelProfessores.setVisible(false);
        painelProfessores.setEnabled(false);
        painelProfessoresListar.setVisible(true);
        painelProfessoresListar.setEnabled(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Servico S = new Servico();
        Professor prof = new Professor();
        prof.setNomeP(jNomeP.getText());
        prof.setEmailP(jEmailP.getText());
        prof.setSenhaP(jSenhaP.getText());
        prof.setNomeInstituicaoP(jInstituicaoP.getText());
        prof.setMateriaP(jMaterialP.getText());
        prof.setCodigoCP(0);
        prof.setIdCP(0);
        S.inserirProfessor(prof);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        String x = jListProfessores.getSelectedValue();
        List<Professor> listarProfessor = new ArrayList<>();
        Servico S = new Servico();
        listarProfessor = S.listarProfessorCadastradas();
        for(Professor p: listarProfessor){
            String y = p.getNomeP()+ " - " + p.getEmailP() + " - " + p.getSenhaP()+ " - " + p.getNomeInstituicaoP()+ " - " + p.getMateriaP() + " - " + p.getCodigoCP()+ " - " + p.getIdCP();
            if(y.equalsIgnoreCase(x)){
                jNomeP.setText(p.getNomeP());
                jEmailP.setText(p.getEmailP());
                jSenhaP.setText(p.getSenhaP());
                jInstituicaoP.setText(p.getNomeInstituicaoP());
                jMaterialP.setText(p.getMateriaP());
            }
        }
        
        painelProfessoresListar.setVisible(false);
        painelProfessoresListar.setEnabled(false);
        painelProfessores.setVisible(true);
        painelProfessores.setEnabled(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        List<Professor> listarProfessor = new ArrayList<>();
        Servico S = new Servico();
        listarProfessor = S.listarProfessorCadastradas();
        Professor prof = new Professor();
        for(Professor p: listarProfessor){
            if(jEmailP.getText().equalsIgnoreCase(p.getEmailP())){
                prof.setNomeP(jNomeP.getText());
                prof.setEmailP(jEmailP.getText());
                prof.setSenhaP(jSenhaP.getText());
                prof.setNomeInstituicaoP(jInstituicaoP.getText());
                prof.setMateriaP(jMaterialP.getText());
                prof.setCodigoCP(p.getCodigoCP());
                prof.setIdCP(p.getIdCP());
                S.atualiarProfessor(prof);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Servico S = new Servico();
        Professor prof = new Professor();
        prof.setNomeP(jNomeP.getText());
        prof.setEmailP(jEmailP.getText());
        prof.setSenhaP(jSenhaP.getText());
        prof.setNomeInstituicaoP(jInstituicaoP.getText());
        prof.setMateriaP(jMaterialP.getText());
        try {
            S.deleteProfessor(prof);
            jNomeP.setText("");
            jEmailP.setText("");
            jSenhaP.setText("");
            jInstituicaoP.setText("");
            jMaterialP.setText("");
            
        } catch (Exception ex) {
            Logger.getLogger(telaGerencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        Servico S = new Servico();
        Gerencia geren = new Gerencia();
        geren.setNomeG(jNomeG.getText());
        geren.seteMailG(jEmailG.getText());
        geren.setSenhaG(jSenhaG.getText());
        S.inserirGerencia(geren);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        List<Gerencia> listarGerencia = new ArrayList<>();
        Servico S = new Servico();
        listarGerencia = S.listarGerenciaCadastradas();
        Gerencia geren = new Gerencia();
        for(Gerencia g: listarGerencia){
            if(jEmailG.getText().equalsIgnoreCase(g.geteMailG())){
                geren.setNomeG(jNomeG.getText());
                geren.seteMailG(jEmailG.getText());
                geren.setSenhaG(jSenhaG.getText());
                S.atualiarGerencia(geren);
            }
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        Servico S = new Servico();
        Gerencia geren = new Gerencia();
        geren.setNomeG(jNomeG.getText());
        geren.seteMailG(jEmailG.getText());
        geren.setSenhaG(jSenhaG.getText());
        try {
            S.deleteGerencia(geren);
            jNomeG.setText("");
            jEmailG.setText("");
            jSenhaG.setText("");
        } catch (Exception ex) {
            Logger.getLogger(telaGerencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        List<Gerencia> listarGerencia = new ArrayList<>();
        Servico S = new Servico();
        listarGerencia = S.listarGerenciaCadastradas();
        int x = 0;
        dlm.clear();
        for(Gerencia g: listarGerencia){
            dlm.addElement(g.getNomeG()+ " - " + g.geteMailG()+ " - " + g.getSenhaG());
        }
        jListGerencia.setModel(dlm);
        
        painelGerencia.setVisible(false);
        painelGerencia.setEnabled(false);
        painelGerenciaListar.setVisible(true);
        painelGerenciaListar.setEnabled(true);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        String x = jListGerencia.getSelectedValue();
        List<Gerencia> listarGerencias = new ArrayList<>();
        Servico S = new Servico();
        listarGerencias = S.listarGerenciaCadastradas();
        for(Gerencia g: listarGerencias){
            String y = g.getNomeG()+ " - " + g.geteMailG()+ " - " + g.getSenhaG();
            if(y.equalsIgnoreCase(x)){
                jNomeG.setText(g.getNomeG());
                jEmailG.setText(g.geteMailG());
                jSenhaG.setText(g.getSenhaG());
            }
        }
        painelGerencia.setVisible(true);
        painelGerencia.setEnabled(true);
        painelGerenciaListar.setVisible(false);
        painelGerenciaListar.setEnabled(false);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        Servico S = new Servico();
        Estudante estu = new Estudante();
        estu.setNomeE(jNomeE.getText());
        estu.seteMailE(jEmailE.getText());
        estu.setSenhaE(jSenhaE.getText());
        estu.setNomeInstituicaoE(jInstituicaoE.getText());
        estu.setMateriasCursandoE(jMateriasE.getText());
        estu.setCursoE(jCursosE.getText());
          
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate data = LocalDate.parse(jInicioE.getText(), formato);
        estu.setAnoInicioE(LocalDateTime.of(data, LocalTime.of(0,0)));
        LocalDate data2 = LocalDate.parse(jFimE.getText(), formato);
        estu.setAnoFinalE(LocalDateTime.of(data2, LocalTime.of(0,0)));
        estu.setCodigoCE(0);
        estu.setIdCE(0);
        
        S.inserirEstudante(estu);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        List<Estudante> listarEstudante = new ArrayList<>();
        Servico S = new Servico();
        listarEstudante = S.listarEstudantesCadastradas();
        Estudante estu = new Estudante();
        for(Estudante e: listarEstudante){
            if(jEmailE.getText().equalsIgnoreCase(e.geteMailE())){
                estu.setNomeE(jNomeE.getText());
                estu.seteMailE(jEmailE.getText());
                estu.setSenhaE(jSenhaE.getText());
                estu.setNomeInstituicaoE(jInstituicaoE.getText());
                estu.setMateriasCursandoE(jMateriasE.getText());
                estu.setCursoE(jCursosE.getText());
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
                LocalDate data = LocalDate.parse(jInicioE.getText(), formato);
                estu.setAnoInicioE(LocalDateTime.of(data, LocalTime.of(0,0)));
                LocalDate data2 = LocalDate.parse(jFimE.getText(), formato);
                estu.setAnoFinalE(LocalDateTime.of(data2, LocalTime.of(0,0)));
                
                estu.setCodigoCE(estu.getCodigoCE());
                estu.setIdCE(estu.getIdCE());
                
                S.atualiarEstudante(estu);
            }
        }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        Servico S = new Servico();
        Estudante estu = new Estudante();
        estu.setNomeE(jNomeE.getText());
        estu.seteMailE(jEmailE.getText());
        estu.setSenhaE(jSenhaE.getText());
        estu.setNomeInstituicaoE(jInstituicaoE.getText());
        estu.setMateriasCursandoE(jMateriasE.getText());
        estu.setCursoE(jCursosE.getText());
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate data = LocalDate.parse(jInicioE.getText(), formato);
        estu.setAnoInicioE(LocalDateTime.of(data, LocalTime.of(0,0)));
        LocalDate data2 = LocalDate.parse(jFimE.getText(), formato);
        estu.setAnoFinalE(LocalDateTime.of(data2, LocalTime.of(0,0)));
        
        try {
            S.deleteEstudante(estu);
            jNomeE.setText("");
            jEmailE.setText("");
            jSenhaE.setText("");
            jInstituicaoE.setText("");
            jMateriasE.setText("");
            jCursosE.setText("");
            jInicioE.setText("");
            jFimE.setText("");
            
        } catch (Exception ex) {
            Logger.getLogger(telaGerencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        List<Estudante> listarEstudante= new ArrayList<>();
        Servico S = new Servico();
        listarEstudante = S.listarEstudantesCadastradas();
        dlm.clear();
        for(Estudante e: listarEstudante){
            dlm.addElement(e.getNomeE()+ " - " + e.geteMailE()+ " - " + e.getSenhaE() + " - " + e.getNomeInstituicaoE()+ " - " + e.getMateriasCursandoE()+ " - " + e.getCursoE() + " - " + e.getAnoInicioE()+ " - " + e.getAnoFinalE() + " - " + e.getCodigoCE()+ " - " + e.getIdCE());
        }
        jListEstudantes.setModel(dlm);
        
        painelEstudante.setVisible(false);
        painelEstudante.setEnabled(false);
        painelEstudanteListar.setVisible(true);
        painelEstudanteListar.setEnabled(true);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        String x = jListEstudantes.getSelectedValue();
        List<Estudante> listarEstudante = new ArrayList<>();
        Servico S = new Servico();
        listarEstudante = S.listarEstudantesCadastradas();
        for(Estudante e: listarEstudante){
            String y = e.getNomeE()+ " - " + e.geteMailE()+ " - " + e.getSenhaE() + " - " + e.getNomeInstituicaoE()+ " - " + e.getMateriasCursandoE()+ " - " + e.getCursoE() + " - " + e.getAnoInicioE()+ " - " + e.getAnoFinalE() + " - " + e.getCodigoCE()+ " - " + e.getIdCE();
            if(y.equalsIgnoreCase(x)){
                jNomeE.setText(e.getNomeE());
                jEmailE.setText(e.geteMailE());
                jSenhaE.setText(e.getSenhaE());
                jInstituicaoE.setText(e.getNomeInstituicaoE());
                jMateriasE.setText(e.getMateriasCursandoE());
                jCursosE.setText(e.getCursoE());
                
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
                String dtFormatado = e.getAnoInicioE().format(formato);
                this.jInicioE.setText(dtFormatado);
                
                String dtFormatado2 = e.getAnoFinalE().format(formato);
                this.jFimE.setText(dtFormatado2);
            }
        }
        
        painelEstudante.setVisible(true);
        painelEstudante.setEnabled(true);
        painelEstudanteListar.setVisible(false);
        painelEstudanteListar.setEnabled(false);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        Servico S = new Servico();
        Chat chat = new Chat();
        int idAcesso = Integer.parseInt(jIdAcesso.getText());
        chat.setCodigoC(idAcesso);
        chat.setMensagensC("");
        
        S.inserirChat(chat);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIdadeActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        Servico S = new Servico();
        Chat chat = new Chat();
        int idAcesso = Integer.parseInt(jIdAcesso.getText());
        chat.setCodigoC(idAcesso);
        chat.setMensagensC("");
        
        try {
            S.deleteChat(chat);
            jIdAcesso.setText("");
        } catch (Exception ex) {
            Logger.getLogger(telaGerencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        List<Chat> listarChat= new ArrayList<>();
        Servico S = new Servico();
        listarChat = S.listarChatCadastradas();
        dlm.clear();
        for(Chat c: listarChat){
            dlm.addElement("Código: " + c.getCodigoC());
        }
        jListChat.setModel(dlm);
        
        painelChat.setVisible(false);
        painelChat.setEnabled(false);
        painelChatListar.setVisible(true);
        painelChatListar.setEnabled(true);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        String x = jListChat.getSelectedValue();
        List<Chat> listarChat = new ArrayList<>();
        Servico S = new Servico();
        listarChat = S.listarChatCadastradas();
        for(Chat c: listarChat){
            String y = ("Código: " + c.getCodigoC());
            if(y.equalsIgnoreCase(x)){
                jIdAcesso.setText("" + c.getCodigoC());
            }
        }
        painelChat.setVisible(true);
        painelChat.setEnabled(true);
        painelChatListar.setVisible(false);
        painelChatListar.setEnabled(false);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        jPanelChatE.setVisible(true);
        jPanelChatE.setEnabled(true);
        painelChat.setVisible(false);
        painelChat.setEnabled(false);
        
        List<Estudante> listarEstudante= new ArrayList<>();
        List<Chat> listarChat= new ArrayList<>();
        Servico S = new Servico();
        listarEstudante = S.listarEstudantesCadastradas();
        listarChat = S.listarChatCadastradas();
        dlm.clear();
        for(Estudante e: listarEstudante){
            dlm.addElement(e.getNomeE()+ " - " + e.geteMailE()+ " - " + e.getSenhaE() + " - " + e.getNomeInstituicaoE()+ " - " + e.getMateriasCursandoE()+ " - " + e.getCursoE() + " - " + e.getAnoInicioE()+ " - " + e.getAnoFinalE() + " - " + e.getCodigoCE()+ " - " + e.getIdCE());
        }
        jListChatE.setModel(dlm);
        
        for(Chat c: listarChat){
            jComboBoxE.addItem(c.getCodigoC() + "");
        }
        
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        jPanelChatP.setVisible(true);
        jPanelChatP.setEnabled(true);
        painelChat.setVisible(false);
        painelChat.setEnabled(false);
        
        List<Professor> listarProfessor = new ArrayList<>();
        List<Chat> listarChat= new ArrayList<>();
        Servico S = new Servico();
        listarProfessor = S.listarProfessorCadastradas();
        listarChat = S.listarChatCadastradas();
        dlm.clear();
        for(Professor p: listarProfessor){
            dlm.addElement(p.getNomeP()+ " - " + p.getEmailP() + " - " + p.getSenhaP()+ " - " + p.getNomeInstituicaoP()+ " - " + p.getMateriaP() + " - " + p.getCodigoCP()+ " - " + p.getIdCP());
        }
        jListChatP.setModel(dlm);
        
        for(Chat c: listarChat){
            jComboBoxP.addItem(c.getCodigoC() + "");
        }
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        jPanelChatE.setVisible(false);
        jPanelChatE.setEnabled(false);
        painelChat.setVisible(true);
        painelChat.setEnabled(true);
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        jPanelChatP.setVisible(false);
        jPanelChatP.setEnabled(false);
        painelChat.setVisible(true);
        painelChat.setEnabled(true);
    }//GEN-LAST:event_jButton44ActionPerformed

    private void AtualizarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarEActionPerformed
        String x = jListChatE.getSelectedValue();
        
        List<Estudante> listarEstudante = new ArrayList<>();
        Servico S = new Servico();
        listarEstudante = S.listarEstudantesCadastradas();
        for(Estudante e: listarEstudante){
            String y = e.getNomeE()+ " - " + e.geteMailE()+ " - " + e.getSenhaE() + " - " + e.getNomeInstituicaoE()+ " - " + e.getMateriasCursandoE()+ " - " + e.getCursoE() + " - " + e.getAnoInicioE()+ " - " + e.getAnoFinalE() + " - " + e.getCodigoCE()+ " - " + e.getIdCE();
            if(y.equalsIgnoreCase(x)){
                int idE = Integer.parseInt((String) jComboBoxE.getSelectedItem());
                e.setCodigoCE(idE);
                S.atualiarEstudante(e);
            }
        }
        dlm.clear();
        for(Estudante e: listarEstudante){
            dlm.addElement(e.getNomeE()+ " - " + e.geteMailE()+ " - " + e.getSenhaE() + " - " + e.getNomeInstituicaoE()+ " - " + e.getMateriasCursandoE()+ " - " + e.getCursoE() + " - " + e.getAnoInicioE()+ " - " + e.getAnoFinalE() + " - " + e.getCodigoCE()+ " - " + e.getIdCE());
        }
        jListChatE.setModel(dlm);
        
    }//GEN-LAST:event_AtualizarEActionPerformed

    private void AtualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarPActionPerformed
        String x = jListChatP.getSelectedValue();
        
        List<Professor> listarProfessor = new ArrayList<>();
        Servico S = new Servico();
        listarProfessor = S.listarProfessorCadastradas();
        for(Professor p: listarProfessor){
            String y = p.getNomeP()+ " - " + p.getEmailP() + " - " + p.getSenhaP()+ " - " + p.getNomeInstituicaoP()+ " - " + p.getMateriaP() + " - " + p.getCodigoCP()+ " - " + p.getIdCP();
            if(y.equalsIgnoreCase(x)){
                int idCP = Integer.parseInt((String) jComboBoxP.getSelectedItem());
                p.setCodigoCP(idCP);
                S.atualiarProfessor(p);
            }
        }
        dlm.clear();
        for(Professor p: listarProfessor){
            dlm.addElement(p.getNomeP()+ " - " + p.getEmailP() + " - " + p.getSenhaP()+ " - " + p.getNomeInstituicaoP()+ " - " + p.getMateriaP() + " - " + p.getCodigoCP()+ " - " + p.getIdCP());
        }
        jListChatP.setModel(dlm);
    }//GEN-LAST:event_AtualizarPActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaGerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaGerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaGerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaGerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaGerencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtualizarE;
    private javax.swing.JButton AtualizarP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
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
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jCalendario;
    private javax.swing.JButton jChat;
    private javax.swing.JComboBox<String> jComboBoxE;
    private javax.swing.JComboBox<String> jComboBoxP;
    private javax.swing.JTextField jContato;
    private javax.swing.JTextField jCursos;
    private javax.swing.JTextField jCursosE;
    private javax.swing.JTextField jDiretor;
    private javax.swing.JTextField jEmailE;
    private javax.swing.JTextField jEmailG;
    private javax.swing.JTextField jEmailP;
    private javax.swing.JFormattedTextField jFimE;
    private javax.swing.JTextField jIdAcesso;
    private javax.swing.JTextField jIdade;
    private javax.swing.JFormattedTextField jInicioE;
    private javax.swing.JTextField jInstituicao;
    private javax.swing.JTextField jInstituicaoE;
    private javax.swing.JTextField jInstituicaoP;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListCalendario;
    private javax.swing.JList<String> jListChat;
    private javax.swing.JList<String> jListChatE;
    private javax.swing.JList<String> jListChatP;
    private javax.swing.JList<String> jListEstudantes;
    private javax.swing.JList<String> jListGerencia;
    private javax.swing.JList<String> jListProfessores;
    private javax.swing.JTextField jLocalizacao;
    private javax.swing.JTextField jMaterialP;
    private javax.swing.JTextField jMaterias;
    private javax.swing.JTextField jMateriasE;
    private javax.swing.JTextField jNomeE;
    private javax.swing.JTextField jNomeG;
    private javax.swing.JTextField jNomeP;
    private javax.swing.JTextField jNomeP4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelChatE;
    private javax.swing.JPanel jPanelChatP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jSenhaE;
    private javax.swing.JTextField jSenhaG;
    private javax.swing.JTextField jSenhaP;
    private javax.swing.JButton jUsuario;
    private javax.swing.JPanel painelCalendario;
    private javax.swing.JPanel painelCalendarioListar;
    private javax.swing.JPanel painelChat;
    private javax.swing.JPanel painelChatListar;
    private javax.swing.JPanel painelEstudante;
    private javax.swing.JPanel painelEstudanteListar;
    private javax.swing.JPanel painelGerencia;
    private javax.swing.JPanel painelGerenciaListar;
    private javax.swing.JPanel painelInstituicao;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelPrincipal1;
    private javax.swing.JPanel painelProfessores;
    private javax.swing.JPanel painelProfessoresListar;
    // End of variables declaration//GEN-END:variables
}
