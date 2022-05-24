package com.example.acao;

import com.example.modelo.Banco;
import com.example.modelo.Empresa;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MostraEmpresa implements Acao{

    public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Mostrando a empresa");
        String paramID = request.getParameter("id");
        Integer id= Integer.valueOf(paramID);

        Banco banco = new Banco();

        Empresa empresa = banco.buscaEmpresa(id);
        System.out.println(empresa.getNome());

        request.setAttribute("empresa", empresa);

        return "forward:/FormAlteraEmpresa.jsp";
    }
}
