package Agenda;
import java.util.Scanner;

public class App {
  

    public static void main(String[] args) {
       // Pessoas [] CadastroPessoas = new Pessoas[3];
       Pessoas  CadastroPessoas = new Pessoas();
        Scanner readLine = new Scanner(System.in);
        int opc=1;
        while(opc!=0){
            System.out.println("1- Cadastra novo usuario");
            System.out.println("2- Mostrar agenda");
            System.out.println("3- Buscar Pessoa");
            System.out.println("4- Imprimir Pessoa");
            switch(opc=readLine.nextInt()){
                case 1:
                    CadastroPessoas.armazenarPessoas();
                    break;
                case 2:
                    CadastroPessoas.imprimirAgenda();
                    break;
                case 3:
                    System.out.println("Insira o nome que deseja buscar");
                    System.out.println(CadastroPessoas.buscarPessoa(readLine.next()));
                    break;
                case 4:
                    System.out.println("Informe a posicao da pessoa");
                    CadastroPessoas.imprimirPessoa(readLine.nextInt());
                    
            }
        }
            
    }
}
