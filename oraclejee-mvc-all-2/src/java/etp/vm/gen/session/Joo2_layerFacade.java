
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_layer;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_layerFacade extends AbstractFacade<Joo2_layer> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_layerFacade() {
        super(Joo2_layer.class);
    }
    
}
