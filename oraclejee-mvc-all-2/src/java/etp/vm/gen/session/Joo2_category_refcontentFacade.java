
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_category_refcontent;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_category_refcontentFacade extends AbstractFacade<Joo2_category_refcontent> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_category_refcontentFacade() {
        super(Joo2_category_refcontent.class);
    }
    
}
