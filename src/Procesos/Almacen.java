/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author KJS
 */
public class Almacen {
public void grabar(String cadena)   {
 try{
 FileWriter archivo = new FileWriter("datos.txt",true);
 BufferedWriter almacena = new BufferedWriter(archivo);
 almacena.write(cadena+"\n");
 almacena.close();
 }catch(Exception ex){
 ex.printStackTrace();
 }
 }
 public ArrayList<String>leer(){
 ArrayList<String> informacion=new ArrayList<String>();
 try{
 FileReader archivo = new FileReader("datos.txt");
 BufferedReader datos = new BufferedReader(archivo);
  String cadena;
  while((cadena = datos.readLine()) != null){
  informacion.add(cadena);    
  }
 }catch(Exception ex){
  ex.printStackTrace();
 }
 return informacion;
 }   
}
