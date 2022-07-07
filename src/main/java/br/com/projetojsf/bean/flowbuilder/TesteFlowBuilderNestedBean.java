package br.com.projetojsf.bean.flowbuilder;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@FlowScoped(value = "newpendencies")
public class TesteFlowBuilderNestedBean implements Serializable {
    private String userName;
    private String userSurname;

    public String userValide(){
        System.out.println("Processo de validação");

        if(true){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Usuario não passou nas validações", "Algum detalhe a mais"));
            return null;
        }
        return "proceedToRegistration3";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }
}
