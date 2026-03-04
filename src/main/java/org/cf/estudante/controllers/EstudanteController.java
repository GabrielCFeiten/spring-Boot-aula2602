package org.cf.estudante.controllers;

import org.cf.estudante.models.EstudanteModel;
import org.cf.estudante.services.EstudanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    public EstudanteModel createEstudante(@RequestBody EstudanteModel estudanteModel) {
        return estudanteService.createEstudante(estudanteModel);
    }

    @GetMapping
    public List<EstudanteModel> findAllEstudantes() {
        return estudanteService.findAllEstudantes();
    }

    @DeleteMapping("/{id}")
    public void deleteEstudante(@PathVariable Long id) {
        estudanteService.deleteEstudante(id);
    }

    @GetMapping("/{id}")
    public EstudanteModel findByIdEstudante(@PathVariable Long id) {
        return estudanteService.findByIdEstudante(id);
    }

    @PutMapping("/{id}")
    public EstudanteModel updateEstudante(@PathVariable Long id, @RequestBody EstudanteModel estudanteModel) {
        return estudanteService.updateEstudante(id, estudanteModel);
    }


}
