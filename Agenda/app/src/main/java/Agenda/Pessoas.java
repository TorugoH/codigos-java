package Agenda;
import java.util.Scanner;
/**
 * @author vitor
 */
public class Pessoas {
    private String nome;
    private int idade;
    private float altura;
    private String [] agenda = new String [3];
    int i,index;
    Scanner readLine = new Scanner(System.in);
    Pessoas [] CadastroPessoas = new Pessoas[3];
    public Pessoas(){
    
    }
    public String[] getAgenda() {
        return agenda;
    }

    public void setAgenda(String[] agenda) {
        this.agenda = agenda;
    }
    
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void armazenarPessoas(){
        for(i=0;i<3;i++){
            CadastroPessoas[i] = new  Pessoas();
            System.out.println("Informe o nome");
            CadastroPessoas[i].setNome(readLine.next());
            System.out.println("Informe a idadae");
            CadastroPessoas[i].setIdade(readLine.nextInt());
            System.out.println("Infome a altura");
            CadastroPessoas[i].setAltura(readLine.nextFloat());
        }
    
    }
    public void removerPessoas( int posicao){
        agenda[posicao] = " ";
    }
    public void imprimirAgenda(){
        int i;
      for(i=0;i<CadastroPessoas.length;i++){
          
           System.out.println(i+" "+CadastroPessoas[i].getNome()+" "+CadastroPessoas[i].getIdade()+" "+CadastroPessoas[i].getAltura());
        }
    }
    public int buscarPessoa(String nome){
        int i;
        for(i=0;i<CadastroPessoas.length;i++){
            if(CadastroPessoas[i].getNome().equals(nome)){
                index=i;
            }
        }
        return index;
    }
    public void imprimirPessoa(int index){
        System.out.println(CadastroPessoas[index].getNome());
        System.out.println(CadastroPessoas[index].getIdade());
        System.out.println(CadastroPessoas[index].getAltura());
    }
}      

