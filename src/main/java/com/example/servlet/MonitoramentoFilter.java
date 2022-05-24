package com.example.servlet;

import javax.servlet.*;
import java.io.IOException;

//@WebFilter("/entrada")
public class MonitoramentoFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}

    @Override
    public void destroy() {}

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MonitoramentoFilter");

        long antes = System.currentTimeMillis();

        String acao = request.getParameter("acao");
        chain.doFilter(request, response);

        long depois = System.currentTimeMillis();

        System.out.println("Tempo de execução: " + acao + " -> " + (depois - antes));
    }
}
