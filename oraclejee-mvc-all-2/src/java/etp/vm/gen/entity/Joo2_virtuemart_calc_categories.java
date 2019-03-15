
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
@Table(name = "joo2_virtuemart_calc_categories", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_calc_categories implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="virtuemart_calc_id")
    private Integer epgen_virtuemart_calc_id;
    @Column(name="virtuemart_category_id")
    private Integer epgen_virtuemart_category_id;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public Integer getepgen_virtuemart_calc_id() {
		return epgen_virtuemart_calc_id;
	}

	public void setepgen_virtuemart_calc_id(Integer epgen_virtuemart_calc_id) {
		this.epgen_virtuemart_calc_id = epgen_virtuemart_calc_id;
	}
	public Integer getepgen_virtuemart_category_id() {
		return epgen_virtuemart_category_id;
	}

	public void setepgen_virtuemart_category_id(Integer epgen_virtuemart_category_id) {
		this.epgen_virtuemart_category_id = epgen_virtuemart_category_id;
	}

}
