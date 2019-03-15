
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_banner_clients;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_banner_clientsFacade extends AbstractFacade<Joo2_banner_clients> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_banner_clientsFacade() {
        super(Joo2_banner_clients.class);
    }
    
}
