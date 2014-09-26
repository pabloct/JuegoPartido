/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.partido.dao;

import edu.cibertec.partido.dao.bean.EquipoBean;
import java.util.List;

/**
 *
 * @author JavaWeb-LM
 */
public interface EquipoDAO {

    public List<EquipoBean> listarTodos();

    public List<EquipoBean> listarTodosImpar();

    public List<EquipoBean> listarTodosPar();
    
    
}
