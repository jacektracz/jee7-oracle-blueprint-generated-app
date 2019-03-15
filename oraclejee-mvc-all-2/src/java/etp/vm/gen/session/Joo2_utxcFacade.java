
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_utxc;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_utxcFacade extends AbstractFacade<Joo2_utxc> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_utxcFacade() {
        super(Joo2_utxc.class);
    }
    
}
