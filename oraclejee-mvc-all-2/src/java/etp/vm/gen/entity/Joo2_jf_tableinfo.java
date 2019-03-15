
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
@Table(name = "joo2_jf_tableinfo", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_jf_tableinfo implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="joomlatablename")
    private String epgen_joomlatablename;
    @Column(name="tablepkID")
    private String epgen_tablepkID;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public String getepgen_joomlatablename() {
		return epgen_joomlatablename;
	}

	public void setepgen_joomlatablename(String epgen_joomlatablename) {
		this.epgen_joomlatablename = epgen_joomlatablename;
	}
	public String getepgen_tablepkID() {
		return epgen_tablepkID;
	}

	public void setepgen_tablepkID(String epgen_tablepkID) {
		this.epgen_tablepkID = epgen_tablepkID;
	}

}
