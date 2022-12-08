public class Main{
    public static void main(String[] args) {
        RH r1 = new RH();
        r1.setNome("Jurema");
        r1.setSalario(1800);
        r1.setCra(1);

        Financeiro f1 = new Financeiro();
        f1.setNome("Creuza");
        f1.setSalario(2000);
        f1.setCra(2);

        System.out.println(r1.descritivoColab());
        System.out.println(f1.descritivoColab());

        Cardiologista c1 = new Cardiologista();
        c1.setNome("Neymar");
        c1.setCrm(123);
        c1.setCra(123);
        c1.setSenha(1010);
        c1.setSalario(18500);
        c1.isAutenticado();

        System.out.println(c1.descritivoColab());
        c1.autenticado();
        System.out.println(c1.descritivoColab());

        ClinicoGeral cg1 = new ClinicoGeral();
        cg1.setNome("Vini Jr");
        cg1.setCrm(1234);
        cg1.setCra(1234);
        cg1.setSenha(1010);
        cg1.setSalario(12000);

        System.out.println(cg1.descritivoColab());

        Dentista d1 = new Dentista();
        d1.setNome("Thiago Silva");
        d1.setCrm(12345);
        d1.setCra(12345);
        d1.setSenha(1010);
        d1.setSalario(8000);

        System.out.println(d1.descritivoColab());



        System.out.println("A soma da folha de pagemento do setor de RH e do financeiro é de: R$ " + (r1.getSalario() + f1.getSalario()));
        System.out.println("A soma da folha de pagamento dos médicos é de: R$ " + (c1.getSalario()+c1.produtividade()+ cg1.getSalario()+cg1.produtividade()+d1.getSalario()+d1.produtividade()));
    }
}