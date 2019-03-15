
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
@Table(name = "joo2_kunena_sessions", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_kunena_sessions implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="userid")
    private Integer epgen_userid;
    @Column(name="allowed")
    private String epgen_allowed;
    @Column(name="lasttime")
    private Integer epgen_lasttime;
    @Column(name="readtopics")
    private String epgen_readtopics;
    @Column(name="currvisit")
    private Integer epgen_currvisit;
	public Integer getepgen_userid() {
		return epgen_userid;
	}

	public void setepgen_userid(Integer epgen_userid) {
		this.epgen_userid = epgen_userid;
	}
	public String getepgen_allowed() {
		return epgen_allowed;
	}

	public void setepgen_allowed(String epgen_allowed) {
		this.epgen_allowed = epgen_allowed;
	}
	public Integer getepgen_lasttime() {
		return epgen_lasttime;
	}

	public void setepgen_lasttime(Integer epgen_lasttime) {
		this.epgen_lasttime = epgen_lasttime;
	}
	public String getepgen_readtopics() {
		return epgen_readtopics;
	}

	public void setepgen_readtopics(String epgen_readtopics) {
		this.epgen_readtopics = epgen_readtopics;
	}
	public Integer getepgen_currvisit() {
		return epgen_currvisit;
	}

	public void setepgen_currvisit(Integer epgen_currvisit) {
		this.epgen_currvisit = epgen_currvisit;
	}

}
