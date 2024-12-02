
package cat.xtec.ioc.service;

/**
 *
 * @author victor
 */
public interface MovimentStockService {
    void processMovimentStock(String medicamentId, long quantity, int signe);
}
