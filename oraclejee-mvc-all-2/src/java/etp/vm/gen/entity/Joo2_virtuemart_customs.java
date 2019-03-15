
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
@Table(name = "joo2_virtuemart_customs", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_customs implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_custom_id")
    private Integer epgen_virtuemart_custom_id;
    @Column(name="custom_parent_id")
    private Integer epgen_custom_parent_id;
    @Column(name="admin_only")
    private Integer epgen_admin_only;
    @Column(name="custom_title")
    private String epgen_custom_title;
    @Column(name="custom_tip")
    private String epgen_custom_tip;
    @Column(name="custom_value")
    private String epgen_custom_value;
    @Column(name="custom_field_desc")
    private String epgen_custom_field_desc;
    @Column(name="field_type")
    private String epgen_field_type;
    @Column(name="is_list")
    private Integer epgen_is_list;
    @Column(name="is_hidden")
    private Integer epgen_is_hidden;
    @Column(name="is_cart_attribute")
    private Integer epgen_is_cart_attribute;
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
	public Integer getepgen_virtuemart_custom_id() {
		return epgen_virtuemart_custom_id;
	}

	public void setepgen_virtuemart_custom_id(Integer epgen_virtuemart_custom_id) {
		this.epgen_virtuemart_custom_id = epgen_virtuemart_custom_id;
	}
	public Integer getepgen_custom_parent_id() {
		return epgen_custom_parent_id;
	}

	public void setepgen_custom_parent_id(Integer epgen_custom_parent_id) {
		this.epgen_custom_parent_id = epgen_custom_parent_id;
	}
	public Integer getepgen_admin_only() {
		return epgen_admin_only;
	}

	public void setepgen_admin_only(Integer epgen_admin_only) {
		this.epgen_admin_only = epgen_admin_only;
	}
	public String getepgen_custom_title() {
		return epgen_custom_title;
	}

	public void setepgen_custom_title(String epgen_custom_title) {
		this.epgen_custom_title = epgen_custom_title;
	}
	public String getepgen_custom_tip() {
		return epgen_custom_tip;
	}

	public void setepgen_custom_tip(String epgen_custom_tip) {
		this.epgen_custom_tip = epgen_custom_tip;
	}
	public String getepgen_custom_value() {
		return epgen_custom_value;
	}

	public void setepgen_custom_value(String epgen_custom_value) {
		this.epgen_custom_value = epgen_custom_value;
	}
	public String getepgen_custom_field_desc() {
		return epgen_custom_field_desc;
	}

	public void setepgen_custom_field_desc(String epgen_custom_field_desc) {
		this.epgen_custom_field_desc = epgen_custom_field_desc;
	}
	public String getepgen_field_type() {
		return epgen_field_type;
	}

	public void setepgen_field_type(String epgen_field_type) {
		this.epgen_field_type = epgen_field_type;
	}
	public Integer getepgen_is_list() {
		return epgen_is_list;
	}

	public void setepgen_is_list(Integer epgen_is_list) {
		this.epgen_is_list = epgen_is_list;
	}
	public Integer getepgen_is_hidden() {
		return epgen_is_hidden;
	}

	public void setepgen_is_hidden(Integer epgen_is_hidden) {
		this.epgen_is_hidden = epgen_is_hidden;
	}
	public Integer getepgen_is_cart_attribute() {
		return epgen_is_cart_attribute;
	}

	public void setepgen_is_cart_attribute(Integer epgen_is_cart_attribute) {
		this.epgen_is_cart_attribute = epgen_is_cart_attribute;
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
