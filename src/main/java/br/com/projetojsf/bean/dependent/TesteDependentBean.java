package br.com.projetojsf.bean.dependent;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@Dependent
public class TesteDependentBean implements Serializable {

    private List<String> personagens;
    private List<String> personagemSelecionadoView = new ArrayList<>();

    public List<String> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<String> personagens) {
        this.personagens = personagens;
    }

    public List<String> getPersonagemSelecionadoView() {
        return personagemSelecionadoView;
    }

    public void setPersonagemSelecionadoView(List<String> personagemSelecionadoView) {
        this.personagemSelecionadoView = personagemSelecionadoView;
    }

    @PostConstruct
    public void init() {
        System.out.println("Objeto Dependent instanciado");
        personagens = asList("Caxias", "Dom Pedro", "Dom Carlos");
    }

    public void escolherPersonagem() {
        int index = ThreadLocalRandom.current().nextInt(3);
        personagemSelecionadoView.add(personagens.get(index));
    }
}
