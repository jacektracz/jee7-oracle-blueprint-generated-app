
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
@Table(name = "joo2_virtuemart_order_items", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_order_items implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_order_item_id")
    private Integer epgen_virtuemart_order_item_id;
    @Column(name="virtuemart_order_id")
    private Integer epgen_virtuemart_order_id;
    @Column(name="virtuemart_userinfo_id")
    private String epgen_virtuemart_userinfo_id;
    @Column(name="virtuemart_vendor_id")
    private Integer epgen_virtuemart_vendor_id;
    @Column(name="virtuemart_product_id")
    private Integer epgen_virtuemart_product_id;
    @Column(name="order_item_sku")
    private String epgen_order_item_sku;
    @Column(name="order_item_name")
    private String epgen_order_item_name;
    @Column(name="product_quantity")
    private Integer epgen_product_quantity;
    @Column(name="product_item_price")
    private float epgen_product_item_price;
    @Column(name="product_final_price")
    private float epgen_product_final_price;
    @Column(name="order_item_currency")
    private Integer epgen_order_item_currency;
    @Column(name="order_status")
    private String epgen_order_status;
    @Column(name="product_attribute")
    private String epgen_product_attribute;
    
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
	public Integer getepgen_virtuemart_order_item_id() {
		return epgen_virtuemart_order_item_id;
	}

	public void setepgen_virtuemart_order_item_id(Integer epgen_virtuemart_order_item_id) {
		this.epgen_virtuemart_order_item_id = epgen_virtuemart_order_item_id;
	}
	public Integer getepgen_virtuemart_order_id() {
		return epgen_virtuemart_order_id;
	}

	public void setepgen_virtuemart_order_id(Integer epgen_virtuemart_order_id) {
		this.epgen_virtuemart_order_id = epgen_virtuemart_order_id;
	}
	public String getepgen_virtuemart_userinfo_id() {
		return epgen_virtuemart_userinfo_id;
	}

	public void setepgen_virtuemart_userinfo_id(String epgen_virtuemart_userinfo_id) {
		this.epgen_virtuemart_userinfo_id = epgen_virtuemart_userinfo_id;
	}
	public Integer getepgen_virtuemart_vendor_id() {
		return epgen_virtuemart_vendor_id;
	}

	public void setepgen_virtuemart_vendor_id(Integer epgen_virtuemart_vendor_id) {
		this.epgen_virtuemart_vendor_id = epgen_virtuemart_vendor_id;
	}
	public Integer getepgen_virtuemart_product_id() {
		return epgen_virtuemart_product_id;
	}

	public void setepgen_virtuemart_product_id(Integer epgen_virtuemart_product_id) {
		this.epgen_virtuemart_product_id = epgen_virtuemart_product_id;
	}
	public String getepgen_order_item_sku() {
		return epgen_order_item_sku;
	}

	public void setepgen_order_item_sku(String epgen_order_item_sku) {
		this.epgen_order_item_sku = epgen_order_item_sku;
	}
	public String getepgen_order_item_name() {
		return epgen_order_item_name;
	}

	public void setepgen_order_item_name(String epgen_order_item_name) {
		this.epgen_order_item_name = epgen_order_item_name;
	}
	public Integer getepgen_product_quantity() {
		return epgen_product_quantity;
	}

	public void setepgen_product_quantity(Integer epgen_product_quantity) {
		this.epgen_product_quantity = epgen_product_quantity;
	}
	public float getepgen_product_item_price() {
		return epgen_product_item_price;
	}

	public void setepgen_product_item_price(float epgen_product_item_price) {
		this.epgen_product_item_price = epgen_product_item_price;
	}
	public float getepgen_product_final_price() {
		return epgen_product_final_price;
	}

	public void setepgen_product_final_price(float epgen_product_final_price) {
		this.epgen_product_final_price = epgen_product_final_price;
	}
	public Integer getepgen_order_item_currency() {
		return epgen_order_item_currency;
	}

	public void setepgen_order_item_currency(Integer epgen_order_item_currency) {
		this.epgen_order_item_currency = epgen_order_item_currency;
	}
	public String getepgen_order_status() {
		return epgen_order_status;
	}

	public void setepgen_order_status(String epgen_order_status) {
		this.epgen_order_status = epgen_order_status;
	}
	public String getepgen_product_attribute() {
		return epgen_product_attribute;
	}

	public void setepgen_product_attribute(String epgen_product_attribute) {
		this.epgen_product_attribute = epgen_product_attribute;
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
