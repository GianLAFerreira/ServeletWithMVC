package com.example.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Empresa> lista = new ArrayList<>();
    private static List<Usuario> listaUsuarios = new ArrayList<Usuario>();
    private static Integer chaveSequencial = 1;
    static {
        Empresa empresa = new Empresa();
        empresa.setId(chaveSequencial++);
        empresa.setNome("Gian");

        Empresa empresa2 = new Empresa();
        empresa2.setId(chaveSequencial++);
        empresa2.setNome("Teste");

        lista.add(empresa);
        lista.add(empresa2);


        Usuario u1 = new Usuario();
        u1.setLogin("system");
        u1.setSenha("system");

        listaUsuarios.add(u1);
    }

    public void adiciona(Empresa empresa) {
        empresa.setId(Banco.chaveSequencial++);
        lista.add(empresa);
        }
    public List<Empresa> getEmpresas(){
        return Banco.lista;
    }

    public void removeEmpresa(Integer id) {
        lista.removeIf(empresa -> empresa.getId() == id);
    }

    public Empresa buscaEmpresa(Integer id) {
        for (Empresa empresa : lista){
            if (empresa.getId() ==id){
                return empresa;
            }
        }
        return null;
    }

    public Usuario existeUsuario(String login, String senha) {
        for (Usuario usuario : listaUsuarios){
            if (usuario.ehIgual(login, senha)){
                return usuario;
            }
        }
        return null;
    }
}
