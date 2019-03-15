
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_core_log_searches;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_core_log_searchesFacade extends AbstractFacade<Joo2_core_log_searches> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_core_log_searchesFacade() {
        super(Joo2_core_log_searches.class);
    }
    
}
