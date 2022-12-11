
package Parqueadero.logica;

import Parqueadero.datos.ArchivoTarifas;
import Parqueadero.datos.DatosTarifas;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ModeloTarifas {
     public static DefaultTableModel tablaTarifas(){
       DefaultTableModel modelo = new DefaultTableModel();
       ArrayList<DatosTarifas> lista = ArchivoTarifas.leer();
       String[] columns = {"Usuarios", "Hora", "Tarifa", "Descuento"}; 
       modelo.setColumnIdentifiers(columns);       
       for (DatosTarifas datos : lista) {
           String[] fila = {datos.getUsuarios(), datos.getHora(), datos.getTarifa(), datos.getDescuento()};
           modelo.addRow(fila);
       }
       return modelo;
    }
}
