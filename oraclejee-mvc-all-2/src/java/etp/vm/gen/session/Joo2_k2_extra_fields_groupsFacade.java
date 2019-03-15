
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_k2_extra_fields_groups;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_k2_extra_fields_groupsFacade extends AbstractFacade<Joo2_k2_extra_fields_groups> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_k2_extra_fields_groupsFacade() {
        super(Joo2_k2_extra_fields_groups.class);
    }
    
}
