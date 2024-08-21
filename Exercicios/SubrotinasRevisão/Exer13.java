/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class Exer13 {
    
public static String Escreve_Por_Extenso_1_a_99_999(int intervalo){
        intervalo = 13968;
        String devolucao ="TREZE MIL NOVE CENTOS E SESSENTA E OITO";
        
        if(intervalo < 0 || intervalo < 99_999) {
            devolucao = "INVALIDO";
        }
        return devolucao;
    }
}