package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CadastroEstagiario {

    private static final String DIRECTORY_PATH = "cadastrosestagiario/";

    static {
        File directory = new File(DIRECTORY_PATH);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }

    public static void salvarCadastro(Estagiario estagiario) {
        String fileName = DIRECTORY_PATH + estagiario.getNome() + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(estagiario.getNome() + "\n");
            writer.write(estagiario.getIdade() + "\n");
            writer.write(estagiario.getEndereco() + "\n");
            writer.write(estagiario.getSexo() + "\n");
            writer.write(estagiario.getAltura() + "\n");
            writer.write(estagiario.getTelefone() + "\n");
            writer.write(estagiario.getRegistro() + "\n");
            writer.write(estagiario.getSalario() + "\n");
            writer.write(estagiario.getBolsa() + "\n");
            writer.write(estagiario.getHorasServico() + "\n");

            System.out.println("Salvando Estagiário: " + estagiario.getNome());
            System.out.println("Registro: " + estagiario.getRegistro());
            System.out.println("Salário: " + estagiario.getSalario());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Estagiario lerCadastro(String nome) {
        String fileName = DIRECTORY_PATH + nome + ".txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String nomeEstagiario = reader.readLine();
            int idade = Integer.parseInt(reader.readLine());
            String endereco = reader.readLine();
            char sexo = reader.readLine().charAt(0);
            float altura = Float.parseFloat(reader.readLine());
            String telefone = reader.readLine();
            String registro = reader.readLine();
            float salario = Float.parseFloat(reader.readLine());
            float bolsa = Float.parseFloat(reader.readLine());
            float horasServico = Float.parseFloat(reader.readLine());

            System.out.println("Nome: " + nomeEstagiario);
            System.out.println("Idade: " + idade);
            System.out.println("Endereço: " + endereco);
            System.out.println("Sexo: " + sexo);
            System.out.println("Altura: " + altura);
            System.out.println("Telefone: " + telefone);
            System.out.println("Registro: " + registro);
            System.out.println("Salário: " + salario);
            System.out.println("Salário: " + bolsa);
            System.out.println("Salário: " + horasServico);

            return new Estagiario(bolsa, horasServico, nomeEstagiario, idade, endereco, sexo, altura, telefone, registro, salario);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void excluirCadastro(String nome) {
        String fileName = DIRECTORY_PATH + nome + ".txt";
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        } else {
            System.out.println("Arquivo não encontrado: " + fileName);
        }
    }
}
