
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
@Table(name = "joo2_user_usergroup_map", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_user_usergroup_map implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="user_id")
    private Integer epgen_user_id;
    @Column(name="group_id")
    private Integer epgen_group_id;
	public Integer getepgen_user_id() {
		return epgen_user_id;
	}

	public void setepgen_user_id(Integer epgen_user_id) {
		this.epgen_user_id = epgen_user_id;
	}
	public Integer getepgen_group_id() {
		return epgen_group_id;
	}

	public void setepgen_group_id(Integer epgen_group_id) {
		this.epgen_group_id = epgen_group_id;
	}

}
