
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_content_frontpage;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_content_frontpageFacade extends AbstractFacade<Joo2_content_frontpage> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_content_frontpageFacade() {
        super(Joo2_content_frontpage.class);
    }
    
}
