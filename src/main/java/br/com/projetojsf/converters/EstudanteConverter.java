package br.com.projetojsf.converters;

import br.com.projetojsf.model.Estudante2;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import java.util.List;

@FacesConverter(value = "estudanteConverter")
public class EstudanteConverter implements Converter {
    List<Estudante2> estudante2List = Estudante2.estudante2List();
    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String value) {
        if(value == null || !value.matches("\\d+"))
            return null;

        Estudante2 estudante2 = new Estudante2();
        estudante2.setId(Integer.parseInt(value));
        int index = estudante2List.indexOf(estudante2);
        return estudante2List.get(index);
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object value) {
        if(value != null && !value.equals("")){
            Estudante2 estudante = (Estudante2) value;
            if(estudante != null){
                return estudante.getId().toString();
            }
        }
        return null;
    }
}
