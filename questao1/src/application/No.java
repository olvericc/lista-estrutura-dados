package application;

public class No<T>
{
    private final T carga;
    private No<T> proximo;

    public No(T carga)
    {
        this.carga = carga;
    }

    public T getCarga()
    {
        return carga;
    }

    public No<T> getProximo()
    {
        return proximo;
    }

    public void setProximo(No<T> proximo)
    {
        this.proximo = proximo;
    }
}
