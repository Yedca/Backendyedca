
package com.portfolio.demo.Repository;

import com.portfolio.demo.Entity.Tecnologias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITecnologiasRepository extends JpaRepository<Tecnologias,Long> {
    
}
