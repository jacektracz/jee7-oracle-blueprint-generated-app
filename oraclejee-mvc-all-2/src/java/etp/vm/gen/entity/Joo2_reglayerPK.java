
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_reglayerPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="m_RegLayer_id")
    private Integer epgen_m_RegLayer_id;
	public Integer getepgen_m_RegLayer_id() {
		return epgen_m_RegLayer_id;
	}

	public void setepgen_m_RegLayer_id(Integer epgen_m_RegLayer_id) {
		this.epgen_m_RegLayer_id = epgen_m_RegLayer_id;
	}

}
