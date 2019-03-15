
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_associations;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_associationsFacade extends AbstractFacade<Joo2_associations> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_associationsFacade() {
        super(Joo2_associations.class);
    }
    
}
