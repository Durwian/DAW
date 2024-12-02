/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cat.xtec.ioc.service;

/**
 *
 * @author victor
 */
public interface MovimentStockService {
    void processMovimentStock(String medicamentId, long quantity, int signe);
}
