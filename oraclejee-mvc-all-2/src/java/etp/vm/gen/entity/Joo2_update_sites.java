
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
@Table(name = "joo2_update_sites", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_update_sites implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="update_site_id")
    private Integer epgen_update_site_id;
    @Column(name="name")
    private String epgen_name;
    @Column(name="type")
    private String epgen_type;
    @Column(name="location")
    private String epgen_location;
    @Column(name="enabled")
    private Integer epgen_enabled;
	public Integer getepgen_update_site_id() {
		return epgen_update_site_id;
	}

	public void setepgen_update_site_id(Integer epgen_update_site_id) {
		this.epgen_update_site_id = epgen_update_site_id;
	}
	public String getepgen_name() {
		return epgen_name;
	}

	public void setepgen_name(String epgen_name) {
		this.epgen_name = epgen_name;
	}
	public String getepgen_type() {
		return epgen_type;
	}

	public void setepgen_type(String epgen_type) {
		this.epgen_type = epgen_type;
	}
	public String getepgen_location() {
		return epgen_location;
	}

	public void setepgen_location(String epgen_location) {
		this.epgen_location = epgen_location;
	}
	public Integer getepgen_enabled() {
		return epgen_enabled;
	}

	public void setepgen_enabled(Integer epgen_enabled) {
		this.epgen_enabled = epgen_enabled;
	}

}
