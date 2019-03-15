
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
@Table(name = "joo2_contact_details", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_contact_details implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="name")
    private String epgen_name;
    @Column(name="alias")
    private String epgen_alias;
    @Column(name="con_position")
    private String epgen_con_position;
    @Column(name="address")
    private String epgen_address;
    @Column(name="suburb")
    private String epgen_suburb;
    @Column(name="state")
    private String epgen_state;
    @Column(name="country")
    private String epgen_country;
    @Column(name="postcode")
    private String epgen_postcode;
    @Column(name="telephone")
    private String epgen_telephone;
    @Column(name="fax")
    private String epgen_fax;
    @Column(name="misc")
    private String epgen_misc;
    @Column(name="image")
    private String epgen_image;
    @Column(name="imagepos")
    private String epgen_imagepos;
    @Column(name="email_to")
    private String epgen_email_to;
    @Column(name="default_con")
    private Integer epgen_default_con;
    @Column(name="published")
    private Integer epgen_published;
    @Column(name="checked_out")
    private Integer epgen_checked_out;
    
    @Column(name = "checked_out_time", columnDefinition="VARCHAR")
    private String epgen_checked_out_time;
    @Column(name="ordering")
    private Integer epgen_ordering;
    @Column(name="params")
    private String epgen_params;
    @Column(name="user_id")
    private Integer epgen_user_id;
    @Column(name="catid")
    private Integer epgen_catid;
    @Column(name="access")
    private Integer epgen_access;
    @Column(name="mobile")
    private String epgen_mobile;
    @Column(name="webpage")
    private String epgen_webpage;
    @Column(name="sortname1")
    private String epgen_sortname1;
    @Column(name="sortname2")
    private String epgen_sortname2;
    @Column(name="sortname3")
    private String epgen_sortname3;
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
	public String getepgen_con_position() {
		return epgen_con_position;
	}

	public void setepgen_con_position(String epgen_con_position) {
		this.epgen_con_position = epgen_con_position;
	}
	public String getepgen_address() {
		return epgen_address;
	}

	public void setepgen_address(String epgen_address) {
		this.epgen_address = epgen_address;
	}
	public String getepgen_suburb() {
		return epgen_suburb;
	}

	public void setepgen_suburb(String epgen_suburb) {
		this.epgen_suburb = epgen_suburb;
	}
	public String getepgen_state() {
		return epgen_state;
	}

	public void setepgen_state(String epgen_state) {
		this.epgen_state = epgen_state;
	}
	public String getepgen_country() {
		return epgen_country;
	}

	public void setepgen_country(String epgen_country) {
		this.epgen_country = epgen_country;
	}
	public String getepgen_postcode() {
		return epgen_postcode;
	}

	public void setepgen_postcode(String epgen_postcode) {
		this.epgen_postcode = epgen_postcode;
	}
	public String getepgen_telephone() {
		return epgen_telephone;
	}

	public void setepgen_telephone(String epgen_telephone) {
		this.epgen_telephone = epgen_telephone;
	}
	public String getepgen_fax() {
		return epgen_fax;
	}

	public void setepgen_fax(String epgen_fax) {
		this.epgen_fax = epgen_fax;
	}
	public String getepgen_misc() {
		return epgen_misc;
	}

	public void setepgen_misc(String epgen_misc) {
		this.epgen_misc = epgen_misc;
	}
	public String getepgen_image() {
		return epgen_image;
	}

	public void setepgen_image(String epgen_image) {
		this.epgen_image = epgen_image;
	}
	public String getepgen_imagepos() {
		return epgen_imagepos;
	}

	public void setepgen_imagepos(String epgen_imagepos) {
		this.epgen_imagepos = epgen_imagepos;
	}
	public String getepgen_email_to() {
		return epgen_email_to;
	}

	public void setepgen_email_to(String epgen_email_to) {
		this.epgen_email_to = epgen_email_to;
	}
	public Integer getepgen_default_con() {
		return epgen_default_con;
	}

	public void setepgen_default_con(Integer epgen_default_con) {
		this.epgen_default_con = epgen_default_con;
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
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
	}
	public String getepgen_params() {
		return epgen_params;
	}

	public void setepgen_params(String epgen_params) {
		this.epgen_params = epgen_params;
	}
	public Integer getepgen_user_id() {
		return epgen_user_id;
	}

	public void setepgen_user_id(Integer epgen_user_id) {
		this.epgen_user_id = epgen_user_id;
	}
	public Integer getepgen_catid() {
		return epgen_catid;
	}

	public void setepgen_catid(Integer epgen_catid) {
		this.epgen_catid = epgen_catid;
	}
	public Integer getepgen_access() {
		return epgen_access;
	}

	public void setepgen_access(Integer epgen_access) {
		this.epgen_access = epgen_access;
	}
	public String getepgen_mobile() {
		return epgen_mobile;
	}

	public void setepgen_mobile(String epgen_mobile) {
		this.epgen_mobile = epgen_mobile;
	}
	public String getepgen_webpage() {
		return epgen_webpage;
	}

	public void setepgen_webpage(String epgen_webpage) {
		this.epgen_webpage = epgen_webpage;
	}
	public String getepgen_sortname1() {
		return epgen_sortname1;
	}

	public void setepgen_sortname1(String epgen_sortname1) {
		this.epgen_sortname1 = epgen_sortname1;
	}
	public String getepgen_sortname2() {
		return epgen_sortname2;
	}

	public void setepgen_sortname2(String epgen_sortname2) {
		this.epgen_sortname2 = epgen_sortname2;
	}
	public String getepgen_sortname3() {
		return epgen_sortname3;
	}

	public void setepgen_sortname3(String epgen_sortname3) {
		this.epgen_sortname3 = epgen_sortname3;
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
