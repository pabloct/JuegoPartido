/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.cibertec.partido.service.impl;

import edu.cibertec.partido.dao.EquipoDAO;
import edu.cibertec.partido.dao.bean.EquipoBean;
import edu.cibertec.partido.dao.bean.impl.EquipoDAOImpl;
import edu.cibertec.partido.service.PartidoService;
import java.util.List;

/**
 *
 * @author JavaWeb-LM
 */
public class PartidoServiceImpl implements PartidoService  {

    @Override
    public List<EquipoBean> listarPartido() {

      //1. Llamar al DAO
        EquipoDAO partidoDAO = new EquipoDAOImpl();
        List<EquipoBean> lista = partidoDAO.listarTodos();
        //2. Retorna lo devuelto por el DAO
        return lista;
    }

    @Override
    public List<EquipoBean> listarPartidoImpar() {
        //1. Llamar al DAO
        EquipoDAO partidoDAO = new EquipoDAOImpl();
        List<EquipoBean> listaimpar = partidoDAO.listarTodosImpar();
        //2. Retorna lo devuelto por el DAO
        return listaimpar;
    }

    @Override
    public List<EquipoBean> listarPartidoPar() {
         EquipoDAO partidoDAO = new EquipoDAOImpl();
        List<EquipoBean> listapar = partidoDAO.listarTodosPar();
        //2. Retorna lo devuelto por el DAO
        return listapar;
    }
    
}
