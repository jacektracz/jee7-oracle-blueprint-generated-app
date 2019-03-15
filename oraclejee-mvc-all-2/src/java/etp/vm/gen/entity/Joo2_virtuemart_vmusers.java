
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
@Table(name = "joo2_virtuemart_vmusers", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_vmusers implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_user_id")
    private Integer epgen_virtuemart_user_id;
    @Column(name="virtuemart_vendor_id")
    private Integer epgen_virtuemart_vendor_id;
    @Column(name="user_is_vendor")
    private Integer epgen_user_is_vendor;
    @Column(name="customer_number")
    private String epgen_customer_number;
    @Column(name="perms")
    private String epgen_perms;
    @Column(name="virtuemart_paymentmethod_id")
    private Integer epgen_virtuemart_paymentmethod_id;
    @Column(name="virtuemart_shippingcarrier_id")
    private Integer epgen_virtuemart_shippingcarrier_id;
    @Column(name="agreed")
    private Integer epgen_agreed;
    
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
	public Integer getepgen_user_is_vendor() {
		return epgen_user_is_vendor;
	}

	public void setepgen_user_is_vendor(Integer epgen_user_is_vendor) {
		this.epgen_user_is_vendor = epgen_user_is_vendor;
	}
	public String getepgen_customer_number() {
		return epgen_customer_number;
	}

	public void setepgen_customer_number(String epgen_customer_number) {
		this.epgen_customer_number = epgen_customer_number;
	}
	public String getepgen_perms() {
		return epgen_perms;
	}

	public void setepgen_perms(String epgen_perms) {
		this.epgen_perms = epgen_perms;
	}
	public Integer getepgen_virtuemart_paymentmethod_id() {
		return epgen_virtuemart_paymentmethod_id;
	}

	public void setepgen_virtuemart_paymentmethod_id(Integer epgen_virtuemart_paymentmethod_id) {
		this.epgen_virtuemart_paymentmethod_id = epgen_virtuemart_paymentmethod_id;
	}
	public Integer getepgen_virtuemart_shippingcarrier_id() {
		return epgen_virtuemart_shippingcarrier_id;
	}

	public void setepgen_virtuemart_shippingcarrier_id(Integer epgen_virtuemart_shippingcarrier_id) {
		this.epgen_virtuemart_shippingcarrier_id = epgen_virtuemart_shippingcarrier_id;
	}
	public Integer getepgen_agreed() {
		return epgen_agreed;
	}

	public void setepgen_agreed(Integer epgen_agreed) {
		this.epgen_agreed = epgen_agreed;
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
