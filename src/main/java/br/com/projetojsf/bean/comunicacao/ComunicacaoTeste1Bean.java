package br.com.projetojsf.bean.comunicacao;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;

@Named
@ViewScoped
public class ComunicacaoTeste1Bean implements Serializable {

    private String nome;
    private String sobrenome;

    private Date data = new Date();

    public void imprimirAtributos(){
        //capturando o atributo global que está no web.xml
        String initParameter = FacesContext.getCurrentInstance()
                .getExternalContext()
                .getInitParameter("images.location");
        System.out.println(initParameter);
    }

    public String salvar(){
        //enviando dados via hard code
        return "comunicacao2?faces-redirect=true&nome="+nome+"&sobrenome="+sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
