
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_kunena_polls_usersPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="pollid")
    private Integer epgen_pollid;
	public Integer getepgen_pollid() {
		return epgen_pollid;
	}

	public void setepgen_pollid(Integer epgen_pollid) {
		this.epgen_pollid = epgen_pollid;
	}

}
