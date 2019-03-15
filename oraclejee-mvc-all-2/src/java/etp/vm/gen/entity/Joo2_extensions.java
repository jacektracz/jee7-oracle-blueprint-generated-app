
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
@Table(name = "joo2_extensions", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_extensions implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="extension_id")
    private Integer epgen_extension_id;
    @Column(name="name")
    private String epgen_name;
    @Column(name="type")
    private String epgen_type;
    @Column(name="element")
    private String epgen_element;
    @Column(name="folder")
    private String epgen_folder;
    @Column(name="client_id")
    private Integer epgen_client_id;
    @Column(name="enabled")
    private Integer epgen_enabled;
    @Column(name="access")
    private Integer epgen_access;
    @Column(name="protected")
    private Integer epgen_protected;
    @Column(name="manifest_cache")
    private String epgen_manifest_cache;
    @Column(name="params")
    private String epgen_params;
    @Column(name="custom_data")
    private String epgen_custom_data;
    @Column(name="system_data")
    private String epgen_system_data;
    @Column(name="checked_out")
    private Integer epgen_checked_out;
    
    @Column(name = "checked_out_time", columnDefinition="VARCHAR")
    private String epgen_checked_out_time;
    @Column(name="ordering")
    private Integer epgen_ordering;
    @Column(name="state")
    private Integer epgen_state;
	public Integer getepgen_extension_id() {
		return epgen_extension_id;
	}

	public void setepgen_extension_id(Integer epgen_extension_id) {
		this.epgen_extension_id = epgen_extension_id;
	}
	public String getepgen_name() {
		return epgen_name;
	}

	public void setepgen_name(String epgen_name) {
		this.epgen_name = epgen_name;
	}
	public String getepgen_type() {
		return epgen_type;
	}

	public void setepgen_type(String epgen_type) {
		this.epgen_type = epgen_type;
	}
	public String getepgen_element() {
		return epgen_element;
	}

	public void setepgen_element(String epgen_element) {
		this.epgen_element = epgen_element;
	}
	public String getepgen_folder() {
		return epgen_folder;
	}

	public void setepgen_folder(String epgen_folder) {
		this.epgen_folder = epgen_folder;
	}
	public Integer getepgen_client_id() {
		return epgen_client_id;
	}

	public void setepgen_client_id(Integer epgen_client_id) {
		this.epgen_client_id = epgen_client_id;
	}
	public Integer getepgen_enabled() {
		return epgen_enabled;
	}

	public void setepgen_enabled(Integer epgen_enabled) {
		this.epgen_enabled = epgen_enabled;
	}
	public Integer getepgen_access() {
		return epgen_access;
	}

	public void setepgen_access(Integer epgen_access) {
		this.epgen_access = epgen_access;
	}
	public Integer getepgen_protected() {
		return epgen_protected;
	}

	public void setepgen_protected(Integer epgen_protected) {
		this.epgen_protected = epgen_protected;
	}
	public String getepgen_manifest_cache() {
		return epgen_manifest_cache;
	}

	public void setepgen_manifest_cache(String epgen_manifest_cache) {
		this.epgen_manifest_cache = epgen_manifest_cache;
	}
	public String getepgen_params() {
		return epgen_params;
	}

	public void setepgen_params(String epgen_params) {
		this.epgen_params = epgen_params;
	}
	public String getepgen_custom_data() {
		return epgen_custom_data;
	}

	public void setepgen_custom_data(String epgen_custom_data) {
		this.epgen_custom_data = epgen_custom_data;
	}
	public String getepgen_system_data() {
		return epgen_system_data;
	}

	public void setepgen_system_data(String epgen_system_data) {
		this.epgen_system_data = epgen_system_data;
	}
	public Integer getepgen_checked_out() {
		return epgen_checked_out;
	}

	public void setepgen_checked_out(Integer epgen_checked_out) {
		this.epgen_checked_out = epgen_checked_out;
	}
	public String getepgen_checked_out_time() {
		return epgen_checked_out_time;
	}

	public void setepgen_checked_out_time(String epgen_checked_out_time) {
		this.epgen_checked_out_time = epgen_checked_out_time;
	}
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
	}
	public Integer getepgen_state() {
		return epgen_state;
	}

	public void setepgen_state(Integer epgen_state) {
		this.epgen_state = epgen_state;
	}

}
