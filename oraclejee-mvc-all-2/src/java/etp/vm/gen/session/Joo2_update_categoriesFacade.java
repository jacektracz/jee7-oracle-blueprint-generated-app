
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_update_categories;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_update_categoriesFacade extends AbstractFacade<Joo2_update_categories> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_update_categoriesFacade() {
        super(Joo2_update_categories.class);
    }
    
}
