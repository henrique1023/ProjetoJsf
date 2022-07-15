package br.com.projetojsf.bean.comunicacao;

import br.com.projetojsf.model.Estudante2;

import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class ComunicacaoTeste6Bean implements Serializable {
    private List<Estudante2> estudante2List = Estudante2.estudante2List();

    public String editar(int index){
        Estudante2 estudante2 = estudante2List.get(index);
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        flash.put("estudante", estudante2);
        System.out.println(estudante2.getNome());
        return "comunicacao7?faces-redirect=true";
    }
    public List<Estudante2> getEstudante2List() {
        return estudante2List;
    }

    public void setEstudante2List(List<Estudante2> estudante2List) {
        this.estudante2List = estudante2List;
    }
}
