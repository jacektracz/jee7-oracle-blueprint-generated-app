
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
@Table(name = "joo2_virtuemart_product_downloads", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_product_downloads implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_product_id")
    private Integer epgen_virtuemart_product_id;
    @Column(name="virtuemart_user_id")
    private Integer epgen_virtuemart_user_id;
    @Column(name="virtuemart_order_id")
    private Integer epgen_virtuemart_order_id;
    
    @Column(name = "end_date", columnDefinition="VARCHAR")
    private String epgen_end_date;
    @Column(name="download_max")
    private Integer epgen_download_max;
    @Column(name="download_id")
    private String epgen_download_id;
    @Column(name="file_name")
    private String epgen_file_name;
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
	public Integer getepgen_virtuemart_product_id() {
		return epgen_virtuemart_product_id;
	}

	public void setepgen_virtuemart_product_id(Integer epgen_virtuemart_product_id) {
		this.epgen_virtuemart_product_id = epgen_virtuemart_product_id;
	}
	public Integer getepgen_virtuemart_user_id() {
		return epgen_virtuemart_user_id;
	}

	public void setepgen_virtuemart_user_id(Integer epgen_virtuemart_user_id) {
		this.epgen_virtuemart_user_id = epgen_virtuemart_user_id;
	}
	public Integer getepgen_virtuemart_order_id() {
		return epgen_virtuemart_order_id;
	}

	public void setepgen_virtuemart_order_id(Integer epgen_virtuemart_order_id) {
		this.epgen_virtuemart_order_id = epgen_virtuemart_order_id;
	}
	public String getepgen_end_date() {
		return epgen_end_date;
	}

	public void setepgen_end_date(String epgen_end_date) {
		this.epgen_end_date = epgen_end_date;
	}
	public Integer getepgen_download_max() {
		return epgen_download_max;
	}

	public void setepgen_download_max(Integer epgen_download_max) {
		this.epgen_download_max = epgen_download_max;
	}
	public String getepgen_download_id() {
		return epgen_download_id;
	}

	public void setepgen_download_id(String epgen_download_id) {
		this.epgen_download_id = epgen_download_id;
	}
	public String getepgen_file_name() {
		return epgen_file_name;
	}

	public void setepgen_file_name(String epgen_file_name) {
		this.epgen_file_name = epgen_file_name;
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
