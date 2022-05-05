package gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gerenciador.modelo.Banco;
import gerenciador.modelo.Empresa;

public class NovaEmpresaFormulario implements Acao{

    public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        return "forward:formularioNovaEmpresa.jsp";
    } 
}
