package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CadastroLivro {

    private static final String DIRECTORY_PATH = "cadastroslivros/";

    static {
        File directory = new File(DIRECTORY_PATH);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }

    public static void salvarLivro(Livro livro) {
        String fileName = DIRECTORY_PATH + livro.getTitulo() + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(livro.getTitulo() + "\n");
            writer.write(livro.getAutor() + "\n");
            writer.write(livro.getAnoPublicacao() + "\n");
            writer.write(livro.getGenero() + "\n");

            System.out.println("Salvando Livro: " + livro.getTitulo());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Livro lerLivro(String titulo) {
        String fileName = DIRECTORY_PATH + titulo + ".txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String tituloLivro = reader.readLine();
            String autor = reader.readLine();
            int anoPublicacao = Integer.parseInt(reader.readLine());
            String genero = reader.readLine();

            return new Livro(tituloLivro, autor, anoPublicacao, genero);
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void excluirLivro(String titulo) {
        String fileName = DIRECTORY_PATH + titulo + ".txt";
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
            System.out.println("Livro excluído: " + titulo);
        } else {
            System.out.println("Arquivo não encontrado: " + fileName);
        }
    }

    public static List<Livro> listarLivros() {
        List<Livro> livros = new ArrayList<>();
        File directory = new File(DIRECTORY_PATH);

        if (directory.exists()) {
            for (File file : directory.listFiles()) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String titulo = reader.readLine();
                    String autor = reader.readLine();
                    int anoPublicacao = Integer.parseInt(reader.readLine());
                    String genero = reader.readLine();

                    livros.add(new Livro(titulo, autor, anoPublicacao, genero));
                } catch (IOException | NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        }

        return livros;
    }
}
