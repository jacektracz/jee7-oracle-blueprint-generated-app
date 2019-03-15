
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
@Table(name = "joo2_messages_cfg", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_messages_cfg implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="user_id")
    private Integer epgen_user_id;
    @Column(name="cfg_name")
    private String epgen_cfg_name;
    @Column(name="cfg_value")
    private String epgen_cfg_value;
	public Integer getepgen_user_id() {
		return epgen_user_id;
	}

	public void setepgen_user_id(Integer epgen_user_id) {
		this.epgen_user_id = epgen_user_id;
	}
	public String getepgen_cfg_name() {
		return epgen_cfg_name;
	}

	public void setepgen_cfg_name(String epgen_cfg_name) {
		this.epgen_cfg_name = epgen_cfg_name;
	}
	public String getepgen_cfg_value() {
		return epgen_cfg_value;
	}

	public void setepgen_cfg_value(String epgen_cfg_value) {
		this.epgen_cfg_value = epgen_cfg_value;
	}

}
