
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
@Table(name = "joo2_kunena_version", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_kunena_version implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="version")
    private String epgen_version;
    @Column(name="build")
    private String epgen_build;
    @Column(name="versionname")
    private String epgen_versionname;
    @Column(name="state")
    private String epgen_state;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public String getepgen_version() {
		return epgen_version;
	}

	public void setepgen_version(String epgen_version) {
		this.epgen_version = epgen_version;
	}
	public String getepgen_build() {
		return epgen_build;
	}

	public void setepgen_build(String epgen_build) {
		this.epgen_build = epgen_build;
	}
	public String getepgen_versionname() {
		return epgen_versionname;
	}

	public void setepgen_versionname(String epgen_versionname) {
		this.epgen_versionname = epgen_versionname;
	}
	public String getepgen_state() {
		return epgen_state;
	}

	public void setepgen_state(String epgen_state) {
		this.epgen_state = epgen_state;
	}

}
