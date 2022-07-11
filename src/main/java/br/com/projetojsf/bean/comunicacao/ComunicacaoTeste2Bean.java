package br.com.projetojsf.bean.comunicacao;

import org.omnifaces.cdi.Param;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class ComunicacaoTeste2Bean implements Serializable {

    @Inject @Param(name = "nome")
    private String nome;
    @Inject @Param(name = "sobrenome")  
    private String sobrenome;

    @PostConstruct
    public void init(){
        System.out.println("Iniciou");
        //esse metodo getRequestParameterMap que pega os dados passados na URL
//        Map<String,String> paramsMap = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
//        System.out.println(paramsMap.get("nome"));
//        System.out.println(paramsMap.get("sobrenome"));
//        nome = paramsMap.get("nome");
//        sobrenome = paramsMap.get("sobrenome");
        System.out.println(nome);
        System.out.println(sobrenome);
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
}
