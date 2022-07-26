package br.com.projetojsf.bean.validator;

import br.com.projetojsf.model.Estudante2;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class ValidatorTesteBean implements Serializable {
    private Estudante2 estudante = new Estudante2();
    public void save(){
        System.out.println("Salvando");
        System.out.println(estudante.getEmail());
    }

    public Estudante2 getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante2 estudante) {
        this.estudante = estudante;
    }
}
