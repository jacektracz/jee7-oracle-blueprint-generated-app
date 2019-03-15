
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_virtuemart_couponsPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="virtuemart_coupon_id")
    private Integer epgen_virtuemart_coupon_id;
	public Integer getepgen_virtuemart_coupon_id() {
		return epgen_virtuemart_coupon_id;
	}

	public void setepgen_virtuemart_coupon_id(Integer epgen_virtuemart_coupon_id) {
		this.epgen_virtuemart_coupon_id = epgen_virtuemart_coupon_id;
	}

}
