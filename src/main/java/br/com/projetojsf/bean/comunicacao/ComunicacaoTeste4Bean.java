package br.com.projetojsf.bean.comunicacao;

import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;

@Named
@ViewScoped
public class ComunicacaoTeste4Bean implements Serializable {

    private String buttonName = "Nome do botão do bean";

    public void execute(ActionEvent e){
        String nome = (String) e.getComponent().getAttributes().get("nome");
        String adjetivo = (String) e.getComponent().getAttributes().get("adjetivo");
        System.out.println(nome + " "+ adjetivo);
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }
}
