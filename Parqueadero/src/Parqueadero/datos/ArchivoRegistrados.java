package Parqueadero.datos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ArchivoRegistrados {

    public static void pintar (ParqueaderoDatos persona) {
        FileWriter archivo = null;
        PrintWriter pintor = null;
        try {
            archivo = new FileWriter("ArchivoDatos.txt", true);
            pintor = new PrintWriter(archivo);
            pintor.println(persona.getNombre() + "-" + persona.getApellido() + "-" + persona.getCargo() + "-" + persona.getParqueadero() + "-" + persona.getVehiculo() + "-" + persona.getPlaca() + "-" + persona.getCodigo() + "-" + persona.getPuesto());
        } catch (IOException e) {
            System.out.println("No se encontro archivo");
        } finally {
            try {
                if (pintor != null) {
                    pintor.close();
                }
                if (archivo != null) {
                    archivo.close();
                }
            } catch (IOException e) {
            }
        }
    }

    public static ArrayList<ParqueaderoDatos> Leer() {
        ArrayList<ParqueaderoDatos> lista = new ArrayList<>();
        FileReader archivo = null;
        BufferedReader lector = null;
        ParqueaderoDatos persona;
        try {
            archivo = new FileReader("ArchivoDatos.txt");
            lector = new BufferedReader(archivo);
            String linea;
            String[] datos;
            while ((linea = lector.readLine()) != null) {
                datos = linea.split("-");
                persona = new ParqueaderoDatos(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5]);
                lista.add(persona);
            }
            return lista;
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
