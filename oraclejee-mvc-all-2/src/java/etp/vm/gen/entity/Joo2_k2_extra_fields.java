
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
@Table(name = "joo2_k2_extra_fields", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_k2_extra_fields implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="name")
    private String epgen_name;
    @Column(name="value")
    private String epgen_value;
    @Column(name="type")
    private String epgen_type;
    @Column(name="group")
    private Integer epgen_group;
    @Column(name="published")
    private Integer epgen_published;
    @Column(name="ordering")
    private Integer epgen_ordering;
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
	public String getepgen_value() {
		return epgen_value;
	}

	public void setepgen_value(String epgen_value) {
		this.epgen_value = epgen_value;
	}
	public String getepgen_type() {
		return epgen_type;
	}

	public void setepgen_type(String epgen_type) {
		this.epgen_type = epgen_type;
	}
	public Integer getepgen_group() {
		return epgen_group;
	}

	public void setepgen_group(Integer epgen_group) {
		this.epgen_group = epgen_group;
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
