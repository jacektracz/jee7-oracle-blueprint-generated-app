
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
@Table(name = "joo2_session", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_session implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="session_id")
    private String epgen_session_id;
    @Column(name="client_id")
    private Integer epgen_client_id;
    @Column(name="guest")
    private Integer epgen_guest;
    @Column(name="time")
    private String epgen_time;
    @Column(name="data")
    private String epgen_data;
    @Column(name="userid")
    private Integer epgen_userid;
    @Column(name="username")
    private String epgen_username;
    @Column(name="usertype")
    private String epgen_usertype;
	public String getepgen_session_id() {
		return epgen_session_id;
	}

	public void setepgen_session_id(String epgen_session_id) {
		this.epgen_session_id = epgen_session_id;
	}
	public Integer getepgen_client_id() {
		return epgen_client_id;
	}

	public void setepgen_client_id(Integer epgen_client_id) {
		this.epgen_client_id = epgen_client_id;
	}
	public Integer getepgen_guest() {
		return epgen_guest;
	}

	public void setepgen_guest(Integer epgen_guest) {
		this.epgen_guest = epgen_guest;
	}
	public String getepgen_time() {
		return epgen_time;
	}

	public void setepgen_time(String epgen_time) {
		this.epgen_time = epgen_time;
	}
	public String getepgen_data() {
		return epgen_data;
	}

	public void setepgen_data(String epgen_data) {
		this.epgen_data = epgen_data;
	}
	public Integer getepgen_userid() {
		return epgen_userid;
	}

	public void setepgen_userid(Integer epgen_userid) {
		this.epgen_userid = epgen_userid;
	}
	public String getepgen_username() {
		return epgen_username;
	}

	public void setepgen_username(String epgen_username) {
		this.epgen_username = epgen_username;
	}
	public String getepgen_usertype() {
		return epgen_usertype;
	}

	public void setepgen_usertype(String epgen_usertype) {
		this.epgen_usertype = epgen_usertype;
	}

}
