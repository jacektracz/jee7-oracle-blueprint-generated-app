
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_updates;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_updatesFacade extends AbstractFacade<Joo2_updates> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_updatesFacade() {
        super(Joo2_updates.class);
    }
    
}
