
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_kunena_categories;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_kunena_categoriesFacade extends AbstractFacade<Joo2_kunena_categories> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_kunena_categoriesFacade() {
        super(Joo2_kunena_categories.class);
    }
    
}
