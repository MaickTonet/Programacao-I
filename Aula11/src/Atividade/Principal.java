package Atividade;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) {
        
        List <Pessoa> pessoas = new ArrayList<Pessoa>(); // Cria uma nova listas

        Pessoa p1 = new Pessoa("Alberto", 17, 1.87f); // Declara os objetos
        Pessoa p2 = new Pessoa("Marcos", 23, 1.72f);
        Pessoa p3 = new Pessoa("Cristian", 34, 1.62f);

        pessoas.add(p1); // Adiciona as pessoas na lista
        pessoas.add(p2);
        pessoas.add(p3);

        pessoas.sort(null); // Ordena a lista (por orden alfabética)

        String patch = "C:\\Windows\\Temp\\PessoaFile.txt"; // Cria o caminho para a criação do arquivo.txt

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(patch))){ // Tenta fazer a escrita dos nomes das pessoas no arquivo
            for (Pessoa pessoa : pessoas) {
                bw.write(pessoa.getNome() + " - " + pessoa.getIdade() + " - " + pessoa.getAltura()); // Escreve e formata o nome das pessoas no arquivo
                bw.newLine(); // Pula a linha
            }
		}
		catch(IOException e) { // Captura as exceções (se tiver alguma)
			e.getMessage(); // Exibe as exceções (se tiver alguma)
		}

        try (BufferedReader br = new BufferedReader(new FileReader(patch))){ // Tenta fazer a leitura do arquivo já criado
            String linha; // Declara uma string para fazer a leitura
            while ((linha = br.readLine()) != null) { // Laço while para saber onde terminam as informações do arquivo
                String [] dados = linha.split(" - "); // Faz a leitura dos dados no vetor de string, e separa eles pelo " - "
                
                String nome = dados[0]; // Faz a atribuição dos valores, pelas posições do vetor de string (já organizado)
                int idade = Integer.parseInt(dados[1]); // Converse os valores da posição "1" para integer
                double altura = Double.parseDouble(dados[2]); // Converse os valores da posição "2" para double

                Pessoa pessoa = new Pessoa(nome, idade, altura); // Declara um novo objeto pessoa
                System.out.println(pessoa); // Exibe o toString já feito na classe pessoa   
            }
        } catch (IOException e) { // Captura as exceções (se tiver alguma)
            System.out.println("Erro de leitura: " + e.getMessage()); // Exibe as exceções (se tiver alguma)
        }
    }
}