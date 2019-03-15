
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
@Table(name = "joo2_phocagallery_categories", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_phocagallery_categories implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="parent_id")
    private Integer epgen_parent_id;
    @Column(name="owner_id")
    private Integer epgen_owner_id;
    @Column(name="title")
    private String epgen_title;
    @Column(name="name")
    private String epgen_name;
    @Column(name="alias")
    private String epgen_alias;
    @Column(name="image")
    private String epgen_image;
    @Column(name="section")
    private String epgen_section;
    @Column(name="image_position")
    private String epgen_image_position;
    @Column(name="description")
    private String epgen_description;
    
    @Column(name = "date", columnDefinition="VARCHAR")
    private String epgen_date;
    @Column(name="published")
    private Integer epgen_published;
    @Column(name="approved")
    private Integer epgen_approved;
    @Column(name="checked_out")
    private Integer epgen_checked_out;
    
    @Column(name = "checked_out_time", columnDefinition="VARCHAR")
    private String epgen_checked_out_time;
    @Column(name="editor")
    private String epgen_editor;
    @Column(name="ordering")
    private Integer epgen_ordering;
    @Column(name="access")
    private Integer epgen_access;
    @Column(name="count")
    private Integer epgen_count;
    @Column(name="hits")
    private Integer epgen_hits;
    @Column(name="accessuserid")
    private String epgen_accessuserid;
    @Column(name="uploaduserid")
    private String epgen_uploaduserid;
    @Column(name="deleteuserid")
    private String epgen_deleteuserid;
    @Column(name="userfolder")
    private String epgen_userfolder;
    @Column(name="latitude")
    private String epgen_latitude;
    @Column(name="longitude")
    private String epgen_longitude;
    @Column(name="zoom")
    private Integer epgen_zoom;
    @Column(name="geotitle")
    private String epgen_geotitle;
    @Column(name="extid")
    private String epgen_extid;
    @Column(name="exta")
    private String epgen_exta;
    @Column(name="extu")
    private String epgen_extu;
    @Column(name="extauth")
    private String epgen_extauth;
    @Column(name="extfbuid")
    private Integer epgen_extfbuid;
    @Column(name="extfbcatid")
    private String epgen_extfbcatid;
    @Column(name="params")
    private String epgen_params;
    @Column(name="metakey")
    private String epgen_metakey;
    @Column(name="metadesc")
    private String epgen_metadesc;
    @Column(name="metadata")
    private String epgen_metadata;
    @Column(name="language")
    private String epgen_language;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public Integer getepgen_parent_id() {
		return epgen_parent_id;
	}

	public void setepgen_parent_id(Integer epgen_parent_id) {
		this.epgen_parent_id = epgen_parent_id;
	}
	public Integer getepgen_owner_id() {
		return epgen_owner_id;
	}

	public void setepgen_owner_id(Integer epgen_owner_id) {
		this.epgen_owner_id = epgen_owner_id;
	}
	public String getepgen_title() {
		return epgen_title;
	}

	public void setepgen_title(String epgen_title) {
		this.epgen_title = epgen_title;
	}
	public String getepgen_name() {
		return epgen_name;
	}

	public void setepgen_name(String epgen_name) {
		this.epgen_name = epgen_name;
	}
	public String getepgen_alias() {
		return epgen_alias;
	}

	public void setepgen_alias(String epgen_alias) {
		this.epgen_alias = epgen_alias;
	}
	public String getepgen_image() {
		return epgen_image;
	}

	public void setepgen_image(String epgen_image) {
		this.epgen_image = epgen_image;
	}
	public String getepgen_section() {
		return epgen_section;
	}

	public void setepgen_section(String epgen_section) {
		this.epgen_section = epgen_section;
	}
	public String getepgen_image_position() {
		return epgen_image_position;
	}

	public void setepgen_image_position(String epgen_image_position) {
		this.epgen_image_position = epgen_image_position;
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
	public Integer getepgen_published() {
		return epgen_published;
	}

	public void setepgen_published(Integer epgen_published) {
		this.epgen_published = epgen_published;
	}
	public Integer getepgen_approved() {
		return epgen_approved;
	}

	public void setepgen_approved(Integer epgen_approved) {
		this.epgen_approved = epgen_approved;
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
	public String getepgen_editor() {
		return epgen_editor;
	}

	public void setepgen_editor(String epgen_editor) {
		this.epgen_editor = epgen_editor;
	}
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
	}
	public Integer getepgen_access() {
		return epgen_access;
	}

	public void setepgen_access(Integer epgen_access) {
		this.epgen_access = epgen_access;
	}
	public Integer getepgen_count() {
		return epgen_count;
	}

	public void setepgen_count(Integer epgen_count) {
		this.epgen_count = epgen_count;
	}
	public Integer getepgen_hits() {
		return epgen_hits;
	}

	public void setepgen_hits(Integer epgen_hits) {
		this.epgen_hits = epgen_hits;
	}
	public String getepgen_accessuserid() {
		return epgen_accessuserid;
	}

	public void setepgen_accessuserid(String epgen_accessuserid) {
		this.epgen_accessuserid = epgen_accessuserid;
	}
	public String getepgen_uploaduserid() {
		return epgen_uploaduserid;
	}

	public void setepgen_uploaduserid(String epgen_uploaduserid) {
		this.epgen_uploaduserid = epgen_uploaduserid;
	}
	public String getepgen_deleteuserid() {
		return epgen_deleteuserid;
	}

	public void setepgen_deleteuserid(String epgen_deleteuserid) {
		this.epgen_deleteuserid = epgen_deleteuserid;
	}
	public String getepgen_userfolder() {
		return epgen_userfolder;
	}

	public void setepgen_userfolder(String epgen_userfolder) {
		this.epgen_userfolder = epgen_userfolder;
	}
	public String getepgen_latitude() {
		return epgen_latitude;
	}

	public void setepgen_latitude(String epgen_latitude) {
		this.epgen_latitude = epgen_latitude;
	}
	public String getepgen_longitude() {
		return epgen_longitude;
	}

	public void setepgen_longitude(String epgen_longitude) {
		this.epgen_longitude = epgen_longitude;
	}
	public Integer getepgen_zoom() {
		return epgen_zoom;
	}

	public void setepgen_zoom(Integer epgen_zoom) {
		this.epgen_zoom = epgen_zoom;
	}
	public String getepgen_geotitle() {
		return epgen_geotitle;
	}

	public void setepgen_geotitle(String epgen_geotitle) {
		this.epgen_geotitle = epgen_geotitle;
	}
	public String getepgen_extid() {
		return epgen_extid;
	}

	public void setepgen_extid(String epgen_extid) {
		this.epgen_extid = epgen_extid;
	}
	public String getepgen_exta() {
		return epgen_exta;
	}

	public void setepgen_exta(String epgen_exta) {
		this.epgen_exta = epgen_exta;
	}
	public String getepgen_extu() {
		return epgen_extu;
	}

	public void setepgen_extu(String epgen_extu) {
		this.epgen_extu = epgen_extu;
	}
	public String getepgen_extauth() {
		return epgen_extauth;
	}

	public void setepgen_extauth(String epgen_extauth) {
		this.epgen_extauth = epgen_extauth;
	}
	public Integer getepgen_extfbuid() {
		return epgen_extfbuid;
	}

	public void setepgen_extfbuid(Integer epgen_extfbuid) {
		this.epgen_extfbuid = epgen_extfbuid;
	}
	public String getepgen_extfbcatid() {
		return epgen_extfbcatid;
	}

	public void setepgen_extfbcatid(String epgen_extfbcatid) {
		this.epgen_extfbcatid = epgen_extfbcatid;
	}
	public String getepgen_params() {
		return epgen_params;
	}

	public void setepgen_params(String epgen_params) {
		this.epgen_params = epgen_params;
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
	public String getepgen_language() {
		return epgen_language;
	}

	public void setepgen_language(String epgen_language) {
		this.epgen_language = epgen_language;
	}

}
