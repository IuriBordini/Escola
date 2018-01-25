package sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import sistema.modelo.Aluno;
import sistema.modelo.DAOAluno;
import sistema.modelo.DAOProfessor;
import sistema.modelo.Professor;

@Controller
public class SistemaController {
    
    @RequestMapping("CadastroAluno")
    public String cadastroAluno(){
        return "cadastro-aluno";
    }
  
    @RequestMapping("alunos")
    public String index(Model model){
        try{
            DAOAluno dao = new DAOAluno();
            model.addAttribute("dados", dao.getListaAluno());
        }catch(Exception e){
            model.addAttribute("mensagem","Erro ao carregar" );
        }
        return "aluno";
    }    
    
    @RequestMapping("CadastrarAluno")
    public String cadastrarAluno(Aluno aluno, Model model){
        try{
            DAOAluno dao = new DAOAluno();
            dao.cadastrar(aluno);
            model.addAttribute("mensagem","Cadastrado com sucesso" );
        }catch(Exception e){
            model.addAttribute("mensagem","Erro ao Cadastrar" );
        }
        return "cadastro-aluno";
    }
    
    @RequestMapping("ExcluirAluno /{id}")
    public String excluirAluno(@PathVariable Long id, Model model){
        try{
            DAOAluno dao = new DAOAluno();
            dao.excluir(id);
            model.addAttribute("mensagem","Excluido com sucesso" );
        }catch(Exception e){
            model.addAttribute("mensagem","Erro ao Excluir" );
        }
        return "redirect:/";
    }
 
    @RequestMapping("VisualizarAluno/{id}")
    public String visualizarAluno(@PathVariable Long id, Model model){
        try{
            DAOAluno dao = new DAOAluno();
            Aluno aluno = dao.visualizar(id);
            model.addAttribute("aluno",aluno);
            return "visualiza-aluno";
        }catch(Exception e){
            model.addAttribute("mensagem","Erro ao Excluir" );
            return "redirect:/";
        }
    }
    
    @RequestMapping("AtualizarAluno")
    public String atualizarAluno(Aluno aluno,RedirectAttributes ra, Model model){
        try{
            DAOAluno dao = new DAOAluno();
            dao.atualizar(aluno);
           ra.addFlashAttribute("mensagem","Atualizado com sucesso" );
           // model.addAttribute("mensagem","Atualizado com sucesso" );
        }catch(Exception e){
            model.addAttribute("mensagem","Erro ao atulizar" );
        }
        return "redirect:/VisualizarAluno/"+aluno.getId();
    }

@RequestMapping("CadastroProfessor")
    public String cadastroProfessor(){
        return "cadastro-professor";
    }
  
    @RequestMapping("professores")
    public String indexprofessor(Model model){
        try{
            DAOProfessor dao = new DAOProfessor();
            model.addAttribute("dados", dao.getListaProfessor());
        }catch(Exception e){
            model.addAttribute("mensagem","Erro ao carregar" );
        }
        return "professor";
    }    
    
    @RequestMapping("CadastrarProfessor")
    public String cadastrarProfessor(Professor professor, Model model){
        try{
            DAOProfessor dao = new DAOProfessor();
            dao.cadastrar(professor);
            model.addAttribute("mensagem","Cadastrado com sucesso" );
        }catch(Exception e){
            model.addAttribute("mensagem","Erro ao Cadastrar" );
        }
        return "cadastro-professor";
    }
    
    @RequestMapping("ExcluirProfessor /{id}")
    public String excluirProfessor(@PathVariable Long id, Model model){
        try{
            DAOProfessor dao = new DAOProfessor();
            dao.excluir(id);
            model.addAttribute("mensagem","Excluido com sucesso" );
        }catch(Exception e){
            model.addAttribute("mensagem","Erro ao Excluir" );
        }
        return "redirect:/";
    }
 
    @RequestMapping("VisualizarProfessor/{id}")
    public String visualizarProfessor(@PathVariable Long id, Model model){
        try{
            DAOProfessor dao = new DAOProfessor();
            Professor professor = dao.visualizar(id);
            model.addAttribute("professor",professor);
            return "visualiza-professor";
        }catch(Exception e){
            model.addAttribute("mensagem","Erro ao Excluir" );
            return "redirect:/";
        }
    }
    
    @RequestMapping("AtualizarProfessor")
    public String atualizarProvessor(Professor professor,RedirectAttributes ra, Model model){
        try{
            DAOProfessor dao = new DAOProfessor();
            dao.atualizar(professor);
           ra.addFlashAttribute("mensagem","Atualizado com sucesso" );
           // model.addAttribute("mensagem","Atualizado com sucesso" );
        }catch(Exception e){
            model.addAttribute("mensagem","Erro ao atulizar" );
        }
        return "redirect:/VisualizarProfessor/"+professor.getId();
    }
}
