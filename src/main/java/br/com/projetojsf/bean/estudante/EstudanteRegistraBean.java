package br.com.projetojsf.bean.estudante;

import br.com.projetojsf.model.Estudante2;

import javax.inject.Named;
import java.io.Serializable;

@Named
public class EstudanteRegistraBean implements Serializable {
    private Estudante2 estudante = new Estudante2();

    public Estudante2 getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante2 estudante) {
        this.estudante = estudante;
    }
}
