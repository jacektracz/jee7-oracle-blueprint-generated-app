
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_ucparam;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_ucparamFacade extends AbstractFacade<Joo2_ucparam> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_ucparamFacade() {
        super(Joo2_ucparam.class);
    }
    
}
