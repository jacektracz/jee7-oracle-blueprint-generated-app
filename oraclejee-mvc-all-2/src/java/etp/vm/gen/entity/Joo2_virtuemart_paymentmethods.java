
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
@Table(name = "joo2_virtuemart_paymentmethods", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_paymentmethods implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_paymentmethod_id")
    private Integer epgen_virtuemart_paymentmethod_id;
    @Column(name="virtuemart_vendor_id")
    private Integer epgen_virtuemart_vendor_id;
    @Column(name="payment_jplugin_id")
    private Integer epgen_payment_jplugin_id;
    @Column(name="payment_name")
    private String epgen_payment_name;
    @Column(name="payment_element")
    private String epgen_payment_element;
    @Column(name="discount")
    private float epgen_discount;
    @Column(name="discount_is_percentage")
    private Integer epgen_discount_is_percentage;
    @Column(name="discount_max_amount")
    private float epgen_discount_max_amount;
    @Column(name="discount_min_amount")
    private float epgen_discount_min_amount;
    @Column(name="payment_params")
    private String epgen_payment_params;
    @Column(name="shared")
    private Integer epgen_shared;
    @Column(name="ordering")
    private Integer epgen_ordering;
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
	public Integer getepgen_virtuemart_paymentmethod_id() {
		return epgen_virtuemart_paymentmethod_id;
	}

	public void setepgen_virtuemart_paymentmethod_id(Integer epgen_virtuemart_paymentmethod_id) {
		this.epgen_virtuemart_paymentmethod_id = epgen_virtuemart_paymentmethod_id;
	}
	public Integer getepgen_virtuemart_vendor_id() {
		return epgen_virtuemart_vendor_id;
	}

	public void setepgen_virtuemart_vendor_id(Integer epgen_virtuemart_vendor_id) {
		this.epgen_virtuemart_vendor_id = epgen_virtuemart_vendor_id;
	}
	public Integer getepgen_payment_jplugin_id() {
		return epgen_payment_jplugin_id;
	}

	public void setepgen_payment_jplugin_id(Integer epgen_payment_jplugin_id) {
		this.epgen_payment_jplugin_id = epgen_payment_jplugin_id;
	}
	public String getepgen_payment_name() {
		return epgen_payment_name;
	}

	public void setepgen_payment_name(String epgen_payment_name) {
		this.epgen_payment_name = epgen_payment_name;
	}
	public String getepgen_payment_element() {
		return epgen_payment_element;
	}

	public void setepgen_payment_element(String epgen_payment_element) {
		this.epgen_payment_element = epgen_payment_element;
	}
	public float getepgen_discount() {
		return epgen_discount;
	}

	public void setepgen_discount(float epgen_discount) {
		this.epgen_discount = epgen_discount;
	}
	public Integer getepgen_discount_is_percentage() {
		return epgen_discount_is_percentage;
	}

	public void setepgen_discount_is_percentage(Integer epgen_discount_is_percentage) {
		this.epgen_discount_is_percentage = epgen_discount_is_percentage;
	}
	public float getepgen_discount_max_amount() {
		return epgen_discount_max_amount;
	}

	public void setepgen_discount_max_amount(float epgen_discount_max_amount) {
		this.epgen_discount_max_amount = epgen_discount_max_amount;
	}
	public float getepgen_discount_min_amount() {
		return epgen_discount_min_amount;
	}

	public void setepgen_discount_min_amount(float epgen_discount_min_amount) {
		this.epgen_discount_min_amount = epgen_discount_min_amount;
	}
	public String getepgen_payment_params() {
		return epgen_payment_params;
	}

	public void setepgen_payment_params(String epgen_payment_params) {
		this.epgen_payment_params = epgen_payment_params;
	}
	public Integer getepgen_shared() {
		return epgen_shared;
	}

	public void setepgen_shared(Integer epgen_shared) {
		this.epgen_shared = epgen_shared;
	}
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
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
