package br.com.projetojsf.model;

import br.com.projetojsf.model.enums.Turno;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;


public class Estudante2 {
    private String nome = "Joaquim";
    private String sobreNome = "Miguel";

    private Turno turno = Turno.MATUTINO;
    private double nota1;
    private double nota2;
    private double nota3 = 10;

    public Estudante2() {
    }

    public Estudante2(String nome, String sobreNome, double nota1) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.nota1 = nota1;
    }

    public static List<Estudante2> estudante2List(){
        List<Estudante2> e = new ArrayList<>();
        e.addAll(asList(new Estudante2("isasa","asdasd", 14),
        new Estudante2("isasa","avdvdv", 15),
        new Estudante2("isasa","asdasd", 14)));
        return e;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}
