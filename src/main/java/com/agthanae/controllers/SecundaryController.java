package com.agthanae.controllers;

import com.agthanae.models.Notas;

public class SecundaryController {
    public void CadNotas(Double nota1, Double nota2,Double nota3,Double nota4){
        Notas notas = new Notas(nota1, nota2, nota3, nota4);
        escreverNotas(notas);
    }
}
