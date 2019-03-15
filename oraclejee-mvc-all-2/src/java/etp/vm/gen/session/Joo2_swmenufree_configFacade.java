
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_swmenufree_config;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_swmenufree_configFacade extends AbstractFacade<Joo2_swmenufree_config> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_swmenufree_configFacade() {
        super(Joo2_swmenufree_config.class);
    }
    
}
