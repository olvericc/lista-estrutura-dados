package application;

public class Main
{
    public static void main(String[] args)
    {
        ListaEncadeada<Professor> listaProfessores = new ListaEncadeada<>();

        listaProfessores.add(new Professor("Ângela Peixoto"));
        listaProfessores.add(new Professor("André Magalhães"));
        listaProfessores.add(new Professor("Marco Câmara"));

        System.out.println("Tamanho da lista: " + listaProfessores.tamanho() + '\'');

        System.out.println("Lista vazia? " + listaProfessores.estaVazia() + '\'');

        System.out.println("Lista de professores:");
        listaProfessores.listar();

        listaProfessores.remover(new Professor("Segundo Professor"));

        listaProfessores.apagarLista();

        System.out.println("Lista vazia após apagar? " + listaProfessores.estaVazia() + '\'');
    }
}
