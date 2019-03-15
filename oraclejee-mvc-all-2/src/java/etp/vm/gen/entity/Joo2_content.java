
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
@Table(name = "joo2_content", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_content implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="asset_id")
    private Integer epgen_asset_id;
    @Column(name="title")
    private String epgen_title;
    @Column(name="alias")
    private String epgen_alias;
    @Column(name="title_alias")
    private String epgen_title_alias;
    @Column(name="introtext")
    private String epgen_introtext;
    
    @Column(name="ep_intro_raw", insertable = false, updatable = false)
    private String epgen_fulltext;
    
    @Column(name="state")
    private Integer epgen_state;
    @Column(name="sectionid")
    private Integer epgen_sectionid;
    @Column(name="mask")
    private Integer epgen_mask;
    @Column(name="catid")
    private Integer epgen_catid;
    
    @Column(name = "created", columnDefinition="VARCHAR")
    private String epgen_created;
    @Column(name="created_by")
    private Integer epgen_created_by;
    @Column(name="created_by_alias")
    private String epgen_created_by_alias;
    
    @Column(name = "modified", columnDefinition="VARCHAR")
    private String epgen_modified;
    @Column(name="modified_by")
    private Integer epgen_modified_by;
    @Column(name="checked_out")
    private Integer epgen_checked_out;
    
    @Column(name = "checked_out_time", columnDefinition="VARCHAR")
    private String epgen_checked_out_time;
    
    @Column(name = "publish_up", columnDefinition="VARCHAR")
    private String epgen_publish_up;
    
    @Column(name = "publish_down", columnDefinition="VARCHAR")
    private String epgen_publish_down;
    @Column(name="images")
    private String epgen_images;
    @Column(name="urls")
    private String epgen_urls;
    @Column(name="attribs")
    private String epgen_attribs;
    @Column(name="version")
    private Integer epgen_version;
    @Column(name="parentid")
    private Integer epgen_parentid;
    @Column(name="ordering")
    private Integer epgen_ordering;
    @Column(name="metakey")
    private String epgen_metakey;
    @Column(name="metadesc")
    private String epgen_metadesc;
    @Column(name="access")
    private Integer epgen_access;
    @Column(name="hits")
    private Integer epgen_hits;
    @Column(name="metadata")
    private String epgen_metadata;
    @Column(name="featured")
    private Integer epgen_featured;
    @Column(name="language")
    private String epgen_language;
    @Column(name="xreference")
    private String epgen_xreference;
    @Column(name="ep_href_main")
    private String epgen_ep_href_main;
    @Column(name="ep_image")
    private String epgen_ep_image;
    @Column(name="ep_intro_raw")
    private String epgen_ep_intro_raw;
    @Column(name="ep_down_buttin")
    private String epgen_ep_down_buttin;
    @Column(name="ep_down_button")
    private String epgen_ep_down_button;
    @Column(name="ep_type")
    private String epgen_ep_type;
    @Column(name="ep_image_type")
    private String epgen_ep_image_type;
    @Column(name="ep_function")
    private String epgen_ep_function;
    @Column(name="ep_regeneration_state")
    private String epgen_ep_regeneration_state;
    @Column(name="ep_featured_position")
    private String epgen_ep_featured_position;
    @Column(name="ep_image_big")
    private String epgen_ep_image_big;
    @Column(name="ep_image_org")
    private String epgen_ep_image_org;
    @Column(name="ep_referenced_catid")
    private Integer epgen_ep_referenced_catid;
    @Column(name="ep_href_org")
    private String epgen_ep_href_org;
    @Column(name="ep_referenced_menuid")
    private Integer epgen_ep_referenced_menuid;
    @Column(name="ep_unpublished")
    private String epgen_ep_unpublished;
    @Column(name="ep_theme")
    private String epgen_ep_theme;
    @Column(name="ep_menuid")
    private Integer epgen_ep_menuid;
    @Column(name="ep_href_all")
    private String epgen_ep_href_all;
    @Column(name="ep_href_text")
    private String epgen_ep_href_text;
    @Column(name="ep_href_title")
    private String epgen_ep_href_title;
    @Column(name="ep_href_img")
    private String epgen_ep_href_img;
    @Column(name="ep_is_three_summary")
    private String epgen_ep_is_three_summary;
    @Column(name="ep_ref_to_outside_cat_id")
    private Integer epgen_ep_ref_to_outside_cat_id;
    @Column(name="ep_import_from_dir")
    private String epgen_ep_import_from_dir;
    @Column(name="ep_import_from_file")
    private String epgen_ep_import_from_file;
    @Column(name="ep_import_from_file_short")
    private String epgen_ep_import_from_file_short;
    @Column(name="ep_leading_imported")
    private String epgen_ep_leading_imported;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public Integer getepgen_asset_id() {
		return epgen_asset_id;
	}

	public void setepgen_asset_id(Integer epgen_asset_id) {
		this.epgen_asset_id = epgen_asset_id;
	}
	public String getepgen_title() {
		return epgen_title;
	}

	public void setepgen_title(String epgen_title) {
		this.epgen_title = epgen_title;
	}
	public String getepgen_alias() {
		return epgen_alias;
	}

	public void setepgen_alias(String epgen_alias) {
		this.epgen_alias = epgen_alias;
	}
	public String getepgen_title_alias() {
		return epgen_title_alias;
	}

	public void setepgen_title_alias(String epgen_title_alias) {
		this.epgen_title_alias = epgen_title_alias;
	}
	public String getepgen_introtext() {
		return epgen_introtext;
	}

	public void setepgen_introtext(String epgen_introtext) {
		this.epgen_introtext = epgen_introtext;
	}
	public String getepgen_fulltext() {
		return epgen_fulltext;
	}

	public void setepgen_fulltext(String epgen_fulltext) {
		this.epgen_fulltext = epgen_fulltext;
	}
	public Integer getepgen_state() {
		return epgen_state;
	}

	public void setepgen_state(Integer epgen_state) {
		this.epgen_state = epgen_state;
	}
	public Integer getepgen_sectionid() {
		return epgen_sectionid;
	}

	public void setepgen_sectionid(Integer epgen_sectionid) {
		this.epgen_sectionid = epgen_sectionid;
	}
	public Integer getepgen_mask() {
		return epgen_mask;
	}

	public void setepgen_mask(Integer epgen_mask) {
		this.epgen_mask = epgen_mask;
	}
	public Integer getepgen_catid() {
		return epgen_catid;
	}

	public void setepgen_catid(Integer epgen_catid) {
		this.epgen_catid = epgen_catid;
	}
	public String getepgen_created() {
		return epgen_created;
	}

	public void setepgen_created(String epgen_created) {
		this.epgen_created = epgen_created;
	}
	public Integer getepgen_created_by() {
		return epgen_created_by;
	}

	public void setepgen_created_by(Integer epgen_created_by) {
		this.epgen_created_by = epgen_created_by;
	}
	public String getepgen_created_by_alias() {
		return epgen_created_by_alias;
	}

	public void setepgen_created_by_alias(String epgen_created_by_alias) {
		this.epgen_created_by_alias = epgen_created_by_alias;
	}
	public String getepgen_modified() {
		return epgen_modified;
	}

	public void setepgen_modified(String epgen_modified) {
		this.epgen_modified = epgen_modified;
	}
	public Integer getepgen_modified_by() {
		return epgen_modified_by;
	}

	public void setepgen_modified_by(Integer epgen_modified_by) {
		this.epgen_modified_by = epgen_modified_by;
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
	public String getepgen_publish_up() {
		return epgen_publish_up;
	}

	public void setepgen_publish_up(String epgen_publish_up) {
		this.epgen_publish_up = epgen_publish_up;
	}
	public String getepgen_publish_down() {
		return epgen_publish_down;
	}

	public void setepgen_publish_down(String epgen_publish_down) {
		this.epgen_publish_down = epgen_publish_down;
	}
	public String getepgen_images() {
		return epgen_images;
	}

	public void setepgen_images(String epgen_images) {
		this.epgen_images = epgen_images;
	}
	public String getepgen_urls() {
		return epgen_urls;
	}

	public void setepgen_urls(String epgen_urls) {
		this.epgen_urls = epgen_urls;
	}
	public String getepgen_attribs() {
		return epgen_attribs;
	}

	public void setepgen_attribs(String epgen_attribs) {
		this.epgen_attribs = epgen_attribs;
	}
	public Integer getepgen_version() {
		return epgen_version;
	}

	public void setepgen_version(Integer epgen_version) {
		this.epgen_version = epgen_version;
	}
	public Integer getepgen_parentid() {
		return epgen_parentid;
	}

	public void setepgen_parentid(Integer epgen_parentid) {
		this.epgen_parentid = epgen_parentid;
	}
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
	}
	public String getepgen_metakey() {
		return epgen_metakey;
	}

	public void setepgen_metakey(String epgen_metakey) {
		this.epgen_metakey = epgen_metakey;
	}
	public String getepgen_metadesc() {
		return epgen_metadesc;
	}

	public void setepgen_metadesc(String epgen_metadesc) {
		this.epgen_metadesc = epgen_metadesc;
	}
	public Integer getepgen_access() {
		return epgen_access;
	}

	public void setepgen_access(Integer epgen_access) {
		this.epgen_access = epgen_access;
	}
	public Integer getepgen_hits() {
		return epgen_hits;
	}

	public void setepgen_hits(Integer epgen_hits) {
		this.epgen_hits = epgen_hits;
	}
	public String getepgen_metadata() {
		return epgen_metadata;
	}

	public void setepgen_metadata(String epgen_metadata) {
		this.epgen_metadata = epgen_metadata;
	}
	public Integer getepgen_featured() {
		return epgen_featured;
	}

	public void setepgen_featured(Integer epgen_featured) {
		this.epgen_featured = epgen_featured;
	}
	public String getepgen_language() {
		return epgen_language;
	}

	public void setepgen_language(String epgen_language) {
		this.epgen_language = epgen_language;
	}
	public String getepgen_xreference() {
		return epgen_xreference;
	}

	public void setepgen_xreference(String epgen_xreference) {
		this.epgen_xreference = epgen_xreference;
	}
	public String getepgen_ep_href_main() {
		return epgen_ep_href_main;
	}

	public void setepgen_ep_href_main(String epgen_ep_href_main) {
		this.epgen_ep_href_main = epgen_ep_href_main;
	}
	public String getepgen_ep_image() {
		return epgen_ep_image;
	}

	public void setepgen_ep_image(String epgen_ep_image) {
		this.epgen_ep_image = epgen_ep_image;
	}
	public String getepgen_ep_intro_raw() {
		return epgen_ep_intro_raw;
	}

	public void setepgen_ep_intro_raw(String epgen_ep_intro_raw) {
		this.epgen_ep_intro_raw = epgen_ep_intro_raw;
	}
	public String getepgen_ep_down_buttin() {
		return epgen_ep_down_buttin;
	}

	public void setepgen_ep_down_buttin(String epgen_ep_down_buttin) {
		this.epgen_ep_down_buttin = epgen_ep_down_buttin;
	}
	public String getepgen_ep_down_button() {
		return epgen_ep_down_button;
	}

	public void setepgen_ep_down_button(String epgen_ep_down_button) {
		this.epgen_ep_down_button = epgen_ep_down_button;
	}
	public String getepgen_ep_type() {
		return epgen_ep_type;
	}

	public void setepgen_ep_type(String epgen_ep_type) {
		this.epgen_ep_type = epgen_ep_type;
	}
	public String getepgen_ep_image_type() {
		return epgen_ep_image_type;
	}

	public void setepgen_ep_image_type(String epgen_ep_image_type) {
		this.epgen_ep_image_type = epgen_ep_image_type;
	}
	public String getepgen_ep_function() {
		return epgen_ep_function;
	}

	public void setepgen_ep_function(String epgen_ep_function) {
		this.epgen_ep_function = epgen_ep_function;
	}
	public String getepgen_ep_regeneration_state() {
		return epgen_ep_regeneration_state;
	}

	public void setepgen_ep_regeneration_state(String epgen_ep_regeneration_state) {
		this.epgen_ep_regeneration_state = epgen_ep_regeneration_state;
	}
	public String getepgen_ep_featured_position() {
		return epgen_ep_featured_position;
	}

	public void setepgen_ep_featured_position(String epgen_ep_featured_position) {
		this.epgen_ep_featured_position = epgen_ep_featured_position;
	}
	public String getepgen_ep_image_big() {
		return epgen_ep_image_big;
	}

	public void setepgen_ep_image_big(String epgen_ep_image_big) {
		this.epgen_ep_image_big = epgen_ep_image_big;
	}
	public String getepgen_ep_image_org() {
		return epgen_ep_image_org;
	}

	public void setepgen_ep_image_org(String epgen_ep_image_org) {
		this.epgen_ep_image_org = epgen_ep_image_org;
	}
	public Integer getepgen_ep_referenced_catid() {
		return epgen_ep_referenced_catid;
	}

	public void setepgen_ep_referenced_catid(Integer epgen_ep_referenced_catid) {
		this.epgen_ep_referenced_catid = epgen_ep_referenced_catid;
	}
	public String getepgen_ep_href_org() {
		return epgen_ep_href_org;
	}

	public void setepgen_ep_href_org(String epgen_ep_href_org) {
		this.epgen_ep_href_org = epgen_ep_href_org;
	}
	public Integer getepgen_ep_referenced_menuid() {
		return epgen_ep_referenced_menuid;
	}

	public void setepgen_ep_referenced_menuid(Integer epgen_ep_referenced_menuid) {
		this.epgen_ep_referenced_menuid = epgen_ep_referenced_menuid;
	}
	public String getepgen_ep_unpublished() {
		return epgen_ep_unpublished;
	}

	public void setepgen_ep_unpublished(String epgen_ep_unpublished) {
		this.epgen_ep_unpublished = epgen_ep_unpublished;
	}
	public String getepgen_ep_theme() {
		return epgen_ep_theme;
	}

	public void setepgen_ep_theme(String epgen_ep_theme) {
		this.epgen_ep_theme = epgen_ep_theme;
	}
	public Integer getepgen_ep_menuid() {
		return epgen_ep_menuid;
	}

	public void setepgen_ep_menuid(Integer epgen_ep_menuid) {
		this.epgen_ep_menuid = epgen_ep_menuid;
	}
	public String getepgen_ep_href_all() {
		return epgen_ep_href_all;
	}

	public void setepgen_ep_href_all(String epgen_ep_href_all) {
		this.epgen_ep_href_all = epgen_ep_href_all;
	}
	public String getepgen_ep_href_text() {
		return epgen_ep_href_text;
	}

	public void setepgen_ep_href_text(String epgen_ep_href_text) {
		this.epgen_ep_href_text = epgen_ep_href_text;
	}
	public String getepgen_ep_href_title() {
		return epgen_ep_href_title;
	}

	public void setepgen_ep_href_title(String epgen_ep_href_title) {
		this.epgen_ep_href_title = epgen_ep_href_title;
	}
	public String getepgen_ep_href_img() {
		return epgen_ep_href_img;
	}

	public void setepgen_ep_href_img(String epgen_ep_href_img) {
		this.epgen_ep_href_img = epgen_ep_href_img;
	}
	public String getepgen_ep_is_three_summary() {
		return epgen_ep_is_three_summary;
	}

	public void setepgen_ep_is_three_summary(String epgen_ep_is_three_summary) {
		this.epgen_ep_is_three_summary = epgen_ep_is_three_summary;
	}
	public Integer getepgen_ep_ref_to_outside_cat_id() {
		return epgen_ep_ref_to_outside_cat_id;
	}

	public void setepgen_ep_ref_to_outside_cat_id(Integer epgen_ep_ref_to_outside_cat_id) {
		this.epgen_ep_ref_to_outside_cat_id = epgen_ep_ref_to_outside_cat_id;
	}
	public String getepgen_ep_import_from_dir() {
		return epgen_ep_import_from_dir;
	}

	public void setepgen_ep_import_from_dir(String epgen_ep_import_from_dir) {
		this.epgen_ep_import_from_dir = epgen_ep_import_from_dir;
	}
	public String getepgen_ep_import_from_file() {
		return epgen_ep_import_from_file;
	}

	public void setepgen_ep_import_from_file(String epgen_ep_import_from_file) {
		this.epgen_ep_import_from_file = epgen_ep_import_from_file;
	}
	public String getepgen_ep_import_from_file_short() {
		return epgen_ep_import_from_file_short;
	}

	public void setepgen_ep_import_from_file_short(String epgen_ep_import_from_file_short) {
		this.epgen_ep_import_from_file_short = epgen_ep_import_from_file_short;
	}
	public String getepgen_ep_leading_imported() {
		return epgen_ep_leading_imported;
	}

	public void setepgen_ep_leading_imported(String epgen_ep_leading_imported) {
		this.epgen_ep_leading_imported = epgen_ep_leading_imported;
	}

}
