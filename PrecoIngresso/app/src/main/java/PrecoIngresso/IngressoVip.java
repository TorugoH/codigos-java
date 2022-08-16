/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrecoIngresso;

/**
 *
 * @author vitor
 */
public class IngressoVip extends Ingresso{
    public IngressoVip(){
        super();
    }
    double valorComAgressimo;
    public double valorVip(){
        valorComAgressimo =(super.getValor()*0.10)+super.getValor();
        return valorComAgressimo;
    }
}
