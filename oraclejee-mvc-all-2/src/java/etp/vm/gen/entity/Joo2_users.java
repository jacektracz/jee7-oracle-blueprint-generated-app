
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
@Table(name = "joo2_users", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_users implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="name")
    private String epgen_name;
    @Column(name="username")
    private String epgen_username;
    @Column(name="email")
    private String epgen_email;
    @Column(name="password")
    private String epgen_password;
    @Column(name="usertype")
    private String epgen_usertype;
    @Column(name="block")
    private Integer epgen_block;
    @Column(name="sendEmail")
    private Integer epgen_sendEmail;
    
    @Column(name = "registerDate", columnDefinition="VARCHAR")
    private String epgen_registerDate;
    
    @Column(name = "lastvisitDate", columnDefinition="VARCHAR")
    private String epgen_lastvisitDate;
    @Column(name="activation")
    private String epgen_activation;
    @Column(name="params")
    private String epgen_params;
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
	public String getepgen_username() {
		return epgen_username;
	}

	public void setepgen_username(String epgen_username) {
		this.epgen_username = epgen_username;
	}
	public String getepgen_email() {
		return epgen_email;
	}

	public void setepgen_email(String epgen_email) {
		this.epgen_email = epgen_email;
	}
	public String getepgen_password() {
		return epgen_password;
	}

	public void setepgen_password(String epgen_password) {
		this.epgen_password = epgen_password;
	}
	public String getepgen_usertype() {
		return epgen_usertype;
	}

	public void setepgen_usertype(String epgen_usertype) {
		this.epgen_usertype = epgen_usertype;
	}
	public Integer getepgen_block() {
		return epgen_block;
	}

	public void setepgen_block(Integer epgen_block) {
		this.epgen_block = epgen_block;
	}
	public Integer getepgen_sendEmail() {
		return epgen_sendEmail;
	}

	public void setepgen_sendEmail(Integer epgen_sendEmail) {
		this.epgen_sendEmail = epgen_sendEmail;
	}
	public String getepgen_registerDate() {
		return epgen_registerDate;
	}

	public void setepgen_registerDate(String epgen_registerDate) {
		this.epgen_registerDate = epgen_registerDate;
	}
	public String getepgen_lastvisitDate() {
		return epgen_lastvisitDate;
	}

	public void setepgen_lastvisitDate(String epgen_lastvisitDate) {
		this.epgen_lastvisitDate = epgen_lastvisitDate;
	}
	public String getepgen_activation() {
		return epgen_activation;
	}

	public void setepgen_activation(String epgen_activation) {
		this.epgen_activation = epgen_activation;
	}
	public String getepgen_params() {
		return epgen_params;
	}

	public void setepgen_params(String epgen_params) {
		this.epgen_params = epgen_params;
	}

}
