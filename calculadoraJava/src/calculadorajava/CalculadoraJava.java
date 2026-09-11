
package calculadorajava;
import java.util.Scanner;

public class CalculadoraJava {

    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int opcao =0;
        do{
            System.out.println("-----Calculadora Java--------");
            System.out.println("Digite (1) para somar ! ");
            System.out.println("Digite (2) para subitrair !");
            System.out.println("Digite (3) para multiplicar ! ");
            System.out.println("Digite (4) para divisao !");
            System.out.println("Digite (0) para sair ! ");
            opcao = entrada.nextInt();
            
            if(opcao != 0){
                
                System.out.println("Digite o primeiro numero: ");
                double nun1 = entrada.nextDouble();
                
                System.out.println("Digite o segundo numero : ");
                double nun2 = entrada.nextDouble();
                
                double resultado = 0;
                
                switch (opcao){
                
                    case 1:
                        
                    resultado = nun1 + nun2; 
                    break;
                    
                    case 2: 
                    resultado = nun1 - nun2;
                    break;
                    
                    case 3:
                    resultado = nun1 * nun2;
                    break;
                    
                    case 4:
                    
                    if(nun1 != 0){
                        
                    resultado = nun1 / nun2;    
                    }else{
                        
                    System.out.println("Erro na divisao por 0 ! ");
                    }break;
                    
                default:
                    System.out.println("Opcao invalida");
                    
                }
                if(opcao >=1 && opcao <=4){
                    System.out.println("Resultado da Operacao = " + resultado);
                } 
            }
             
        }while(opcao!= 0); 
        
        System.out.println("Encerrando calculadora ! ");
        entrada.close();
    }  
}
