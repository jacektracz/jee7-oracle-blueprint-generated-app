
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_utxcPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="m_uctxc_id")
    private Integer epgen_m_uctxc_id;
	public Integer getepgen_m_uctxc_id() {
		return epgen_m_uctxc_id;
	}

	public void setepgen_m_uctxc_id(Integer epgen_m_uctxc_id) {
		this.epgen_m_uctxc_id = epgen_m_uctxc_id;
	}

}
