
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
@Table(name = "joo2_virtuemart_states", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_states implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_state_id")
    private Integer epgen_virtuemart_state_id;
    @Column(name="virtuemart_vendor_id")
    private Integer epgen_virtuemart_vendor_id;
    @Column(name="virtuemart_country_id")
    private Integer epgen_virtuemart_country_id;
    @Column(name="virtuemart_worldzone_id")
    private Integer epgen_virtuemart_worldzone_id;
    @Column(name="state_name")
    private String epgen_state_name;
    @Column(name="state_3_code")
    private String epgen_state_3_code;
    @Column(name="state_2_code")
    private String epgen_state_2_code;
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
	public Integer getepgen_virtuemart_state_id() {
		return epgen_virtuemart_state_id;
	}

	public void setepgen_virtuemart_state_id(Integer epgen_virtuemart_state_id) {
		this.epgen_virtuemart_state_id = epgen_virtuemart_state_id;
	}
	public Integer getepgen_virtuemart_vendor_id() {
		return epgen_virtuemart_vendor_id;
	}

	public void setepgen_virtuemart_vendor_id(Integer epgen_virtuemart_vendor_id) {
		this.epgen_virtuemart_vendor_id = epgen_virtuemart_vendor_id;
	}
	public Integer getepgen_virtuemart_country_id() {
		return epgen_virtuemart_country_id;
	}

	public void setepgen_virtuemart_country_id(Integer epgen_virtuemart_country_id) {
		this.epgen_virtuemart_country_id = epgen_virtuemart_country_id;
	}
	public Integer getepgen_virtuemart_worldzone_id() {
		return epgen_virtuemart_worldzone_id;
	}

	public void setepgen_virtuemart_worldzone_id(Integer epgen_virtuemart_worldzone_id) {
		this.epgen_virtuemart_worldzone_id = epgen_virtuemart_worldzone_id;
	}
	public String getepgen_state_name() {
		return epgen_state_name;
	}

	public void setepgen_state_name(String epgen_state_name) {
		this.epgen_state_name = epgen_state_name;
	}
	public String getepgen_state_3_code() {
		return epgen_state_3_code;
	}

	public void setepgen_state_3_code(String epgen_state_3_code) {
		this.epgen_state_3_code = epgen_state_3_code;
	}
	public String getepgen_state_2_code() {
		return epgen_state_2_code;
	}

	public void setepgen_state_2_code(String epgen_state_2_code) {
		this.epgen_state_2_code = epgen_state_2_code;
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
