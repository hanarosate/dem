package com.agthanae.controllers;

import java.io.IOException;
import java.util.Date;
import com.agthanae.controllers.FileController;
import com.agthanae.models.Aluno;

public class PrimaryController {
    public void CadAluno(String nome, String cpf, String email, Date nascimento) {
        Aluno aluno = new Aluno(nome, cpf, email, nascimento);
        FileController fc = new FileController(); 
        try {
            fc.escreverAluno(aluno);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Erro em salvar aluno");
            e.printStackTrace();
        }
    }

    

}
