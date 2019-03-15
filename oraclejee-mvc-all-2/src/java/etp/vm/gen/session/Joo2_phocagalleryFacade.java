
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_phocagallery;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_phocagalleryFacade extends AbstractFacade<Joo2_phocagallery> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_phocagalleryFacade() {
        super(Joo2_phocagallery.class);
    }
    
}
