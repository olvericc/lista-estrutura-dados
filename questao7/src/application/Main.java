package application;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ListaEncadeada listaProfessores = new ListaEncadeada();

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os nomes dos professores:");

        for (int i = 0; i < 5; i++)
        {
            System.out.print("Nome do professor " + (i + 1) + ": ");
            String nome = sc.nextLine();
            listaProfessores.adicionar(nome);
        }

        System.out.println("Listagem de Professores");
        System.out.println("\nProfessores gravados no banco de dados:");
        listaProfessores.percorrer();
    }
}
