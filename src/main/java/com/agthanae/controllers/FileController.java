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

    String caminho = "C:\\Users\\Aluno\\gatha\\dem\\src\\main\\java\\com\\agthanae\\Alunos.txt";
    File arq;

    public void escreverAluno(Aluno aluno) throws IOException {
        arq = new File(caminho);

        FileWriter fileWriter = new FileWriter(caminho, true);
        BufferedWriter escritor = new BufferedWriter(fileWriter);
        escritor.write(aluno.getNome() + "| " + aluno.getCpf() + "  " + aluno.getEmail() + "  " + aluno.getNascimento() + "\n");
        escritor.close();
    }

    public void escreverNotas(Notas notas) throws IOException {
        FileWriter fileWriter = new FileWriter(caminho, true);
        BufferedWriter escritor = new BufferedWriter(fileWriter);
        double media = (notas.getNota1()+notas.getNota2()+notas.getNota3()+notas.getNota4())/4; 
        escritor.write(notas.getNota1() + " | " + notas.getNota2() + " | " + notas.getNota3() + " | " + notas.getNota4()+ "| " +media+"\n");
        escritor.close();
    }

    public String getAlunosNotas() throws IOException {
        StringBuilder alunosNotas = new StringBuilder();
        
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminho))) {
            String linha;
    
            while ((linha = leitor.readLine()) != null) {
                for (int i = 0; i < linha.length(); i++) {
                    char caractere = linha.charAt(i);
                    if (caractere != '|') {
                        alunosNotas.append(caractere);
                    } else {
                        linha = leitor.readLine();
                        if (linha == null || Character.isLetter(linha.charAt(0))) {
                            break;
                        } else {
                            alunosNotas.append(linha);
                        }
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    
        return alunosNotas.toString();
    }
    

}