package application;

public class Main
{
    public static void main(String[] args)
    {
        ListaEncadeada listaNumeros = new ListaEncadeada();

        for (int i = 1; i <= 15; i++)
        {
            listaNumeros.adicionar(i);
        }

        System.out.println("Percorrendo a lista seria: ");
        listaNumeros.percorrer();

        int valorBuscado = 7;

        int posicao = listaNumeros.buscarComRecursividade(valorBuscado, listaNumeros.inicio, 0);

        if (posicao != -1)
        {
            System.out.println("Valor " + valorBuscado + " encontrado na posição: " + posicao);
        }
        else
        {
            System.out.println("Valor " + valorBuscado + " não encontrado na lista.");
        }
    }
}
