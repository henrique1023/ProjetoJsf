package br.com.projetojsf.bean.beanvalidation;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.*;
import java.io.Serializable;

@Named
@ViewScoped
public class BeanValidationTesteBean implements Serializable {
    @Size(min = 3, max = 10, message = "Tamanho min 3 e MAX 10")
    @NotNull(message = "Nome não pode ser vazio")
    private String nome;
    @Pattern(regexp = "^[a-zA-Z0-9_.+-]+@[a-zA-z0-9_.+-]+\\\\.[a-zA-Z0-9_.+-]+$", message = "Digite um email valido")
    private String email;
    @DecimalMax(value = "30.50", message = "O valor não pode ser maior que 30.50")
    @DecimalMin(value = "5.00", message = "O valor não pode ser menor que 5.00")
    private double decimal;
    @Digits(integer = 3,fraction = 2,message = "Não pode ser maior que 999 e maior que duas casas decimais")
    private double numero;

    public void salvar(){
        System.out.println(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDecimal() {
        return decimal;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
}
