
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
@Table(name = "joo2_phocagallery", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_phocagallery implements Serializable 
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
    @Column(name="filename")
    private String epgen_filename;
    @Column(name="description")
    private String epgen_description;
    
    @Column(name = "date", columnDefinition="VARCHAR")
    private String epgen_date;
    @Column(name="hits")
    private Integer epgen_hits;
    @Column(name="latitude")
    private String epgen_latitude;
    @Column(name="longitude")
    private String epgen_longitude;
    @Column(name="zoom")
    private Integer epgen_zoom;
    @Column(name="geotitle")
    private String epgen_geotitle;
    @Column(name="userid")
    private Integer epgen_userid;
    @Column(name="videocode")
    private String epgen_videocode;
    @Column(name="vmproductid")
    private Integer epgen_vmproductid;
    @Column(name="imgorigsize")
    private Integer epgen_imgorigsize;
    @Column(name="published")
    private Integer epgen_published;
    @Column(name="approved")
    private Integer epgen_approved;
    @Column(name="checked_out")
    private Integer epgen_checked_out;
    
    @Column(name = "checked_out_time", columnDefinition="VARCHAR")
    private String epgen_checked_out_time;
    @Column(name="ordering")
    private Integer epgen_ordering;
    @Column(name="params")
    private String epgen_params;
    @Column(name="metakey")
    private String epgen_metakey;
    @Column(name="metadesc")
    private String epgen_metadesc;
    @Column(name="metadata")
    private String epgen_metadata;
    @Column(name="extlink1")
    private String epgen_extlink1;
    @Column(name="extlink2")
    private String epgen_extlink2;
    @Column(name="extid")
    private String epgen_extid;
    @Column(name="exttype")
    private Integer epgen_exttype;
    @Column(name="extl")
    private String epgen_extl;
    @Column(name="extm")
    private String epgen_extm;
    @Column(name="exts")
    private String epgen_exts;
    @Column(name="exto")
    private String epgen_exto;
    @Column(name="extw")
    private String epgen_extw;
    @Column(name="exth")
    private String epgen_exth;
    @Column(name="language")
    private String epgen_language;
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
	public String getepgen_filename() {
		return epgen_filename;
	}

	public void setepgen_filename(String epgen_filename) {
		this.epgen_filename = epgen_filename;
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
	public Integer getepgen_userid() {
		return epgen_userid;
	}

	public void setepgen_userid(Integer epgen_userid) {
		this.epgen_userid = epgen_userid;
	}
	public String getepgen_videocode() {
		return epgen_videocode;
	}

	public void setepgen_videocode(String epgen_videocode) {
		this.epgen_videocode = epgen_videocode;
	}
	public Integer getepgen_vmproductid() {
		return epgen_vmproductid;
	}

	public void setepgen_vmproductid(Integer epgen_vmproductid) {
		this.epgen_vmproductid = epgen_vmproductid;
	}
	public Integer getepgen_imgorigsize() {
		return epgen_imgorigsize;
	}

	public void setepgen_imgorigsize(Integer epgen_imgorigsize) {
		this.epgen_imgorigsize = epgen_imgorigsize;
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
	public String getepgen_extlink1() {
		return epgen_extlink1;
	}

	public void setepgen_extlink1(String epgen_extlink1) {
		this.epgen_extlink1 = epgen_extlink1;
	}
	public String getepgen_extlink2() {
		return epgen_extlink2;
	}

	public void setepgen_extlink2(String epgen_extlink2) {
		this.epgen_extlink2 = epgen_extlink2;
	}
	public String getepgen_extid() {
		return epgen_extid;
	}

	public void setepgen_extid(String epgen_extid) {
		this.epgen_extid = epgen_extid;
	}
	public Integer getepgen_exttype() {
		return epgen_exttype;
	}

	public void setepgen_exttype(Integer epgen_exttype) {
		this.epgen_exttype = epgen_exttype;
	}
	public String getepgen_extl() {
		return epgen_extl;
	}

	public void setepgen_extl(String epgen_extl) {
		this.epgen_extl = epgen_extl;
	}
	public String getepgen_extm() {
		return epgen_extm;
	}

	public void setepgen_extm(String epgen_extm) {
		this.epgen_extm = epgen_extm;
	}
	public String getepgen_exts() {
		return epgen_exts;
	}

	public void setepgen_exts(String epgen_exts) {
		this.epgen_exts = epgen_exts;
	}
	public String getepgen_exto() {
		return epgen_exto;
	}

	public void setepgen_exto(String epgen_exto) {
		this.epgen_exto = epgen_exto;
	}
	public String getepgen_extw() {
		return epgen_extw;
	}

	public void setepgen_extw(String epgen_extw) {
		this.epgen_extw = epgen_extw;
	}
	public String getepgen_exth() {
		return epgen_exth;
	}

	public void setepgen_exth(String epgen_exth) {
		this.epgen_exth = epgen_exth;
	}
	public String getepgen_language() {
		return epgen_language;
	}

	public void setepgen_language(String epgen_language) {
		this.epgen_language = epgen_language;
	}

}
