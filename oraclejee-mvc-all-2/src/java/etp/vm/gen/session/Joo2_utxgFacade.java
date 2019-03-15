
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_utxg;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_utxgFacade extends AbstractFacade<Joo2_utxg> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_utxgFacade() {
        super(Joo2_utxg.class);
    }
    
}
