package application;

public class Main
{
    public static void main(String[] args)
    {
        ListaEncadeada listaAlunos = new ListaEncadeada();

        listaAlunos.adicionar(new Aluno("Eric Lopes", "200028551"));
        listaAlunos.adicionar(new Aluno("Sofia Andrade", "200029857"));
        listaAlunos.adicionar(new Aluno("Diego Silva", "200028559"));

        System.out.println("Lista de alunos:");
        listaAlunos.listar();

        String matriculaBuscada = "200028551";

        Aluno alunoEncontrado = listaAlunos.pesquisar(matriculaBuscada);

        System.out.println(alunoEncontrado != null ? "Aluno encontrado: " + alunoEncontrado : "Aluno não encontrado.");

        listaAlunos.remover("200029857");

        System.out.println("Lista de alunos após remoção:");
        listaAlunos.listar();
    }
}
