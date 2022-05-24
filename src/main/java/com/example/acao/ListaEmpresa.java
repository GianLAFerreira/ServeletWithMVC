package com.example.acao;

import com.example.demo2.Banco;
import com.example.demo2.Empresa;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListaEmpresa implements Acao{

    public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Listando a Empresas");
        Banco banco = new Banco();
        List<Empresa> lista = banco.getEmpresas();
        request.setAttribute("empresas", lista);

        return "forward:listaEmpresas.jsp";
    }
}
