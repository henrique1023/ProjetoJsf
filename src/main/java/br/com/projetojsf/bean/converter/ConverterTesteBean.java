package br.com.projetojsf.bean.converter;

import br.com.projetojsf.model.Estudante2;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class ConverterTesteBean implements Serializable {
    private Estudante2 estudante;
    private List<Estudante2> estudanteList = Estudante2.estudante2List();

    public void save() {
        System.out.println("Salvando");
        System.out.println(estudante.getEmail());
    }

    public List<Estudante2> getEstudanteList() {
        return estudanteList;
    }

    public void setEstudanteList(List<Estudante2> estudanteList) {
        this.estudanteList = estudanteList;
    }

    public Estudante2 getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante2 estudante) {
        this.estudante = estudante;
    }
}
