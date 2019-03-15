
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_messages_cfgPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="user_id")
    private Integer epgen_user_id;
	public Integer getepgen_user_id() {
		return epgen_user_id;
	}

	public void setepgen_user_id(Integer epgen_user_id) {
		this.epgen_user_id = epgen_user_id;
	}

}
