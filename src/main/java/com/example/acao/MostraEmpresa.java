package com.example.acao;

import com.example.demo2.Banco;
import com.example.demo2.Empresa;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MostraEmpresa {

    public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Mostrando a empresa");
        String paramID = request.getParameter("id");
        Integer id= Integer.valueOf(paramID);

        Banco banco = new Banco();

        Empresa empresa = banco.buscaEmpresa(id);
        System.out.println(empresa.getNome());

        request.setAttribute("empresa", empresa);
        RequestDispatcher rd = request.getRequestDispatcher("/FormAlteraEmpresa.jsp");
        rd.forward(request,response);
    }
}
