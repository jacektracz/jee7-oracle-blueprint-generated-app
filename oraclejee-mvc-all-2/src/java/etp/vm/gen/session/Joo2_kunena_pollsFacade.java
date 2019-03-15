
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_kunena_polls;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_kunena_pollsFacade extends AbstractFacade<Joo2_kunena_polls> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_kunena_pollsFacade() {
        super(Joo2_kunena_polls.class);
    }
    
}
