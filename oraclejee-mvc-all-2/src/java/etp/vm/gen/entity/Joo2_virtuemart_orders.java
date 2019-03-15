
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
@Table(name = "joo2_virtuemart_orders", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_orders implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_order_id")
    private Integer epgen_virtuemart_order_id;
    @Column(name="virtuemart_user_id")
    private Integer epgen_virtuemart_user_id;
    @Column(name="virtuemart_vendor_id")
    private Integer epgen_virtuemart_vendor_id;
    @Column(name="order_number")
    private String epgen_order_number;
    @Column(name="order_pass")
    private String epgen_order_pass;
    @Column(name="virtuemart_userinfo_id")
    private String epgen_virtuemart_userinfo_id;
    @Column(name="order_total")
    private float epgen_order_total;
    @Column(name="order_subtotal")
    private float epgen_order_subtotal;
    @Column(name="order_tax")
    private float epgen_order_tax;
    @Column(name="order_tax_details")
    private String epgen_order_tax_details;
    @Column(name="order_shipping")
    private float epgen_order_shipping;
    @Column(name="order_shipping_tax")
    private float epgen_order_shipping_tax;
    @Column(name="coupon_discount")
    private float epgen_coupon_discount;
    @Column(name="coupon_code")
    private String epgen_coupon_code;
    @Column(name="order_discount")
    private float epgen_order_discount;
    @Column(name="order_currency")
    private Integer epgen_order_currency;
    @Column(name="order_status")
    private String epgen_order_status;
    @Column(name="user_currency_id")
    private Integer epgen_user_currency_id;
    @Column(name="user_currency_rate")
    private float epgen_user_currency_rate;
    @Column(name="payment_method_id")
    private Integer epgen_payment_method_id;
    @Column(name="ship_method_id")
    private String epgen_ship_method_id;
    @Column(name="customer_note")
    private String epgen_customer_note;
    @Column(name="ip_address")
    private String epgen_ip_address;
    
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
	public Integer getepgen_virtuemart_order_id() {
		return epgen_virtuemart_order_id;
	}

	public void setepgen_virtuemart_order_id(Integer epgen_virtuemart_order_id) {
		this.epgen_virtuemart_order_id = epgen_virtuemart_order_id;
	}
	public Integer getepgen_virtuemart_user_id() {
		return epgen_virtuemart_user_id;
	}

	public void setepgen_virtuemart_user_id(Integer epgen_virtuemart_user_id) {
		this.epgen_virtuemart_user_id = epgen_virtuemart_user_id;
	}
	public Integer getepgen_virtuemart_vendor_id() {
		return epgen_virtuemart_vendor_id;
	}

	public void setepgen_virtuemart_vendor_id(Integer epgen_virtuemart_vendor_id) {
		this.epgen_virtuemart_vendor_id = epgen_virtuemart_vendor_id;
	}
	public String getepgen_order_number() {
		return epgen_order_number;
	}

	public void setepgen_order_number(String epgen_order_number) {
		this.epgen_order_number = epgen_order_number;
	}
	public String getepgen_order_pass() {
		return epgen_order_pass;
	}

	public void setepgen_order_pass(String epgen_order_pass) {
		this.epgen_order_pass = epgen_order_pass;
	}
	public String getepgen_virtuemart_userinfo_id() {
		return epgen_virtuemart_userinfo_id;
	}

	public void setepgen_virtuemart_userinfo_id(String epgen_virtuemart_userinfo_id) {
		this.epgen_virtuemart_userinfo_id = epgen_virtuemart_userinfo_id;
	}
	public float getepgen_order_total() {
		return epgen_order_total;
	}

	public void setepgen_order_total(float epgen_order_total) {
		this.epgen_order_total = epgen_order_total;
	}
	public float getepgen_order_subtotal() {
		return epgen_order_subtotal;
	}

	public void setepgen_order_subtotal(float epgen_order_subtotal) {
		this.epgen_order_subtotal = epgen_order_subtotal;
	}
	public float getepgen_order_tax() {
		return epgen_order_tax;
	}

	public void setepgen_order_tax(float epgen_order_tax) {
		this.epgen_order_tax = epgen_order_tax;
	}
	public String getepgen_order_tax_details() {
		return epgen_order_tax_details;
	}

	public void setepgen_order_tax_details(String epgen_order_tax_details) {
		this.epgen_order_tax_details = epgen_order_tax_details;
	}
	public float getepgen_order_shipping() {
		return epgen_order_shipping;
	}

	public void setepgen_order_shipping(float epgen_order_shipping) {
		this.epgen_order_shipping = epgen_order_shipping;
	}
	public float getepgen_order_shipping_tax() {
		return epgen_order_shipping_tax;
	}

	public void setepgen_order_shipping_tax(float epgen_order_shipping_tax) {
		this.epgen_order_shipping_tax = epgen_order_shipping_tax;
	}
	public float getepgen_coupon_discount() {
		return epgen_coupon_discount;
	}

	public void setepgen_coupon_discount(float epgen_coupon_discount) {
		this.epgen_coupon_discount = epgen_coupon_discount;
	}
	public String getepgen_coupon_code() {
		return epgen_coupon_code;
	}

	public void setepgen_coupon_code(String epgen_coupon_code) {
		this.epgen_coupon_code = epgen_coupon_code;
	}
	public float getepgen_order_discount() {
		return epgen_order_discount;
	}

	public void setepgen_order_discount(float epgen_order_discount) {
		this.epgen_order_discount = epgen_order_discount;
	}
	public Integer getepgen_order_currency() {
		return epgen_order_currency;
	}

	public void setepgen_order_currency(Integer epgen_order_currency) {
		this.epgen_order_currency = epgen_order_currency;
	}
	public String getepgen_order_status() {
		return epgen_order_status;
	}

	public void setepgen_order_status(String epgen_order_status) {
		this.epgen_order_status = epgen_order_status;
	}
	public Integer getepgen_user_currency_id() {
		return epgen_user_currency_id;
	}

	public void setepgen_user_currency_id(Integer epgen_user_currency_id) {
		this.epgen_user_currency_id = epgen_user_currency_id;
	}
	public float getepgen_user_currency_rate() {
		return epgen_user_currency_rate;
	}

	public void setepgen_user_currency_rate(float epgen_user_currency_rate) {
		this.epgen_user_currency_rate = epgen_user_currency_rate;
	}
	public Integer getepgen_payment_method_id() {
		return epgen_payment_method_id;
	}

	public void setepgen_payment_method_id(Integer epgen_payment_method_id) {
		this.epgen_payment_method_id = epgen_payment_method_id;
	}
	public String getepgen_ship_method_id() {
		return epgen_ship_method_id;
	}

	public void setepgen_ship_method_id(String epgen_ship_method_id) {
		this.epgen_ship_method_id = epgen_ship_method_id;
	}
	public String getepgen_customer_note() {
		return epgen_customer_note;
	}

	public void setepgen_customer_note(String epgen_customer_note) {
		this.epgen_customer_note = epgen_customer_note;
	}
	public String getepgen_ip_address() {
		return epgen_ip_address;
	}

	public void setepgen_ip_address(String epgen_ip_address) {
		this.epgen_ip_address = epgen_ip_address;
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
