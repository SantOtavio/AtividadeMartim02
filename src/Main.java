import classes.CadastroAssociados;
import classes.ContaFinanceira;
import classes.ControleDeMensalidades;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CadastroAssociados associado = new CadastroAssociados();
        System.out.println("Digite o nome do associado:");
        associado.setNome(scanner.nextLine());
        System.out.println("Digite o CPF do associado:");
        associado.setCpf(scanner.nextFloat());

        System.out.println("Informações do Associado:");
        System.out.println("Nome: " + associado.getNome());
        System.out.println("CPF: " + associado.getCpf());

        ControleDeMensalidades mensalidade = new ControleDeMensalidades();
        System.out.println("Digite o valor total da mensalidade:");
        mensalidade.setValorTotal(scanner.nextFloat());
        System.out.println("Mensalidade registrada com valor: " + mensalidade.getValorTotal());

        ContaFinanceira conta = new ContaFinanceira();
        System.out.println("Saldo atual da conta financeira: R$ " + conta.getSaldoAtual());

        scanner.close();
    }
}