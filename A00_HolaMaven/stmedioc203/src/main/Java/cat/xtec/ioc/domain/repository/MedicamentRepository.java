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

public interface MedicamentRepository {
    List <Medicament> getAllMedicaments();
    Medicament getMedicamentById(String medicamentId);
}
