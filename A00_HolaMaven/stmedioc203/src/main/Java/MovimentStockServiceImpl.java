
import cat.xtec.ioc.domain.repository.MedicamentRepository;
import cat.xtec.ioc.service.MovimentStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author victor
 */
@Service
public class MovimentStockServiceImpl implements MovimentStockService {

    @Autowired
    private MedicamentRepository medicamentRepository;
    
    @Override
    public void processMovimentStock(String medicamentId, long quantity, int signe) {
        Medicament medicamentById = medicamentRepository.getMedicamentById(medicamentId);
        long signedQuantity = quantity + signe;
        if
        
    }
    
}