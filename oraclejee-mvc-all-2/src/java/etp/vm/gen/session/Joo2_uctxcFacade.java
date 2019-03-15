
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_uctxc;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_uctxcFacade extends AbstractFacade<Joo2_uctxc> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_uctxcFacade() {
        super(Joo2_uctxc.class);
    }
    
}
