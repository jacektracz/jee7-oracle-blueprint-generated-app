
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_uctxgPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="m_uctxg_id")
    private Integer epgen_m_uctxg_id;
	public Integer getepgen_m_uctxg_id() {
		return epgen_m_uctxg_id;
	}

	public void setepgen_m_uctxg_id(Integer epgen_m_uctxg_id) {
		this.epgen_m_uctxg_id = epgen_m_uctxg_id;
	}

}
