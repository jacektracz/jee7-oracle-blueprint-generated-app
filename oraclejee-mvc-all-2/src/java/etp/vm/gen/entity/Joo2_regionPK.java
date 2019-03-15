
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_regionPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="m_region_id")
    private Integer epgen_m_region_id;
	public Integer getepgen_m_region_id() {
		return epgen_m_region_id;
	}

	public void setepgen_m_region_id(Integer epgen_m_region_id) {
		this.epgen_m_region_id = epgen_m_region_id;
	}

}
