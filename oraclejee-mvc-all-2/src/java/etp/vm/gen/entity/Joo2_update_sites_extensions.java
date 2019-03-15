
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
@Table(name = "joo2_update_sites_extensions", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_update_sites_extensions implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="update_site_id")
    private Integer epgen_update_site_id;
    @Column(name="extension_id")
    private Integer epgen_extension_id;
	public Integer getepgen_update_site_id() {
		return epgen_update_site_id;
	}

	public void setepgen_update_site_id(Integer epgen_update_site_id) {
		this.epgen_update_site_id = epgen_update_site_id;
	}
	public Integer getepgen_extension_id() {
		return epgen_extension_id;
	}

	public void setepgen_extension_id(Integer epgen_extension_id) {
		this.epgen_extension_id = epgen_extension_id;
	}

}
