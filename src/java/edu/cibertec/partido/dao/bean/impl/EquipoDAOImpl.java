/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.cibertec.partido.dao.bean.impl;

import edu.cibertec.partido.dao.EquipoDAO;
import edu.cibertec.partido.dao.bean.EquipoBean;
import edu.cibertec.partido.util.ConexionBD;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JavaWeb-LM
 */
public class EquipoDAOImpl implements EquipoDAO {

    @Override
    public List<EquipoBean> listarTodos() {
        try {
            //1. Obtener conexion
            Connection cn = new ConexionBD().obtenerConexion();
            //2. Ejecución sentencia
            Statement st = cn.createStatement();
            //3. ejecutar sentencia y recorrer resultset
            ResultSet rs = st.executeQuery(
                    "Select idequipos, nombre from equipos ");
            List<EquipoBean> lista = new ArrayList<EquipoBean>();
            while(rs.next())
            {
                EquipoBean partidoBean = new 
                    EquipoBean(rs.getInt("idequipos"), 
                            rs.getString("nombre"));
                lista.add(partidoBean);
            }
            //4. devolver lista
            return lista;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<EquipoBean> listarTodosImpar() {
        try {
            //1. Obtener conexion
            Connection cn = new ConexionBD().obtenerConexion();
            //2. Ejecución sentencia
            Statement st = cn.createStatement();
            //3. ejecutar sentencia y recorrer resultset
            ResultSet rs = st.executeQuery(
                    "Select idequipos, nombre from equipos where idequipos in (1,3,5) ");
            List<EquipoBean> listaimpar = new ArrayList<EquipoBean>();
            while(rs.next())
            {
                EquipoBean partidoBean = new 
                    EquipoBean(rs.getInt("idequipos"), 
                            rs.getString("nombre"));
                listaimpar.add(partidoBean);
            }
            //4. devolver lista
            return listaimpar;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public List<EquipoBean> listarTodosPar() {
       try {
            //1. Obtener conexion
            Connection cn = new ConexionBD().obtenerConexion();
            //2. Ejecución sentencia
            Statement st = cn.createStatement();
            //3. ejecutar sentencia y recorrer resultset
            ResultSet rs = st.executeQuery(
                    "Select idequipos, nombre from equipos where idequipos in (2,4,6) ");
            List<EquipoBean> listaimpar = new ArrayList<EquipoBean>();
            while(rs.next())
            {
                EquipoBean partidoBean = new 
                    EquipoBean(rs.getInt("idequipos"), 
                            rs.getString("nombre"));
                listaimpar.add(partidoBean);
            }
            //4. devolver lista
            return listaimpar;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    

    
}
