
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_virtuemart_ratingsPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="virtuemart_rating_id")
    private Integer epgen_virtuemart_rating_id;
	public Integer getepgen_virtuemart_rating_id() {
		return epgen_virtuemart_rating_id;
	}

	public void setepgen_virtuemart_rating_id(Integer epgen_virtuemart_rating_id) {
		this.epgen_virtuemart_rating_id = epgen_virtuemart_rating_id;
	}

}
