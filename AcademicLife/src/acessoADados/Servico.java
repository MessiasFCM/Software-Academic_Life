package acessoADados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Calendario;
import modelo.Chat;
import modelo.Estudante;
import modelo.Gerencia;
import modelo.Instituicao;
import modelo.Professor;

public class Servico {

    private Connection c;

    private void abrirConexao() {
        Conexao conexao = new Conexao();
        this.c = conexao.getConexao();
        System.out.println("ADM: abrirConexao");
    }

    private void fechaConexao() {
        try {
            if (this.c != null && !this.c.isClosed()) {
                this.c.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void checarConexao() {
        try {
            if (this.c == null || this.c.isClosed()) {
                this.abrirConexao();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    // Calendario
    
    public void inserirCalendario(Calendario c){
        try {
            this.checarConexao();
            String sql="INSERT INTO Calendario ( idC, trabalhosC, provasC, feriadosRecessosC, inicioTerminoAulasC) "
                    + "VALUES ( ?, ?, ?, ?, ? );";
            PreparedStatement ps = this.c.prepareStatement(sql);
            ps.setInt(1, c.getIdC());
            ps.setString(2, c.getTrabalhosC());
            ps.setString(3, c.getProvasC());
            ps.setString(4, c.getFeriadosRecessosC());
            ps.setString(5, c.getInicioTerminoAulasC());
            
            ps.execute();
            this.fechaConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            this.fechaConexao();
        }
    }
    
    public List<Calendario> listarCalendarioCadastrado(){
        try {
            List<Calendario> calendario = new ArrayList<>();
            String sql = "SELECT * FROM Calendario";
            this.checarConexao();
            PreparedStatement ps = this.c.prepareStatement(sql);
            ResultSet r = ps.executeQuery();
            while(r.next()){
                int idC = r.getInt("idC");
                String trabalhosC =r.getString("trabalhosC");
                String feriadosC =r.getString("feriadosC");
                String provasC =r.getString("provasC");
                String feriasC =r.getString("feriasC");
                calendario.add( new Calendario(idC,trabalhosC,feriadosC,provasC,feriasC));
            }
            for(Calendario a: calendario){
                System.out.println(a);
            }
            this.fechaConexao();
            return calendario;
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    // Chat
    
    public void inserirChat(Chat c2){
        try {
            this.checarConexao();
            String sql="INSERT INTO Chat ( codigoC, mensagensC) "
                    + "VALUES ( ?, ? );";
            PreparedStatement ps = this.c.prepareStatement(sql);
            ps.setInt(1, c2.getCodigoC());
            ps.setString(2, c2.getMensagensC());
            
            ps.execute();
            this.fechaConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            this.fechaConexao();
        }
    }
    
    public List<Chat> listarChatCadastradas(){
        try {
            List<Chat> comunicacoes = new ArrayList<>();
            String sql = "SELECT * FROM Chat";
            this.checarConexao();
            PreparedStatement ps = this.c.prepareStatement(sql);
            ResultSet r = ps.executeQuery();
            while(r.next()){
                int codigoC = r.getInt("codigoC");
                String mensagensC =r.getString("mensagensC");
                comunicacoes.add(new Chat(codigoC,mensagensC));
            }
            for(Chat a: comunicacoes){
                System.out.println(a);
            }
            this.fechaConexao();
            return comunicacoes;
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void atualiarChat(Chat chat) {
        try {
            this.checarConexao();
            String comandoSQL="UPDATE Chat SET mensagensC = ? WHERE codigoC = ?";
            PreparedStatement ps = this.c.prepareStatement(comandoSQL);
            ps.setString(1, chat.getMensagensC());
            ps.setInt(2, chat.getCodigoC());
            ps.executeUpdate();
            System.out.println("5");
            this.fechaConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            this.fechaConexao();
        }
    }
    
    public void deleteChat(Chat chat) throws Exception {
        try {  
            this.checarConexao();
            String comandoSQL=("Delete from Chat WHERE codigoC = ?");
            PreparedStatement ps = this.c.prepareStatement(comandoSQL);
            ps.setInt(1, chat.getCodigoC());
            ps.executeUpdate();
            this.fechaConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            this.fechaConexao();
        }
                
    }
    
    // Estudante
    
    public void inserirEstudante(Estudante e){
        try {
            this.checarConexao();
            String sql="INSERT INTO Estudante ( eMailE, senhaE, nomeE, nomeInstituicaoE, materiasCursandoE, cursoE, anoInicioE, anoFinalE, codigoCE, idCE) "
                    + "VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ? );";
            PreparedStatement ps = this.c.prepareStatement(sql);
            ps.setString(1, e.geteMailE());
            ps.setString(2, e.getSenhaE());
            ps.setString(3, e.getNomeE());
            ps.setString(4, e.getNomeInstituicaoE());
            ps.setString(5, e.getMateriasCursandoE());
            ps.setString(6, e.getCursoE());
            Timestamp data = Timestamp.valueOf(e.getAnoInicioE());
            ps.setTimestamp(7, data);
            ps.setTimestamp(8, Timestamp.valueOf(e.getAnoFinalE()));
            ps.setInt(9, 0);
            ps.setInt(10, 0);
            
            ps.execute();
            this.fechaConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            this.fechaConexao();
        }
    }
    
    public List<Estudante> listarEstudantesCadastradas(){
        try {
            List<Estudante> estudante = new ArrayList<>();
            String sql = "SELECT * FROM Estudante";
            this.checarConexao();
            PreparedStatement ps = this.c.prepareStatement(sql);
            ResultSet r = ps.executeQuery();
            while(r.next()){
                String eMailE = r.getString("eMailE");
                String senhaE =r.getString("senhaE");
                String nomeE =r.getString("nomeE");
                String nomeInstituicaoE =r.getString("nomeInstituicaoE");
                String materiasCursandoE =r.getString("materiasCursandoE");
                String cursoE =r.getString("cursoE");
                LocalDateTime anoInicioE =r.getTimestamp("anoInicioE").toLocalDateTime();
                LocalDateTime anoFinalE =r.getTimestamp("anoFinalE").toLocalDateTime();
                int codigoCE = r.getInt("codigoCE");
                int idCE = r.getInt("idCE");
                estudante.add( new Estudante(eMailE, senhaE, nomeE, nomeInstituicaoE, materiasCursandoE, cursoE, anoInicioE, anoFinalE, codigoCE, idCE));
            }
            for(Estudante a: estudante){
                System.out.println(a);
            }
            this.fechaConexao();
            return estudante;
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void atualiarEstudante(Estudante estu) {
        try {
            this.checarConexao();
            String comandoSQL="UPDATE Estudante SET senhaE = ?, nomeE = ?, nomeInstituicaoE = ?, materiasCursandoE = ?, cursoE = ?, anoInicioE = ?, anoFinalE= ?, codigoCE= ?, idCE= ? WHERE emailE = ?";
            PreparedStatement ps = this.c.prepareStatement(comandoSQL);
            ps.setString(1, estu.getSenhaE());
            ps.setString(2, estu.getNomeE());
            ps.setString(3, estu.getNomeInstituicaoE());
            ps.setString(4, estu.getMateriasCursandoE());
            ps.setString(5, estu.getCursoE());
            ps.setTimestamp(6, Timestamp.valueOf(estu.getAnoInicioE()));
            ps.setTimestamp(7, Timestamp.valueOf(estu.getAnoFinalE()));
            ps.setInt(8, estu.getCodigoCE());
            ps.setInt(9, estu.getIdCE());
            ps.setString(10, estu.geteMailE());
            
            ps.executeUpdate();
            this.fechaConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            this.fechaConexao();
        }
    }
    
    public void deleteEstudante(Estudante estu) throws Exception {
        try {  
            this.checarConexao();
            String comandoSQL=("Delete from Estudante WHERE eMailE = ?");
            PreparedStatement ps = this.c.prepareStatement(comandoSQL);
            ps.setString(1, estu.geteMailE());
            ps.executeUpdate();
            this.fechaConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            this.fechaConexao();
        }
                
    }
    
    // Gerencia
    
    public void inserirGerencia(Gerencia g){
        try {
            this.checarConexao();
            String sql="INSERT INTO Gerencia ( emailG, senhaG, nomeG) "
                    + "VALUES ( ?, ?, ? );";
            PreparedStatement ps = this.c.prepareStatement(sql);
            ps.setString(1, g.geteMailG());
            ps.setString(2, g.getSenhaG());
            ps.setString(3, g.getNomeG());
            
            ps.execute();
            this.fechaConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            this.fechaConexao();
        }
    }
    
    public List<Gerencia> listarGerenciaCadastradas(){
        try {
            List<Gerencia> gerencia = new ArrayList<>();
            String sql = "SELECT * FROM Gerencia";
            this.checarConexao();
            PreparedStatement ps = this.c.prepareStatement(sql);
            ResultSet r = ps.executeQuery();
            while(r.next()){
                String eMailG = r.getString("eMailG");
                String senhaG =r.getString("senhaG");
                String nomeG =r.getString("nomeG");
                gerencia.add( new Gerencia(eMailG,senhaG,nomeG));
            }
            for(Gerencia a: gerencia){
                System.out.println(a);
            }
            this.fechaConexao();
            return gerencia;
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void atualiarGerencia(Gerencia geren) {
        try {
            this.checarConexao();
            String comandoSQL="UPDATE Gerencia SET senhaG = ?, nomeG = ? WHERE emailG = ?";
            PreparedStatement ps = this.c.prepareStatement(comandoSQL);
            ps.setString(1, geren.getSenhaG());
            ps.setString(2, geren.getNomeG());
            ps.setString(3, geren.geteMailG());
            ps.executeUpdate();
            this.fechaConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            this.fechaConexao();
        }
    }
    
    public void deleteGerencia(Gerencia geren) throws Exception {
        try {  
            this.checarConexao();
            String comandoSQL=("Delete from Gerencia WHERE emailG = ?");
            PreparedStatement ps = this.c.prepareStatement(comandoSQL);
            ps.setString(1, geren.geteMailG());
            ps.executeUpdate();
            this.fechaConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            this.fechaConexao();
        }
                
    }
    
    // Instituição
    
    public void inserirInstituicao(Instituicao i){
        try {
            this.checarConexao();
            String sql="INSERT INTO Instituicao ( nomeInstituicao, cursosI, materiasI, localizacaoI, diretorI, anosDaIntituicaoI, contatoI) "
                    + "VALUES ( ?, ?, ?, ?, ?, ?, ? );";
            PreparedStatement ps = this.c.prepareStatement(sql);
            ps.setString(1, i.getNomeInstituicaoI());
            ps.setString(2, i.getCursosI());
            ps.setString(3, i.getMateriasI());
            ps.setString(4, i.getLocalizacaoI());
            ps.setString(5, i.getDiretorI());
            ps.setInt(6, i.getAnosDaIntituicaoI());
            ps.setString(7, i.getContatoI());
            
            ps.execute();
            this.fechaConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            this.fechaConexao();
        }
    }
    
    public List<Instituicao> listarInstituicaoCadastradas(){
        try {
            List<Instituicao> instituicao = new ArrayList<>();
            String sql = "SELECT * FROM Instituicao";
            this.checarConexao();
            PreparedStatement ps = this.c.prepareStatement(sql);
            ResultSet r = ps.executeQuery();
            while(r.next()){
                String nomeInstituicao = r.getString("nomeInstituicaoI");
                String cursosI =r.getString("cursosI");
                String materiasI =r.getString("materiasI");
                String localizacaoI =r.getString("localizacaoI");
                String diretorI =r.getString("diretorI");
                int anosDaIntituicaoI =r.getInt("anosDaIntituicaoI");
                String contatoI =r.getString("contatoI");
                instituicao.add( new Instituicao(nomeInstituicao,cursosI,materiasI,localizacaoI,diretorI,anosDaIntituicaoI,contatoI));
            }
            for(Instituicao a: instituicao){
                System.out.println(a);
            }
            this.fechaConexao();
            return instituicao;
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void atualiarInstituicao(Instituicao inst) {
        try {
            this.checarConexao();
            String comandoSQL="UPDATE Instituicao SET nomeInstituicaoI = ?, cursosI = ?, materiasI = ?, localizacaoI = ?, diretorI = ?, anosDaIntituicaoI = ?, contatoI = ? ";
            PreparedStatement ps = this.c.prepareStatement(comandoSQL);    
            ps.setString(1, inst.getNomeInstituicaoI());
            ps.setString(2, inst.getCursosI());
            ps.setString(3, inst.getMateriasI());
            ps.setString(4, inst.getLocalizacaoI());
            ps.setString(5, inst.getDiretorI());
            ps.setInt(6, inst.getAnosDaIntituicaoI());
            ps.setString(7, inst.getContatoI());
            ps.executeUpdate();
            this.fechaConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            this.fechaConexao();
        }
    }
    
    
    // Professor
    
    public void inserirProfessor(Professor prof){
        try {
            this.checarConexao();
            String sql="INSERT INTO Professor ( emailP, senhaP, nomeP, nomeInstituicaoP, materiaP, codigoCP, idCP) "
                    + "VALUES ( ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = this.c.prepareStatement(sql);
            ps.setString(1, prof.getEmailP());
            ps.setString(2, prof.getSenhaP());
            ps.setString(3, prof.getNomeP());
            ps.setString(4, prof.getNomeInstituicaoP());
            ps.setString(5, prof.getMateriaP());
            ps.setInt(6, 0);
            ps.setInt(7, 0);
            
            ps.execute();
            this.fechaConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            this.fechaConexao();
        }
    }
    
    public List<Professor> listarProfessorCadastradas(){
        try {
            List<Professor> professor = new ArrayList<>();
            String sql = "SELECT * FROM Professor";
            this.checarConexao();
            PreparedStatement ps = this.c.prepareStatement(sql);
            ResultSet r = ps.executeQuery();
            while(r.next()){
                String emailP = r.getString("emailP");
                String senhaP =r.getString("senhaP");
                String nomeP =r.getString("nomeP");
                String nomeInstituicaoP =r.getString("nomeInstituicaoP");
                String materiaP =r.getString("materiaP");
                int codigoCP = r.getInt("codigoCP");
                int idCP = r.getInt("idCP");
                professor.add( new Professor(emailP,senhaP,nomeP,nomeInstituicaoP,materiaP,codigoCP, idCP));
            }
            for(Professor a: professor){
                System.out.println(a);
            }
            this.fechaConexao();
            return professor;
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public void atualiarProfessor(Professor prof) {
        try {
            this.checarConexao();
            String comandoSQL="UPDATE Professor SET senhaP = ?, nomeP = ?, nomeInstituicaoP = ?, materiaP = ?,codigoCP= ?, idCP= ? WHERE emailP = ?";
            PreparedStatement ps = this.c.prepareStatement(comandoSQL);
            ps.setString(1, prof.getSenhaP());
            ps.setString(2, prof.getNomeP());
            ps.setString(3, prof.getNomeInstituicaoP());
            ps.setString(4, prof.getMateriaP());
            ps.setInt(5, prof.getCodigoCP());
            ps.setInt(6, prof.getIdCP());
            ps.setString(7, prof.getEmailP());
            
            ps.executeUpdate();
            this.fechaConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            this.fechaConexao();
        }
    }
    
    public void deleteProfessor(Professor prof) throws Exception {
        try {  
            this.checarConexao();
            String comandoSQL=("Delete from Professor WHERE emailP = ?");
            PreparedStatement ps = this.c.prepareStatement(comandoSQL);
            ps.setString(1, prof.getEmailP());
            ps.executeUpdate();
            this.fechaConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Servico.class.getName()).log(Level.SEVERE, null, ex);
            this.fechaConexao();
        }
                
    }
    
   
}
