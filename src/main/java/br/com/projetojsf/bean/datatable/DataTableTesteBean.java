package br.com.projetojsf.bean.datatable;

import br.com.projetojsf.model.Estudante2;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class DataTableTesteBean implements Serializable {
    private List<Estudante2> estudante2List = Estudante2.estudante2List();

    public List<Estudante2> getEstudante2List() {
        return estudante2List;
    }

    public void setEstudante2List(List<Estudante2> estudante2List) {
        this.estudante2List = estudante2List;
    }
}
