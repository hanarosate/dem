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

    String caminho = "src\\main\\java\\com\\agthanae\\Alunos.txt";
    File arq;

    public void escreverAluno(Aluno aluno) throws IOException {
        arq = new File(caminho);

        FileWriter fileWriter = new FileWriter(caminho, true);
        BufferedWriter escritor = new BufferedWriter(fileWriter);
        escritor.write(aluno.getNome() + "| " + aluno.getCpf() + " " + aluno.getEmail() + "  " + aluno.getNascimento()
                + "\n");
        escritor.close();
    }

    public void escreverNotas(Notas notas) throws IOException {
        FileWriter fileWriter = new FileWriter(caminho, true);
        BufferedWriter escritor = new BufferedWriter(fileWriter);
        double media = (notas.getNota1() + notas.getNota2() + notas.getNota3() + notas.getNota4()) / 4;
        escritor.write(notas.getNota1() + " | " + notas.getNota2() + " | " + notas.getNota3() + " | " + notas.getNota4()
                + " | " + media + "\n");
        escritor.close();
    }

    public String getAlunosNotas() throws IOException {

        // tipo de string mais eficiente para alterações
        StringBuilder alunosNotas = new StringBuilder();

        //
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminho))) {
            String linha;

            // enquanto linha != de nullo
            while ((linha = leitor.readLine()) != null) {

                // enquanto i < numero total de caracteres dessa linha
                for (int i = 0; i < linha.length(); i++) {

                    // caractere recebe o caracter i da linha
                    char caractere = linha.charAt(i);

                    if (Character.isDigit(caractere)) {
                        alunosNotas.append("\t");
                        alunosNotas.append(linha);
                        break;

                    } else if (Character.isLetter(caractere) || caractere == ' ') {
                        if (i == 0) {
                            alunosNotas.append("\n");
                        }
                        alunosNotas.append(caractere);

                    } else if (caractere == '|') {
                        break;
                    }

                    /*
                     * // se o caractere for diferente de | significa que ele faz parte do nome do
                     * // aluno
                     * if (caractere != '|') {
                     * alunosNotas.append(caractere);
                     * } else {
                     * 
                     * // le a linha de notas que esta embaixo da linha do nome no .txt
                     * linha = leitor.readLine();
                     * 
                     * // se a linha for nada ou um nome ele quebra o FOR
                     * if (linha == null || Character.isLetter(caractere)) {
                     * 
                     * alunosNotas.append("\n");
                     * break;
                     * 
                     * } else { // se for as notas ele as adiciona na string alunosNotas
                     * 
                     * alunosNotas.append("\t");
                     * alunosNotas.append(linha);
                     * alunosNotas.append("\n");
                     * 
                     * // quebra o FOR para ler o proximo nome ou finalizar, caso nao tenha mais
                     * nada
                     * break;
                     * }
                     * 
                     * }
                     */
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return alunosNotas.toString();
    }

}