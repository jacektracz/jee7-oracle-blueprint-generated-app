
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
@Table(name = "joo2_virtuemart_categories", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_categories implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_category_id")
    private Integer epgen_virtuemart_category_id;
    @Column(name="virtuemart_vendor_id")
    private Integer epgen_virtuemart_vendor_id;
    @Column(name="category_name")
    private String epgen_category_name;
    @Column(name="slug")
    private String epgen_slug;
    @Column(name="category_description")
    private String epgen_category_description;
    @Column(name="category_template")
    private String epgen_category_template;
    @Column(name="category_layout")
    private String epgen_category_layout;
    @Column(name="category_product_layout")
    private String epgen_category_product_layout;
    @Column(name="products_per_row")
    private Integer epgen_products_per_row;
    @Column(name="limit_list_start")
    private Integer epgen_limit_list_start;
    @Column(name="limit_list_step")
    private Integer epgen_limit_list_step;
    @Column(name="limit_list_max")
    private Integer epgen_limit_list_max;
    @Column(name="limit_list_initial")
    private Integer epgen_limit_list_initial;
    @Column(name="hits")
    private Integer epgen_hits;
    @Column(name="metadesc")
    private String epgen_metadesc;
    @Column(name="metakey")
    private String epgen_metakey;
    @Column(name="metarobot")
    private String epgen_metarobot;
    @Column(name="metaauthor")
    private String epgen_metaauthor;
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
	public Integer getepgen_virtuemart_category_id() {
		return epgen_virtuemart_category_id;
	}

	public void setepgen_virtuemart_category_id(Integer epgen_virtuemart_category_id) {
		this.epgen_virtuemart_category_id = epgen_virtuemart_category_id;
	}
	public Integer getepgen_virtuemart_vendor_id() {
		return epgen_virtuemart_vendor_id;
	}

	public void setepgen_virtuemart_vendor_id(Integer epgen_virtuemart_vendor_id) {
		this.epgen_virtuemart_vendor_id = epgen_virtuemart_vendor_id;
	}
	public String getepgen_category_name() {
		return epgen_category_name;
	}

	public void setepgen_category_name(String epgen_category_name) {
		this.epgen_category_name = epgen_category_name;
	}
	public String getepgen_slug() {
		return epgen_slug;
	}

	public void setepgen_slug(String epgen_slug) {
		this.epgen_slug = epgen_slug;
	}
	public String getepgen_category_description() {
		return epgen_category_description;
	}

	public void setepgen_category_description(String epgen_category_description) {
		this.epgen_category_description = epgen_category_description;
	}
	public String getepgen_category_template() {
		return epgen_category_template;
	}

	public void setepgen_category_template(String epgen_category_template) {
		this.epgen_category_template = epgen_category_template;
	}
	public String getepgen_category_layout() {
		return epgen_category_layout;
	}

	public void setepgen_category_layout(String epgen_category_layout) {
		this.epgen_category_layout = epgen_category_layout;
	}
	public String getepgen_category_product_layout() {
		return epgen_category_product_layout;
	}

	public void setepgen_category_product_layout(String epgen_category_product_layout) {
		this.epgen_category_product_layout = epgen_category_product_layout;
	}
	public Integer getepgen_products_per_row() {
		return epgen_products_per_row;
	}

	public void setepgen_products_per_row(Integer epgen_products_per_row) {
		this.epgen_products_per_row = epgen_products_per_row;
	}
	public Integer getepgen_limit_list_start() {
		return epgen_limit_list_start;
	}

	public void setepgen_limit_list_start(Integer epgen_limit_list_start) {
		this.epgen_limit_list_start = epgen_limit_list_start;
	}
	public Integer getepgen_limit_list_step() {
		return epgen_limit_list_step;
	}

	public void setepgen_limit_list_step(Integer epgen_limit_list_step) {
		this.epgen_limit_list_step = epgen_limit_list_step;
	}
	public Integer getepgen_limit_list_max() {
		return epgen_limit_list_max;
	}

	public void setepgen_limit_list_max(Integer epgen_limit_list_max) {
		this.epgen_limit_list_max = epgen_limit_list_max;
	}
	public Integer getepgen_limit_list_initial() {
		return epgen_limit_list_initial;
	}

	public void setepgen_limit_list_initial(Integer epgen_limit_list_initial) {
		this.epgen_limit_list_initial = epgen_limit_list_initial;
	}
	public Integer getepgen_hits() {
		return epgen_hits;
	}

	public void setepgen_hits(Integer epgen_hits) {
		this.epgen_hits = epgen_hits;
	}
	public String getepgen_metadesc() {
		return epgen_metadesc;
	}

	public void setepgen_metadesc(String epgen_metadesc) {
		this.epgen_metadesc = epgen_metadesc;
	}
	public String getepgen_metakey() {
		return epgen_metakey;
	}

	public void setepgen_metakey(String epgen_metakey) {
		this.epgen_metakey = epgen_metakey;
	}
	public String getepgen_metarobot() {
		return epgen_metarobot;
	}

	public void setepgen_metarobot(String epgen_metarobot) {
		this.epgen_metarobot = epgen_metarobot;
	}
	public String getepgen_metaauthor() {
		return epgen_metaauthor;
	}

	public void setepgen_metaauthor(String epgen_metaauthor) {
		this.epgen_metaauthor = epgen_metaauthor;
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
