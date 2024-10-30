package com.agthanae.controllers;

import java.io.IOException;
import java.util.Date;
import com.agthanae.controllers.FileController;
import com.agthanae.models.Aluno;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML
    private Button botaoCadAluno;

    @FXML
    private TextField textFieldCpf;

    @FXML
    private TextField dtNascimento;

    @FXML
    private TextField email;

    @FXML
    private TextField textFieldNome;

   
    @FXML
    public void cadastrarAluno(ActionEvent event) {
        String nome = textFieldNome.getText();
        String cpf = textFieldCpf.getText();


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
