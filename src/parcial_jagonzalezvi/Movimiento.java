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
public class Movimiento {
   
    
    private Date _date;
    private double _soldePrecedant;
    private double _cantidad;
    private Type _type;


    public Movimiento(Date _date, double _soldePrecedant, double _montant, Type _type) {
        this._date = _date;
        this._soldePrecedant = _soldePrecedant;
        this._cantidad = _montant;
        this._type = _type;
    }

    public Date getDate() {
        return _date;
    }

    public double getSoldePrecedant() {
        return _soldePrecedant;
    }

    public double getCantidad() {
        return _cantidad;
    }

    public Type getType() {
        return _type;
    }
    
    
    
}
