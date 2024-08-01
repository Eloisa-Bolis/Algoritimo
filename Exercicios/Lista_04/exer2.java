/*
Escreva um algoritmo que calcule os seguintes logaritmos:
a) log2
(1024 )
b) log3
(2187)
c) log5
(390625)
d) log1,01 (1,104622125)
e) log2,5 (244,140625)
 */
public class exer2 {
    public static void main(String[] args) {
        
        double log_2_1024 = Math.log(1024) / Math.log(2);
        double log_3_2187 = Math.log(2187) / Math.log(3);
        double log_3_390625 = Math.log(390625) / Math.log(3);
        double log_101_1104 = Math.log(1104) / Math.log(1.01);
        double log_25_244 = Math.log(244) / Math.log(2.5);
        
        System.out.println(log_2_1024);
        System.out.println(log_3_2187);
        System.out.println(log_3_390625);
        System.out.println(log_101_1104);
        System.out.println(log_25_244);

    }
    
}
