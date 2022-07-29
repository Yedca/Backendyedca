
package com.portfolio.demo.Controller;

import com.portfolio.demo.Entity.Tecnologias;
import com.portfolio.demo.Interface.ITecnologiasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TecnologiasController {
    @Autowired ITecnologiasService itecnologiasService;
    
    
    @GetMapping("/tecnologias/traer")
    public List<Tecnologias> getTecnologias(){
        return itecnologiasService.getTecnologias();
    }
    
    @PostMapping("/tecnologias/crear")
    public String createTecnologias(@RequestBody Tecnologias tecnologias){
        itecnologiasService.saveTecnologias(tecnologias);
        return "La tecnologias fue creada correctamente";
    }
    
    @DeleteMapping("/tecnologias/borrar/{id}")
    public String deleteTecnologia(@PathVariable Long id){
        itecnologiasService.deleteTecnologias(id);
        return "La tecnologia fue borrada correctamente";
    }
    
    @PutMapping("/tecnologias/editar/{id}")
    public Tecnologias editTecnologias(@PathVariable Long id,
                                        @RequestParam("nombreTecnologias") String nuevoNombreTecnologias, 
                                        @RequestParam("porcentajeTecnologias") String nuevoporcentajeTecnologias){
        
        Tecnologias tecnologias = itecnologiasService.findTecnologias(id);
        
        
        tecnologias.setNombreTecnologias(nuevoNombreTecnologias);
        tecnologias.setPorcentajeTecnologias(nuevoNombreTecnologias);
        
        itecnologiasService.saveTecnologias(tecnologias);
        return tecnologias;
    }
                                      
}
