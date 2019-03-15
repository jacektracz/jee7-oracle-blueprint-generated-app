
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_phocagallery_user;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_phocagallery_userFacade extends AbstractFacade<Joo2_phocagallery_user> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_phocagallery_userFacade() {
        super(Joo2_phocagallery_user.class);
    }
    
}
