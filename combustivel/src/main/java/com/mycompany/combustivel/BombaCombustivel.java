/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.combustivel;

/**
 *
 * @author vitor
 */
public class BombaCombustivel {
    public BombaCombustivel() {
    }
   private String TipoCombustivel; 
   private double valorPorLitro;
   private double quantidadeCombustivel;
   

    public String getTipoCombustivel() {
        return TipoCombustivel;
    }

    public void setTipoCombustivel(String TipoCombustivel) {
        this.TipoCombustivel = TipoCombustivel;
    }

    public double getValorPorLitro() {
        return valorPorLitro;
    }

    public void setValorPorLitro(double valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
   public double abastecerPorValor(){
        return quantidadeCombustivel/valorPorLitro;
   }
   public double abastecerPorLitro(){
       return quantidadeCombustivel*valorPorLitro;
   }
   public void alterarValor(double NovoValor){
       valorPorLitro = NovoValor;
   }
   public void alterearCombustivel(String combustivel){
       TipoCombustivel = combustivel;
   }
   public void alterarQuantidade(double NovaQuantidade){
        quantidadeCombustivel = NovaQuantidade;
   }
}
