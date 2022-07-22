package br.com.projetojsf.bean.login;

import br.com.projetojsf.model.Estudante2;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import static java.util.Arrays.asList;

@Named
@SessionScoped
public class LoginBean implements Serializable {
    private String nome;
    private String senha;
    private Estudante2 estudante;
    private List<Locale> localeList = asList(new Locale("en"), new Locale("pt"));
    private String language;

    public String logar(){
        //faz a verificação e busca no banco
        if(nome.equals("w") && senha.equals("s")){
            estudante = new Estudante2();
            return "/restricted/iniciosistema.xhtml?faces-redirect=true";
        }

        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                "senha incorreta", ""));
        return null;
    }

    public String logout() {
        estudante = null;
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/login?faces-redirect=true";
    }

    public List<Locale> getLocaleList() {
        return localeList;
    }

    public void setLocaleList(List<Locale> localeList) {
        this.localeList = localeList;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Estudante2 getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante2 estudante) {
        this.estudante = estudante;
    }
}
