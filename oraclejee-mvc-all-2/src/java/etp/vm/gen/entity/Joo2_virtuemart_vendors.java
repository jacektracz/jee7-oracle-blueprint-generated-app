
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
@Table(name = "joo2_virtuemart_vendors", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_vendors implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_vendor_id")
    private Integer epgen_virtuemart_vendor_id;
    @Column(name="vendor_name")
    private String epgen_vendor_name;
    @Column(name="vendor_phone")
    private String epgen_vendor_phone;
    @Column(name="vendor_store_name")
    private String epgen_vendor_store_name;
    @Column(name="vendor_store_desc")
    private String epgen_vendor_store_desc;
    @Column(name="vendor_currency")
    private Integer epgen_vendor_currency;
    @Column(name="vendor_image_path")
    private String epgen_vendor_image_path;
    @Column(name="vendor_terms_of_service")
    private String epgen_vendor_terms_of_service;
    @Column(name="vendor_url")
    private String epgen_vendor_url;
    @Column(name="vendor_min_pov")
    private float epgen_vendor_min_pov;
    @Column(name="vendor_freeshipping")
    private float epgen_vendor_freeshipping;
    @Column(name="vendor_accepted_currencies")
    private String epgen_vendor_accepted_currencies;
    @Column(name="vendor_address_format")
    private String epgen_vendor_address_format;
    @Column(name="vendor_date_format")
    private String epgen_vendor_date_format;
    @Column(name="config")
    private String epgen_config;
    
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
	public Integer getepgen_virtuemart_vendor_id() {
		return epgen_virtuemart_vendor_id;
	}

	public void setepgen_virtuemart_vendor_id(Integer epgen_virtuemart_vendor_id) {
		this.epgen_virtuemart_vendor_id = epgen_virtuemart_vendor_id;
	}
	public String getepgen_vendor_name() {
		return epgen_vendor_name;
	}

	public void setepgen_vendor_name(String epgen_vendor_name) {
		this.epgen_vendor_name = epgen_vendor_name;
	}
	public String getepgen_vendor_phone() {
		return epgen_vendor_phone;
	}

	public void setepgen_vendor_phone(String epgen_vendor_phone) {
		this.epgen_vendor_phone = epgen_vendor_phone;
	}
	public String getepgen_vendor_store_name() {
		return epgen_vendor_store_name;
	}

	public void setepgen_vendor_store_name(String epgen_vendor_store_name) {
		this.epgen_vendor_store_name = epgen_vendor_store_name;
	}
	public String getepgen_vendor_store_desc() {
		return epgen_vendor_store_desc;
	}

	public void setepgen_vendor_store_desc(String epgen_vendor_store_desc) {
		this.epgen_vendor_store_desc = epgen_vendor_store_desc;
	}
	public Integer getepgen_vendor_currency() {
		return epgen_vendor_currency;
	}

	public void setepgen_vendor_currency(Integer epgen_vendor_currency) {
		this.epgen_vendor_currency = epgen_vendor_currency;
	}
	public String getepgen_vendor_image_path() {
		return epgen_vendor_image_path;
	}

	public void setepgen_vendor_image_path(String epgen_vendor_image_path) {
		this.epgen_vendor_image_path = epgen_vendor_image_path;
	}
	public String getepgen_vendor_terms_of_service() {
		return epgen_vendor_terms_of_service;
	}

	public void setepgen_vendor_terms_of_service(String epgen_vendor_terms_of_service) {
		this.epgen_vendor_terms_of_service = epgen_vendor_terms_of_service;
	}
	public String getepgen_vendor_url() {
		return epgen_vendor_url;
	}

	public void setepgen_vendor_url(String epgen_vendor_url) {
		this.epgen_vendor_url = epgen_vendor_url;
	}
	public float getepgen_vendor_min_pov() {
		return epgen_vendor_min_pov;
	}

	public void setepgen_vendor_min_pov(float epgen_vendor_min_pov) {
		this.epgen_vendor_min_pov = epgen_vendor_min_pov;
	}
	public float getepgen_vendor_freeshipping() {
		return epgen_vendor_freeshipping;
	}

	public void setepgen_vendor_freeshipping(float epgen_vendor_freeshipping) {
		this.epgen_vendor_freeshipping = epgen_vendor_freeshipping;
	}
	public String getepgen_vendor_accepted_currencies() {
		return epgen_vendor_accepted_currencies;
	}

	public void setepgen_vendor_accepted_currencies(String epgen_vendor_accepted_currencies) {
		this.epgen_vendor_accepted_currencies = epgen_vendor_accepted_currencies;
	}
	public String getepgen_vendor_address_format() {
		return epgen_vendor_address_format;
	}

	public void setepgen_vendor_address_format(String epgen_vendor_address_format) {
		this.epgen_vendor_address_format = epgen_vendor_address_format;
	}
	public String getepgen_vendor_date_format() {
		return epgen_vendor_date_format;
	}

	public void setepgen_vendor_date_format(String epgen_vendor_date_format) {
		this.epgen_vendor_date_format = epgen_vendor_date_format;
	}
	public String getepgen_config() {
		return epgen_config;
	}

	public void setepgen_config(String epgen_config) {
		this.epgen_config = epgen_config;
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
