
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_kunena_thankyouPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="postid")
    private Integer epgen_postid;
	public Integer getepgen_postid() {
		return epgen_postid;
	}

	public void setepgen_postid(Integer epgen_postid) {
		this.epgen_postid = epgen_postid;
	}

}
