/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author alxdr
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 = 3;
        int n2 = 5;
        float m = n1+n2/2;
        System.out.println("A media e igual a " + m);*/
        
        /*int numero = 10;
        int valor = 4 + numero++;
        System.out.println(valor);
        System.out.println(numero);*/
        
        int x1 = 4;
        int x2 = 4;
        int x3 = 4;
        int x4 = 4;
        int x5 = 4;
        x1 += 3; // x = x + 3
        x2 -= 4; // x = x - 4
        x3 *= 2; // x = x * 2
        x4 /= 2; // x = x / 2
        x5 %= 3; // x = x % 3        
        
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);
        
        System.out.println(Math.PI);
        System.out.println(Math.pow(5, 2));
        System.out.println(Math.sqrt(144));
        System.out.println(Math.cbrt(27));
        
        float v = 8.4f;
        System.out.println(Math.round(v));
        
        double ale = Math.random();
        int n = (int) (0 + ale * (11-0));
        System.out.println(n);
        
    }
    
}
