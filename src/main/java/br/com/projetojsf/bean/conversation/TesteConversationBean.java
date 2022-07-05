package br.com.projetojsf.bean.conversation;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@ConversationScoped
public class TesteConversationBean implements Serializable {
    private List<String> personagens;
    private List<String> personagemSelecionadoSession = new ArrayList<>();

    @Inject
    private Conversation conversation;
    public void init() {
        System.out.println("Objeto Conversations instanciado");
        personagens = asList("Mar", "Terra", "Ar");
        if(conversation.isTransient()){
            //Long Running
            conversation.begin();
            System.out.println("Iniciado conversation Scoped, ID=" + conversation.getId());
        }
    }

    public void endConversation(){
        if (!conversation.isTransient()){
            conversation.end();
            System.out.println("Finalizado o Conversation!");
        }
    }

    public void escolherPersonagem() {
        int index = ThreadLocalRandom.current().nextInt(3);
        personagemSelecionadoSession.add(personagens.get(index));
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

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }
}
