
package Parqueadero.logica;

import Parqueadero.datos.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ValidacionRegistrarUsuario {
    
    private static ArrayList<ParqueaderoDatos> lista = new ArrayList<>();
    public static String agregar(String nombre, String apellido, String cargo, String parqueadero, String vehiculo, String placa){
        String respuesta = validarUsuario(nombre, apellido, cargo, parqueadero, vehiculo, placa);
        if(respuesta.equals("OK")){
            ParqueaderoDatos persona = new ParqueaderoDatos(nombre, apellido, cargo, parqueadero, vehiculo, placa);//para que el objeto persona tome sus datos
            ArchivoRegistrados.pintar(persona);
            lista.add(persona);//agregar personas a la lista
            return "OK";
        }else{
            return respuesta;
        }
    }
    
    public static DefaultTableModel Valores(){
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"Nombre","Apellido","Cargo","Parqueadero","Vehiculo","Placa"};
        modelo.setColumnIdentifiers(columnas);//identificadores de columna, para el encabezado del modelo
        ArrayList<ParqueaderoDatos> listaArchivo = ArchivoRegistrados.Leer();
        for(ParqueaderoDatos persona: listaArchivo){ //recorrer la lista para formar el cuerpo del modelo
            String[] fila = {persona.getNombre(), persona.getApellido(), persona.getCargo(), persona.getParqueadero(), persona.getVehiculo(), persona.getPlaca()};
            modelo.addRow(fila); //al modelo le voy a agregar una fila
        }
        return modelo;
    }
    public static DefaultTableModel ValoresUsuarios(){
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"Nombre","Apellido","Cargo","Parqueadero","Vehiculo"};
        modelo.setColumnIdentifiers(columnas);//identificadores de columna, para el encabezado del modelo
        ArrayList<ParqueaderoDatos> listaArchivo = ArchivoRegistrados.Leer();
        for(ParqueaderoDatos persona: listaArchivo){ //recorrer la lista para formar el cuerpo del modelo
            String[] fila = {persona.getNombre(), persona.getApellido(), persona.getCargo(), persona.getParqueadero(), persona.getVehiculo()};
            modelo.addRow(fila); //al modelo le voy a agregar una fila
        }
        return modelo;
    }
            
    private static String validarUsuario(String nombre, String apellido, String cargo, String parqueadero, String vehiculo, String placa){
        if(nombre.trim().equals("")){
            return "Debe ingresar el nombre";
        }else
        if(apellido.trim().equals("")){
            return "Debe ingresar el apellido";  
        }else
        if(cargo.trim().equals("SELECCIONE")){
            return "Debe seleccionar un cargo";
        }else
        if(parqueadero.trim().equals("SELECCIONE")){
            return "Debe selecionar un parqueadero";
        }else
        if(vehiculo.trim().equals("SELECCIONE")){
            return "Debe selecionar el vehiculo";
        }else
         if(!vehiculo.trim().equals("Bicicleta")){
            if(placa.trim().equals("")){
            return "Debe ingresar la placa";
            }
        }
        return "OK";
    }
            
}
