
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_assets;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_assetsFacade extends AbstractFacade<Joo2_assets> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_assetsFacade() {
        super(Joo2_assets.class);
    }
    
}
