
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_messages_cfg;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_messages_cfgFacade extends AbstractFacade<Joo2_messages_cfg> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_messages_cfgFacade() {
        super(Joo2_messages_cfg.class);
    }
    
}
