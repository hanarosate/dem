package com.agthanae.controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import com.agthanae.controllers.FileController;
import javafx.scene.control.TextArea;

public class TertiaryController {

    @FXML
    private TextArea textAreaAlunosNotas;

    
    public void exibirAlunos() throws Exception {
        FileController fc = new FileController();
        try {
            String AlunosNotas = fc.getAlunosNotas();     
            textAreaAlunosNotas.setText(AlunosNotas);
        } catch (IOException e) {
            System.out.println("Erro em montar o texto AlunosNotas"+ e.getMessage());
        }
       
        
    }

    /*public void exibirAlunos(){
        FileController fc = new FileController();
        try {
            fc.mostrarAlunos();
        } catch (IOException e) {
            System.out.println("erro em exibir alunos");
            e.printStackTrace();
        }
    }*/
}
