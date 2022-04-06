/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import com.google.gson.Gson;
import g4s21karlazmp11.Datos;

/**
 *
 * @author KJS
 */
public class conversiones {
 public String cjson(Datos datos){
 Gson gson = new Gson();
 return gson.toJson(datos);
 } 
public Datos cDTA(String cadena) {
Gson gson = new Gson();
return gson.fromJson(cadena, Datos.class);
}
}
