package sistema.modelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOAluno extends Conexao{
    public void cadastrar(Aluno aluno) throws SQLException{
        String sql = "INSERT INTO aluno VALUES(default,?,?,?,?)";
        PreparedStatement st = getConnection().prepareStatement(sql);
        st.setString(1, aluno.getNome());
        st.setString(2, aluno.getMatricula());
        st.setString(3, aluno.getEndereco());
        st.setString(4, aluno.getTelefone());
        st.execute();
    }
    
    public List<Aluno> getListaAluno() throws SQLException{
        
        String sql = "select * from aluno";
        PreparedStatement st = getConnection().prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        List<Aluno> lista = new ArrayList<Aluno>();
        while(rs.next()){
            Aluno a = new Aluno();
            a.setId(rs.getLong(1));
            a.setNome(rs.getString(2));
            a.setMatricula(rs.getString(3));
            a.setEndereco(rs.getString(4));
            a.setTelefone(rs.getString(5));
            lista.add(a);
        }
        return lista;
    }
    
    public void excluir(long id) throws SQLException{
        String sql = "DELETE FROM aluno WHERE id = ?";
        PreparedStatement st = 
                getConnection().prepareStatement(sql);
        st.setLong(1, id); 
        st.execute();
    }
 
    
public Aluno visualizar(long id) throws SQLException{   
        String sql = "select * from aluno where id = ?";
        PreparedStatement st = getConnection().prepareStatement(sql);
        st.setLong(1, id);
        ResultSet rs = st.executeQuery();
        Aluno a = new Aluno();
        while(rs.next()){
            a.setId(rs.getLong(1));
            a.setNome(rs.getString(2));
            a.setMatricula(rs.getString(3));
            a.setEndereco(rs.getString(4));
            a.setTelefone(rs.getString(5));
        }
        return a;
    }
 public void atualizar(Aluno aluno) throws SQLException{
        String sql = "update aluno set "
                +"nome=?,matricula=?,endereco=?,telefone=?"
                +"where id = ?";
        PreparedStatement st = getConnection().prepareStatement(sql);
        st.setString(1, aluno.getNome());
        st.setString(2, aluno.getMatricula());
        st.setString(3, aluno.getEndereco());
        st.setString(4, aluno.getTelefone());
        st.setLong(5,aluno.getId());
        st.execute();
    }
}

