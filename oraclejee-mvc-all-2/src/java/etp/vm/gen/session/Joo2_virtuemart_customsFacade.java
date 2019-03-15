
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_virtuemart_customs;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_virtuemart_customsFacade extends AbstractFacade<Joo2_virtuemart_customs> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_virtuemart_customsFacade() {
        super(Joo2_virtuemart_customs.class);
    }
    
}
