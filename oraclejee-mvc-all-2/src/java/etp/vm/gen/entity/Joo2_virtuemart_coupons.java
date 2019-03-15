
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
@Table(name = "joo2_virtuemart_coupons", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_coupons implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_coupon_id")
    private Integer epgen_virtuemart_coupon_id;
    @Column(name="coupon_code")
    private String epgen_coupon_code;
    @Column(name="coupon_value")
    private float epgen_coupon_value;
    
    @Column(name = "coupon_start_date", columnDefinition="VARCHAR")
    private String epgen_coupon_start_date;
    
    @Column(name = "coupon_expiry_date", columnDefinition="VARCHAR")
    private String epgen_coupon_expiry_date;
    @Column(name="coupon_value_valid")
    private float epgen_coupon_value_valid;
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
	public Integer getepgen_virtuemart_coupon_id() {
		return epgen_virtuemart_coupon_id;
	}

	public void setepgen_virtuemart_coupon_id(Integer epgen_virtuemart_coupon_id) {
		this.epgen_virtuemart_coupon_id = epgen_virtuemart_coupon_id;
	}
	public String getepgen_coupon_code() {
		return epgen_coupon_code;
	}

	public void setepgen_coupon_code(String epgen_coupon_code) {
		this.epgen_coupon_code = epgen_coupon_code;
	}
	public float getepgen_coupon_value() {
		return epgen_coupon_value;
	}

	public void setepgen_coupon_value(float epgen_coupon_value) {
		this.epgen_coupon_value = epgen_coupon_value;
	}
	public String getepgen_coupon_start_date() {
		return epgen_coupon_start_date;
	}

	public void setepgen_coupon_start_date(String epgen_coupon_start_date) {
		this.epgen_coupon_start_date = epgen_coupon_start_date;
	}
	public String getepgen_coupon_expiry_date() {
		return epgen_coupon_expiry_date;
	}

	public void setepgen_coupon_expiry_date(String epgen_coupon_expiry_date) {
		this.epgen_coupon_expiry_date = epgen_coupon_expiry_date;
	}
	public float getepgen_coupon_value_valid() {
		return epgen_coupon_value_valid;
	}

	public void setepgen_coupon_value_valid(float epgen_coupon_value_valid) {
		this.epgen_coupon_value_valid = epgen_coupon_value_valid;
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
