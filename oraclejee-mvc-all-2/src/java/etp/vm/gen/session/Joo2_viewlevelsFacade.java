
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_viewlevels;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_viewlevelsFacade extends AbstractFacade<Joo2_viewlevels> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_viewlevelsFacade() {
        super(Joo2_viewlevels.class);
    }
    
}
