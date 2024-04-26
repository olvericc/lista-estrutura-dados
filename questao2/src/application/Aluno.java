package application;

public class Aluno
{
    private final String nome;
    private final String matricula;

    public Aluno(String nome, String matricula)
    {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome()
    {
        return nome;
    }

    public String getMatricula()
    {
        return matricula;
    }

    @Override
    public String toString()
    {
        return "Dados do Aluno, " + '\'' +
                "Nome: '" + nome + '\'' +
                "Matrícula: '" + matricula + '\'';
    }
}
