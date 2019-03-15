
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
@Table(name = "joo2_modules_menu", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_modules_menu implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="moduleid")
    private Integer epgen_moduleid;
    @Column(name="menuid")
    private Integer epgen_menuid;
	public Integer getepgen_moduleid() {
		return epgen_moduleid;
	}

	public void setepgen_moduleid(Integer epgen_moduleid) {
		this.epgen_moduleid = epgen_moduleid;
	}
	public Integer getepgen_menuid() {
		return epgen_menuid;
	}

	public void setepgen_menuid(Integer epgen_menuid) {
		this.epgen_menuid = epgen_menuid;
	}

}
