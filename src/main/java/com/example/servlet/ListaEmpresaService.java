package com.example.servlet;

import com.example.modelo.Banco;
import com.example.modelo.Empresa;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "/empresas", value = "/empresas")
public class ListaEmpresaService extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        List<Empresa> empresas=  new Banco().getEmpresas();

        Gson gson = new Gson();
        String json = gson.toJson(empresas);

        response.setContentType("application/json");
        response.getWriter().println(json);
    }
}
