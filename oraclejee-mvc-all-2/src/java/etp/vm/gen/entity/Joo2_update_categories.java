
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
@Table(name = "joo2_update_categories", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_update_categories implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="categoryid")
    private Integer epgen_categoryid;
    @Column(name="name")
    private String epgen_name;
    @Column(name="description")
    private String epgen_description;
    @Column(name="parent")
    private Integer epgen_parent;
    @Column(name="updatesite")
    private Integer epgen_updatesite;
	public Integer getepgen_categoryid() {
		return epgen_categoryid;
	}

	public void setepgen_categoryid(Integer epgen_categoryid) {
		this.epgen_categoryid = epgen_categoryid;
	}
	public String getepgen_name() {
		return epgen_name;
	}

	public void setepgen_name(String epgen_name) {
		this.epgen_name = epgen_name;
	}
	public String getepgen_description() {
		return epgen_description;
	}

	public void setepgen_description(String epgen_description) {
		this.epgen_description = epgen_description;
	}
	public Integer getepgen_parent() {
		return epgen_parent;
	}

	public void setepgen_parent(Integer epgen_parent) {
		this.epgen_parent = epgen_parent;
	}
	public Integer getepgen_updatesite() {
		return epgen_updatesite;
	}

	public void setepgen_updatesite(Integer epgen_updatesite) {
		this.epgen_updatesite = epgen_updatesite;
	}

}
