
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_images;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_imagesFacade extends AbstractFacade<Joo2_images> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_imagesFacade() {
        super(Joo2_images.class);
    }
    
}
