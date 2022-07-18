package br.com.projetojsf.bean.comunicacao;

import org.omnifaces.util.Faces;

import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.Cookie;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Map;

@Named
@ViewScoped
public class ComunicacaoTesteCookiesBean implements Serializable {
    private String key;
    private String value;
    public void init(){
        Map<String, Object> requestCookieMap = FacesContext.getCurrentInstance().getExternalContext().getRequestCookieMap();
        Cookie cookie = (Cookie) requestCookieMap.get("chave");
        System.out.println(requestCookieMap);
        System.out.println(cookie);
    }

    public void salvarCookie(){
        Faces.addResponseCookie(key, value, -1);
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

