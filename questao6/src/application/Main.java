package application;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ListaEncadeada listaPrimos = new ListaEncadeada();

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe pelo menos 5 números:");

        for (int i = 0; i < 5; i++)
        {
            int numero = sc.nextInt();

            if (numeroPrimo(numero))
            {
                listaPrimos.adicionar(numero);
                System.out.println(numero + " é primo e foi adicionado à lista.");
            } else {
                System.out.println(numero + " não é primo.");
            }
        }

        System.out.println("Números primos na lista:");
        listaPrimos.percorrer();
    }

    private static boolean numeroPrimo(int numero)
    {
        if (numero <= 1)
        {
            return false;
        }
        for (int i = 2; i < numero; i++)
        {
            if (numero % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
