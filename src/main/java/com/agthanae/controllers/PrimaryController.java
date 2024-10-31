package com.agthanae.controllers;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import com.agthanae.App;
import com.agthanae.controllers.FileController;
import com.agthanae.models.Aluno;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class PrimaryController {
    @FXML
    private Button botaoAdicionarNotas;

    @FXML
    private Button botaocadrastarAluno;

    @FXML
    private TextField textFieldCpf;

    @FXML
    private DatePicker datePickerNascimento;

    @FXML
    private TextField textFieldEmail;

    @FXML
    private TextField textFieldNome;

    // tentativa de criar uma verificador da datePickerNascimento. Deu ruim!!
    @FXML
    void verificarData(ActionEvent event) {

        /*
         * LocalDate dataNascimento = datePickerNascimento.getValue();
         * 
         * if (dataNascimento == null) {
         * mensagemErro.setText("Por favor, selecione uma data.");
         * } else if (dataNascimento.isAfter(LocalDate.now())) {
         * mensagemErro.setText("A data de nascimento não pode ser futura.");
         * } else {
         * mensagemErro.setText("Data de nascimento válida!");
         * // Lógica adicional, se necessário
         * }
         */

    }

    @FXML
    public void cadastrarAluno(ActionEvent event) throws Exception {

        LocalDate ld = datePickerNascimento.getValue();

        Date nascimento = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());
        String nome = textFieldNome.getText();
        String cpf = textFieldCpf.getText();
        String email = textFieldEmail.getText();

        Aluno aluno = new Aluno(nome, cpf, email, nascimento);
        FileController fc = new FileController();
        try {
            fc.escreverAluno(aluno);
            System.out.println("\n    !!  Aluno cadrastado com sucesso    !!\n");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("Erro em salvar aluno" + e.getMessage());
            e.printStackTrace();
        }


        // Ir para outra tela
        App.setRoot("tertiary");
    }

    @FXML
    void adicionarNotas(ActionEvent event) throws Exception {
        
        cadastrarAluno(event);
        App.setRoot("secondary");

    }

}
