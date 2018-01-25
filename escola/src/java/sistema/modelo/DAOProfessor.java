package sistema.modelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOProfessor extends Conexao{
    public void cadastrar(Professor professor) throws SQLException{
        String sql = "INSERT INTO professor VALUES(default,?,?,?,?)";
        PreparedStatement st = getConnection().prepareStatement(sql);
        st.setString(1, professor.getNome());
        st.setString(2, professor.getArea());
        st.setDouble(3, professor.getSalario());
        st.setString(4, professor.getEmail());
        st.execute();
    }
    
    public List<Professor> getListaProfessor() throws SQLException{
        
        String sql = "select * from professor";
        PreparedStatement st = getConnection().prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        List<Professor> lista = new ArrayList<Professor>();
        while(rs.next()){
            Professor a = new Professor();
            a.setId(rs.getLong(1));
            a.setNome(rs.getString(2));
            a.setArea(rs.getString(3));
            a.setSalario(rs.getDouble(4));
            a.setEmail(rs.getString(5));
            lista.add(a);
        }
        return lista;
    }
    
    public void excluir(long id) throws SQLException{
        String sql = "DELETE FROM professor WHERE id = ?";
        PreparedStatement st = 
                getConnection().prepareStatement(sql);
        st.setLong(1, id); 
        st.execute();
    }
 
    
public Professor visualizar(long id) throws SQLException{   
        String sql = "select * from professor where id = ?";
        PreparedStatement st = getConnection().prepareStatement(sql);
        st.setLong(1, id);
        ResultSet rs = st.executeQuery();
       Professor a = new Professor();
        while(rs.next()){
            a.setId(rs.getLong(1));
            a.setNome(rs.getString(2));
            a.setArea(rs.getString(3));
            a.setSalario(rs.getDouble(4));
            a.setEmail(rs.getString(5));
        }
        return a;
    }
 public void atualizar(Professor professor) throws SQLException{
        String sql = "update professor set "
                +"nome=?,area=?,salario=?,email=?"
                +"where id = ?";
        PreparedStatement st = getConnection().prepareStatement(sql);
        st.setString(1, professor.getNome());
        st.setString(2, professor.getArea());
        st.setDouble(3, professor.getSalario());
        st.setString(4, professor.getEmail());
        st.setLong(5,professor.getId());
        st.execute();
    }
}

