package parque;

import java.util.ArrayList;
import java.util.Scanner;

public class Gerente extends Pessoa {

    public ArrayList<String> ListaAparelhos = new ArrayList();
    public ArrayList<String> ListaOperadores = new ArrayList();

    Scanner scan = new Scanner(System.in);

    public Gerente(String nome, String cpf, String enderecoCompleto) {
        this.nome = nome;
        this.cpf = cpf;
        this.enderecoCompleto = enderecoCompleto;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }

    @Override
    public void setEnderecoCompleto(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }

    public void VisualizarOperadores() {    //Visualizar os operadores cadastrados na ArrayList
        System.out.println("============= Operador Registrado com Sucesso! ==================");
        System.out.println("Lista de Operadores Registrados: " + "\n" + ListaOperadores);
        System.out.println("=================================================================");

    }

    public void VisualizarAparelho() {    //Visualizar os aparelhos cadastrados na ArrayList

        System.out.println("============= Aparelho Registrado com Sucesso! ==================");
        System.out.println("Lista de Aparelhos Registrados: " + "\n" + ListaAparelhos);
        System.out.println("=================================================================");

    }

    public void RegistrarAparelho(Aparelhos carrosel) { //Armazenar o aparelho na ArrayList

        System.out.println("Informe o Nome do Aparelho: ");
        ListaAparelhos.add(scan.nextLine());
        System.out.println("Informe o valor: ");
        ListaAparelhos.add(Double.toString(scan.nextDouble()));
        System.out.println("Informe a quantidade maxima de pessoas que o aparelho suporta: ");
        ListaAparelhos.add(Integer.toString(scan.nextInt()));

    }

    public void CadastrarOperador() { //Armazenar as informações do operador na ArrayList

        System.out.println("Informe o nome do Operador: ");
        ListaOperadores.add(scan.nextLine());
        System.out.println("Informe o cpf do Operador: ");
        ListaOperadores.add(scan.nextLine());
        System.out.println("Informe a data de nascimento: ");
        ListaOperadores.add(scan.nextLine());
    }

    public void AtribuirPlanoGold(Cliente cliente_gold) {    //Setar o plano do cliente para Gold
            
        cliente_gold.setPlanoEscolhido(2);
        System.out.println("O cliente: " + cliente_gold.getNome() + " adquiriu o plano Gold!" + "(" + cliente_gold.getPlanoEscolhido() + ")");
    }

    public void VisualizarCatraca(Aparelhos a) { //Visualizar todos as pessoas que usaram o aparelho durante o dia
        
        System.out.println("==================================================================");
        System.out.println("Quantidade de Pessoas que usaram o Aparelho nos ultimos minutos: " + a.getQtPessoasNoAparelho() + " pessoas");
        System.out.println("Quantidade de Pessoas que usaram o Aparelho durante o dia: " + a.getQtPessoasNoDia() + " pessoas");
        System.out.println("==================================================================");
    }

    public void VisualizarClientes(Operador p) {  
        System.out.println("Lista de clientes cadastrados: " + p.getListaClientes());

    }

}
