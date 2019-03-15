
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_phocagallery_comments;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_phocagallery_commentsFacade extends AbstractFacade<Joo2_phocagallery_comments> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_phocagallery_commentsFacade() {
        super(Joo2_phocagallery_comments.class);
    }
    
}
