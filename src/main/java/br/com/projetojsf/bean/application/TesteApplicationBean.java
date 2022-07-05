package br.com.projetojsf.bean.application;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@ApplicationScoped
public class TesteApplicationBean implements Serializable {
    private List<String> categoriaList;

    public List<String> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<String> categoriaList) {
        this.categoriaList = categoriaList;
    }

    @PostConstruct
    public void init() {
        System.out.println("Objeto View instanciado");
        categoriaList = asList("Personagem", "Casta", "Imperadores");
    }

}
