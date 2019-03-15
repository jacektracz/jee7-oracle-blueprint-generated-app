
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_virtuemart_ordersPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="virtuemart_order_id")
    private Integer epgen_virtuemart_order_id;
	public Integer getepgen_virtuemart_order_id() {
		return epgen_virtuemart_order_id;
	}

	public void setepgen_virtuemart_order_id(Integer epgen_virtuemart_order_id) {
		this.epgen_virtuemart_order_id = epgen_virtuemart_order_id;
	}

}
