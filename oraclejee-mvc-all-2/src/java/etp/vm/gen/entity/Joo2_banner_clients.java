
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
@Table(name = "joo2_banner_clients", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_banner_clients implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="name")
    private String epgen_name;
    @Column(name="contact")
    private String epgen_contact;
    @Column(name="email")
    private String epgen_email;
    @Column(name="extrainfo")
    private String epgen_extrainfo;
    @Column(name="state")
    private Integer epgen_state;
    @Column(name="checked_out")
    private Integer epgen_checked_out;
    
    @Column(name = "checked_out_time", columnDefinition="VARCHAR")
    private String epgen_checked_out_time;
    @Column(name="metakey")
    private String epgen_metakey;
    @Column(name="own_prefix")
    private Integer epgen_own_prefix;
    @Column(name="metakey_prefix")
    private String epgen_metakey_prefix;
    @Column(name="purchase_type")
    private Integer epgen_purchase_type;
    @Column(name="track_clicks")
    private Integer epgen_track_clicks;
    @Column(name="track_impressions")
    private Integer epgen_track_impressions;
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
	public String getepgen_contact() {
		return epgen_contact;
	}

	public void setepgen_contact(String epgen_contact) {
		this.epgen_contact = epgen_contact;
	}
	public String getepgen_email() {
		return epgen_email;
	}

	public void setepgen_email(String epgen_email) {
		this.epgen_email = epgen_email;
	}
	public String getepgen_extrainfo() {
		return epgen_extrainfo;
	}

	public void setepgen_extrainfo(String epgen_extrainfo) {
		this.epgen_extrainfo = epgen_extrainfo;
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
	public String getepgen_metakey() {
		return epgen_metakey;
	}

	public void setepgen_metakey(String epgen_metakey) {
		this.epgen_metakey = epgen_metakey;
	}
	public Integer getepgen_own_prefix() {
		return epgen_own_prefix;
	}

	public void setepgen_own_prefix(Integer epgen_own_prefix) {
		this.epgen_own_prefix = epgen_own_prefix;
	}
	public String getepgen_metakey_prefix() {
		return epgen_metakey_prefix;
	}

	public void setepgen_metakey_prefix(String epgen_metakey_prefix) {
		this.epgen_metakey_prefix = epgen_metakey_prefix;
	}
	public Integer getepgen_purchase_type() {
		return epgen_purchase_type;
	}

	public void setepgen_purchase_type(Integer epgen_purchase_type) {
		this.epgen_purchase_type = epgen_purchase_type;
	}
	public Integer getepgen_track_clicks() {
		return epgen_track_clicks;
	}

	public void setepgen_track_clicks(Integer epgen_track_clicks) {
		this.epgen_track_clicks = epgen_track_clicks;
	}
	public Integer getepgen_track_impressions() {
		return epgen_track_impressions;
	}

	public void setepgen_track_impressions(Integer epgen_track_impressions) {
		this.epgen_track_impressions = epgen_track_impressions;
	}

}
