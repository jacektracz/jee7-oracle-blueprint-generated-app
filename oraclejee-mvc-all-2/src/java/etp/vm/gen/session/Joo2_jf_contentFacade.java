
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_jf_content;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_jf_contentFacade extends AbstractFacade<Joo2_jf_content> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_jf_contentFacade() {
        super(Joo2_jf_content.class);
    }
    
}
