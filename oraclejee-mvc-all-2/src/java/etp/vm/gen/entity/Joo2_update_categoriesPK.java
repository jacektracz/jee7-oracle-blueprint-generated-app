
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_update_categoriesPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="categoryid")
    private Integer epgen_categoryid;
	public Integer getepgen_categoryid() {
		return epgen_categoryid;
	}

	public void setepgen_categoryid(Integer epgen_categoryid) {
		this.epgen_categoryid = epgen_categoryid;
	}

}
