
package Parqueadero.logica;

public class ValidacionLogin {
    
    public static String validarL(String usuario, String contraseña){
        String user = "admin";
        String password = "12345";
        
        if(usuario.trim().equals("")){
            return "Debe ingresar el usuario";
        }
        if(contraseña.trim().equals("")){
            return "Debe ingresar una contraseña";
        }
        if(user.equals(usuario) && (password.equals(contraseña))){
        return "OK";
        }else
            return "Usuario / contraseña incorrecta";
      }
}
