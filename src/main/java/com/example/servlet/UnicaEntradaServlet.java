package com.example.servlet;

import com.example.acao.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

//@WebServlet(name = "entrada", value = "/entrada")
public class UnicaEntradaServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  //      String paramAcao = request.getParameter("acao");

//        HttpSession sessao = request.getSession();
//        boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado") == null);
//        boolean ehUmaAcaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm")) ;
//
//        if (ehUmaAcaoProtegida && usuarioNaoEstaLogado){
//            response.sendRedirect("entrada?acao=LoginForm");
//            return;
//        }












//
//        String nome = null;
//
//        switch (paramAcao) {
//            case "ListaEmpresa": {
//                ListaEmpresa acao = new ListaEmpresa();
//                nome = acao.executa(request, response);
//                break;
//            }
//            case "RemoveEmpresa": {
//                RemoveEmpresa acao = new RemoveEmpresa();
//                nome = acao.executa(request, response);
//                break;
//            }
//            case "MostraEmpresa": {
//                MostraEmpresa acao = new MostraEmpresa();
//                nome = acao.executa(request, response);
//                break;
//            }
//            case "AlteraEmpresa": {
//                System.out.println("Chamando altera empresa");
//                AlteraEmpresa acao = new AlteraEmpresa();
//                nome = acao.executa(request, response);
//                break;
//            }
//            case "NovaEmpresa": {
//                System.out.println("Chamou o nova empresa");
//                NovaEmpresa acao = new NovaEmpresa();
//                nome = acao.executa(request, response);
//                break;
//            }
//            case "NovaEmpresaForm": {
//                System.out.println("Abrindo formulário de cadastro de nova empresa");
//                NovaEmpresaForm acao = new NovaEmpresaForm();
//                nome = acao.executa(request, response);
//                break;
//            }
//        }

    }
}
