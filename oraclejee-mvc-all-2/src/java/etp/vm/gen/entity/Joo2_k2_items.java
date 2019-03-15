
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
@Table(name = "joo2_k2_items", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_k2_items implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="title")
    private String epgen_title;
    @Column(name="alias")
    private String epgen_alias;
    @Column(name="catid")
    private Integer epgen_catid;
    @Column(name="published")
    private Integer epgen_published;
    @Column(name="introtext")
    private String epgen_introtext;
    @Column(name="fulltext")
    private String epgen_fulltext;
    @Column(name="video")
    private String epgen_video;
    @Column(name="gallery")
    private String epgen_gallery;
    @Column(name="extra_fields")
    private String epgen_extra_fields;
    @Column(name="extra_fields_search")
    private String epgen_extra_fields_search;
    
    @Column(name = "created", columnDefinition="VARCHAR")
    private String epgen_created;
    @Column(name="created_by")
    private Integer epgen_created_by;
    @Column(name="created_by_alias")
    private String epgen_created_by_alias;
    @Column(name="checked_out")
    private Integer epgen_checked_out;
    
    @Column(name = "checked_out_time", columnDefinition="VARCHAR")
    private String epgen_checked_out_time;
    
    @Column(name = "modified", columnDefinition="VARCHAR")
    private String epgen_modified;
    @Column(name="modified_by")
    private Integer epgen_modified_by;
    
    @Column(name = "publish_up", columnDefinition="VARCHAR")
    private String epgen_publish_up;
    
    @Column(name = "publish_down", columnDefinition="VARCHAR")
    private String epgen_publish_down;
    @Column(name="trash")
    private Integer epgen_trash;
    @Column(name="access")
    private Integer epgen_access;
    @Column(name="ordering")
    private Integer epgen_ordering;
    @Column(name="featured")
    private Integer epgen_featured;
    @Column(name="featured_ordering")
    private Integer epgen_featured_ordering;
    @Column(name="image_caption")
    private String epgen_image_caption;
    @Column(name="image_credits")
    private String epgen_image_credits;
    @Column(name="video_caption")
    private String epgen_video_caption;
    @Column(name="video_credits")
    private String epgen_video_credits;
    @Column(name="hits")
    private Integer epgen_hits;
    @Column(name="params")
    private String epgen_params;
    @Column(name="metadesc")
    private String epgen_metadesc;
    @Column(name="metadata")
    private String epgen_metadata;
    @Column(name="metakey")
    private String epgen_metakey;
    @Column(name="plugins")
    private String epgen_plugins;
    @Column(name="language")
    private String epgen_language;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
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
	public Integer getepgen_catid() {
		return epgen_catid;
	}

	public void setepgen_catid(Integer epgen_catid) {
		this.epgen_catid = epgen_catid;
	}
	public Integer getepgen_published() {
		return epgen_published;
	}

	public void setepgen_published(Integer epgen_published) {
		this.epgen_published = epgen_published;
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
	public String getepgen_video() {
		return epgen_video;
	}

	public void setepgen_video(String epgen_video) {
		this.epgen_video = epgen_video;
	}
	public String getepgen_gallery() {
		return epgen_gallery;
	}

	public void setepgen_gallery(String epgen_gallery) {
		this.epgen_gallery = epgen_gallery;
	}
	public String getepgen_extra_fields() {
		return epgen_extra_fields;
	}

	public void setepgen_extra_fields(String epgen_extra_fields) {
		this.epgen_extra_fields = epgen_extra_fields;
	}
	public String getepgen_extra_fields_search() {
		return epgen_extra_fields_search;
	}

	public void setepgen_extra_fields_search(String epgen_extra_fields_search) {
		this.epgen_extra_fields_search = epgen_extra_fields_search;
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
	public Integer getepgen_trash() {
		return epgen_trash;
	}

	public void setepgen_trash(Integer epgen_trash) {
		this.epgen_trash = epgen_trash;
	}
	public Integer getepgen_access() {
		return epgen_access;
	}

	public void setepgen_access(Integer epgen_access) {
		this.epgen_access = epgen_access;
	}
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
	}
	public Integer getepgen_featured() {
		return epgen_featured;
	}

	public void setepgen_featured(Integer epgen_featured) {
		this.epgen_featured = epgen_featured;
	}
	public Integer getepgen_featured_ordering() {
		return epgen_featured_ordering;
	}

	public void setepgen_featured_ordering(Integer epgen_featured_ordering) {
		this.epgen_featured_ordering = epgen_featured_ordering;
	}
	public String getepgen_image_caption() {
		return epgen_image_caption;
	}

	public void setepgen_image_caption(String epgen_image_caption) {
		this.epgen_image_caption = epgen_image_caption;
	}
	public String getepgen_image_credits() {
		return epgen_image_credits;
	}

	public void setepgen_image_credits(String epgen_image_credits) {
		this.epgen_image_credits = epgen_image_credits;
	}
	public String getepgen_video_caption() {
		return epgen_video_caption;
	}

	public void setepgen_video_caption(String epgen_video_caption) {
		this.epgen_video_caption = epgen_video_caption;
	}
	public String getepgen_video_credits() {
		return epgen_video_credits;
	}

	public void setepgen_video_credits(String epgen_video_credits) {
		this.epgen_video_credits = epgen_video_credits;
	}
	public Integer getepgen_hits() {
		return epgen_hits;
	}

	public void setepgen_hits(Integer epgen_hits) {
		this.epgen_hits = epgen_hits;
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
	public String getepgen_metadata() {
		return epgen_metadata;
	}

	public void setepgen_metadata(String epgen_metadata) {
		this.epgen_metadata = epgen_metadata;
	}
	public String getepgen_metakey() {
		return epgen_metakey;
	}

	public void setepgen_metakey(String epgen_metakey) {
		this.epgen_metakey = epgen_metakey;
	}
	public String getepgen_plugins() {
		return epgen_plugins;
	}

	public void setepgen_plugins(String epgen_plugins) {
		this.epgen_plugins = epgen_plugins;
	}
	public String getepgen_language() {
		return epgen_language;
	}

	public void setepgen_language(String epgen_language) {
		this.epgen_language = epgen_language;
	}

}
