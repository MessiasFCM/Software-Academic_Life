package telas;

import acessoADados.Servico;
import java.awt.Color;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import modelo.Estudante;
import modelo.Professor;
import modelo.Gerencia;
import modelo.Instituicao;

public class telaInformacoes extends javax.swing.JFrame {

    telaMenu MenuChamar;
    public String email, nome;
    public int usuario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("Nome - " + nome);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        System.out.println("Email - " + email);
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
        System.out.println("Usuario - " + usuario);
        Servico S = new Servico();
        
        if(usuario == 0){
            List<Estudante> carregarEstudante = new ArrayList<>();
            carregarEstudante = S.listarEstudantesCadastradas();
            List<Instituicao> carregarInstituicao = new ArrayList<>();
            carregarInstituicao = S.listarInstituicaoCadastradas();
            painelEstudante.setVisible(true);
            painelEstudante.setEnabled(true);
            painelProfessor.setVisible(false);
            painelProfessor.setEnabled(false);
            painelGerencia.setVisible(false);
            painelGerencia.setEnabled(false);
            for(Estudante estudante: carregarEstudante){
                if(email.equalsIgnoreCase(estudante.geteMailE())){
                    jNomeE.setText(estudante.getNomeE());
                    jEmailE.setText(estudante.geteMailE());
                    jMateriasE.setText(estudante.getMateriasCursandoE());
                    jCursosE.setText(estudante.getCursoE());
                    
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    
                    LocalDate data = LocalDate.parse(estudante.getAnoInicioE().format(formato), formato);
                    LocalDate data2 = LocalDate.parse(estudante.getAnoFinalE().format(formato), formato);
                    
                    
                    jInicioFimE.setText(data + " / " + data2);
                
              
                }
            }
            for(Instituicao instituicao: carregarInstituicao){
                jInstituicaoE.setText(instituicao.getNomeInstituicaoI());
                jLocalizacao.setText(instituicao.getLocalizacaoI());
                jDiretor.setText(instituicao.getDiretorI());
                jContato.setText(instituicao.getContatoI());
            }
        }
        if(usuario == 1){
            List<Professor> carregarProfessor = new ArrayList<>();
            carregarProfessor = S.listarProfessorCadastradas();
            List<Instituicao> carregarInstituicao = new ArrayList<>();
            carregarInstituicao = S.listarInstituicaoCadastradas();
            painelEstudante.setVisible(false);
            painelEstudante.setEnabled(false);
            painelProfessor.setVisible(true);
            painelProfessor.setEnabled(true);
            painelGerencia.setVisible(false);
            painelGerencia.setEnabled(false);
            for(Professor professor: carregarProfessor){
                if(email.equalsIgnoreCase(professor.getEmailP())){
                    jNomeP.setText(professor.getNomeP());
                    jEmailP.setText(professor.getEmailP());
                    jMateriaP.setText(professor.getMateriaP());
                }
            }
            for(Instituicao instituicao: carregarInstituicao){
                jInstituicaoP.setText(instituicao.getNomeInstituicaoI());
                jLocalizacaoP.setText(instituicao.getLocalizacaoI());
                jDiretorP.setText(instituicao.getDiretorI());
                jContatoP.setText(instituicao.getContatoI());
            }
        }
        if(usuario == 2){
            List<Gerencia> carregarGerencia = new ArrayList<>();
            carregarGerencia = S.listarGerenciaCadastradas();
            List<Instituicao> carregarInstituicao = new ArrayList<>();
            carregarInstituicao = S.listarInstituicaoCadastradas();
            painelEstudante.setVisible(false);
            painelEstudante.setEnabled(false);
            painelProfessor.setVisible(false);
            painelProfessor.setEnabled(false);
            painelGerencia.setVisible(true);
            painelGerencia.setEnabled(true);
            for(Gerencia gere: carregarGerencia){
                if(email.equalsIgnoreCase(gere.geteMailG())){
                    jEmailG.setText(gere.geteMailG());
                    jNomeG.setText(gere.getNomeG());
                }
            }
            for(Instituicao instituicao: carregarInstituicao){
                jInstituicaoG.setText(instituicao.getNomeInstituicaoI());
                jCursosG.setText(instituicao.getCursosI());
                jMateriasG.setText(instituicao.getMateriasI());
                jLocalizacaoG.setText(instituicao.getLocalizacaoI());
                jDiretorG.setText(instituicao.getDiretorI());
                jIdadeG.setText("" + instituicao.getAnosDaIntituicaoI());
                jContatoG.setText(instituicao.getContatoI());
            }
        }
    }
    
    public telaInformacoes() {
        initComponents();
        setLocationRelativeTo(null);
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        painelGerencia = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jContatoG = new javax.swing.JLabel();
        jInstituicaoG = new javax.swing.JLabel();
        jDiretorG = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jIdadeG = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLocalizacaoG = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jMateriasG = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jCursosG = new javax.swing.JLabel();
        jEmailG = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jNomeG = new javax.swing.JLabel();
        painelProfessor = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jInstituicaoP = new javax.swing.JLabel();
        jNomeP = new javax.swing.JLabel();
        jEmailP = new javax.swing.JLabel();
        jMateriaP = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLocalizacaoP = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jDiretorP = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jContatoP = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jPasswordP = new javax.swing.JPasswordField();
        jAlterarP = new javax.swing.JButton();
        painelEstudante = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jNomeE = new javax.swing.JLabel();
        jEmailE = new javax.swing.JLabel();
        jMateriasE = new javax.swing.JLabel();
        jDiretor = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jInstituicaoE = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jCursosE = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jInicioFimE = new javax.swing.JLabel();
        jContato = new javax.swing.JLabel();
        jLocalizacao = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jAlterarE = new javax.swing.JButton();
        jPasswordE = new javax.swing.JPasswordField();
        jLabel59 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Academic Life");
        setMinimumSize(new java.awt.Dimension(320, 340));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(320, 340));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelGerencia.setOpaque(false);
        painelGerencia.setPreferredSize(new java.awt.Dimension(300, 320));
        painelGerencia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel58.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setText("Informações da Instituição");
        jLabel58.setToolTipText("");
        painelGerencia.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 290, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("E-Mail");
        painelGerencia.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Instituição");
        painelGerencia.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Diretor");
        painelGerencia.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 90, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Contato");
        painelGerencia.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 90, -1));

        jButton4.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 0, 0));
        jButton4.setText("Voltar");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setPreferredSize(new java.awt.Dimension(110, 30));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        painelGerencia.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 110, 30));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Perfil");
        jLabel18.setPreferredSize(new java.awt.Dimension(220, 25));
        painelGerencia.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, -1));

        jContatoG.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jContatoG.setForeground(new java.awt.Color(102, 102, 102));
        jContatoG.setText("texto");
        painelGerencia.add(jContatoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 190, -1));

        jInstituicaoG.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jInstituicaoG.setForeground(new java.awt.Color(102, 102, 102));
        jInstituicaoG.setText("texto");
        painelGerencia.add(jInstituicaoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 190, -1));

        jDiretorG.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jDiretorG.setForeground(new java.awt.Color(102, 102, 102));
        jDiretorG.setText("texto");
        painelGerencia.add(jDiretorG, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 190, -1));

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Idade Inst.");
        painelGerencia.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 90, -1));

        jIdadeG.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jIdadeG.setForeground(new java.awt.Color(102, 102, 102));
        jIdadeG.setText("texto");
        painelGerencia.add(jIdadeG, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 190, -1));

        jLabel41.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("Localização");
        painelGerencia.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 100, -1));

        jLocalizacaoG.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLocalizacaoG.setForeground(new java.awt.Color(102, 102, 102));
        jLocalizacaoG.setText("texto");
        painelGerencia.add(jLocalizacaoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 190, -1));

        jLabel45.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("Matérias");
        painelGerencia.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, -1));

        jMateriasG.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jMateriasG.setForeground(new java.awt.Color(102, 102, 102));
        jMateriasG.setText("texto");
        painelGerencia.add(jMateriasG, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 190, -1));

        jLabel47.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setText("Cursos");
        painelGerencia.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, -1));

        jCursosG.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jCursosG.setForeground(new java.awt.Color(102, 102, 102));
        jCursosG.setText("texto");
        painelGerencia.add(jCursosG, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 190, 20));

        jEmailG.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jEmailG.setForeground(new java.awt.Color(102, 102, 102));
        jEmailG.setText("texto");
        painelGerencia.add(jEmailG, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 190, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nome");
        painelGerencia.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, -1));

        jNomeG.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jNomeG.setForeground(new java.awt.Color(102, 102, 102));
        jNomeG.setText("texto");
        painelGerencia.add(jNomeG, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 190, -1));

        jPanel1.add(painelGerencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        painelProfessor.setOpaque(false);
        painelProfessor.setPreferredSize(new java.awt.Dimension(300, 320));
        painelProfessor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Nome");
        painelProfessor.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("E-Mail");
        painelProfessor.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Instituição");
        painelProfessor.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 80, -1));

        jButton3.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 0, 0));
        jButton3.setText("Voltar");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setPreferredSize(new java.awt.Dimension(110, 30));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        painelProfessor.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, 30));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Perfil");
        jLabel12.setPreferredSize(new java.awt.Dimension(220, 25));
        painelProfessor.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, -1));

        jInstituicaoP.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jInstituicaoP.setForeground(new java.awt.Color(102, 102, 102));
        jInstituicaoP.setText("texto");
        painelProfessor.add(jInstituicaoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 190, -1));

        jNomeP.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jNomeP.setForeground(new java.awt.Color(102, 102, 102));
        jNomeP.setText("texto");
        painelProfessor.add(jNomeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 190, -1));

        jEmailP.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jEmailP.setForeground(new java.awt.Color(102, 102, 102));
        jEmailP.setText("texto");
        painelProfessor.add(jEmailP, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 190, -1));

        jMateriaP.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jMateriaP.setForeground(new java.awt.Color(102, 102, 102));
        jMateriaP.setText("texto");
        painelProfessor.add(jMateriaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 91, 190, 20));

        jLabel53.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setText("Matéria");
        painelProfessor.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, -1));

        jLabel54.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setText("Informações da Instituição");
        jLabel54.setToolTipText("");
        painelProfessor.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 290, -1));

        jLocalizacaoP.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLocalizacaoP.setForeground(new java.awt.Color(102, 102, 102));
        jLocalizacaoP.setText("texto");
        painelProfessor.add(jLocalizacaoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 190, -1));

        jLabel55.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setText("Diretor");
        painelProfessor.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 80, -1));

        jDiretorP.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jDiretorP.setForeground(new java.awt.Color(102, 102, 102));
        jDiretorP.setText("texto");
        painelProfessor.add(jDiretorP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 190, 20));

        jLabel56.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 0, 0));
        jLabel56.setText("Contato");
        painelProfessor.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 80, -1));

        jContatoP.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jContatoP.setForeground(new java.awt.Color(102, 102, 102));
        jContatoP.setText("texto");
        painelProfessor.add(jContatoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 190, -1));

        jLabel57.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setText("Localização");
        painelProfessor.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jPasswordP.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordP.setForeground(java.awt.Color.gray);
        jPasswordP.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jPasswordP.setPreferredSize(new java.awt.Dimension(170, 21));
        painelProfessor.add(jPasswordP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jAlterarP.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jAlterarP.setForeground(new java.awt.Color(0, 153, 0));
        jAlterarP.setText("Alterar Senha");
        jAlterarP.setBorder(null);
        jAlterarP.setBorderPainted(false);
        jAlterarP.setContentAreaFilled(false);
        jAlterarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jAlterarPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jAlterarPMouseExited(evt);
            }
        });
        jAlterarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlterarPActionPerformed(evt);
            }
        });
        painelProfessor.add(jAlterarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jPanel1.add(painelProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        painelEstudante.setOpaque(false);
        painelEstudante.setPreferredSize(new java.awt.Dimension(300, 320));
        painelEstudante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nome");
        painelEstudante.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("E-Mail");
        painelEstudante.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Materias");
        painelEstudante.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Diretor");
        painelEstudante.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 80, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Contato");
        painelEstudante.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 80, -1));

        jButton2.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 0));
        jButton2.setText("Voltar");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setPreferredSize(new java.awt.Dimension(110, 30));
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
        painelEstudante.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Perfil");
        jLabel6.setPreferredSize(new java.awt.Dimension(220, 25));
        painelEstudante.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, -1));

        jNomeE.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jNomeE.setForeground(new java.awt.Color(102, 102, 102));
        jNomeE.setText("texto");
        painelEstudante.add(jNomeE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 190, -1));

        jEmailE.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jEmailE.setForeground(new java.awt.Color(102, 102, 102));
        jEmailE.setText("texto");
        painelEstudante.add(jEmailE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 190, -1));

        jMateriasE.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jMateriasE.setForeground(new java.awt.Color(102, 102, 102));
        jMateriasE.setText("texto");
        painelEstudante.add(jMateriasE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 190, -1));

        jDiretor.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jDiretor.setForeground(new java.awt.Color(102, 102, 102));
        jDiretor.setText("texto");
        painelEstudante.add(jDiretor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 190, -1));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Instituição");
        painelEstudante.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 80, -1));

        jInstituicaoE.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jInstituicaoE.setForeground(new java.awt.Color(102, 102, 102));
        jInstituicaoE.setText("texto");
        painelEstudante.add(jInstituicaoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 190, -1));

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Curso");
        painelEstudante.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 80, -1));

        jCursosE.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jCursosE.setForeground(new java.awt.Color(102, 102, 102));
        jCursosE.setText("texto");
        painelEstudante.add(jCursosE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 190, -1));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Inicio/Fim");
        painelEstudante.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jInicioFimE.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jInicioFimE.setForeground(new java.awt.Color(102, 102, 102));
        jInicioFimE.setText("texto");
        painelEstudante.add(jInicioFimE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 190, -1));

        jContato.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jContato.setForeground(new java.awt.Color(102, 102, 102));
        jContato.setText("texto");
        jContato.setToolTipText("");
        painelEstudante.add(jContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 190, -1));

        jLocalizacao.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLocalizacao.setForeground(new java.awt.Color(102, 102, 102));
        jLocalizacao.setText("texto");
        painelEstudante.add(jLocalizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 190, -1));

        jLabel44.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("Localização");
        painelEstudante.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jAlterarE.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jAlterarE.setForeground(new java.awt.Color(0, 153, 0));
        jAlterarE.setText("Alterar Senha");
        jAlterarE.setBorder(null);
        jAlterarE.setBorderPainted(false);
        jAlterarE.setContentAreaFilled(false);
        jAlterarE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jAlterarEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jAlterarEMouseExited(evt);
            }
        });
        jAlterarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlterarEActionPerformed(evt);
            }
        });
        painelEstudante.add(jAlterarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 155, -1, -1));

        jPasswordE.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordE.setForeground(java.awt.Color.gray);
        jPasswordE.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 4, 1, 1));
        jPasswordE.setPreferredSize(new java.awt.Dimension(170, 21));
        painelEstudante.add(jPasswordE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 155, -1, -1));

        jLabel59.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setText("Informações da Instituição");
        jLabel59.setToolTipText("");
        painelEstudante.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 280, -1));

        jPanel1.add(painelEstudante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MenuChamar = new telaMenu();
        
        MenuChamar.setUsuario(getUsuario());
        MenuChamar.setEmail(getEmail());
        MenuChamar.setNome(getNome());
        
        MenuChamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MenuChamar = new telaMenu();
        
        MenuChamar.setUsuario(getUsuario());
        MenuChamar.setEmail(getEmail());
        MenuChamar.setNome(getNome());
        
        MenuChamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MenuChamar = new telaMenu();
        
        MenuChamar.setUsuario(getUsuario());
        MenuChamar.setEmail(getEmail());
        MenuChamar.setNome(getNome());
        
        MenuChamar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jAlterarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlterarPActionPerformed
        Servico S = new Servico();
        String senha = new String(jPasswordP.getPassword());
        List<Professor> checarProfessor= new ArrayList<>();
        checarProfessor = S.listarProfessorCadastradas();
        
        for(Professor p: checarProfessor){
            if(p.getEmailP().equalsIgnoreCase(getEmail())){
                p.setNomeP(p.getNomeP());
                p.setEmailP(p.getEmailP());
                p.setNomeInstituicaoP(p.getNomeInstituicaoP());
                p.setMateriaP(p.getMateriaP());
                
                p.setSenhaP(senha);
                S.atualiarProfessor(p);
                jPasswordP.setText("");
            }
        }
    }//GEN-LAST:event_jAlterarPActionPerformed

    private void jAlterarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlterarEActionPerformed
        Servico S = new Servico();
        String senha = new String(jPasswordE.getPassword());
        List<Estudante> checarEstudante= new ArrayList<>();
        checarEstudante = S.listarEstudantesCadastradas();
        
        for(Estudante e: checarEstudante){
            if(e.geteMailE().equalsIgnoreCase(getEmail())){
                
                e.setNomeE(e.getNomeE());
                e.seteMailE(e.geteMailE());
                e.setNomeInstituicaoE(e.getNomeInstituicaoE());
                e.setMateriasCursandoE(e.getMateriasCursandoE());
                e.setCursoE(e.getCursoE());
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
                LocalDate data = LocalDate.parse(e.getAnoInicioE().format(formato), formato);
                LocalDate data2 = LocalDate.parse(e.getAnoFinalE().format(formato), formato);
                
                e.setAnoInicioE(LocalDateTime.of(data, LocalTime.of(0,0)));
                e.setAnoFinalE(LocalDateTime.of(data2, LocalTime.of(0,0)));
                
                e.setCodigoCE(e.getCodigoCE());
                e.setIdCE(e.getIdCE());
                
                e.setSenhaE(senha);
                S.atualiarEstudante(e);
                jPasswordE.setText("");
            }
        }
    }//GEN-LAST:event_jAlterarEActionPerformed

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setForeground(new Color(255,102,102));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        jButton4.setForeground(new Color(153,0,0));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setForeground(new Color(255,102,102));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setForeground(new Color(153,0,0));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setForeground(new Color(255,102,102));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setForeground(new Color(153,0,0));
    }//GEN-LAST:event_jButton2MouseExited

    private void jAlterarEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAlterarEMouseEntered
        jAlterarE.setForeground(new Color(153,255,153));
    }//GEN-LAST:event_jAlterarEMouseEntered

    private void jAlterarEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAlterarEMouseExited
        jAlterarE.setForeground(new Color(0,153,0));
    }//GEN-LAST:event_jAlterarEMouseExited

    private void jAlterarPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAlterarPMouseEntered
        jAlterarP.setForeground(new Color(153,255,153));
    }//GEN-LAST:event_jAlterarPMouseEntered

    private void jAlterarPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAlterarPMouseExited
        jAlterarP.setForeground(new Color(0,153,0));
    }//GEN-LAST:event_jAlterarPMouseExited

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaInformacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaInformacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaInformacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaInformacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaInformacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAlterarE;
    private javax.swing.JButton jAlterarP;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jContato;
    private javax.swing.JLabel jContatoG;
    private javax.swing.JLabel jContatoP;
    private javax.swing.JLabel jCursosE;
    private javax.swing.JLabel jCursosG;
    private javax.swing.JLabel jDiretor;
    private javax.swing.JLabel jDiretorG;
    private javax.swing.JLabel jDiretorP;
    private javax.swing.JLabel jEmailE;
    private javax.swing.JLabel jEmailG;
    private javax.swing.JLabel jEmailP;
    private javax.swing.JLabel jIdadeG;
    private javax.swing.JLabel jInicioFimE;
    private javax.swing.JLabel jInstituicaoE;
    private javax.swing.JLabel jInstituicaoG;
    private javax.swing.JLabel jInstituicaoP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLocalizacao;
    private javax.swing.JLabel jLocalizacaoG;
    private javax.swing.JLabel jLocalizacaoP;
    private javax.swing.JLabel jMateriaP;
    private javax.swing.JLabel jMateriasE;
    private javax.swing.JLabel jMateriasG;
    private javax.swing.JLabel jNomeE;
    private javax.swing.JLabel jNomeG;
    private javax.swing.JLabel jNomeP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordE;
    private javax.swing.JPasswordField jPasswordP;
    private javax.swing.JPanel painelEstudante;
    private javax.swing.JPanel painelGerencia;
    private javax.swing.JPanel painelProfessor;
    // End of variables declaration//GEN-END:variables
}
