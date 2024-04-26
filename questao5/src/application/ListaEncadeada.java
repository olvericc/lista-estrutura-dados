package application;

public class ListaEncadeada
{
    private No inicio;
    private No fim;
    private static final int MAX_ELEMENTOS = 7;
    private int tamanho = 0;

    public void adicionarInicio(int valor)
    {
        if (tamanho < MAX_ELEMENTOS)
        {
            No novoNo = new No(valor);
            novoNo.setProximo(inicio);
            inicio = novoNo;

            if (fim == null)
            {
                fim = novoNo;
            }

            tamanho++;

            System.out.println("Valor adicionado no início da lista.");
        }
        else
        {
            System.out.println("Lista cheia. Não é possível adicionar mais elementos.");
        }
    }

    public void adicionarFim(int valor)
    {
        if (tamanho < MAX_ELEMENTOS)
        {
            No novoNo = new No(valor);

            if (inicio == null)
            {
                inicio = novoNo;
            }
            else
            {
                fim.setProximo(novoNo);
            }

            fim = novoNo;
            tamanho++;
            System.out.println("Valor adicionado no fim da lista.");
        }
        else
        {
            System.out.println("Lista cheia. Não é possível adicionar mais elementos.");
        }
    }

    public void percorrer()
    {
        No atual = inicio;
        int posicao = 0;

        while (atual != null)
        {
            System.out.println("Posição: " + posicao + ", Valor: " + atual.getValor());
            atual = atual.getProximo();
            posicao++;
        }
    }

    public int buscarComRecursividade(int valorBuscado, No atual, int posicaoAtual)
    {
        if (atual == null)
        {
            return -1;
        }
        if (atual.getValor() == valorBuscado)
        {
            return posicaoAtual;
        }

        return buscarComRecursividade(valorBuscado, atual.getProximo(), posicaoAtual + 1);
    }
}
