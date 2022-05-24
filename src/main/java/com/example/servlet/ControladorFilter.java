package com.example.servlet;

import com.example.acao.Acao;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//@WebFilter(filterName = "/entrada")
public class ControladorFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws ServletException, IOException {

        System.out.println("ControladorFilter");

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String paramAcao = request.getParameter("acao");


        String nomeDaClasse = "com.example.acao." + paramAcao;

        String nome;
        try {
            System.out.println("passou aqui");
            Class classe = Class.forName(nomeDaClasse);//carrega a classe com o nome
            Acao acao = (Acao) classe.newInstance();
            nome = acao.executa(request, response);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new ServletException(e);
        }

        String[] tipoEEndereco =  nome.split(":");
        if (tipoEEndereco[0].equals("forward")){
            RequestDispatcher rd= request.getRequestDispatcher("WEB-INF/view/" + tipoEEndereco[1]);
            rd.forward(request, response);
        }else{
            response.sendRedirect(tipoEEndereco[1]);
        }

    }
}
