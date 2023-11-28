package Work;

public class Cargo {

    private String nome;
    private double salarioBase;
    private String beneficios;

    public Cargo(String nome, double salarioBase, String beneficios) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.beneficios = beneficios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }
}