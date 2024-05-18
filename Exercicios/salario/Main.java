package exercicios.salario;

public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Junior", 20.0, 160);
        Lider lider1 = new Lider("Tadeu", 25.0, 170);
        Gerente gerente1 = new Gerente("Romulo", 30.0, 180);

        double salarioFunc1 = func1.calcularSalario();
        double salarioLider1 = lider1.calcularSalario();
        double salarioGerente1 = gerente1.calcularSalario();
        
        System.out.println("Salário do Funcionário Jeferson : R$ " + salarioFunc1);
        System.out.println("Salário da Líder Celso: R$ " + salarioLider1);
        System.out.println("Salário do Gerente Maria: R$ " + salarioGerente1);
    }
}