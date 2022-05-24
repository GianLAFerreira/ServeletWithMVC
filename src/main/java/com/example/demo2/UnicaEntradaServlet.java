package com.example.demo2;

import com.example.acao.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "entrada", value = "/entrada")
public class UnicaEntradaServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String paramAcao = request.getParameter("acao");

        if (paramAcao.equals("ListaEmpresa")){
            ListaEmpresas acao = new ListaEmpresas();
            acao.executa(request, response);

        }else if (paramAcao.equals("RemoveEmpresa")){
            RemoveEmpresa acao = new RemoveEmpresa();
            acao.executa(request, response);
        }else if (paramAcao.equals("MostraEmpresa")){
            MostraEmpresa acao = new MostraEmpresa();
            acao.executa(request, response);
        }else if (paramAcao.equals("AlteraEmpresa")){
            System.out.println("dorrr");
            AlteraEmpresa acao = new AlteraEmpresa();
            acao.executa(request, response);
        }else if (paramAcao.equals("NovaEmpresa")){
            System.out.println("dorrr");
            NovaEmpresa acao = new NovaEmpresa();
            acao.executa(request, response);
        }
    }
}
