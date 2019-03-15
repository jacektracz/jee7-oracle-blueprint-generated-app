
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_virtuemart_currenciesPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="virtuemart_currency_id")
    private Integer epgen_virtuemart_currency_id;
	public Integer getepgen_virtuemart_currency_id() {
		return epgen_virtuemart_currency_id;
	}

	public void setepgen_virtuemart_currency_id(Integer epgen_virtuemart_currency_id) {
		this.epgen_virtuemart_currency_id = epgen_virtuemart_currency_id;
	}

}
