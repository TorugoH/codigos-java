/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package PrecoIngresso;

public class App {
   

    public static void main(String[] args) {
            Ingresso ingresso = new Ingresso();
            IngressoVip vip = new IngressoVip();
            System.out.println(ingresso.getValor());
            System.out.println(vip.valorVip());
            
    }
}