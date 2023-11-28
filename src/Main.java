import Work.Cargo;
import Work.Departamento;
import Work.Funcionario;
import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome do departamento:");
        String departamentoNome = scanner.nextLine();
        Departamento departamento = new Departamento(departamentoNome);

        System.out.println("Insira o nome do cargo:");
        String cargoNome = scanner.nextLine();
        System.out.println("Insira o salario base:");
        double cargoSalarioBase = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Insira os benefícios do cargo:");
        String cargoBeneficios = scanner.nextLine();
        Cargo cargo = new Cargo(cargoNome, cargoSalarioBase, cargoBeneficios);

        System.out.println("Insira o nome do funcionário:");
        String funcionarioNome = scanner.nextLine();
        System.out.println("Insira a quantidade de horas que ele trabalhou:");
        int funcionarioHoras = scanner.nextInt();
        scanner.nextLine();
        Funcionario funcionario = new Funcionario(funcionarioNome, cargo, cargo.getSalarioBase(), funcionarioHoras);

        System.out.println("----------------------------");
        System.out.println("Nome funcionario: " + funcionario.getNome());
        System.out.println("Trabalho.Cargo do funcionário: " + funcionario.getCargo().getNome());
        System.out.println("Salário do funcionário: R$" + String.format("%.2f", funcionario.calcularSalario()));
        System.out.println("----------------------------");
    }
}