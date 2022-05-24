package com.example.acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NovaEmpresaForm implements Acao{
    public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Executando redirect para form de nova empresa");

        return "forward:FormNovaEmpresa.jsp";
    }
}
