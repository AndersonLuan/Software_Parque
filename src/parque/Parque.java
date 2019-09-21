
package parque;

public class Parque {

    public static void main(String[] args) {
        //Instancia dos objetos para usar como parâmetro nos metodos
        Cliente cliente = new Cliente("Anderson","555.555.55-5");
        Plano plano = new Plano();
        Operador operador1 = new Operador();
        Aparelhos carrosel = new Aparelhos(10,100); 
        Gerente gerente = new Gerente("João","222.222.22-2","Ondina");
        
       
        //gerente.CadastrarOperador();
        //gerente.VisualizarOperadores();
        
        //gerente.RegistrarAparelho(carrosel);
        //gerente.VisualizarAparelho();
        
        //operador1.CadastroCliente();
        //operador1.CadastrarPlano(cliente, plano);
        //gerente.AtribuirPlanoGold(cliente);
        
        //operador1.LigarAparelho(carrosel);
        //operador1.DesligarAparelho(carrosel);
        
       
        //gerente.VisualizarCatraca(carrosel);
        
        
        
        
        
        
        
    }
        
  
}
