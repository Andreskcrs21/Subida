
package con3ctar;


import java.sql.Connection;
import java.sql.DriverManager;
public class conexion {
    Connection con;
    
    public conexion(){
        

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql//localhost:3306/tienda"
                    , "MiUsuario", "micontraseña21");
            System.out.println("Conexion exitosa");
        }catch (Exception e){
            System.out.println("Base de datos no conectada");
        }
    
    }
    public static void main(String[] args){
        conexion cn= new conexion();
        
        
    }
}

