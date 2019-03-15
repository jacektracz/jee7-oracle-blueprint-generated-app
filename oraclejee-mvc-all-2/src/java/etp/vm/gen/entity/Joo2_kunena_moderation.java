
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
@Table(name = "joo2_kunena_moderation", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_kunena_moderation implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="catid")
    private Integer epgen_catid;
    @Column(name="userid")
    private Integer epgen_userid;
    @Column(name="future1")
    private Integer epgen_future1;
    @Column(name="future2")
    private Integer epgen_future2;
	public Integer getepgen_catid() {
		return epgen_catid;
	}

	public void setepgen_catid(Integer epgen_catid) {
		this.epgen_catid = epgen_catid;
	}
	public Integer getepgen_userid() {
		return epgen_userid;
	}

	public void setepgen_userid(Integer epgen_userid) {
		this.epgen_userid = epgen_userid;
	}
	public Integer getepgen_future1() {
		return epgen_future1;
	}

	public void setepgen_future1(Integer epgen_future1) {
		this.epgen_future1 = epgen_future1;
	}
	public Integer getepgen_future2() {
		return epgen_future2;
	}

	public void setepgen_future2(Integer epgen_future2) {
		this.epgen_future2 = epgen_future2;
	}

}
