package br.com.projetojsf.bean.comunicacao;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Named
@ViewScoped
public class ComunicacaoTeste3Bean implements Serializable {
    private String nome;
    private String sobrenome;
    private Date data;
    public void init(){
        System.out.println("Comunicação 3");
        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(data);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data){
        this.data = data;
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
