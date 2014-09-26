/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.partido.dao.bean;

/**
 *
 * @author pabloct
 */
public class PartidoBean {

    private int codigo;
    private String resultado;
    private String marcador;
    private int puntos;

    
    
    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
}
