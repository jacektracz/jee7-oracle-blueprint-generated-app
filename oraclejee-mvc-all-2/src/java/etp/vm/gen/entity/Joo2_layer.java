
package etp.vm.gen.entity;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@Table(name = "joo2_layer", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_layer implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="layer_id")
    private Integer epgen_layer_id;
    @Column(name="parent_id")
    private Integer epgen_parent_id;
    @Column(name="short_name")
    private String epgen_short_name;
    @Column(name="layer_type")
    private String epgen_layer_type;
	public Integer getepgen_layer_id() {
		return epgen_layer_id;
	}

	public void setepgen_layer_id(Integer epgen_layer_id) {
		this.epgen_layer_id = epgen_layer_id;
	}
	public Integer getepgen_parent_id() {
		return epgen_parent_id;
	}

	public void setepgen_parent_id(Integer epgen_parent_id) {
		this.epgen_parent_id = epgen_parent_id;
	}
	public String getepgen_short_name() {
		return epgen_short_name;
	}

	public void setepgen_short_name(String epgen_short_name) {
		this.epgen_short_name = epgen_short_name;
	}
	public String getepgen_layer_type() {
		return epgen_layer_type;
	}

	public void setepgen_layer_type(String epgen_layer_type) {
		this.epgen_layer_type = epgen_layer_type;
	}

}
