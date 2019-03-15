
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
@Table(name = "joo2_virtuemart_products", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_products implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_product_id")
    private Integer epgen_virtuemart_product_id;
    @Column(name="virtuemart_vendor_id")
    private Integer epgen_virtuemart_vendor_id;
    @Column(name="product_parent_id")
    private Integer epgen_product_parent_id;
    @Column(name="product_sku")
    private String epgen_product_sku;
    @Column(name="product_name")
    private String epgen_product_name;
    @Column(name="slug")
    private String epgen_slug;
    @Column(name="product_s_desc")
    private String epgen_product_s_desc;
    @Column(name="product_desc")
    private String epgen_product_desc;
    @Column(name="product_weight")
    private float epgen_product_weight;
    @Column(name="product_weight_uom")
    private String epgen_product_weight_uom;
    @Column(name="product_length")
    private float epgen_product_length;
    @Column(name="product_width")
    private float epgen_product_width;
    @Column(name="product_height")
    private float epgen_product_height;
    @Column(name="product_lwh_uom")
    private String epgen_product_lwh_uom;
    @Column(name="product_url")
    private String epgen_product_url;
    @Column(name="product_in_stock")
    private Integer epgen_product_in_stock;
    @Column(name="product_ordered")
    private Integer epgen_product_ordered;
    @Column(name="low_stock_notification")
    private Integer epgen_low_stock_notification;
    
    @Column(name = "product_available_date", columnDefinition="VARCHAR")
    private String epgen_product_available_date;
    @Column(name="product_availability")
    private String epgen_product_availability;
    @Column(name="product_special")
    private String epgen_product_special;
    @Column(name="ship_code_id")
    private Integer epgen_ship_code_id;
    @Column(name="product_sales")
    private Integer epgen_product_sales;
    @Column(name="product_unit")
    private String epgen_product_unit;
    @Column(name="product_packaging")
    private Integer epgen_product_packaging;
    @Column(name="product_order_levels")
    private String epgen_product_order_levels;
    @Column(name="hits")
    private Integer epgen_hits;
    @Column(name="intnotes")
    private String epgen_intnotes;
    @Column(name="metadesc")
    private String epgen_metadesc;
    @Column(name="metakey")
    private String epgen_metakey;
    @Column(name="metarobot")
    private String epgen_metarobot;
    @Column(name="metaauthor")
    private String epgen_metaauthor;
    @Column(name="layout")
    private String epgen_layout;
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
	public Integer getepgen_virtuemart_vendor_id() {
		return epgen_virtuemart_vendor_id;
	}

	public void setepgen_virtuemart_vendor_id(Integer epgen_virtuemart_vendor_id) {
		this.epgen_virtuemart_vendor_id = epgen_virtuemart_vendor_id;
	}
	public Integer getepgen_product_parent_id() {
		return epgen_product_parent_id;
	}

	public void setepgen_product_parent_id(Integer epgen_product_parent_id) {
		this.epgen_product_parent_id = epgen_product_parent_id;
	}
	public String getepgen_product_sku() {
		return epgen_product_sku;
	}

	public void setepgen_product_sku(String epgen_product_sku) {
		this.epgen_product_sku = epgen_product_sku;
	}
	public String getepgen_product_name() {
		return epgen_product_name;
	}

	public void setepgen_product_name(String epgen_product_name) {
		this.epgen_product_name = epgen_product_name;
	}
	public String getepgen_slug() {
		return epgen_slug;
	}

	public void setepgen_slug(String epgen_slug) {
		this.epgen_slug = epgen_slug;
	}
	public String getepgen_product_s_desc() {
		return epgen_product_s_desc;
	}

	public void setepgen_product_s_desc(String epgen_product_s_desc) {
		this.epgen_product_s_desc = epgen_product_s_desc;
	}
	public String getepgen_product_desc() {
		return epgen_product_desc;
	}

	public void setepgen_product_desc(String epgen_product_desc) {
		this.epgen_product_desc = epgen_product_desc;
	}
	public float getepgen_product_weight() {
		return epgen_product_weight;
	}

	public void setepgen_product_weight(float epgen_product_weight) {
		this.epgen_product_weight = epgen_product_weight;
	}
	public String getepgen_product_weight_uom() {
		return epgen_product_weight_uom;
	}

	public void setepgen_product_weight_uom(String epgen_product_weight_uom) {
		this.epgen_product_weight_uom = epgen_product_weight_uom;
	}
	public float getepgen_product_length() {
		return epgen_product_length;
	}

	public void setepgen_product_length(float epgen_product_length) {
		this.epgen_product_length = epgen_product_length;
	}
	public float getepgen_product_width() {
		return epgen_product_width;
	}

	public void setepgen_product_width(float epgen_product_width) {
		this.epgen_product_width = epgen_product_width;
	}
	public float getepgen_product_height() {
		return epgen_product_height;
	}

	public void setepgen_product_height(float epgen_product_height) {
		this.epgen_product_height = epgen_product_height;
	}
	public String getepgen_product_lwh_uom() {
		return epgen_product_lwh_uom;
	}

	public void setepgen_product_lwh_uom(String epgen_product_lwh_uom) {
		this.epgen_product_lwh_uom = epgen_product_lwh_uom;
	}
	public String getepgen_product_url() {
		return epgen_product_url;
	}

	public void setepgen_product_url(String epgen_product_url) {
		this.epgen_product_url = epgen_product_url;
	}
	public Integer getepgen_product_in_stock() {
		return epgen_product_in_stock;
	}

	public void setepgen_product_in_stock(Integer epgen_product_in_stock) {
		this.epgen_product_in_stock = epgen_product_in_stock;
	}
	public Integer getepgen_product_ordered() {
		return epgen_product_ordered;
	}

	public void setepgen_product_ordered(Integer epgen_product_ordered) {
		this.epgen_product_ordered = epgen_product_ordered;
	}
	public Integer getepgen_low_stock_notification() {
		return epgen_low_stock_notification;
	}

	public void setepgen_low_stock_notification(Integer epgen_low_stock_notification) {
		this.epgen_low_stock_notification = epgen_low_stock_notification;
	}
	public String getepgen_product_available_date() {
		return epgen_product_available_date;
	}

	public void setepgen_product_available_date(String epgen_product_available_date) {
		this.epgen_product_available_date = epgen_product_available_date;
	}
	public String getepgen_product_availability() {
		return epgen_product_availability;
	}

	public void setepgen_product_availability(String epgen_product_availability) {
		this.epgen_product_availability = epgen_product_availability;
	}
	public String getepgen_product_special() {
		return epgen_product_special;
	}

	public void setepgen_product_special(String epgen_product_special) {
		this.epgen_product_special = epgen_product_special;
	}
	public Integer getepgen_ship_code_id() {
		return epgen_ship_code_id;
	}

	public void setepgen_ship_code_id(Integer epgen_ship_code_id) {
		this.epgen_ship_code_id = epgen_ship_code_id;
	}
	public Integer getepgen_product_sales() {
		return epgen_product_sales;
	}

	public void setepgen_product_sales(Integer epgen_product_sales) {
		this.epgen_product_sales = epgen_product_sales;
	}
	public String getepgen_product_unit() {
		return epgen_product_unit;
	}

	public void setepgen_product_unit(String epgen_product_unit) {
		this.epgen_product_unit = epgen_product_unit;
	}
	public Integer getepgen_product_packaging() {
		return epgen_product_packaging;
	}

	public void setepgen_product_packaging(Integer epgen_product_packaging) {
		this.epgen_product_packaging = epgen_product_packaging;
	}
	public String getepgen_product_order_levels() {
		return epgen_product_order_levels;
	}

	public void setepgen_product_order_levels(String epgen_product_order_levels) {
		this.epgen_product_order_levels = epgen_product_order_levels;
	}
	public Integer getepgen_hits() {
		return epgen_hits;
	}

	public void setepgen_hits(Integer epgen_hits) {
		this.epgen_hits = epgen_hits;
	}
	public String getepgen_intnotes() {
		return epgen_intnotes;
	}

	public void setepgen_intnotes(String epgen_intnotes) {
		this.epgen_intnotes = epgen_intnotes;
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
	public String getepgen_layout() {
		return epgen_layout;
	}

	public void setepgen_layout(String epgen_layout) {
		this.epgen_layout = epgen_layout;
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
