
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_uctxg;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_uctxgFacade extends AbstractFacade<Joo2_uctxg> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_uctxgFacade() {
        super(Joo2_uctxg.class);
    }
    
}
