
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_schemas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_schemasFacade extends AbstractFacade<Joo2_schemas> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_schemasFacade() {
        super(Joo2_schemas.class);
    }
    
}
