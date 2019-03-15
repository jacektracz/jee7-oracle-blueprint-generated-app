
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
@Table(name = "joo2_virtuemart_medias", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_medias implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_media_id")
    private Integer epgen_virtuemart_media_id;
    @Column(name="virtuemart_vendor_id")
    private Integer epgen_virtuemart_vendor_id;
    @Column(name="file_title")
    private String epgen_file_title;
    @Column(name="file_description")
    private String epgen_file_description;
    @Column(name="file_meta")
    private String epgen_file_meta;
    @Column(name="file_mimetype")
    private String epgen_file_mimetype;
    @Column(name="file_type")
    private String epgen_file_type;
    @Column(name="file_url")
    private String epgen_file_url;
    @Column(name="file_url_thumb")
    private String epgen_file_url_thumb;
    @Column(name="file_is_product_image")
    private Integer epgen_file_is_product_image;
    @Column(name="file_is_downloadable")
    private Integer epgen_file_is_downloadable;
    @Column(name="file_is_forSale")
    private Integer epgen_file_is_forSale;
    @Column(name="file_params")
    private String epgen_file_params;
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
	public Integer getepgen_virtuemart_media_id() {
		return epgen_virtuemart_media_id;
	}

	public void setepgen_virtuemart_media_id(Integer epgen_virtuemart_media_id) {
		this.epgen_virtuemart_media_id = epgen_virtuemart_media_id;
	}
	public Integer getepgen_virtuemart_vendor_id() {
		return epgen_virtuemart_vendor_id;
	}

	public void setepgen_virtuemart_vendor_id(Integer epgen_virtuemart_vendor_id) {
		this.epgen_virtuemart_vendor_id = epgen_virtuemart_vendor_id;
	}
	public String getepgen_file_title() {
		return epgen_file_title;
	}

	public void setepgen_file_title(String epgen_file_title) {
		this.epgen_file_title = epgen_file_title;
	}
	public String getepgen_file_description() {
		return epgen_file_description;
	}

	public void setepgen_file_description(String epgen_file_description) {
		this.epgen_file_description = epgen_file_description;
	}
	public String getepgen_file_meta() {
		return epgen_file_meta;
	}

	public void setepgen_file_meta(String epgen_file_meta) {
		this.epgen_file_meta = epgen_file_meta;
	}
	public String getepgen_file_mimetype() {
		return epgen_file_mimetype;
	}

	public void setepgen_file_mimetype(String epgen_file_mimetype) {
		this.epgen_file_mimetype = epgen_file_mimetype;
	}
	public String getepgen_file_type() {
		return epgen_file_type;
	}

	public void setepgen_file_type(String epgen_file_type) {
		this.epgen_file_type = epgen_file_type;
	}
	public String getepgen_file_url() {
		return epgen_file_url;
	}

	public void setepgen_file_url(String epgen_file_url) {
		this.epgen_file_url = epgen_file_url;
	}
	public String getepgen_file_url_thumb() {
		return epgen_file_url_thumb;
	}

	public void setepgen_file_url_thumb(String epgen_file_url_thumb) {
		this.epgen_file_url_thumb = epgen_file_url_thumb;
	}
	public Integer getepgen_file_is_product_image() {
		return epgen_file_is_product_image;
	}

	public void setepgen_file_is_product_image(Integer epgen_file_is_product_image) {
		this.epgen_file_is_product_image = epgen_file_is_product_image;
	}
	public Integer getepgen_file_is_downloadable() {
		return epgen_file_is_downloadable;
	}

	public void setepgen_file_is_downloadable(Integer epgen_file_is_downloadable) {
		this.epgen_file_is_downloadable = epgen_file_is_downloadable;
	}
	public Integer getepgen_file_is_forSale() {
		return epgen_file_is_forSale;
	}

	public void setepgen_file_is_forSale(Integer epgen_file_is_forSale) {
		this.epgen_file_is_forSale = epgen_file_is_forSale;
	}
	public String getepgen_file_params() {
		return epgen_file_params;
	}

	public void setepgen_file_params(String epgen_file_params) {
		this.epgen_file_params = epgen_file_params;
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
