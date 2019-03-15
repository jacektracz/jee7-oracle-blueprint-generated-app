
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_content_ratingPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="content_id")
    private Integer epgen_content_id;
	public Integer getepgen_content_id() {
		return epgen_content_id;
	}

	public void setepgen_content_id(Integer epgen_content_id) {
		this.epgen_content_id = epgen_content_id;
	}

}
