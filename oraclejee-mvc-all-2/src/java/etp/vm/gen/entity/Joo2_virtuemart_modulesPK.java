
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_virtuemart_modulesPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="module_id")
    private Integer epgen_module_id;
	public Integer getepgen_module_id() {
		return epgen_module_id;
	}

	public void setepgen_module_id(Integer epgen_module_id) {
		this.epgen_module_id = epgen_module_id;
	}

}
