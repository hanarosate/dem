package com.agthanae.controllers;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.TextArea;

public class TertiaryController implements Initializable {

    @FXML
    private TextArea textAreaAlunosNotas;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            exibirAlunos(); // Chamando o método automaticamente quando a tela é exibida
        } catch (Exception e) {
            System.out.println("Erro no metodo exibir alunos: " + e.getMessage());
        }
    }

    public void exibirAlunos() throws Exception {
        FileController fc = new FileController();
        try {
            String AlunosNotas = fc.getAlunosNotas();
            textAreaAlunosNotas.setText(AlunosNotas);
        } catch (IOException e) {
            System.out.println("Erro em montar o texto AlunosNotas: " + e.getMessage());
        }
    }
}
