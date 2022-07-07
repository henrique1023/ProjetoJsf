package br.com.projetojsf.bean.application;

import br.com.projetojsf.bean.dependent.TesteDependentBean;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

import static java.util.Arrays.asList;

@Named
@ApplicationScoped
public class TesteApplicationBean implements Serializable {
    private List<String> categoriaList;
    private final TesteDependentBean dependentBean;
    @Inject
    public TesteApplicationBean(TesteDependentBean dependentBean){
        this.dependentBean = dependentBean;
    }

    @PostConstruct
    public void init() {
        System.out.println("Objeto View instanciado");
        categoriaList = asList("Personagem", "Casta", "Imperadores");
        dependentBean.escolherPersonagem();
    }
    public TesteDependentBean getDependentBean() {
        return dependentBean;
    }


    public List<String> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<String> categoriaList) {
        this.categoriaList = categoriaList;
    }



}
