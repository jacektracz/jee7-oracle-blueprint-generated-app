
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_weblinks;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_weblinksFacade extends AbstractFacade<Joo2_weblinks> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_weblinksFacade() {
        super(Joo2_weblinks.class);
    }
    
}
