
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_imagesPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="ep_image_id")
    private Integer epgen_ep_image_id;
	public Integer getepgen_ep_image_id() {
		return epgen_ep_image_id;
	}

	public void setepgen_ep_image_id(Integer epgen_ep_image_id) {
		this.epgen_ep_image_id = epgen_ep_image_id;
	}

}
