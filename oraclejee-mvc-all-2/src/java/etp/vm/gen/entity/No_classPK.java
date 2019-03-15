
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class No_classPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="epvm_id")
    private Integer epgen_epvm_id;
	public Integer getepgen_epvm_id() {
		return epgen_epvm_id;
	}

	public void setepgen_epvm_id(Integer epgen_epvm_id) {
		this.epgen_epvm_id = epgen_epvm_id;
	}

}
