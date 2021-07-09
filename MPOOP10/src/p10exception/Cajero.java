/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10exception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class Cajero {
    public static void main(String[] args) {
        try {
            Cuenta cuenta = new Cuenta();
            cuenta.getSaldo();
            cuenta.depositar(1000);
            cuenta.getSaldo();
            cuenta.retirar(500);
            cuenta.getSaldo();
            cuenta.retirar(100);
            cuenta.getSaldo();
            cuenta.retirar(100);
            cuenta.getSaldo();
            cuenta.depositar(25000);
            cuenta.getSaldo();
         
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Error! No cuentas con el saldo suficiente");
            //Logger.getLogger(Cajero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MontoExcedidoException ex) {
            System.out.println("Error! No puedes ingresar mas de 20,000 ");
            //Logger.getLogger(Cajero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LimiteRetirosException ex) {
            System.out.println("Error! Limite de retiros excedido ");
            //Logger.getLogger(Cajero.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}
