
package Parqueadero.datos;

public class DatosTarifas {
     private String Usuarios, Hora, Tarifa, Descuento;
     
     public DatosTarifas(String usuarios, String hora, String tarifa, String descuento){
         this.Usuarios = usuarios;
         this.Hora = hora;
         this.Tarifa = tarifa;
         this.Descuento = descuento;
     }

    public String getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(String Usuarios) {
        this.Usuarios = Usuarios;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getTarifa() {
        return Tarifa;
    }

    public void setTarifa(String Tarifa) {
        this.Tarifa = Tarifa;
    }

    public String getDescuento() {
        return Descuento;
    }

    public void setDescuento(String Descuento) {
        this.Descuento = Descuento;
    }

}
