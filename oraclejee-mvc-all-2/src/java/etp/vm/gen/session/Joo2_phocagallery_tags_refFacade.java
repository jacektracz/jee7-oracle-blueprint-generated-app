
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_phocagallery_tags_ref;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_phocagallery_tags_refFacade extends AbstractFacade<Joo2_phocagallery_tags_ref> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_phocagallery_tags_refFacade() {
        super(Joo2_phocagallery_tags_ref.class);
    }
    
}
