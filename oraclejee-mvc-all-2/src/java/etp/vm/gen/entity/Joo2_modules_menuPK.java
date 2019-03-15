
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_modules_menuPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="moduleid")
    private Integer epgen_moduleid;
	public Integer getepgen_moduleid() {
		return epgen_moduleid;
	}

	public void setepgen_moduleid(Integer epgen_moduleid) {
		this.epgen_moduleid = epgen_moduleid;
	}

}
