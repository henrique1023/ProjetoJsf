package br.com.projetojsf.bean.estudante;

import br.com.projetojsf.model.Estudante2;

import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Named
public class EstudanteRegistraBean implements Serializable {
    private Estudante2 estudante = new Estudante2();
    private String[] nomes = {"Teste1","Teste2","Teste3","Teste4"};
    private List<String> lista = new ArrayList<>();

    public void executar(){
        System.out.println("Executando um metodo!");
    }

    public String retorna(){
        return "Retorna na tela " + getEstudante().getNome();
    }
    public String proximaPagina(){
        return "index2?faces-redirect=true";
    }

    public List<String> getLista() {
        lista.add("João");
        lista.add("Maria");
        lista.add("JOse");
        lista.add("Antonio");
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    public Estudante2 getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante2 estudante) {
        this.estudante = estudante;
    }
}
