
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_kunena_messages_textPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="mesid")
    private Integer epgen_mesid;
	public Integer getepgen_mesid() {
		return epgen_mesid;
	}

	public void setepgen_mesid(Integer epgen_mesid) {
		this.epgen_mesid = epgen_mesid;
	}

}
