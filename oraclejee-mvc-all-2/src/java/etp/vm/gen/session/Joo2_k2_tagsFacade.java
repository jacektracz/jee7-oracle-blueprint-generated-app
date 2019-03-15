
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_k2_tags;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_k2_tagsFacade extends AbstractFacade<Joo2_k2_tags> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_k2_tagsFacade() {
        super(Joo2_k2_tags.class);
    }
    
}
