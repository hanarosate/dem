package com.agthanae.controllers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileController {

    String caminho = "C:\\Users\\Aluno\\dem\\dem\\src\\main\\java\\com\\agthanae\\Alunos.txt";
    File arq = new File (caminho);

    if(arq.exists()){
        System.out.println("Arquivo Existe");
    }
    else{
        System.out.println("Arquivo não existe");
    }

    public void escreverAluno(Aluno aluno){
        FileWriter fileWriter = new FileWriter(caminho);
        BufferedWriter escritor = new BufferedWriter(fileWriter);
        escritor.write(aluno);
        escritor.write("#");
        escritor.close();
    }
    public void escreverNotas(Notas notas){
        FileWriter fileWriter = new FileWriter(caminho);
        BufferedWriter escritor = new BufferedWriter(fileWriter);
        escritor.write(notas);
        escritor.write("%");
        escritor.close();
    }

    public void mostrarAlunos ( )  {
        BufferedReader leitor =  null;
        String alunos;
        try {
            FileReader leitorArquivo = new FileReader(caminho);
            String linha = leitor.readLine();
            while (linha != null){
                System.out.println(linha);
                linha = leitor.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        leitor.close();
        
    } 

}}