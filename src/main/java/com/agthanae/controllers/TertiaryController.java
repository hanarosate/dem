package com.agthanae.controllers;

import java.io.IOException;

public class TertiaryController {
    public void exibirAlunos(){
        FileController fc = new FileController();
        try {
            fc.mostrarAlunos();
        } catch (IOException e) {
            System.out.println("erro em exibir alunos");
            e.printStackTrace();
        }
    }
}
