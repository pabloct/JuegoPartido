/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.cibertec.partido.service;

import edu.cibertec.partido.dao.bean.EquipoBean;
import java.util.List;

/**
 *
 * @author JavaWeb-LM
 */
public interface PartidoService {
    public List<EquipoBean> listarPartido();
    public List<EquipoBean> listarPartidoImpar();
    public List<EquipoBean> listarPartidoPar();
}
