package br.com.projetojsf.bean.validator;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;
import javax.servlet.http.Part;
import java.io.Serializable;
import java.util.List;

import static java.util.Arrays.asList;

@Named
@RequestScoped
public class Validators implements Serializable {
    private List<String> emailsDB = asList("teste1@gmail.com", "teste2@gmail.com", "teste3@gmail.com");

    public void validateDuplicatedEmail(FacesContext facesContext, UIComponent uiComponent, Object o)
            throws ValidatorException {
        String email = (String) o;
        if (emailsDB.contains(email)) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "O email já existe", "");
            throw new ValidatorException(message);
        }
    }

    public void validateFile(FacesContext facesContext, UIComponent uiComponent, Object o)
            throws ValidatorException {
        Part file = (Part) o;
        try{
            validateFileNameLength(file);
            validateContentType(file);
            validateFileSize(file);

        }catch (RuntimeException e){
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    e.getMessage(), "");
            throw new ValidatorException(message);
        }
    }

    private void validateFileNameLength(Part file){
        if(file.getSubmittedFileName().length() > 10){
            throw new RuntimeException("O nome + a extensão não pode passar de 10 carac");
        }
    }

    private void validateContentType(Part file){
        String contentType = file.getContentType();
        if(!contentType.equals("image/png") && !contentType.equals("image/jpge") ){
            throw new RuntimeException("Apenas arquivos do tipo PNG ou JPGE aceitos!");
        }
    }
    private void validateFileSize(Part file){
        if(file.getSize() > 1048576){
            throw new RuntimeException("Arquivo maior que 1Mb");
        }
    }
}
