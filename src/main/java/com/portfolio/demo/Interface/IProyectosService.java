
package com.portfolio.demo.Interface;

import com.portfolio.demo.Entity.Proyectos;
import java.util.List;


public interface IProyectosService {
    
    public List<Proyectos> getProyectos();

//Guarda un objeto de tipo proyecto//
public void saveProyectos(Proyectos proyectos);

//Eliminar un objeto pero lo buscamos por ID//
public void deleteProyectos(Long id);

//Buscamos un proyecto//
public Proyectos findProyectos(Long id);
}

