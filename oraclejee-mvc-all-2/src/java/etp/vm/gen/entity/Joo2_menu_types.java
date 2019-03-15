
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
@Table(name = "joo2_menu_types", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_menu_types implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="menutype")
    private String epgen_menutype;
    @Column(name="title")
    private String epgen_title;
    @Column(name="description")
    private String epgen_description;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public String getepgen_menutype() {
		return epgen_menutype;
	}

	public void setepgen_menutype(String epgen_menutype) {
		this.epgen_menutype = epgen_menutype;
	}
	public String getepgen_title() {
		return epgen_title;
	}

	public void setepgen_title(String epgen_title) {
		this.epgen_title = epgen_title;
	}
	public String getepgen_description() {
		return epgen_description;
	}

	public void setepgen_description(String epgen_description) {
		this.epgen_description = epgen_description;
	}

}
