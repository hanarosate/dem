package com.agthanae.models;

import java.util.Date;

public class Aluno {
    private String nome;
    private String cpf;
    private String email;
    private Date nascimento;
    private Notas notas;

    public Aluno(String nome, String cpf, String email, Date nascimento, Notas notas) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.nascimento = nascimento;
        this.notas = notas;
    }

    public Aluno(String nome, String cpf, String email, Date nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }

}
