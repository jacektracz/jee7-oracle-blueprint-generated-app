
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_region;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_regionFacade extends AbstractFacade<Joo2_region> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_regionFacade() {
        super(Joo2_region.class);
    }
    
}
