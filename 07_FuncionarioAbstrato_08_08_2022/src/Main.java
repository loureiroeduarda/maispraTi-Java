public class Main {
    public static void main(String[] args) {
        Funcionario programador = new Programador("João", 30.00, 60);

        System.out.println(programador);
        System.out.println("Valor total a receber: R$ " + programador.valorTotalAReceber());
        System.out.println();

        Funcionario contador = new Contador("Fernando", 25.50, 65);

        System.out.println(contador);
        System.out.println("Valor total a receber: R$ " + contador.valorTotalAReceber());
        System.out.println();

        Funcionario administrador = new Administrador("Carlos", 35.00, 50);

        System.out.println(administrador);
        System.out.println("Valor total a receber: R$ " + administrador.valorTotalAReceber());
    }
}