
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
@Table(name = "joo2_virtuemart_category_categories", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_category_categories implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="category_parent_id")
    private Integer epgen_category_parent_id;
    @Column(name="category_child_id")
    private Integer epgen_category_child_id;
    @Column(name="ordering")
    private Integer epgen_ordering;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public Integer getepgen_category_parent_id() {
		return epgen_category_parent_id;
	}

	public void setepgen_category_parent_id(Integer epgen_category_parent_id) {
		this.epgen_category_parent_id = epgen_category_parent_id;
	}
	public Integer getepgen_category_child_id() {
		return epgen_category_child_id;
	}

	public void setepgen_category_child_id(Integer epgen_category_child_id) {
		this.epgen_category_child_id = epgen_category_child_id;
	}
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
	}

}
