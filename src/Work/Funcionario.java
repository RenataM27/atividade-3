package Work;

public class Funcionario {

    private String nome;
    private Cargo cargo;
    private double salario;
    private int horasDeTrabalho;

    public Funcionario(String nome, Cargo cargo, double salario, int horasDeTrabalho) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.horasDeTrabalho = horasDeTrabalho;
    }

    public void atribuirCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void registrarHorasTrabalho(int horas) {
        this.horasDeTrabalho = horas;
    }

    public double calcularSalario() {
        return this.horasDeTrabalho * this.salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHorasDeTrabalho() {
        return horasDeTrabalho;
    }

    public void setHorasDeTrabalho(int horasDeTrabalho) {
        this.horasDeTrabalho = horasDeTrabalho;
    }
}
