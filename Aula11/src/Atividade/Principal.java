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
        
        List <Pessoa> pessoas = new ArrayList<Pessoa>();

        Pessoa p1 = new Pessoa("Alberto", 17, 1.87f);
        Pessoa p2 = new Pessoa("Marcos", 23, 1.72f);
        Pessoa p3 = new Pessoa("Cristian", 34, 1.62f);

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        pessoas.sort(null);

        String patch = "C:\\Windows\\Temp\\PessoaFile.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(patch))){
            for (Pessoa pessoa : pessoas) {
                bw.write(pessoa.getNome() + " - " + pessoa.getIdade() + " - " + pessoa.getAltura());
                bw.newLine();
            }
		}
		catch(IOException e) {
			e.getMessage();
		}

        try (BufferedReader br = new BufferedReader(new FileReader(patch))){
            String linha;
            while ((linha = br.readLine()) != null) {
                String [] dados = linha.split(" - ");            
                
                String nome = dados[0];
                int idade = Integer.parseInt(dados[1]);
                double altura = Double.parseDouble(dados[2]);

                Pessoa pessoa = new Pessoa(nome, idade, altura);
                System.out.println(pessoa);                
            }
        } catch (IOException e) {
            System.out.println("Erro de leitura: " + e.getMessage());
        }
    }
}