/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_jagonzalezvi;

import java.util.*;

/**
 *
 * @author Estudiante
 */
public class Banco {
    
    private String _code;
    private ArrayList<Cuenta> _cuentas;
    private ArrayList<Type> _types;
    
    public Banco(String codigo){
        this._code = codigo;
        _cuentas = new ArrayList();
        _types = new ArrayList();
        
        Date now = new Date(System.currentTimeMillis());
        Cuenta cuenta1 = new Cuenta(101, 2000.00, now, "Miguel");
        Cuenta cuenta2 = new Cuenta(102, 10000.00, now, "Jose");
        
        Type tipo1 = new Type("Consignacion");
        Type tipo2 = new Type("Retiro");
        
        _types.add(tipo1);
        _types.add(tipo2);
       
        cuenta1.agregarMovimiento(now, 200, tipo1);
        cuenta1.agregarMovimiento(now, 150, tipo2);
        
        cuenta2.agregarMovimiento(now, 1000, tipo2);
        cuenta2.agregarMovimiento(now, 100, tipo1);
        
        _cuentas.add(cuenta1);
        _cuentas.add(cuenta2);
        
        
        
    }
    
    public ArrayList<String> listarExtractosBancarios(){
        ArrayList<String> a = new ArrayList();
        String agregar = "";
        for(Cuenta actual:_cuentas){
            agregar += "\n\nInformacion de la cuenta : " 
                    + actual.getNumeroCuenta()+
                    "\n -Nombre : "+actual.getNomClient()
                    +"\n -Saldo : "+actual.getSouldeCourant()
                    +"\n -Fecha de Creacion : "+actual.getDateCreation()
                    +"\n \n Con movimientos ";
            int i = 0;
            for(Movimiento c: actual.getMovimientos()){
                i++;
            String temp = "\n " +i+". "+c.getDate().toString()+c.getSoldePrecedant()+c.getCantidad()+c.getType().getCode();
            agregar += temp;
            }
         a.add(agregar);
         agregar = "";
        }
        
        return a;
    }
}
