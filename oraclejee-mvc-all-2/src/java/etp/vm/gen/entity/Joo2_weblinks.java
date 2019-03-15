
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
@Table(name = "joo2_weblinks", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_weblinks implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="catid")
    private Integer epgen_catid;
    @Column(name="sid")
    private Integer epgen_sid;
    @Column(name="title")
    private String epgen_title;
    @Column(name="alias")
    private String epgen_alias;
    @Column(name="url")
    private String epgen_url;
    @Column(name="description")
    private String epgen_description;
    
    @Column(name = "date", columnDefinition="VARCHAR")
    private String epgen_date;
    @Column(name="hits")
    private Integer epgen_hits;
    @Column(name="state")
    private Integer epgen_state;
    @Column(name="checked_out")
    private Integer epgen_checked_out;
    
    @Column(name = "checked_out_time", columnDefinition="VARCHAR")
    private String epgen_checked_out_time;
    @Column(name="ordering")
    private Integer epgen_ordering;
    @Column(name="archived")
    private Integer epgen_archived;
    @Column(name="approved")
    private Integer epgen_approved;
    @Column(name="access")
    private Integer epgen_access;
    @Column(name="params")
    private String epgen_params;
    @Column(name="language")
    private String epgen_language;
    
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
    @Column(name="metakey")
    private String epgen_metakey;
    @Column(name="metadesc")
    private String epgen_metadesc;
    @Column(name="metadata")
    private String epgen_metadata;
    @Column(name="featured")
    private Integer epgen_featured;
    @Column(name="xreference")
    private String epgen_xreference;
    
    @Column(name = "publish_up", columnDefinition="VARCHAR")
    private String epgen_publish_up;
    
    @Column(name = "publish_down", columnDefinition="VARCHAR")
    private String epgen_publish_down;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public Integer getepgen_catid() {
		return epgen_catid;
	}

	public void setepgen_catid(Integer epgen_catid) {
		this.epgen_catid = epgen_catid;
	}
	public Integer getepgen_sid() {
		return epgen_sid;
	}

	public void setepgen_sid(Integer epgen_sid) {
		this.epgen_sid = epgen_sid;
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
	public String getepgen_url() {
		return epgen_url;
	}

	public void setepgen_url(String epgen_url) {
		this.epgen_url = epgen_url;
	}
	public String getepgen_description() {
		return epgen_description;
	}

	public void setepgen_description(String epgen_description) {
		this.epgen_description = epgen_description;
	}
	public String getepgen_date() {
		return epgen_date;
	}

	public void setepgen_date(String epgen_date) {
		this.epgen_date = epgen_date;
	}
	public Integer getepgen_hits() {
		return epgen_hits;
	}

	public void setepgen_hits(Integer epgen_hits) {
		this.epgen_hits = epgen_hits;
	}
	public Integer getepgen_state() {
		return epgen_state;
	}

	public void setepgen_state(Integer epgen_state) {
		this.epgen_state = epgen_state;
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
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
	}
	public Integer getepgen_archived() {
		return epgen_archived;
	}

	public void setepgen_archived(Integer epgen_archived) {
		this.epgen_archived = epgen_archived;
	}
	public Integer getepgen_approved() {
		return epgen_approved;
	}

	public void setepgen_approved(Integer epgen_approved) {
		this.epgen_approved = epgen_approved;
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
	public String getepgen_language() {
		return epgen_language;
	}

	public void setepgen_language(String epgen_language) {
		this.epgen_language = epgen_language;
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
	public String getepgen_xreference() {
		return epgen_xreference;
	}

	public void setepgen_xreference(String epgen_xreference) {
		this.epgen_xreference = epgen_xreference;
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

}
