package com.example.acao;

import com.example.demo2.Banco;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RemoveEmpresa {
    public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Removendo a Empresa");

        String paramID = request.getParameter("id");
        Integer id= Integer.valueOf(paramID);
        System.out.println(id);
        Banco banco = new Banco();
        banco.removeEmpresa(id);
        response.sendRedirect("entrada?acao=ListaEmpresa");
    }
}
