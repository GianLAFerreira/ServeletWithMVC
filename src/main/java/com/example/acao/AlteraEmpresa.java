package com.example.acao;

import com.example.demo2.Banco;
import com.example.demo2.Empresa;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AlteraEmpresa implements Acao{
    public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Altera Epresa");
        String nomeEmpresa   =  request.getParameter("nome");
        String parameterData =  request.getParameter("data");
        String paramID       =  request.getParameter("id");
        Integer id = Integer.valueOf(paramID);

        Date dataAbertura  = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            dataAbertura  = sdf.parse(parameterData);
        } catch (ParseException e) {
            throw new ServletException(e);
        }
        System.out.println(id);

        Banco banco = new Banco();
        Empresa empresa = banco.buscaEmpresa(id);
        empresa.setNome(nomeEmpresa);
        empresa.setDataAbertura(dataAbertura);

        return "redirect:entrada?acao=ListaEmpresa";
    }
}
