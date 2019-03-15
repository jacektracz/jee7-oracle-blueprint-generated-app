
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
@Table(name = "joo2_updates", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_updates implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="update_id")
    private Integer epgen_update_id;
    @Column(name="update_site_id")
    private Integer epgen_update_site_id;
    @Column(name="extension_id")
    private Integer epgen_extension_id;
    @Column(name="categoryid")
    private Integer epgen_categoryid;
    @Column(name="name")
    private String epgen_name;
    @Column(name="description")
    private String epgen_description;
    @Column(name="element")
    private String epgen_element;
    @Column(name="type")
    private String epgen_type;
    @Column(name="folder")
    private String epgen_folder;
    @Column(name="client_id")
    private Integer epgen_client_id;
    @Column(name="version")
    private String epgen_version;
    @Column(name="data")
    private String epgen_data;
    @Column(name="detailsurl")
    private String epgen_detailsurl;
	public Integer getepgen_update_id() {
		return epgen_update_id;
	}

	public void setepgen_update_id(Integer epgen_update_id) {
		this.epgen_update_id = epgen_update_id;
	}
	public Integer getepgen_update_site_id() {
		return epgen_update_site_id;
	}

	public void setepgen_update_site_id(Integer epgen_update_site_id) {
		this.epgen_update_site_id = epgen_update_site_id;
	}
	public Integer getepgen_extension_id() {
		return epgen_extension_id;
	}

	public void setepgen_extension_id(Integer epgen_extension_id) {
		this.epgen_extension_id = epgen_extension_id;
	}
	public Integer getepgen_categoryid() {
		return epgen_categoryid;
	}

	public void setepgen_categoryid(Integer epgen_categoryid) {
		this.epgen_categoryid = epgen_categoryid;
	}
	public String getepgen_name() {
		return epgen_name;
	}

	public void setepgen_name(String epgen_name) {
		this.epgen_name = epgen_name;
	}
	public String getepgen_description() {
		return epgen_description;
	}

	public void setepgen_description(String epgen_description) {
		this.epgen_description = epgen_description;
	}
	public String getepgen_element() {
		return epgen_element;
	}

	public void setepgen_element(String epgen_element) {
		this.epgen_element = epgen_element;
	}
	public String getepgen_type() {
		return epgen_type;
	}

	public void setepgen_type(String epgen_type) {
		this.epgen_type = epgen_type;
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
	public String getepgen_version() {
		return epgen_version;
	}

	public void setepgen_version(String epgen_version) {
		this.epgen_version = epgen_version;
	}
	public String getepgen_data() {
		return epgen_data;
	}

	public void setepgen_data(String epgen_data) {
		this.epgen_data = epgen_data;
	}
	public String getepgen_detailsurl() {
		return epgen_detailsurl;
	}

	public void setepgen_detailsurl(String epgen_detailsurl) {
		this.epgen_detailsurl = epgen_detailsurl;
	}

}
