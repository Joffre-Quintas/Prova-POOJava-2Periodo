public class ClinicoGeral extends Medico {
    double porcentagem = 0.2;
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
}
