package org.cf.estudante.services;

import org.cf.estudante.models.EstudanteModel;
import org.cf.estudante.repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {

    @Autowired
    private EstudanteRepository estudanteRepository;

    public EstudanteModel createEstudante(EstudanteModel estudanteModel) {
        return estudanteRepository.save(estudanteModel);
    }

    public List<EstudanteModel> findAllEstudantes() {
        return estudanteRepository.findAll();
    }

    public void deleteEstudante(Long id) {
        estudanteRepository.deleteById(id);
    }

    public EstudanteModel findByIdEstudante(Long id) {
        return estudanteRepository.findById(id).get();
    }

    public EstudanteModel updateEstudante(Long id, EstudanteModel estudanteModel) {
        EstudanteModel newEstudante = estudanteRepository.findById(id).get();
        newEstudante.setNome(estudanteModel.getNome());
        newEstudante.setEmail(estudanteModel.getEmail());
        newEstudante.setIdade(estudanteModel.getIdade());

        return estudanteRepository.save(newEstudante);
    }

}
