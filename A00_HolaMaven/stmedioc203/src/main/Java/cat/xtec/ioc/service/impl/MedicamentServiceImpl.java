/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.xtec.ioc.service.impl;

import cat.xtec.ioc.domain.Medicament;
import cat.xtec.ioc.domain.repository.MedicamentRepository;
import cat.xtec.ioc.service.MedicamentService;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Usuario
 */
@Service
public class MedicamentServiceImpl implements MedicamentService {
    
    @Autowired
    private MedicamentRepository medicamentRepository;
    
    @Override
    public List<Medicament> getAllMedicaments(){
        return medicamentRepository.getAllMedicaments();
    }
    
    @Override
    public Medicament getMedicamentById(String medicamentID){
        return medicamentRepository.getMedicamentById(medicamentID);
    }
    
    @Override
    public List<Medicament> getMedicamentsByCategory(String category){
        return medicamentRepository.getMedicamentsByCategory(category);
    }
    @Override
    public Set<Medicament> getMedicamentsByFilter(Map<String, List<String>> filterParams){
        return medicamentRepository.getMedicamentsByFilter(filterParams);
    }
    
    @Override
    public void addMedicament(Medicament medicament){
        medicamentRepository.addMedicament(medicament);
    }
}
