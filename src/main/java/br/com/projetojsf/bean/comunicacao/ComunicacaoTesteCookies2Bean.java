package br.com.projetojsf.bean.comunicacao;

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
    private String key;
    private String value;
    public void init(){
        value = Faces.getRequestCookie("nome");
        System.out.println(value);
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

