package br.com.projetojsf.bean.flowbuilder;

import javax.faces.flow.FlowScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@FlowScoped(value = "newregistration")
public class TesteFlowBuilderBean implements Serializable {
    private String nome;
    private String sobrenome;
    private String endereco;

    public void salvar(){
        System.out.println("Flow finalizado e salvando no banco!!");
        System.out.println(nome + " " + sobrenome + " "+ endereco);

//        esse retorno serve para dizer qual a pagina que tem que ir depois que finalizar
//        return "exitToInicio";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
