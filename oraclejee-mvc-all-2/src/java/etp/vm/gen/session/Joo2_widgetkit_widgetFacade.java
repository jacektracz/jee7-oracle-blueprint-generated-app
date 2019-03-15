
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_widgetkit_widget;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_widgetkit_widgetFacade extends AbstractFacade<Joo2_widgetkit_widget> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_widgetkit_widgetFacade() {
        super(Joo2_widgetkit_widget.class);
    }
    
}
