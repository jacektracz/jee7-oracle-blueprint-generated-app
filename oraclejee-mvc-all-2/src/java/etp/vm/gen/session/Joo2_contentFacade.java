
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_content;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_contentFacade extends AbstractFacade<Joo2_content> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_contentFacade() {
        super(Joo2_content.class);
    }
    
}
