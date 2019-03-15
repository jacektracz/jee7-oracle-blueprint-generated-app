
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_languagesPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="lang_id")
    private Integer epgen_lang_id;
	public Integer getepgen_lang_id() {
		return epgen_lang_id;
	}

	public void setepgen_lang_id(Integer epgen_lang_id) {
		this.epgen_lang_id = epgen_lang_id;
	}

}
