
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_user_profiles;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_user_profilesFacade extends AbstractFacade<Joo2_user_profiles> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_user_profilesFacade() {
        super(Joo2_user_profiles.class);
    }
    
}
