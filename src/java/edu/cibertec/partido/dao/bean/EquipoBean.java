/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.partido.dao.bean;

import edu.cibertec.partido.dao.*;
import edu.cibertec.partido.dao.bean.*;

/**
 *
 * @author JavaWeb-LM
 */
public class EquipoBean {

    private int codigo;
    private String nombre;

    public EquipoBean(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
