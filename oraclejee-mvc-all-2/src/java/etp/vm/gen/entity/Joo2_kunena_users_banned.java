
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
@Table(name = "joo2_kunena_users_banned", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_kunena_users_banned implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="userid")
    private Integer epgen_userid;
    @Column(name="ip")
    private String epgen_ip;
    @Column(name="blocked")
    private Integer epgen_blocked;
    
    @Column(name = "expiration", columnDefinition="VARCHAR")
    private String epgen_expiration;
    @Column(name="created_by")
    private Integer epgen_created_by;
    
    @Column(name = "created_time", columnDefinition="VARCHAR")
    private String epgen_created_time;
    @Column(name="reason_private")
    private String epgen_reason_private;
    @Column(name="reason_public")
    private String epgen_reason_public;
    @Column(name="modified_by")
    private Integer epgen_modified_by;
    
    @Column(name = "modified_time", columnDefinition="VARCHAR")
    private String epgen_modified_time;
    @Column(name="comments")
    private String epgen_comments;
    @Column(name="params")
    private String epgen_params;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public Integer getepgen_userid() {
		return epgen_userid;
	}

	public void setepgen_userid(Integer epgen_userid) {
		this.epgen_userid = epgen_userid;
	}
	public String getepgen_ip() {
		return epgen_ip;
	}

	public void setepgen_ip(String epgen_ip) {
		this.epgen_ip = epgen_ip;
	}
	public Integer getepgen_blocked() {
		return epgen_blocked;
	}

	public void setepgen_blocked(Integer epgen_blocked) {
		this.epgen_blocked = epgen_blocked;
	}
	public String getepgen_expiration() {
		return epgen_expiration;
	}

	public void setepgen_expiration(String epgen_expiration) {
		this.epgen_expiration = epgen_expiration;
	}
	public Integer getepgen_created_by() {
		return epgen_created_by;
	}

	public void setepgen_created_by(Integer epgen_created_by) {
		this.epgen_created_by = epgen_created_by;
	}
	public String getepgen_created_time() {
		return epgen_created_time;
	}

	public void setepgen_created_time(String epgen_created_time) {
		this.epgen_created_time = epgen_created_time;
	}
	public String getepgen_reason_private() {
		return epgen_reason_private;
	}

	public void setepgen_reason_private(String epgen_reason_private) {
		this.epgen_reason_private = epgen_reason_private;
	}
	public String getepgen_reason_public() {
		return epgen_reason_public;
	}

	public void setepgen_reason_public(String epgen_reason_public) {
		this.epgen_reason_public = epgen_reason_public;
	}
	public Integer getepgen_modified_by() {
		return epgen_modified_by;
	}

	public void setepgen_modified_by(Integer epgen_modified_by) {
		this.epgen_modified_by = epgen_modified_by;
	}
	public String getepgen_modified_time() {
		return epgen_modified_time;
	}

	public void setepgen_modified_time(String epgen_modified_time) {
		this.epgen_modified_time = epgen_modified_time;
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

}
