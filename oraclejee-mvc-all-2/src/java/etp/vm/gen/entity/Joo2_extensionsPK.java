
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_extensionsPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="extension_id")
    private Integer epgen_extension_id;
	public Integer getepgen_extension_id() {
		return epgen_extension_id;
	}

	public void setepgen_extension_id(Integer epgen_extension_id) {
		this.epgen_extension_id = epgen_extension_id;
	}

}
