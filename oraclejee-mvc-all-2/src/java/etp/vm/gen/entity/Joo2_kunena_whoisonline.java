
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
@Table(name = "joo2_kunena_whoisonline", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_kunena_whoisonline implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="userid")
    private Integer epgen_userid;
    @Column(name="time")
    private String epgen_time;
    @Column(name="item")
    private Integer epgen_item;
    @Column(name="what")
    private String epgen_what;
    @Column(name="func")
    private String epgen_func;
    @Column(name="do")
    private String epgen_do;
    @Column(name="task")
    private String epgen_task;
    @Column(name="link")
    private String epgen_link;
    @Column(name="userip")
    private String epgen_userip;
    @Column(name="user")
    private Integer epgen_user;
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
	public String getepgen_time() {
		return epgen_time;
	}

	public void setepgen_time(String epgen_time) {
		this.epgen_time = epgen_time;
	}
	public Integer getepgen_item() {
		return epgen_item;
	}

	public void setepgen_item(Integer epgen_item) {
		this.epgen_item = epgen_item;
	}
	public String getepgen_what() {
		return epgen_what;
	}

	public void setepgen_what(String epgen_what) {
		this.epgen_what = epgen_what;
	}
	public String getepgen_func() {
		return epgen_func;
	}

	public void setepgen_func(String epgen_func) {
		this.epgen_func = epgen_func;
	}
	public String getepgen_do() {
		return epgen_do;
	}

	public void setepgen_do(String epgen_do) {
		this.epgen_do = epgen_do;
	}
	public String getepgen_task() {
		return epgen_task;
	}

	public void setepgen_task(String epgen_task) {
		this.epgen_task = epgen_task;
	}
	public String getepgen_link() {
		return epgen_link;
	}

	public void setepgen_link(String epgen_link) {
		this.epgen_link = epgen_link;
	}
	public String getepgen_userip() {
		return epgen_userip;
	}

	public void setepgen_userip(String epgen_userip) {
		this.epgen_userip = epgen_userip;
	}
	public Integer getepgen_user() {
		return epgen_user;
	}

	public void setepgen_user(Integer epgen_user) {
		this.epgen_user = epgen_user;
	}

}
