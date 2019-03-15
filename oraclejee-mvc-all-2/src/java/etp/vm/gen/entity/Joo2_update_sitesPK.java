
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_update_sitesPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="update_site_id")
    private Integer epgen_update_site_id;
	public Integer getepgen_update_site_id() {
		return epgen_update_site_id;
	}

	public void setepgen_update_site_id(Integer epgen_update_site_id) {
		this.epgen_update_site_id = epgen_update_site_id;
	}

}
