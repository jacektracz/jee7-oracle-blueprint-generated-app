
package etp.vm.gen.session;
import etp.vm.gen.entity.Joo2_virtuemart_manufacturer_medias;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
/**
 *
 * @author jacek tracz
 */
@Stateless
public class Joo2_virtuemart_manufacturer_mediasFacade extends AbstractFacade<Joo2_virtuemart_manufacturer_medias> {
    @PersistenceContext(unitName = "EtpVmV2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public Joo2_virtuemart_manufacturer_mediasFacade() {
        super(Joo2_virtuemart_manufacturer_medias.class);
    }
    
}
