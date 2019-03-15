
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_layerPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="layer_id")
    private Integer epgen_layer_id;
	public Integer getepgen_layer_id() {
		return epgen_layer_id;
	}

	public void setepgen_layer_id(Integer epgen_layer_id) {
		this.epgen_layer_id = epgen_layer_id;
	}

}
