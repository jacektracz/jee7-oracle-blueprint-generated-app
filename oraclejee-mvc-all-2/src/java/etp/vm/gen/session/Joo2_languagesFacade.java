
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_languages;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_languagesFacade extends AbstractFacade<Joo2_languages> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_languagesFacade() {
        super(Joo2_languages.class);
    }
    
}
