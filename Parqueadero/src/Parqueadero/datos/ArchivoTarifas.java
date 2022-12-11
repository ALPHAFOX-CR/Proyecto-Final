
package Parqueadero.datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoTarifas {
    public static ArrayList<DatosTarifas> leer() {
        ArrayList<DatosTarifas> listaArchivo = new ArrayList<>();
        FileReader archivo = null;
        BufferedReader lector = null;
        DatosTarifas archivoTexto;
        try {
            archivo = new FileReader("ArchivoTarifas.txt");
            lector = new BufferedReader(archivo);
            String linea;
            String[] datos;
            lector.readLine();
            while ((linea = lector.readLine()) != null) {
                datos = linea.split(";");
                archivoTexto = new DatosTarifas(datos[0], datos[1], datos[2], datos[3]);
                listaArchivo.add(archivoTexto);
            }
            return listaArchivo;
        } catch (IOException e) {
            System.out.println("NO SE ENCONTRO ARCHIVO");
            return null;
        } finally {
            try {
                if (lector != null) {
                    lector.close();
                }
                if (archivo != null) {
                    archivo.close();
                }
            } catch (IOException e) {
            }
        }
    }
}
