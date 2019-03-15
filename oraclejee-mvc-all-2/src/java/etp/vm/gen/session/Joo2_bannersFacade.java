
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_banners;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_bannersFacade extends AbstractFacade<Joo2_banners> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_bannersFacade() {
        super(Joo2_banners.class);
    }
    
}
