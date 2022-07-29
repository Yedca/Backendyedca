
package com.portfolio.demo.Service;

import com.portfolio.demo.Entity.Tecnologias;
import com.portfolio.demo.Interface.ITecnologiasService;
import com.portfolio.demo.Repository.ITecnologiasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpTecnologiasService implements ITecnologiasService {
@Autowired ITecnologiasRepository itecnologiasRepository;
    
    @Override
    public List<Tecnologias> getTecnologias() {
     List<Tecnologias> tecnologias = itecnologiasRepository.findAll();
       return tecnologias;
    }

    @Override
    public void saveTecnologias(Tecnologias tecnologias) {
        itecnologiasRepository.save(tecnologias);
    }

    @Override
    public void deleteTecnologias(Long id) {
        itecnologiasRepository.deleteById(id);
    }

    @Override
    public Tecnologias findTecnologias(Long id) {
     Tecnologias tecnologias =itecnologiasRepository.findById(id).orElse(null);
     return tecnologias;
    }
    
}
