package acessoADados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    
    Connection c;

    public Connection getConexao(){
        try {
            String url="jdbc:postgresql://108.166.210.245/aula";
            String usuario="aula";
            String senha="aula";
            this.c = DriverManager.getConnection(url, usuario, senha);
            this.c.setSchema("messias_feres");
            System.out.println("ADM: getConexao");
            return c;
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
