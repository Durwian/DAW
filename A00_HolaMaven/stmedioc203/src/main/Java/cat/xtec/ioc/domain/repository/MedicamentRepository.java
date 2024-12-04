/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cat.xtec.ioc.domain.repository;

/**
 *
 * @author victor
 */

import cat.xtec.ioc.domain.Medicament;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface MedicamentRepository {
    void addMedicament(Medicament medicament);
    List <Medicament> getAllMedicaments();
    Medicament getMedicamentById(String medicamentId);
    List<Medicament> getMedicamentsByCategory(String category);
    Set<Medicament> getMedicamentsByFilter(Map<String, List<String>> filterParams);
    
    
}
