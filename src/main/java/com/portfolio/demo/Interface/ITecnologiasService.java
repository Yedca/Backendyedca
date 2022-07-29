
package com.portfolio.demo.Interface;

import com.portfolio.demo.Entity.Tecnologias;
import java.util.List;


public interface ITecnologiasService {
  
//Traer una lista de tecnologias
public List<Tecnologias> getTecnologias();

//Guarda un objeto de tipo Tecnologia//
public void saveTecnologias(Tecnologias tecnologias);

//Eliminar un objeto pero lo buscamos por ID//
public void deleteTecnologias(Long id);

//Buscamos una Tecnologia//
public Tecnologias findTecnologias(Long id);
}


