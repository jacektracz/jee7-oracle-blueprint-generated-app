
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_virtuemart_adminmenuentries;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_virtuemart_adminmenuentriesFacade extends AbstractFacade<Joo2_virtuemart_adminmenuentries> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_virtuemart_adminmenuentriesFacade() {
        super(Joo2_virtuemart_adminmenuentries.class);
    }
    
}
