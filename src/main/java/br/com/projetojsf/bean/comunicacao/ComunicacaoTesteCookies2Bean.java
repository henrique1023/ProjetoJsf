package br.com.projetojsf.bean.comunicacao;

import br.com.projetojsf.model.Estudante2;
import br.com.projetojsf.util.ApplicationMapUtil;
import org.omnifaces.util.Faces;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.Cookie;
import java.io.Serializable;
import java.util.Map;

@Named
@ViewScoped
public class ComunicacaoTesteCookies2Bean implements Serializable {
    private Estudante2 estudante;
    private Estudante2 estudante2 = new Estudante2();

    public void init(){
        System.out.println("Cookie2");
        estudante = (Estudante2) ApplicationMapUtil.getValueFromApplicationMap("estudante");
    }
    public Estudante2 getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante2 estudante) {
        this.estudante = estudante;
    }

    public Estudante2 getEstudante2() {
        return estudante2;
    }

    public void setEstudante2(Estudante2 estudante2) {
        this.estudante2 = estudante2;
    }
}

