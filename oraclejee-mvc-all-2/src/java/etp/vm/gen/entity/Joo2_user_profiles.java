
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
@Table(name = "joo2_user_profiles", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_user_profiles implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="user_id")
    private Integer epgen_user_id;
    @Column(name="profile_key")
    private String epgen_profile_key;
    @Column(name="profile_value")
    private String epgen_profile_value;
    @Column(name="ordering")
    private Integer epgen_ordering;
	public Integer getepgen_user_id() {
		return epgen_user_id;
	}

	public void setepgen_user_id(Integer epgen_user_id) {
		this.epgen_user_id = epgen_user_id;
	}
	public String getepgen_profile_key() {
		return epgen_profile_key;
	}

	public void setepgen_profile_key(String epgen_profile_key) {
		this.epgen_profile_key = epgen_profile_key;
	}
	public String getepgen_profile_value() {
		return epgen_profile_value;
	}

	public void setepgen_profile_value(String epgen_profile_value) {
		this.epgen_profile_value = epgen_profile_value;
	}
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
	}

}
