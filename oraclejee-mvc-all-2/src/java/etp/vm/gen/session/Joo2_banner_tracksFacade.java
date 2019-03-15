
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_banner_tracks;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_banner_tracksFacade extends AbstractFacade<Joo2_banner_tracks> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_banner_tracksFacade() {
        super(Joo2_banner_tracks.class);
    }
    
}
