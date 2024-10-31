package com.agthanae.controllers;

import java.io.IOException;

import com.agthanae.App;
import com.agthanae.models.Notas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SecundaryController {

    @FXML
    private Button botaoCadrastarNotas;

    @FXML
    private TextField textFieldnota1;

    @FXML
    private TextField textFieldnota2;

    @FXML
    private TextField textFieldnota3;

    @FXML
    private TextField textFieldnota4;

    @FXML
    void cadrastarNotas(ActionEvent event) {

        String n1 = textFieldnota1.getText();
        String n2 = textFieldnota2.getText();
        String n3 = textFieldnota3.getText();
        String n4 = textFieldnota4.getText();

        Double nota1 = Double.parseDouble(n1);
        Double nota2 = Double.parseDouble(n2);
        Double nota3 = Double.parseDouble(n3);
        Double nota4 = Double.parseDouble(n4);

        Notas notas = new Notas(nota1, nota2, nota3, nota4);
        FileController fc = new FileController();
        try {
            fc.escreverNotas(notas);
        } catch (IOException e) {
            System.out.println("erro em salvar notas");
            e.printStackTrace();
        }
        try {
            App.setRoot("tertiary");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("\n"+e.getMessage()+"\n");
        }
    }


}
