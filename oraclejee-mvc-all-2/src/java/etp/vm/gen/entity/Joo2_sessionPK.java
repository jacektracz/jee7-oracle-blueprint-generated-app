
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_sessionPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="session_id")
    private String epgen_session_id;
	public String getepgen_session_id() {
		return epgen_session_id;
	}

	public void setepgen_session_id(String epgen_session_id) {
		this.epgen_session_id = epgen_session_id;
	}

}
