/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cat.xtec.ioc.service;

import cat.xtec.ioc.domain.Medicament;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface MedicamentService {
    List <Medicament> getAllMedicaments();
    Medicament getMedicamentById(String medicamentID);
}
