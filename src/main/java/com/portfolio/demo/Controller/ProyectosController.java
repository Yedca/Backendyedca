
package com.portfolio.demo.Controller;

import com.portfolio.demo.Entity.Proyectos;
import com.portfolio.demo.Interface.IProyectosService;
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
public class ProyectosController {
    @Autowired IProyectosService iproyectosService;
    
    @GetMapping("/proyectos/traer")
    public List<Proyectos> getProyectos(){
        return iproyectosService.getProyectos();
    }
    
    @PostMapping("/proyectos/crear")
    public String createProyectos(@RequestBody Proyectos proyectos){
        iproyectosService.saveProyectos(proyectos);
        return "El proyecto fue creado correctamente";
    }
    
    @DeleteMapping("/proyectos/borrar/{id}")
    public String deleteProyectos(@PathVariable Long id){
       iproyectosService.deleteProyectos(id);
       return "El proyecto fue borrado correctamente";
    }
    
    @PutMapping("/proyectos/editar/{id}")
    public Proyectos editProyectos(@PathVariable Long id,
                                   @RequestParam("nombredeproyectos") String nuevoNombredeProyectos,
                                   @RequestParam("descripcion") String nuevaDescripcion,
                                   @RequestParam("img") String nuevaImg){
        
       Proyectos proyectos =iproyectosService.findProyectos(id);
       
       proyectos.setNombredeProyecto(nuevoNombredeProyectos);
       proyectos.setDescripcion(nuevaDescripcion);
       proyectos.setImg(nuevaImg);
       
       iproyectosService.saveProyectos(proyectos);
       return proyectos;
    }
    }