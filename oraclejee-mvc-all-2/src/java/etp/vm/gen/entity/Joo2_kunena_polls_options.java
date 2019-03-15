
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
@Table(name = "joo2_kunena_polls_options", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_kunena_polls_options implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="pollid")
    private Integer epgen_pollid;
    @Column(name="text")
    private String epgen_text;
    @Column(name="votes")
    private Integer epgen_votes;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public Integer getepgen_pollid() {
		return epgen_pollid;
	}

	public void setepgen_pollid(Integer epgen_pollid) {
		this.epgen_pollid = epgen_pollid;
	}
	public String getepgen_text() {
		return epgen_text;
	}

	public void setepgen_text(String epgen_text) {
		this.epgen_text = epgen_text;
	}
	public Integer getepgen_votes() {
		return epgen_votes;
	}

	public void setepgen_votes(Integer epgen_votes) {
		this.epgen_votes = epgen_votes;
	}

}
