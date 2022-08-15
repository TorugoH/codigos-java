
package com.mycompany.combustivel;
import java.util.Scanner;
/**
 *
 * @author vitor
 */
public class Combustivel {

    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       BombaCombustivel bomba = new BombaCombustivel();
       System.out.println("Informe a quantidade de combustivel");
       bomba.setQuantidadeCombustivel(leitor.nextDouble());
       System.out.println("Tipo de combustivel");
       bomba.setTipoCombustivel(leitor.next());
       System.out.println("Informe o valor por litro");
       bomba.setValorPorLitro(leitor.nextDouble());
       int opc=1;
       while(opc!=0){
           System.out.println("1- Abastecer por litro");
           System.out.println("2- Abastecer por valor");
           System.out.println("3- Alterar a quantidade");
           System.out.println("4- Alterar o valor do litro");
           System.out.println("5- Alterar o combustivel");
              switch(opc = leitor.nextInt()){
           case 1:
               System.out.println(bomba.abastecerPorLitro());
               break;
           case 2:
               System.out.println(bomba.abastecerPorValor());
               break;
           case 3:
               System.out.println("Informe a nova quantidade");
               bomba.alterarQuantidade(leitor.nextDouble());
               break;
           case 4: 
               System.out.println("Informe o novo valor");
               bomba.alterarValor(leitor.nextDouble());
               break;
           case 5:
               System.out.println("Informe o combustivel");
               bomba.alterearCombustivel(leitor.next());
               break;
           case 6:
               System.out.println(bomba.getValorPorLitro());
               break;
           default:
               System.out.println("Informe uma opcao valida");
             }
        
       }
     
       
       //System.out.println(bomba.abastecerPorValor());
    }
}
