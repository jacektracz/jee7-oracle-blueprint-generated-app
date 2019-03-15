
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_ucparamPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="m_ucparam_id")
    private Integer epgen_m_ucparam_id;
	public Integer getepgen_m_ucparam_id() {
		return epgen_m_ucparam_id;
	}

	public void setepgen_m_ucparam_id(Integer epgen_m_ucparam_id) {
		this.epgen_m_ucparam_id = epgen_m_ucparam_id;
	}

}
