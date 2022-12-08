public class Cardiologista extends Medico {
    double porcentagem = 0.3;
    double bonus;

    @Override
    public double produtividade() {
        this.setBonus(getSalario() * this.porcentagem);
        return this.bonus;
    }

    public double getBonus() {
        return bonus;
    }

    private void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
