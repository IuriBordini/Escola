package sistema.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String BANCO = "escola";
    private final String URL = "jdbc:mysql://localhost:3306/" + BANCO;
    private final String LOGIN = "root";
    private final String SENHA = "";

    private Connection connection = null;

    public Connection getConnection() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, LOGIN, SENHA);
        } catch(ClassNotFoundException ex){
            connection = null;
            ex.printStackTrace();
        } catch(SQLException ex1) {
            connection = null;
            ex1.printStackTrace();
        }

        return connection;
    }
    
    public void fecharConexao(){
        try {
            connection.close();
        } catch (SQLException ex) {
            System.out.println("Erro");
            ex.printStackTrace();
        }
    }
    
}
