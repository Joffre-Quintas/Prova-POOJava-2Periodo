public abstract class Colaboradores {
    //Atributos
    private double salario;
    private int cra;
    private String nome;

    //Métodos Especiais
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCra() {
        return cra;
    }

    public void setCra(int cra) {
        this.cra = cra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String descritivoColab() {
        return "Colaboradores{" +
                "Salario = R$ " + salario +
                ", CRA = " + cra +
                ", Nome = '" + nome + '\'' +
                '}';
    }
}
