package application;

public class ListaEncadeada<T>
{
    private No<T> inicio = null;
    private No<T> fim = null;

    public void add(T carga)
    {
        No<T> no = new No<>(carga);
        if (inicio == null)
        {
            this.inicio = no;
        }
        else
        {
            this.fim.setProximo(no);
        }
        this.fim = no;
    }

    public void remover(T carga)
    {
        if (inicio == null) return;

        if (inicio.getCarga().equals(carga))
        {
            inicio = inicio.getProximo();
            if (inicio == null) fim = null;
            return;
        }

        No<T> atual = inicio;

        while (atual.getProximo() != null && !atual.getProximo().getCarga().equals(carga))
        {
            atual = atual.getProximo();
        }

        if (atual.getProximo() != null)
        {
            atual.setProximo(atual.getProximo().getProximo());
            if (atual.getProximo() == null) fim = atual;
        }
    }

    public int tamanho()
    {
        int contador = 0;

        No<T> atual = inicio;

        while (atual != null)
        {
            contador++;
            atual = atual.getProximo();
        }

        return contador;
    }

    public boolean estaVazia()
    {
        return inicio == null;
    }

    public void apagarLista()
    {
        inicio = null;
        fim = null;
    }

    public void listar()
    {
        No<T> atual = inicio;

        while (atual != null)
        {
            System.out.println(atual.getCarga());
            atual = atual.getProximo();
        }
    }
}
