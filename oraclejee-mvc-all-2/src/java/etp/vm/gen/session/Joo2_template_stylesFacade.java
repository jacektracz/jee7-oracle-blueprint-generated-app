
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_template_styles;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_template_stylesFacade extends AbstractFacade<Joo2_template_styles> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_template_stylesFacade() {
        super(Joo2_template_styles.class);
    }
    
}
