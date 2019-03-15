
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
@Table(name = "joo2_virtuemart_manufacturers", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_manufacturers implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_manufacturer_id")
    private Integer epgen_virtuemart_manufacturer_id;
    @Column(name="mf_name")
    private String epgen_mf_name;
    @Column(name="slug")
    private String epgen_slug;
    @Column(name="mf_email")
    private String epgen_mf_email;
    @Column(name="mf_desc")
    private String epgen_mf_desc;
    @Column(name="virtuemart_manufacturercategories_id")
    private Integer epgen_virtuemart_manufacturercategories_id;
    @Column(name="mf_url")
    private String epgen_mf_url;
    @Column(name="hits")
    private Integer epgen_hits;
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
	public Integer getepgen_virtuemart_manufacturer_id() {
		return epgen_virtuemart_manufacturer_id;
	}

	public void setepgen_virtuemart_manufacturer_id(Integer epgen_virtuemart_manufacturer_id) {
		this.epgen_virtuemart_manufacturer_id = epgen_virtuemart_manufacturer_id;
	}
	public String getepgen_mf_name() {
		return epgen_mf_name;
	}

	public void setepgen_mf_name(String epgen_mf_name) {
		this.epgen_mf_name = epgen_mf_name;
	}
	public String getepgen_slug() {
		return epgen_slug;
	}

	public void setepgen_slug(String epgen_slug) {
		this.epgen_slug = epgen_slug;
	}
	public String getepgen_mf_email() {
		return epgen_mf_email;
	}

	public void setepgen_mf_email(String epgen_mf_email) {
		this.epgen_mf_email = epgen_mf_email;
	}
	public String getepgen_mf_desc() {
		return epgen_mf_desc;
	}

	public void setepgen_mf_desc(String epgen_mf_desc) {
		this.epgen_mf_desc = epgen_mf_desc;
	}
	public Integer getepgen_virtuemart_manufacturercategories_id() {
		return epgen_virtuemart_manufacturercategories_id;
	}

	public void setepgen_virtuemart_manufacturercategories_id(Integer epgen_virtuemart_manufacturercategories_id) {
		this.epgen_virtuemart_manufacturercategories_id = epgen_virtuemart_manufacturercategories_id;
	}
	public String getepgen_mf_url() {
		return epgen_mf_url;
	}

	public void setepgen_mf_url(String epgen_mf_url) {
		this.epgen_mf_url = epgen_mf_url;
	}
	public Integer getepgen_hits() {
		return epgen_hits;
	}

	public void setepgen_hits(Integer epgen_hits) {
		this.epgen_hits = epgen_hits;
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
