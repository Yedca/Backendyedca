
package com.portfolio.demo.Repository;

import com.portfolio.demo.Entity.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectosRepository extends JpaRepository <Proyectos, Long>{
    
}
