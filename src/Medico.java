public abstract class Medico extends Colaboradores {
    private int senha;
    private int crm;
    private double porcentagem;
    private boolean autenticado = false;

    //Método
    public boolean autenticado(){
        if(this.getSenha()== 1010){
            this.autenticado = true;
        }else {
            this.autenticado = false;
        }
        return autenticado;
    }
    public double produtividade(){
        return 0;
    }

    //Métodos Especiais

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }

    @Override
    public String descritivoColab() {
        return "Medico{" +"Salario = R$ " + this.getSalario() +
                ", CRA = " + this.getCra() +
                ", Nome = '" + this.getNome() + '\'' +
                ", CRM=" + this.crm +
                ", autenticado=" + this.autenticado +
                '}';
    }
}
