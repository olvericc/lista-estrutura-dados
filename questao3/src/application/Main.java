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
    }
}
