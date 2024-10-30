package com.agthanae.controllers;

import java.util.Date;

import com.agthanae.models.Aluno;

public class PrimaryController {
    public void CadAluno(String nome, String cpf, String email, Date nascimento) {
        Aluno aluno = new Aluno(nome, cpf, email, nascimento);

    }

}
