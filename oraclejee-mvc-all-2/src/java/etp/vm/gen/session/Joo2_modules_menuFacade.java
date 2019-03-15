
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_modules_menu;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_modules_menuFacade extends AbstractFacade<Joo2_modules_menu> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_modules_menuFacade() {
        super(Joo2_modules_menu.class);
    }
    
}
