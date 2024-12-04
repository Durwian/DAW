
package cat.xtec.ioc.service;

import cat.xtec.ioc.domain.Medicament;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public interface MedicamentService {
    void addMedicament(Medicament medicament);
    List <Medicament> getAllMedicaments();
    Medicament getMedicamentById(String medicamentID);
    List<Medicament> getMedicamentsByCategory(String category);
    Set<Medicament> getMedicamentsByFilter(Map<String, List<String>> filterParams);
}
