
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
@Table(name = "joo2_virtuemart_userfield_values", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_userfield_values implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_userfield_value_id")
    private Integer epgen_virtuemart_userfield_value_id;
    @Column(name="virtuemart_userfield_id")
    private Integer epgen_virtuemart_userfield_id;
    @Column(name="fieldtitle")
    private String epgen_fieldtitle;
    @Column(name="fieldvalue")
    private String epgen_fieldvalue;
    @Column(name="sys")
    private Integer epgen_sys;
    @Column(name="ordering")
    private Integer epgen_ordering;
    
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
	public Integer getepgen_virtuemart_userfield_value_id() {
		return epgen_virtuemart_userfield_value_id;
	}

	public void setepgen_virtuemart_userfield_value_id(Integer epgen_virtuemart_userfield_value_id) {
		this.epgen_virtuemart_userfield_value_id = epgen_virtuemart_userfield_value_id;
	}
	public Integer getepgen_virtuemart_userfield_id() {
		return epgen_virtuemart_userfield_id;
	}

	public void setepgen_virtuemart_userfield_id(Integer epgen_virtuemart_userfield_id) {
		this.epgen_virtuemart_userfield_id = epgen_virtuemart_userfield_id;
	}
	public String getepgen_fieldtitle() {
		return epgen_fieldtitle;
	}

	public void setepgen_fieldtitle(String epgen_fieldtitle) {
		this.epgen_fieldtitle = epgen_fieldtitle;
	}
	public String getepgen_fieldvalue() {
		return epgen_fieldvalue;
	}

	public void setepgen_fieldvalue(String epgen_fieldvalue) {
		this.epgen_fieldvalue = epgen_fieldvalue;
	}
	public Integer getepgen_sys() {
		return epgen_sys;
	}

	public void setepgen_sys(Integer epgen_sys) {
		this.epgen_sys = epgen_sys;
	}
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
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
