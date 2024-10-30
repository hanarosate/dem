package com.agthanae.controllers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.agthanae.models.Aluno;
import com.agthanae.models.Notas;

public class FileController {

    String caminho = "C:\\Users\\Aluno\\dem\\dem\\src\\main\\java\\com\\agthanae\\Alunos.txt";
    File arq;

    public void escreverAluno(Aluno aluno) throws IOException {
        arq = new File(caminho);

        FileWriter fileWriter = new FileWriter(caminho);
        BufferedWriter escritor = new BufferedWriter(fileWriter);
        escritor.write(aluno.getNome() + ";" + aluno.getCpf() + ";" + aluno.getEmail() + ";" + aluno.getNascimento());
        escritor.write("#");
        escritor.close();
    }

    public void escreverNotas(Notas notas) throws IOException {
        FileWriter fileWriter = new FileWriter(caminho);
        BufferedWriter escritor = new BufferedWriter(fileWriter);
        escritor.write(notas.getNota1() + ";" + notas.getNota2() + ";" + notas.getNota3() + ";" + notas.getNota4());
        escritor.write("%");
        escritor.close();
    }

    public void mostrarAlunos() throws IOException {
        BufferedReader leitor = null;
        String alunos;
        try {
            FileReader leitorArquivo = new FileReader(caminho);
            String linha = leitor.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = leitor.readLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{
        leitor.close();
    }

    }

}