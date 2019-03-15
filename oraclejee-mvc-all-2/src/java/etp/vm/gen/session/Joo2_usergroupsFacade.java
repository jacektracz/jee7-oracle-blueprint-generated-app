
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_usergroups;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_usergroupsFacade extends AbstractFacade<Joo2_usergroups> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_usergroupsFacade() {
        super(Joo2_usergroups.class);
    }
    
}
