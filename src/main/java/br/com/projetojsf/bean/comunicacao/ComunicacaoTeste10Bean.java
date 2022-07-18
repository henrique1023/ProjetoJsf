package br.com.projetojsf.bean.comunicacao;

import br.com.projetojsf.model.Estudante2;
import org.omnifaces.util.Faces;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class ComunicacaoTeste10Bean implements Serializable {
    private String password;
    private List<Estudante2> estudante2s = Estudante2.estudante2List();

    public void remover(Estudante2 estudante2){
        estudante2s.remove(estudante2);
    }

    public void salvar(){
        System.out.println(password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Estudante2> getEstudante2s() {
        return estudante2s;
    }

    public void setEstudante2s(List<Estudante2> estudante2s) {
        this.estudante2s = estudante2s;
    }
}

