package br.com.projetojsf.bean.comunicacao;

import br.com.projetojsf.model.Estudante2;

import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class ComunicacaoTeste5Bean implements Serializable {
    private String nome;
    private String sobrenome;

    private Estudante2 estudante = new Estudante2();
    private Estudante2 estudante2;

    public void execute(ActionEvent e){
    };

    public Estudante2 getEstudante2() {
        return estudante2;
    }

    public void setEstudante2(Estudante2 estudante2) {
        this.estudante2 = estudante2;
    }

    public Estudante2 getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante2 estudante) {
        this.estudante = estudante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        System.out.println("Veio do setPropertyActionListener " + nome);
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        System.out.println("Veio do setPropertyActionListener " + sobrenome);
        this.sobrenome = sobrenome;
    }
}
