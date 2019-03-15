
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_content_tmp;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_content_tmpFacade extends AbstractFacade<Joo2_content_tmp> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_content_tmpFacade() {
        super(Joo2_content_tmp.class);
    }
    
}
