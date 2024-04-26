package application;

public class Main
{
    public static void main(String[] args)
    {
        ListaEncadeada listaNumeros = new ListaEncadeada();

        listaNumeros.adicionarInicio(1);
        listaNumeros.adicionarFim(2);
        listaNumeros.adicionarInicio(0);
        listaNumeros.adicionarFim(3);
        listaNumeros.adicionarInicio(-1);
        listaNumeros.adicionarFim(4);
        listaNumeros.adicionarInicio(-2);
        listaNumeros.adicionarFim(5);
        listaNumeros.adicionarInicio(-3);
        listaNumeros.adicionarFim(6);
        listaNumeros.adicionarInicio(-4);
        listaNumeros.adicionarFim(7);

        listaNumeros.adicionarInicio(-5);
        listaNumeros.adicionarFim(8);

        listaNumeros.percorrer();
    }
}
