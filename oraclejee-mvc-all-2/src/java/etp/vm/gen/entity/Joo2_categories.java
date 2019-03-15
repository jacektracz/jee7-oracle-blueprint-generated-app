
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
@Table(name = "joo2_categories", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_categories implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="asset_id")
    private Integer epgen_asset_id;
    @Column(name="parent_id")
    private Integer epgen_parent_id;
    @Column(name="lft")
    private Integer epgen_lft;
    @Column(name="rgt")
    private Integer epgen_rgt;
    @Column(name="level")
    private Integer epgen_level;
    @Column(name="path")
    private String epgen_path;
    @Column(name="extension")
    private String epgen_extension;
    @Column(name="title")
    private String epgen_title;
    @Column(name="alias")
    private String epgen_alias;
    @Column(name="note")
    private String epgen_note;
    @Column(name="description")
    private String epgen_description;
    @Column(name="published")
    private Integer epgen_published;
    @Column(name="checked_out")
    private Integer epgen_checked_out;
    
    @Column(name = "checked_out_time", columnDefinition="VARCHAR")
    private String epgen_checked_out_time;
    @Column(name="access")
    private Integer epgen_access;
    @Column(name="params")
    private String epgen_params;
    @Column(name="metadesc")
    private String epgen_metadesc;
    @Column(name="metakey")
    private String epgen_metakey;
    @Column(name="metadata")
    private String epgen_metadata;
    @Column(name="created_user_id")
    private Integer epgen_created_user_id;
    
    @Column(name = "created_time", columnDefinition="VARCHAR")
    private String epgen_created_time;
    @Column(name="modified_user_id")
    private Integer epgen_modified_user_id;
    
    @Column(name = "modified_time", columnDefinition="VARCHAR")
    private String epgen_modified_time;
    @Column(name="hits")
    private Integer epgen_hits;
    @Column(name="language")
    private String epgen_language;
    @Column(name="ep_menuid")
    private Integer epgen_ep_menuid;
    @Column(name="ep_menu_path")
    private String epgen_ep_menu_path;
    @Column(name="ep_copy_cat_id")
    private Integer epgen_ep_copy_cat_id;
    @Column(name="ep_redirected_to_cat_id")
    private Integer epgen_ep_redirected_to_cat_id;
    @Column(name="ep_referenced_count")
    private Integer epgen_ep_referenced_count;
    @Column(name="ep_referenced_parentcat_count")
    private Integer epgen_ep_referenced_parentcat_count;
    @Column(name="ep_referenced_parent_contentid")
    private Integer epgen_ep_referenced_parent_contentid;
    @Column(name="ep_ordering")
    private Integer epgen_ep_ordering;
    @Column(name="ep_import_from_dir")
    private String epgen_ep_import_from_dir;
    @Column(name="ep_import_from_file")
    private String epgen_ep_import_from_file;
    @Column(name="ept_lft")
    private String epgen_ept_lft;
    @Column(name="ept_rgt")
    private String epgen_ept_rgt;
    @Column(name="ept_count")
    private String epgen_ept_count;
    @Column(name="ep_lft")
    private String epgen_ep_lft;
    @Column(name="ep_rgt")
    private String epgen_ep_rgt;
    @Column(name="ep_count")
    private String epgen_ep_count;
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
	public Integer getepgen_parent_id() {
		return epgen_parent_id;
	}

	public void setepgen_parent_id(Integer epgen_parent_id) {
		this.epgen_parent_id = epgen_parent_id;
	}
	public Integer getepgen_lft() {
		return epgen_lft;
	}

	public void setepgen_lft(Integer epgen_lft) {
		this.epgen_lft = epgen_lft;
	}
	public Integer getepgen_rgt() {
		return epgen_rgt;
	}

	public void setepgen_rgt(Integer epgen_rgt) {
		this.epgen_rgt = epgen_rgt;
	}
	public Integer getepgen_level() {
		return epgen_level;
	}

	public void setepgen_level(Integer epgen_level) {
		this.epgen_level = epgen_level;
	}
	public String getepgen_path() {
		return epgen_path;
	}

	public void setepgen_path(String epgen_path) {
		this.epgen_path = epgen_path;
	}
	public String getepgen_extension() {
		return epgen_extension;
	}

	public void setepgen_extension(String epgen_extension) {
		this.epgen_extension = epgen_extension;
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
	public String getepgen_note() {
		return epgen_note;
	}

	public void setepgen_note(String epgen_note) {
		this.epgen_note = epgen_note;
	}
	public String getepgen_description() {
		return epgen_description;
	}

	public void setepgen_description(String epgen_description) {
		this.epgen_description = epgen_description;
	}
	public Integer getepgen_published() {
		return epgen_published;
	}

	public void setepgen_published(Integer epgen_published) {
		this.epgen_published = epgen_published;
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
	public Integer getepgen_access() {
		return epgen_access;
	}

	public void setepgen_access(Integer epgen_access) {
		this.epgen_access = epgen_access;
	}
	public String getepgen_params() {
		return epgen_params;
	}

	public void setepgen_params(String epgen_params) {
		this.epgen_params = epgen_params;
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
	public String getepgen_metadata() {
		return epgen_metadata;
	}

	public void setepgen_metadata(String epgen_metadata) {
		this.epgen_metadata = epgen_metadata;
	}
	public Integer getepgen_created_user_id() {
		return epgen_created_user_id;
	}

	public void setepgen_created_user_id(Integer epgen_created_user_id) {
		this.epgen_created_user_id = epgen_created_user_id;
	}
	public String getepgen_created_time() {
		return epgen_created_time;
	}

	public void setepgen_created_time(String epgen_created_time) {
		this.epgen_created_time = epgen_created_time;
	}
	public Integer getepgen_modified_user_id() {
		return epgen_modified_user_id;
	}

	public void setepgen_modified_user_id(Integer epgen_modified_user_id) {
		this.epgen_modified_user_id = epgen_modified_user_id;
	}
	public String getepgen_modified_time() {
		return epgen_modified_time;
	}

	public void setepgen_modified_time(String epgen_modified_time) {
		this.epgen_modified_time = epgen_modified_time;
	}
	public Integer getepgen_hits() {
		return epgen_hits;
	}

	public void setepgen_hits(Integer epgen_hits) {
		this.epgen_hits = epgen_hits;
	}
	public String getepgen_language() {
		return epgen_language;
	}

	public void setepgen_language(String epgen_language) {
		this.epgen_language = epgen_language;
	}
	public Integer getepgen_ep_menuid() {
		return epgen_ep_menuid;
	}

	public void setepgen_ep_menuid(Integer epgen_ep_menuid) {
		this.epgen_ep_menuid = epgen_ep_menuid;
	}
	public String getepgen_ep_menu_path() {
		return epgen_ep_menu_path;
	}

	public void setepgen_ep_menu_path(String epgen_ep_menu_path) {
		this.epgen_ep_menu_path = epgen_ep_menu_path;
	}
	public Integer getepgen_ep_copy_cat_id() {
		return epgen_ep_copy_cat_id;
	}

	public void setepgen_ep_copy_cat_id(Integer epgen_ep_copy_cat_id) {
		this.epgen_ep_copy_cat_id = epgen_ep_copy_cat_id;
	}
	public Integer getepgen_ep_redirected_to_cat_id() {
		return epgen_ep_redirected_to_cat_id;
	}

	public void setepgen_ep_redirected_to_cat_id(Integer epgen_ep_redirected_to_cat_id) {
		this.epgen_ep_redirected_to_cat_id = epgen_ep_redirected_to_cat_id;
	}
	public Integer getepgen_ep_referenced_count() {
		return epgen_ep_referenced_count;
	}

	public void setepgen_ep_referenced_count(Integer epgen_ep_referenced_count) {
		this.epgen_ep_referenced_count = epgen_ep_referenced_count;
	}
	public Integer getepgen_ep_referenced_parentcat_count() {
		return epgen_ep_referenced_parentcat_count;
	}

	public void setepgen_ep_referenced_parentcat_count(Integer epgen_ep_referenced_parentcat_count) {
		this.epgen_ep_referenced_parentcat_count = epgen_ep_referenced_parentcat_count;
	}
	public Integer getepgen_ep_referenced_parent_contentid() {
		return epgen_ep_referenced_parent_contentid;
	}

	public void setepgen_ep_referenced_parent_contentid(Integer epgen_ep_referenced_parent_contentid) {
		this.epgen_ep_referenced_parent_contentid = epgen_ep_referenced_parent_contentid;
	}
	public Integer getepgen_ep_ordering() {
		return epgen_ep_ordering;
	}

	public void setepgen_ep_ordering(Integer epgen_ep_ordering) {
		this.epgen_ep_ordering = epgen_ep_ordering;
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
	public String getepgen_ept_lft() {
		return epgen_ept_lft;
	}

	public void setepgen_ept_lft(String epgen_ept_lft) {
		this.epgen_ept_lft = epgen_ept_lft;
	}
	public String getepgen_ept_rgt() {
		return epgen_ept_rgt;
	}

	public void setepgen_ept_rgt(String epgen_ept_rgt) {
		this.epgen_ept_rgt = epgen_ept_rgt;
	}
	public String getepgen_ept_count() {
		return epgen_ept_count;
	}

	public void setepgen_ept_count(String epgen_ept_count) {
		this.epgen_ept_count = epgen_ept_count;
	}
	public String getepgen_ep_lft() {
		return epgen_ep_lft;
	}

	public void setepgen_ep_lft(String epgen_ep_lft) {
		this.epgen_ep_lft = epgen_ep_lft;
	}
	public String getepgen_ep_rgt() {
		return epgen_ep_rgt;
	}

	public void setepgen_ep_rgt(String epgen_ep_rgt) {
		this.epgen_ep_rgt = epgen_ep_rgt;
	}
	public String getepgen_ep_count() {
		return epgen_ep_count;
	}

	public void setepgen_ep_count(String epgen_ep_count) {
		this.epgen_ep_count = epgen_ep_count;
	}

}
