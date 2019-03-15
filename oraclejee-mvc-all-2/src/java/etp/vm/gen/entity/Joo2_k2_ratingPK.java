
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_k2_ratingPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="itemID")
    private Integer epgen_itemID;
	public Integer getepgen_itemID() {
		return epgen_itemID;
	}

	public void setepgen_itemID(Integer epgen_itemID) {
		this.epgen_itemID = epgen_itemID;
	}

}
