package application;

public class ListaEncadeada
{
    private No inicio;
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
}
