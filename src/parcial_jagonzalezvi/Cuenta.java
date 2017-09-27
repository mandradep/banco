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
public class Cuenta {
    
    private int _numeroCuenta;
    private double _souldeCourant;
    private Date _dateCreation;
    private String _nomClient;
    private ArrayList<Movimiento> movimientos;
    
    public Cuenta(int a, double b, Date c, String d){
        this._numeroCuenta = a;
        this._souldeCourant = b;
        this._dateCreation = c;
        this._nomClient = d;
        movimientos = new ArrayList();
    }

    public int getNumeroCuenta() {
        return _numeroCuenta;
    }

    public double getSouldeCourant() {
        return _souldeCourant;
    }

    public Date getDateCreation() {
        return _dateCreation;
    }

    public String getNomClient() {
        return _nomClient;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }
    
    public void agregarMovimiento(Date d, double cantidad, Type tipo){
        Movimiento x = new Movimiento(d,this._souldeCourant, cantidad, tipo);
        this.movimientos.add(x);
    }
    
}
