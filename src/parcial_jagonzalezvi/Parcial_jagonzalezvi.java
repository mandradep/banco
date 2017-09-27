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
public class Parcial_jagonzalezvi {

    private static Banco banco;


    
    public static void main(String[] args) {
       banco = new Banco("UN Banco");
       ArrayList<String> imp = new ArrayList();
       imp = banco.listarExtractosBancarios();
       for(String a: imp){
           System.out.print(a);
       }
       
    }
    
}
