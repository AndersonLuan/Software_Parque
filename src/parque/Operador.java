package parque;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Operador extends Pessoa {

    private int tempoTrabalho;
    private String aparelhoGerencia;

    public ArrayList<String> ListaClientes = new ArrayList();   //Array List para armazenar os clientes cadastrados

    Scanner scan = new Scanner(System.in);

    public void LigarAparelho(Aparelhos carrosel) { // Ligar o aparelho

        boolean l = carrosel.isEstado();
        l = true;
        System.out.println("Status do Aparelho: " + l + ", O Aparelho esta Ligado! ");
        System.out.println("Duração: 10 Segundos.");
    }

    public void DesligarAparelho(Aparelhos carrosel) {  //Desligar o aparelho após 10 segundos
        Timer cronometro = new Timer();
        TimerTask tarefa = new TimerTask() {

            @Override
            public void run() {

                boolean d = carrosel.isEstado();
                d = false;
                System.out.println("************************************************");
                System.out.println("10 Segundos se passaram!");
                System.out.println("Status do Aparelho: " + d + ",O Aparelho esta Desligado! ");
                System.exit(0);
            }
        };
        int milissegundos = 10000;      //Timer de 10 Segundos
        cronometro.schedule(tarefa, milissegundos);

    }

    public void CadastroCliente() {   //Menu para cadastrar cpf do cliente e visualizar os clientes cadastrados.
        try {
            int opcao;
            while (true) {

                System.out.println("\n Escolha uma das seguintes opções:\n\n"
                        + " 1 - Inserir CPF do Cliente\n"
                        + " 2 - Visualizar Cliente Cadastrado\n"
                        + " 3 - Sair\n");

                System.out.print(" Opção escolhida: ");
                opcao = scan.nextInt();

                switch (opcao) {

                    case 1:
                        scan.nextLine();
                        System.out.print("\n CPF do Cliente: ");
                        this.cpf = scan.nextLine();
                        ListaClientes.add(this.cpf);
                        break;

                    case 2:
                        System.out.println("===================================================");
                        System.out.println("CPF do Cliente Cadastrado:" + ListaClientes);
                        break;

                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println(" Opção inexistente! Tente novamente.\n\n");

                }
            }
        } catch (InputMismatchException inputMismatchException)    //Excecption caso o cliente digite um caractere invalido
        {
            System.out.println("Caracter inválido!" + "\n" + inputMismatchException);
        }
    }

    public ArrayList<String> getListaClientes() {
        return ListaClientes;
    }

    public void CadastrarPlano(Cliente cliente, Plano plano) {
        int opcao2;
        double valor;       //Menu para: cadastrar o plano do cliente, colocar créditos e
        // verificar se o cliente pode entrar no aparelho.

        while (true) {
            System.out.println("\n Escolha o Plano Desejado: \n"
                    + " 1 - Bronze\n"
                    + " 2 - Silver\n"
                    + " 3 - Para creditar o Plano Escolhido.\n"
                    + " 4 - Verificar se o Cliente pode usar o aparelho. \n\n"
                    + " 5 - Sair.\n\n");

            System.out.print(" Opção escolhida: ");
            opcao2 = scan.nextInt();

            switch (opcao2) {
                case 1:
                    scan.nextLine();
                    cliente.setPlanoEscolhido(0);
                    System.out.println("\nPlano Bronze" + "(" + cliente.getPlanoEscolhido() + ")" + "adquirido!");
                    break;

                case 2:
                    cliente.setPlanoEscolhido(1);
                    System.out.println("\nPlano Silver" + "(" + cliente.getPlanoEscolhido() + ")" + "adquirido!");
                    break;

                case 3:
                    System.out.println("===================================================");
                    System.out.println("================ Creditar Plano ===================");
                    System.out.println("Digite o valor: ");
                    valor = scan.nextDouble();
                    System.out.println("Foi creditado o valor de " + valor + " com sucesso!");
                    System.out.println("===================================================");
                    break;
                case 4:
                    PermitirAcesso(cliente);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println(" Opção inexistente! Tente novamente.\n\n");
            }
        }
    }

    public void PermitirAcesso(Cliente c) {  //Chamado no método CadastrarPlano()  

          if (c.getPlanoEscolhido() == 0) {
            System.out.println("\n****************************************");
            System.out.println("Seu plano é Bronze!");
            System.out.println("Só é permitido a entrada uma unica vez!");
            System.out.println("*****************************************\n");
        } if (c.getPlanoEscolhido() == 1) {
            System.out.println("****************************************\n");
            System.out.println("Seu plano é Silver!");
            System.out.println("Pode usar mais 2 vezes!");
            System.out.println("****************************************\n");
        } if (c.getPlanoEscolhido() == 2) {
            System.out.println("****************************************\n");
            System.out.println("Seu plano é Gold!");
            System.out.println("Uso Ilimitado!");
            System.out.println("****************************************\n");
        }
        else {
            System.out.println("Cliente sem plano cadastrado.");
        }
    }

    public void VisualizarGerente(Gerente gerente) { //Visualizar o atual gerente do parque
        System.out.println(gerente.getNome());
        System.out.println(gerente.getCpf());
        System.out.println(gerente.getEnderecoCompleto());
    }

}
