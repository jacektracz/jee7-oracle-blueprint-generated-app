
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_virtuemart_ept_customvaluesPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="ept_customvalues_id")
    private Integer epgen_ept_customvalues_id;
	public Integer getepgen_ept_customvalues_id() {
		return epgen_ept_customvalues_id;
	}

	public void setepgen_ept_customvalues_id(Integer epgen_ept_customvalues_id) {
		this.epgen_ept_customvalues_id = epgen_ept_customvalues_id;
	}

}
