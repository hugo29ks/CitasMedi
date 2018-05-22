/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author UNI
 */
public class Paciente {
    
    
public static ResultSet resultado;

public static void Agregar_Paciente(String Nombre, String Apellido, String Telefono, String Genero, String Cedula, String Correo){

    
        try {

        CallableStatement consulta = Conexion.con.prepareCall("{call AgregarPaciente (?,?,?,?,?,?)}");

                        consulta.setString(1, Nombre);
                        consulta.setString(2, Apellido);
                        consulta.setString(5, Cedula);
                        consulta.setString(6, Correo);
                        consulta.setString(4, Genero);
                        consulta.setString(3, Telefono);
                      
                        
                        consulta.execute();

         JOptionPane.showMessageDialog(null,"Datos del Paciente guardado correctamente","Información",JOptionPane.INFORMATION_MESSAGE);

     }   catch (SQLException ex) {     
      JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
  }



        

    }


public static void Actualizar_Paciente(int ID, String Nombre, String Apellido, String Cedula, String Correo, String Genero, String Telefono){
   
    
    
        try {

        CallableStatement consulta = Conexion.con.prepareCall("{call ModificarPaciente (?,?,?,?,?,?,?) }");

                        consulta.setInt(1,ID);
                        consulta.setString(2, Nombre);
                        consulta.setString(3, Apellido);
                        consulta.setString(4, Cedula);
                        consulta.setString(5, Correo);
                        consulta.setString(6,Genero);
                        consulta.setString(7, Telefono);
                        
                       

                        consulta.execute();

         JOptionPane.showMessageDialog(null,"Datos del Paciente Actualizados Correctamente","Información",JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {

        JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

        }
}

public static void Activar_Paciente(int ID){
  

    
    try{
        
               CallableStatement consulta = Conexion.con.prepareCall("{call Activar_Paciente (?)}");

               consulta.setInt(1, ID);
               consulta.execute();
      JOptionPane.showMessageDialog(null,"Activado Correctamente","Información",JOptionPane.INFORMATION_MESSAGE); 
            
            
  
    }catch(SQLException ex){

          JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

    }
}

public static void Desactivar_Paciente(int ID){
  

    
    try{
        
               CallableStatement consulta = Conexion.con.prepareCall("{call Desactivar_Paciente (?)}");

               consulta.setInt(1, ID);
               consulta.execute();
     JOptionPane.showMessageDialog(null,"Desactivado Correctamente","Información",JOptionPane.INFORMATION_MESSAGE); 
         
  
    }catch(SQLException ex){

          JOptionPane.showMessageDialog(null,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);

    }
}

}