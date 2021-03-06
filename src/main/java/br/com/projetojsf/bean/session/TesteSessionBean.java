package br.com.projetojsf.bean.session;

import br.com.projetojsf.model.Estudante2;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@SessionScoped
public class TesteSessionBean implements Serializable {
    private List<String> personagens;
    private List<String> personagemSelecionadoSession = new ArrayList<>();
    private Estudante2 estudante;

    @PostConstruct
    public void init() {
        System.out.println("Objeto Session instanciado");
        personagens = asList("Duque", "Rainha", "Rei");
        logar();
    }

    public void logar(){
        //fez a consulta, verificou e está OK
        estudante = new Estudante2();
    }

    //funções que serve para finalizar a Sessão no servidor
    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "session?faces-redirect=true";
    }

    public void escolherPersonagem() {
        int index = ThreadLocalRandom.current().nextInt(3);
        personagemSelecionadoSession.add(personagens.get(index));
    }

    public Estudante2 getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante2 estudante) {
        this.estudante = estudante;
    }

    public List<String> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<String> personagens) {
        this.personagens = personagens;
    }

    public List<String> getPersonagemSelecionadoSession() {
        return personagemSelecionadoSession;
    }

    public void setPersonagemSelecionadoSession(List<String> personagemSelecionadoSession) {
        this.personagemSelecionadoSession = personagemSelecionadoSession;
    }


}
