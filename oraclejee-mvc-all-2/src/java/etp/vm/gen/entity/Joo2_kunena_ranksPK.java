
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_kunena_ranksPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="rank_id")
    private double epgen_rank_id;
	public double getepgen_rank_id() {
		return epgen_rank_id;
	}

	public void setepgen_rank_id(double epgen_rank_id) {
		this.epgen_rank_id = epgen_rank_id;
	}

}
