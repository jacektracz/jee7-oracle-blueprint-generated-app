
package etp.vm.gen.session;
import etp.vm.gen.entity.Tmp_tree;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Tmp_treeFacade extends AbstractFacade<Tmp_tree> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Tmp_treeFacade() {
        super(Tmp_tree.class);
    }
    
}
