package sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TesteController {
    
    @RequestMapping("RecebeDados")
    public String recebeDados(){
        return "index";
    }

    
    @RequestMapping("OutrosDados")
    public String maisDados(){
        return "index";
    }
    
    @RequestMapping("Cadastro")
    public String cadastro(){
        return "cadastro";
    }
    
}
