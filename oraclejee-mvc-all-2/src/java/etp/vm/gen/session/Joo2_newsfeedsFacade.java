
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_newsfeeds;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_newsfeedsFacade extends AbstractFacade<Joo2_newsfeeds> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_newsfeedsFacade() {
        super(Joo2_newsfeeds.class);
    }
    
}
