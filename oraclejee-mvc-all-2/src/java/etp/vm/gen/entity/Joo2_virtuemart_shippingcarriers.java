
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
@Table(name = "joo2_virtuemart_shippingcarriers", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_shippingcarriers implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_shippingcarrier_id")
    private Integer epgen_virtuemart_shippingcarrier_id;
    @Column(name="virtuemart_vendor_id")
    private Integer epgen_virtuemart_vendor_id;
    @Column(name="shipping_carrier_jplugin_id")
    private Integer epgen_shipping_carrier_jplugin_id;
    @Column(name="shipping_carrier_name")
    private String epgen_shipping_carrier_name;
    @Column(name="shipping_carrier_desc")
    private String epgen_shipping_carrier_desc;
    @Column(name="shipping_carrier_element")
    private String epgen_shipping_carrier_element;
    @Column(name="shipping_carrier_params")
    private String epgen_shipping_carrier_params;
    @Column(name="shipping_carrier_value")
    private float epgen_shipping_carrier_value;
    @Column(name="shipping_carrier_package_fee")
    private float epgen_shipping_carrier_package_fee;
    @Column(name="shipping_carrier_vat_id")
    private Integer epgen_shipping_carrier_vat_id;
    @Column(name="ordering")
    private Integer epgen_ordering;
    @Column(name="shared")
    private Integer epgen_shared;
    @Column(name="published")
    private Integer epgen_published;
    
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
	public Integer getepgen_virtuemart_shippingcarrier_id() {
		return epgen_virtuemart_shippingcarrier_id;
	}

	public void setepgen_virtuemart_shippingcarrier_id(Integer epgen_virtuemart_shippingcarrier_id) {
		this.epgen_virtuemart_shippingcarrier_id = epgen_virtuemart_shippingcarrier_id;
	}
	public Integer getepgen_virtuemart_vendor_id() {
		return epgen_virtuemart_vendor_id;
	}

	public void setepgen_virtuemart_vendor_id(Integer epgen_virtuemart_vendor_id) {
		this.epgen_virtuemart_vendor_id = epgen_virtuemart_vendor_id;
	}
	public Integer getepgen_shipping_carrier_jplugin_id() {
		return epgen_shipping_carrier_jplugin_id;
	}

	public void setepgen_shipping_carrier_jplugin_id(Integer epgen_shipping_carrier_jplugin_id) {
		this.epgen_shipping_carrier_jplugin_id = epgen_shipping_carrier_jplugin_id;
	}
	public String getepgen_shipping_carrier_name() {
		return epgen_shipping_carrier_name;
	}

	public void setepgen_shipping_carrier_name(String epgen_shipping_carrier_name) {
		this.epgen_shipping_carrier_name = epgen_shipping_carrier_name;
	}
	public String getepgen_shipping_carrier_desc() {
		return epgen_shipping_carrier_desc;
	}

	public void setepgen_shipping_carrier_desc(String epgen_shipping_carrier_desc) {
		this.epgen_shipping_carrier_desc = epgen_shipping_carrier_desc;
	}
	public String getepgen_shipping_carrier_element() {
		return epgen_shipping_carrier_element;
	}

	public void setepgen_shipping_carrier_element(String epgen_shipping_carrier_element) {
		this.epgen_shipping_carrier_element = epgen_shipping_carrier_element;
	}
	public String getepgen_shipping_carrier_params() {
		return epgen_shipping_carrier_params;
	}

	public void setepgen_shipping_carrier_params(String epgen_shipping_carrier_params) {
		this.epgen_shipping_carrier_params = epgen_shipping_carrier_params;
	}
	public float getepgen_shipping_carrier_value() {
		return epgen_shipping_carrier_value;
	}

	public void setepgen_shipping_carrier_value(float epgen_shipping_carrier_value) {
		this.epgen_shipping_carrier_value = epgen_shipping_carrier_value;
	}
	public float getepgen_shipping_carrier_package_fee() {
		return epgen_shipping_carrier_package_fee;
	}

	public void setepgen_shipping_carrier_package_fee(float epgen_shipping_carrier_package_fee) {
		this.epgen_shipping_carrier_package_fee = epgen_shipping_carrier_package_fee;
	}
	public Integer getepgen_shipping_carrier_vat_id() {
		return epgen_shipping_carrier_vat_id;
	}

	public void setepgen_shipping_carrier_vat_id(Integer epgen_shipping_carrier_vat_id) {
		this.epgen_shipping_carrier_vat_id = epgen_shipping_carrier_vat_id;
	}
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
	}
	public Integer getepgen_shared() {
		return epgen_shared;
	}

	public void setepgen_shared(Integer epgen_shared) {
		this.epgen_shared = epgen_shared;
	}
	public Integer getepgen_published() {
		return epgen_published;
	}

	public void setepgen_published(Integer epgen_published) {
		this.epgen_published = epgen_published;
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
