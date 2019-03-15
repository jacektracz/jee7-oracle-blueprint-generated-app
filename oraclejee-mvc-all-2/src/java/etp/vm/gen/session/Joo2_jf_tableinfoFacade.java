
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_jf_tableinfo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_jf_tableinfoFacade extends AbstractFacade<Joo2_jf_tableinfo> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_jf_tableinfoFacade() {
        super(Joo2_jf_tableinfo.class);
    }
    
}
