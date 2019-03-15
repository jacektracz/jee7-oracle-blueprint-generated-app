
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_k2_tags_xref;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_k2_tags_xrefFacade extends AbstractFacade<Joo2_k2_tags_xref> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_k2_tags_xrefFacade() {
        super(Joo2_k2_tags_xref.class);
    }
    
}
