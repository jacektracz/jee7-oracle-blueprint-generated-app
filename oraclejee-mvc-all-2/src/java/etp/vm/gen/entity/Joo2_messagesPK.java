
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_messagesPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="message_id")
    private Integer epgen_message_id;
	public Integer getepgen_message_id() {
		return epgen_message_id;
	}

	public void setepgen_message_id(Integer epgen_message_id) {
		this.epgen_message_id = epgen_message_id;
	}

}
