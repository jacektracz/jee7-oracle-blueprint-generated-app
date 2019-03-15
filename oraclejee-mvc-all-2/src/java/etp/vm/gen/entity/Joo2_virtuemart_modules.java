
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
@Table(name = "joo2_virtuemart_modules", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_modules implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="module_id")
    private Integer epgen_module_id;
    @Column(name="module_name")
    private String epgen_module_name;
    @Column(name="module_description")
    private String epgen_module_description;
    @Column(name="module_perms")
    private String epgen_module_perms;
    @Column(name="published")
    private Integer epgen_published;
    @Column(name="ordering")
    private Integer epgen_ordering;
	public Integer getepgen_module_id() {
		return epgen_module_id;
	}

	public void setepgen_module_id(Integer epgen_module_id) {
		this.epgen_module_id = epgen_module_id;
	}
	public String getepgen_module_name() {
		return epgen_module_name;
	}

	public void setepgen_module_name(String epgen_module_name) {
		this.epgen_module_name = epgen_module_name;
	}
	public String getepgen_module_description() {
		return epgen_module_description;
	}

	public void setepgen_module_description(String epgen_module_description) {
		this.epgen_module_description = epgen_module_description;
	}
	public String getepgen_module_perms() {
		return epgen_module_perms;
	}

	public void setepgen_module_perms(String epgen_module_perms) {
		this.epgen_module_perms = epgen_module_perms;
	}
	public Integer getepgen_published() {
		return epgen_published;
	}

	public void setepgen_published(Integer epgen_published) {
		this.epgen_published = epgen_published;
	}
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
	}

}
