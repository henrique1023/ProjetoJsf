package br.com.projetojsf.bean.datatable;

import br.com.projetojsf.model.Estudante2;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

@Named
@ViewScoped
public class DataTableTesteBean implements Serializable {
    private List<Estudante2> estudante2List = Estudante2.estudante2List();


    public void orderByName(String order){
        if(order.equals("asc")){
            estudante2List.sort(Comparator.comparing(Estudante2::getNome));
        }else{
            estudante2List.sort(Comparator.comparing(Estudante2::getNome).reversed());
        }
    }

    public void orderBySobrenome(String order){
        if(order.equals("asc")){
            estudante2List.sort(Comparator.comparing(Estudante2::getSobreNome));
        }else{
            estudante2List.sort(Comparator.comparing(Estudante2::getSobreNome).reversed());
        }
    }

    public void remove(Estudante2 estudante2){
        estudante2List.remove(estudante2);
        System.out.println("Removido! " + estudante2.getNome());
    }

    public void edit(Estudante2 estudante2){
        estudante2.setEditing(true);
    }

    public void save(){
        estudante2List.forEach(estudante2 -> {
            if(estudante2.isEditing()){
                estudante2.setEditing(false);
            }
        });
    }
    public List<Estudante2> getEstudante2List() {
        return estudante2List;
    }

    public void setEstudante2List(List<Estudante2> estudante2List) {
        this.estudante2List = estudante2List;
    }
}
