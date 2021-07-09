/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop10;

/**
 *
 * @author USER
 */
public class MPOOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mensajes[] = {"primero","segundo","tercero"};
        try{
            for (int i = 0; i <=3; i++) {
                System.out.println(mensajes[i]);

            }
        }catch(ArrayIndexOutOfBoundsException aioob){
            System.out.println("Error, tu apuntador se salio del radio");
        } 
        
        System.out.println("##########EJ-2#############");
        int a=99, b=0;
        try{
            int c =a/b;
            System.out.println("C= "+c);
        }catch(ArithmeticException ae){
            System.out.println("Error, no puedes dividir entre cero");
        }finally{
            System.out.println("A pesar de todo se ejecuta el finally");
        }
        System.out.println("##########EJ-3#############");
        try{
            int division = miMetodo(10,0);
            System.out.println("division= "+division);
        }catch(ArithmeticException ae){
            System.out.println("Excepción aritmetica");
        } 
        System.out.println("Mi programa sigue vivo"); 
    }
    
    
   public static int miMetodo(int a, int b)throws ArithmeticException{
       if(b==0){
           throw new ArithmeticException();
       }
       return a/b;
   } 
}
