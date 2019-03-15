
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_kunena_subscriptionsPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="thread")
    private Integer epgen_thread;
	public Integer getepgen_thread() {
		return epgen_thread;
	}

	public void setepgen_thread(Integer epgen_thread) {
		this.epgen_thread = epgen_thread;
	}

}
