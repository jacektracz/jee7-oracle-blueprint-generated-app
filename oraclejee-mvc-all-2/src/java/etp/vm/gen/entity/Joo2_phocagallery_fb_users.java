
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
@Table(name = "joo2_phocagallery_fb_users", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_phocagallery_fb_users implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="appid")
    private String epgen_appid;
    @Column(name="appsid")
    private String epgen_appsid;
    @Column(name="uid")
    private String epgen_uid;
    @Column(name="name")
    private String epgen_name;
    @Column(name="link")
    private String epgen_link;
    @Column(name="secret")
    private String epgen_secret;
    @Column(name="base_domain")
    private String epgen_base_domain;
    @Column(name="expires")
    private String epgen_expires;
    @Column(name="session_key")
    private String epgen_session_key;
    @Column(name="access_token")
    private String epgen_access_token;
    @Column(name="sig")
    private String epgen_sig;
    @Column(name="fanpageid")
    private String epgen_fanpageid;
    @Column(name="published")
    private Integer epgen_published;
    @Column(name="checked_out")
    private Integer epgen_checked_out;
    
    @Column(name = "checked_out_time", columnDefinition="VARCHAR")
    private String epgen_checked_out_time;
    @Column(name="ordering")
    private Integer epgen_ordering;
    @Column(name="comments")
    private String epgen_comments;
    @Column(name="params")
    private String epgen_params;
    @Column(name="language")
    private String epgen_language;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public String getepgen_appid() {
		return epgen_appid;
	}

	public void setepgen_appid(String epgen_appid) {
		this.epgen_appid = epgen_appid;
	}
	public String getepgen_appsid() {
		return epgen_appsid;
	}

	public void setepgen_appsid(String epgen_appsid) {
		this.epgen_appsid = epgen_appsid;
	}
	public String getepgen_uid() {
		return epgen_uid;
	}

	public void setepgen_uid(String epgen_uid) {
		this.epgen_uid = epgen_uid;
	}
	public String getepgen_name() {
		return epgen_name;
	}

	public void setepgen_name(String epgen_name) {
		this.epgen_name = epgen_name;
	}
	public String getepgen_link() {
		return epgen_link;
	}

	public void setepgen_link(String epgen_link) {
		this.epgen_link = epgen_link;
	}
	public String getepgen_secret() {
		return epgen_secret;
	}

	public void setepgen_secret(String epgen_secret) {
		this.epgen_secret = epgen_secret;
	}
	public String getepgen_base_domain() {
		return epgen_base_domain;
	}

	public void setepgen_base_domain(String epgen_base_domain) {
		this.epgen_base_domain = epgen_base_domain;
	}
	public String getepgen_expires() {
		return epgen_expires;
	}

	public void setepgen_expires(String epgen_expires) {
		this.epgen_expires = epgen_expires;
	}
	public String getepgen_session_key() {
		return epgen_session_key;
	}

	public void setepgen_session_key(String epgen_session_key) {
		this.epgen_session_key = epgen_session_key;
	}
	public String getepgen_access_token() {
		return epgen_access_token;
	}

	public void setepgen_access_token(String epgen_access_token) {
		this.epgen_access_token = epgen_access_token;
	}
	public String getepgen_sig() {
		return epgen_sig;
	}

	public void setepgen_sig(String epgen_sig) {
		this.epgen_sig = epgen_sig;
	}
	public String getepgen_fanpageid() {
		return epgen_fanpageid;
	}

	public void setepgen_fanpageid(String epgen_fanpageid) {
		this.epgen_fanpageid = epgen_fanpageid;
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
	public String getepgen_comments() {
		return epgen_comments;
	}

	public void setepgen_comments(String epgen_comments) {
		this.epgen_comments = epgen_comments;
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

}
