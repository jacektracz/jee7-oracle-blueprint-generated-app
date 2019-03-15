
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_k2_rating;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_k2_ratingFacade extends AbstractFacade<Joo2_k2_rating> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_k2_ratingFacade() {
        super(Joo2_k2_rating.class);
    }
    
}
