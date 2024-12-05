package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CadastroFuncionario {

    private static final String DIRECTORY_PATH = "cadastrosfuncionarios/";

    static {
        File directory = new File(DIRECTORY_PATH);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }

    public static void salvarCadastro(Funcionario funcionario) {
        String fileName = DIRECTORY_PATH + funcionario.getNome() + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(funcionario.getNome() + "\n");
            writer.write(funcionario.getIdade() + "\n");
            writer.write(funcionario.getEndereco() + "\n");
            writer.write(funcionario.getSexo() + "\n");
            writer.write(funcionario.getAltura() + "\n");
            writer.write(funcionario.getTelefone() + "\n");
            writer.write(funcionario.getRegistro() + "\n");
            writer.write(funcionario.getSalario() + "\n");

            System.out.println("Salvando Funcionário: " + funcionario.getNome());
            System.out.println("Registro: " + funcionario.getRegistro());
            System.out.println("Salário: " + funcionario.getSalario());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static Funcionario lerCadastro(String nome) {
        String fileName = DIRECTORY_PATH + nome + ".txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String nomeFuncionario = reader.readLine();
            int idade = Integer.parseInt(reader.readLine());
            String endereco = reader.readLine();
            char sexo = reader.readLine().charAt(0);
            float altura = Float.parseFloat(reader.readLine());
            String telefone = reader.readLine();
            String registro = reader.readLine();
            float salario = Float.parseFloat(reader.readLine());

            System.out.println("Nome: " + nomeFuncionario);
            System.out.println("Idade: " + idade);
            System.out.println("Endereço: " + endereco);
            System.out.println("Sexo: " + sexo);
            System.out.println("Altura: " + altura);
            System.out.println("Telefone: " + telefone);
            System.out.println("Registro: " + registro);
            System.out.println("Salário: " + salario);

            return new Funcionario(nomeFuncionario, idade, endereco, sexo, altura, telefone, registro, salario);
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
