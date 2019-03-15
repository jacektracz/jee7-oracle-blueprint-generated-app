
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
@Table(name = "joo2_k2_users", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_k2_users implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="userID")
    private Integer epgen_userID;
    @Column(name="userName")
    private String epgen_userName;
    @Column(name="description")
    private String epgen_description;
    @Column(name="image")
    private String epgen_image;
    @Column(name="url")
    private String epgen_url;
    @Column(name="group")
    private Integer epgen_group;
    @Column(name="plugins")
    private String epgen_plugins;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public Integer getepgen_userID() {
		return epgen_userID;
	}

	public void setepgen_userID(Integer epgen_userID) {
		this.epgen_userID = epgen_userID;
	}
	public String getepgen_userName() {
		return epgen_userName;
	}

	public void setepgen_userName(String epgen_userName) {
		this.epgen_userName = epgen_userName;
	}
	public String getepgen_description() {
		return epgen_description;
	}

	public void setepgen_description(String epgen_description) {
		this.epgen_description = epgen_description;
	}
	public String getepgen_image() {
		return epgen_image;
	}

	public void setepgen_image(String epgen_image) {
		this.epgen_image = epgen_image;
	}
	public String getepgen_url() {
		return epgen_url;
	}

	public void setepgen_url(String epgen_url) {
		this.epgen_url = epgen_url;
	}
	public Integer getepgen_group() {
		return epgen_group;
	}

	public void setepgen_group(Integer epgen_group) {
		this.epgen_group = epgen_group;
	}
	public String getepgen_plugins() {
		return epgen_plugins;
	}

	public void setepgen_plugins(String epgen_plugins) {
		this.epgen_plugins = epgen_plugins;
	}

}
