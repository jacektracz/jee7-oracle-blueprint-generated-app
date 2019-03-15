
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
@Table(name = "joo2_virtuemart_userfields", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_userfields implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_userfield_id")
    private Integer epgen_virtuemart_userfield_id;
    @Column(name="virtuemart_vendor_id")
    private Integer epgen_virtuemart_vendor_id;
    @Column(name="name")
    private String epgen_name;
    @Column(name="title")
    private String epgen_title;
    @Column(name="description")
    private String epgen_description;
    @Column(name="type")
    private String epgen_type;
    @Column(name="maxlength")
    private Integer epgen_maxlength;
    @Column(name="size")
    private Integer epgen_size;
    @Column(name="required")
    private Integer epgen_required;
    @Column(name="cols")
    private Integer epgen_cols;
    @Column(name="rows")
    private Integer epgen_rows;
    @Column(name="value")
    private String epgen_value;
    @Column(name="default")
    private Integer epgen_default;
    @Column(name="registration")
    private Integer epgen_registration;
    @Column(name="shipping")
    private Integer epgen_shipping;
    @Column(name="account")
    private Integer epgen_account;
    @Column(name="readonly")
    private Integer epgen_readonly;
    @Column(name="calculated")
    private Integer epgen_calculated;
    @Column(name="sys")
    private Integer epgen_sys;
    @Column(name="params")
    private String epgen_params;
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
	public Integer getepgen_virtuemart_userfield_id() {
		return epgen_virtuemart_userfield_id;
	}

	public void setepgen_virtuemart_userfield_id(Integer epgen_virtuemart_userfield_id) {
		this.epgen_virtuemart_userfield_id = epgen_virtuemart_userfield_id;
	}
	public Integer getepgen_virtuemart_vendor_id() {
		return epgen_virtuemart_vendor_id;
	}

	public void setepgen_virtuemart_vendor_id(Integer epgen_virtuemart_vendor_id) {
		this.epgen_virtuemart_vendor_id = epgen_virtuemart_vendor_id;
	}
	public String getepgen_name() {
		return epgen_name;
	}

	public void setepgen_name(String epgen_name) {
		this.epgen_name = epgen_name;
	}
	public String getepgen_title() {
		return epgen_title;
	}

	public void setepgen_title(String epgen_title) {
		this.epgen_title = epgen_title;
	}
	public String getepgen_description() {
		return epgen_description;
	}

	public void setepgen_description(String epgen_description) {
		this.epgen_description = epgen_description;
	}
	public String getepgen_type() {
		return epgen_type;
	}

	public void setepgen_type(String epgen_type) {
		this.epgen_type = epgen_type;
	}
	public Integer getepgen_maxlength() {
		return epgen_maxlength;
	}

	public void setepgen_maxlength(Integer epgen_maxlength) {
		this.epgen_maxlength = epgen_maxlength;
	}
	public Integer getepgen_size() {
		return epgen_size;
	}

	public void setepgen_size(Integer epgen_size) {
		this.epgen_size = epgen_size;
	}
	public Integer getepgen_required() {
		return epgen_required;
	}

	public void setepgen_required(Integer epgen_required) {
		this.epgen_required = epgen_required;
	}
	public Integer getepgen_cols() {
		return epgen_cols;
	}

	public void setepgen_cols(Integer epgen_cols) {
		this.epgen_cols = epgen_cols;
	}
	public Integer getepgen_rows() {
		return epgen_rows;
	}

	public void setepgen_rows(Integer epgen_rows) {
		this.epgen_rows = epgen_rows;
	}
	public String getepgen_value() {
		return epgen_value;
	}

	public void setepgen_value(String epgen_value) {
		this.epgen_value = epgen_value;
	}
	public Integer getepgen_default() {
		return epgen_default;
	}

	public void setepgen_default(Integer epgen_default) {
		this.epgen_default = epgen_default;
	}
	public Integer getepgen_registration() {
		return epgen_registration;
	}

	public void setepgen_registration(Integer epgen_registration) {
		this.epgen_registration = epgen_registration;
	}
	public Integer getepgen_shipping() {
		return epgen_shipping;
	}

	public void setepgen_shipping(Integer epgen_shipping) {
		this.epgen_shipping = epgen_shipping;
	}
	public Integer getepgen_account() {
		return epgen_account;
	}

	public void setepgen_account(Integer epgen_account) {
		this.epgen_account = epgen_account;
	}
	public Integer getepgen_readonly() {
		return epgen_readonly;
	}

	public void setepgen_readonly(Integer epgen_readonly) {
		this.epgen_readonly = epgen_readonly;
	}
	public Integer getepgen_calculated() {
		return epgen_calculated;
	}

	public void setepgen_calculated(Integer epgen_calculated) {
		this.epgen_calculated = epgen_calculated;
	}
	public Integer getepgen_sys() {
		return epgen_sys;
	}

	public void setepgen_sys(Integer epgen_sys) {
		this.epgen_sys = epgen_sys;
	}
	public String getepgen_params() {
		return epgen_params;
	}

	public void setepgen_params(String epgen_params) {
		this.epgen_params = epgen_params;
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
