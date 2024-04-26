package application;

public class ListaEncadeada
{
    private No inicio;
    private No fim;

    public void adicionar(Aluno aluno)
    {
        No novoNo = new No(aluno);

        if (inicio == null)
        {
            inicio = novoNo;
        }
        else
        {
            fim.setProximo(novoNo);
        }
        fim = novoNo;
    }

    public void remover(String matricula)
    {
        if (inicio == null) return;

        if (inicio.getAluno().getMatricula().equals(matricula))
        {
            inicio = inicio.getProximo();
            if (inicio == null) fim = null;
            return;
        }

        No atual = inicio;

        while (atual.getProximo() != null && !atual.getProximo().getAluno().getMatricula().equals(matricula))
        {
            atual = atual.getProximo();
        }
        if (atual.getProximo() != null)
        {
            atual.setProximo(atual.getProximo().getProximo());
            if (atual.getProximo() == null) fim = atual;
        }
    }

    public Aluno pesquisar(String matricula)
    {
        No atual = inicio;

        while (atual != null)
        {
            if (atual.getAluno().getMatricula().equals(matricula))
            {
                return atual.getAluno();
            }
            atual = atual.getProximo();
        }

        return null;
    }

    public void listar()
    {
        No atual = inicio;

        while (atual != null)
        {
            System.out.println(atual.getAluno());
            atual = atual.getProximo();
        }
    }
}
