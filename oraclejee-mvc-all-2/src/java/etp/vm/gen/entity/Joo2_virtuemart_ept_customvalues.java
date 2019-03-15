
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
@Table(name = "joo2_virtuemart_ept_customvalues", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_ept_customvalues implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="ept_customvalues_id")
    private Integer epgen_ept_customvalues_id;
    @Column(name="product_id")
    private Integer epgen_product_id;
    @Column(name="product_parent_id")
    private Integer epgen_product_parent_id;
    @Column(name="color")
    private String epgen_color;
    @Column(name="size")
    private String epgen_size;
    @Column(name="on_stock")
    private String epgen_on_stock;
    @Column(name="charge")
    private String epgen_charge;
	public Integer getepgen_ept_customvalues_id() {
		return epgen_ept_customvalues_id;
	}

	public void setepgen_ept_customvalues_id(Integer epgen_ept_customvalues_id) {
		this.epgen_ept_customvalues_id = epgen_ept_customvalues_id;
	}
	public Integer getepgen_product_id() {
		return epgen_product_id;
	}

	public void setepgen_product_id(Integer epgen_product_id) {
		this.epgen_product_id = epgen_product_id;
	}
	public Integer getepgen_product_parent_id() {
		return epgen_product_parent_id;
	}

	public void setepgen_product_parent_id(Integer epgen_product_parent_id) {
		this.epgen_product_parent_id = epgen_product_parent_id;
	}
	public String getepgen_color() {
		return epgen_color;
	}

	public void setepgen_color(String epgen_color) {
		this.epgen_color = epgen_color;
	}
	public String getepgen_size() {
		return epgen_size;
	}

	public void setepgen_size(String epgen_size) {
		this.epgen_size = epgen_size;
	}
	public String getepgen_on_stock() {
		return epgen_on_stock;
	}

	public void setepgen_on_stock(String epgen_on_stock) {
		this.epgen_on_stock = epgen_on_stock;
	}
	public String getepgen_charge() {
		return epgen_charge;
	}

	public void setepgen_charge(String epgen_charge) {
		this.epgen_charge = epgen_charge;
	}

}
