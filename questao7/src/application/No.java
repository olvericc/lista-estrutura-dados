package application;

public class No
{
    private String valor;
    private No proximo;

    public No(String valor)
    {
        this.valor = valor;
    }

    public String getValor()
    {
        return valor;
    }

    public void setValor(String valor)
    {
        this.valor = valor;
    }

    public No getProximo()
    {
        return proximo;
    }

    public void setProximo(No proximo)
    {
        this.proximo = proximo;
    }
}
