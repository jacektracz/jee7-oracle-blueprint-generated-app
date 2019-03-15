
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
@Table(name = "joo2_kunena_polls_users", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_kunena_polls_users implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="pollid")
    private Integer epgen_pollid;
    @Column(name="userid")
    private Integer epgen_userid;
    @Column(name="votes")
    private Integer epgen_votes;
    @Column(name="lastvote")
    private Integer epgen_lastvote;
	public Integer getepgen_pollid() {
		return epgen_pollid;
	}

	public void setepgen_pollid(Integer epgen_pollid) {
		this.epgen_pollid = epgen_pollid;
	}
	public Integer getepgen_userid() {
		return epgen_userid;
	}

	public void setepgen_userid(Integer epgen_userid) {
		this.epgen_userid = epgen_userid;
	}
	public Integer getepgen_votes() {
		return epgen_votes;
	}

	public void setepgen_votes(Integer epgen_votes) {
		this.epgen_votes = epgen_votes;
	}
	public Integer getepgen_lastvote() {
		return epgen_lastvote;
	}

	public void setepgen_lastvote(Integer epgen_lastvote) {
		this.epgen_lastvote = epgen_lastvote;
	}

}
