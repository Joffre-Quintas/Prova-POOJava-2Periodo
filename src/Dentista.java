public class Dentista extends Medico{
    double porcentagem = 0.1;
    private int cro;
    double bonus;

    @Override
    public double produtividade() {
        this.setBonus(getSalario() * this.porcentagem);
        return this.bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    //Métodos Especiais

    public int getCro() {
        return cro;
    }

    public void setCro(int cro) {
        this.cro = cro;
    }
}
