package parque;

public class Aparelhos {

    private int codigo;
    private String nome;
    private double valor;
    private int qtMaxima;
    private int qtPessoasNoAparelho;
    private int qtPessoasNoDia;
    private String operadorResponsavel;
    private boolean estado;

    public Aparelhos(int qtPessoasNoAparelho, int qtPessoasNoDia) {
        this.qtPessoasNoAparelho = qtPessoasNoAparelho;
        this.qtPessoasNoDia = qtPessoasNoDia;
    }

    //Gets e Sets dos Atributos de aparelho
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQtMaxima() {
        return qtMaxima;
    }

    public void setQtMaxima(int qtMaxima) {
        this.qtMaxima = qtMaxima;
    }

    public int getQtPessoasNoAparelho() {
        return qtPessoasNoAparelho;
    }

    public void setQtPessoasNoAparelho(int qtPessoasNoAparelho) {
        this.qtPessoasNoAparelho = qtPessoasNoAparelho;
    }

    public int getQtPessoasNoDia() {
        return qtPessoasNoDia;
    }

    public void setQtPessoasNoDia(int qtPessoasNoDia) {
        this.qtPessoasNoDia = qtPessoasNoDia;
    }

    public String getOperadorResponsavel() {
        return operadorResponsavel;
    }

    public void setOperadorResponsavel(String operadorResponsavel) {
        this.operadorResponsavel = operadorResponsavel;
    }

    public void Catraca() { 

        System.out.println("==================================================================");
        System.out.println("Quantidade de Pessoas que usaram o Aparelho nos ultimos minutos: " + this.qtPessoasNoAparelho);
        System.out.println("Quantidade de Pessoas que usaram o Aparelho durante o dia: " + this.qtPessoasNoDia);
        System.out.println("==================================================================");
    }
}
