/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10exception;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Cuenta {
    private double saldo;

    public Cuenta() {
        this.saldo = 0;
    }
    public void depositar(double monto) throws MontoExcedidoException{
        System.out.println("Tratando de depositar "+monto);
        if(monto>20000){
            throw new MontoExcedidoException();
        }else{
             saldo+=monto;
        }  
    }

    public void retirar (double monto) throws SaldoInsuficienteException, LimiteRetirosException{
        int nr=0;
        int r=0;
             
        Scanner entrada = new Scanner(System.in);
        while(nr!=3){
            nr++;
        System.out.println(" Cuanto deseas retirar? ");
        monto = entrada.nextInt();
        if(saldo<monto){
           throw new SaldoInsuficienteException(); 
        }else {
            saldo-=monto;
        }
        System.out.println(" Deseas otro retiro? (1 = si, 2= no)");
        r = entrada.nextInt();
        }
        throw new LimiteRetirosException();
    }

    public double getSaldo(){
        System.out.println("Saldo "+saldo);
        return saldo;
    }

        @Override
        public String toString() {
            return "Cuenta{" + "saldo=" + saldo + '}';
        }


    
}
