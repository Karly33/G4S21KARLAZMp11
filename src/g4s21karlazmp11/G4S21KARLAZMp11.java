/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21karlazmp11;

import com.google.gson.Gson;

/**
 *
 * @author KJS
 */
public class G4S21KARLAZMp11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Datos datos = new Datos("VICTOR", 42, "personal@gmail.com");
        Gson gson = new Gson();
        String cadena= gson.toJson(datos);
        System.out.println("NOMBRE  "+datos.getNombre());
        System.out.println("EDAD  "+String.valueOf(datos.getEdad()));
        System.out.println("CORREO  "+datos.getCorreo());
        
        System.out.println("LA CADENA CONTIENE: "+cadena);
        String cjson="{\"nombre\":\"javier\",\"edad\":22,\"correo\":\"sin correo\"}";
        Datos datos2 = gson.fromJson(cjson, Datos.class);
        System.out.println("NOMBRE  "+datos2.getNombre());
        System.out.println("EDAD  "+String.valueOf(datos2.getEdad()));
        System.out.println("CORREO  "+datos2.getCorreo());
    }
    
}
