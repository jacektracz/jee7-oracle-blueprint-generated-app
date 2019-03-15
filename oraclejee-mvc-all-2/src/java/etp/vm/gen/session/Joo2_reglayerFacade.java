
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_reglayer;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_reglayerFacade extends AbstractFacade<Joo2_reglayer> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_reglayerFacade() {
        super(Joo2_reglayer.class);
    }
    
}
