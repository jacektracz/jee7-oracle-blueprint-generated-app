
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
@Table(name = "joo2_schemas", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_schemas implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="extension_id")
    private Integer epgen_extension_id;
    @Column(name="version_id")
    private String epgen_version_id;
	public Integer getepgen_extension_id() {
		return epgen_extension_id;
	}

	public void setepgen_extension_id(Integer epgen_extension_id) {
		this.epgen_extension_id = epgen_extension_id;
	}
	public String getepgen_version_id() {
		return epgen_version_id;
	}

	public void setepgen_version_id(String epgen_version_id) {
		this.epgen_version_id = epgen_version_id;
	}

}
