
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
@Table(name = "joo2_k2_user_groups", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_k2_user_groups implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="name")
    private String epgen_name;
    @Column(name="permissions")
    private String epgen_permissions;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public String getepgen_name() {
		return epgen_name;
	}

	public void setepgen_name(String epgen_name) {
		this.epgen_name = epgen_name;
	}
	public String getepgen_permissions() {
		return epgen_permissions;
	}

	public void setepgen_permissions(String epgen_permissions) {
		this.epgen_permissions = epgen_permissions;
	}

}
