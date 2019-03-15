
package etp.vm.gen.session;
import etp.vm.gen.entity.No_class;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class No_classFacade extends AbstractFacade<No_class> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public No_classFacade() {
        super(No_class.class);
    }
    
}
