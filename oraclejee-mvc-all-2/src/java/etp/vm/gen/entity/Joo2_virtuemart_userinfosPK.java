
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_virtuemart_userinfosPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="virtuemart_userinfo_id")
    private String epgen_virtuemart_userinfo_id;
	public String getepgen_virtuemart_userinfo_id() {
		return epgen_virtuemart_userinfo_id;
	}

	public void setepgen_virtuemart_userinfo_id(String epgen_virtuemart_userinfo_id) {
		this.epgen_virtuemart_userinfo_id = epgen_virtuemart_userinfo_id;
	}

}
