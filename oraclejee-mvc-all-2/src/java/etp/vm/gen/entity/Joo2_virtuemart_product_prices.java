
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
@Table(name = "joo2_virtuemart_product_prices", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_product_prices implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_product_price_id")
    private Integer epgen_virtuemart_product_price_id;
    @Column(name="virtuemart_product_id")
    private Integer epgen_virtuemart_product_id;
    @Column(name="virtuemart_shoppergroup_id")
    private Integer epgen_virtuemart_shoppergroup_id;
    @Column(name="product_price")
    private float epgen_product_price;
    @Column(name="override")
    private Integer epgen_override;
    @Column(name="product_override_price")
    private float epgen_product_override_price;
    @Column(name="product_tax_id")
    private Integer epgen_product_tax_id;
    @Column(name="product_discount_id")
    private Integer epgen_product_discount_id;
    @Column(name="product_currency")
    private String epgen_product_currency;
    
    @Column(name = "product_price_vdate", columnDefinition="VARCHAR")
    private String epgen_product_price_vdate;
    
    @Column(name = "product_price_edate", columnDefinition="VARCHAR")
    private String epgen_product_price_edate;
    @Column(name="price_quantity_start")
    private Integer epgen_price_quantity_start;
    @Column(name="price_quantity_end")
    private Integer epgen_price_quantity_end;
    
    @Column(name = "created_on", columnDefinition="VARCHAR")
    private String epgen_created_on;
    @Column(name="created_by")
    private Integer epgen_created_by;
    
    @Column(name = "modified_on", columnDefinition="VARCHAR")
    private String epgen_modified_on;
    @Column(name="modified_by")
    private Integer epgen_modified_by;
    
    @Column(name = "locked_on", columnDefinition="VARCHAR")
    private String epgen_locked_on;
    @Column(name="locked_by")
    private Integer epgen_locked_by;
	public Integer getepgen_virtuemart_product_price_id() {
		return epgen_virtuemart_product_price_id;
	}

	public void setepgen_virtuemart_product_price_id(Integer epgen_virtuemart_product_price_id) {
		this.epgen_virtuemart_product_price_id = epgen_virtuemart_product_price_id;
	}
	public Integer getepgen_virtuemart_product_id() {
		return epgen_virtuemart_product_id;
	}

	public void setepgen_virtuemart_product_id(Integer epgen_virtuemart_product_id) {
		this.epgen_virtuemart_product_id = epgen_virtuemart_product_id;
	}
	public Integer getepgen_virtuemart_shoppergroup_id() {
		return epgen_virtuemart_shoppergroup_id;
	}

	public void setepgen_virtuemart_shoppergroup_id(Integer epgen_virtuemart_shoppergroup_id) {
		this.epgen_virtuemart_shoppergroup_id = epgen_virtuemart_shoppergroup_id;
	}
	public float getepgen_product_price() {
		return epgen_product_price;
	}

	public void setepgen_product_price(float epgen_product_price) {
		this.epgen_product_price = epgen_product_price;
	}
	public Integer getepgen_override() {
		return epgen_override;
	}

	public void setepgen_override(Integer epgen_override) {
		this.epgen_override = epgen_override;
	}
	public float getepgen_product_override_price() {
		return epgen_product_override_price;
	}

	public void setepgen_product_override_price(float epgen_product_override_price) {
		this.epgen_product_override_price = epgen_product_override_price;
	}
	public Integer getepgen_product_tax_id() {
		return epgen_product_tax_id;
	}

	public void setepgen_product_tax_id(Integer epgen_product_tax_id) {
		this.epgen_product_tax_id = epgen_product_tax_id;
	}
	public Integer getepgen_product_discount_id() {
		return epgen_product_discount_id;
	}

	public void setepgen_product_discount_id(Integer epgen_product_discount_id) {
		this.epgen_product_discount_id = epgen_product_discount_id;
	}
	public String getepgen_product_currency() {
		return epgen_product_currency;
	}

	public void setepgen_product_currency(String epgen_product_currency) {
		this.epgen_product_currency = epgen_product_currency;
	}
	public String getepgen_product_price_vdate() {
		return epgen_product_price_vdate;
	}

	public void setepgen_product_price_vdate(String epgen_product_price_vdate) {
		this.epgen_product_price_vdate = epgen_product_price_vdate;
	}
	public String getepgen_product_price_edate() {
		return epgen_product_price_edate;
	}

	public void setepgen_product_price_edate(String epgen_product_price_edate) {
		this.epgen_product_price_edate = epgen_product_price_edate;
	}
	public Integer getepgen_price_quantity_start() {
		return epgen_price_quantity_start;
	}

	public void setepgen_price_quantity_start(Integer epgen_price_quantity_start) {
		this.epgen_price_quantity_start = epgen_price_quantity_start;
	}
	public Integer getepgen_price_quantity_end() {
		return epgen_price_quantity_end;
	}

	public void setepgen_price_quantity_end(Integer epgen_price_quantity_end) {
		this.epgen_price_quantity_end = epgen_price_quantity_end;
	}
	public String getepgen_created_on() {
		return epgen_created_on;
	}

	public void setepgen_created_on(String epgen_created_on) {
		this.epgen_created_on = epgen_created_on;
	}
	public Integer getepgen_created_by() {
		return epgen_created_by;
	}

	public void setepgen_created_by(Integer epgen_created_by) {
		this.epgen_created_by = epgen_created_by;
	}
	public String getepgen_modified_on() {
		return epgen_modified_on;
	}

	public void setepgen_modified_on(String epgen_modified_on) {
		this.epgen_modified_on = epgen_modified_on;
	}
	public Integer getepgen_modified_by() {
		return epgen_modified_by;
	}

	public void setepgen_modified_by(Integer epgen_modified_by) {
		this.epgen_modified_by = epgen_modified_by;
	}
	public String getepgen_locked_on() {
		return epgen_locked_on;
	}

	public void setepgen_locked_on(String epgen_locked_on) {
		this.epgen_locked_on = epgen_locked_on;
	}
	public Integer getepgen_locked_by() {
		return epgen_locked_by;
	}

	public void setepgen_locked_by(Integer epgen_locked_by) {
		this.epgen_locked_by = epgen_locked_by;
	}

}
