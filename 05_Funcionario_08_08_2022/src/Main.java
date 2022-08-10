import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> listaDeFuncionarios = new ArrayList<>();

        listaDeFuncionarios.add(new Funcionario("João", "Psicólogo", "RH"));
        listaDeFuncionarios.add(new Funcionario("Maria", "Contadora", "Financeiro"));
        listaDeFuncionarios.add(new Funcionario("Ana Luiza", "Secretária", "Recepção"));
        listaDeFuncionarios.add(new Funcionario("Carlos", "Porteiro", "Portaria"));
        listaDeFuncionarios.add(new Funcionario("Helena", "Diretora Executiva", "Diretoria"));
        listaDeFuncionarios.add(new Funcionario("Marcos", "Gerente de Produção", "Produção"));
        listaDeFuncionarios.add(new Funcionario("Viviane", "Psicóloga", "RH"));
        listaDeFuncionarios.add(new Funcionario("Clara", "Advogada", "Jurídico"));
        listaDeFuncionarios.add(new Funcionario("Felipe", "Advogado", "Jurídico"));
        listaDeFuncionarios.add(new Funcionario("Martin", "Diretor Financeiro", "Diretoria"));

        for(Funcionario funcionario : listaDeFuncionarios){
            System.out.println(funcionario);
            System.out.println();
        }

    }
}