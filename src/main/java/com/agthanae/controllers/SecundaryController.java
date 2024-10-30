package com.agthanae.controllers;

import java.io.IOException;

import com.agthanae.models.Notas;

public class SecundaryController {
    public void CadNotas(Double nota1, Double nota2,Double nota3,Double nota4){
        Notas notas = new Notas(nota1, nota2, nota3, nota4);
        FileController fc = new FileController();
        try {
            fc.escreverNotas(notas);
        } catch (IOException e) {
            System.out.println("erro em salvar notas");
            e.printStackTrace();
        }
    }
}
