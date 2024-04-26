package application;

public class ListaEncadeada
{
    No inicio;
    private No fim;

    public void adicionar(int valor)
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
