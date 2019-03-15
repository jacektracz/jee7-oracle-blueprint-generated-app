
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
@Table(name = "joo2_kunena_polls", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_kunena_polls implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="title")
    private String epgen_title;
    @Column(name="threadid")
    private Integer epgen_threadid;
    
    @Column(name = "polltimetolive", columnDefinition="VARCHAR")
    private String epgen_polltimetolive;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public String getepgen_title() {
		return epgen_title;
	}

	public void setepgen_title(String epgen_title) {
		this.epgen_title = epgen_title;
	}
	public Integer getepgen_threadid() {
		return epgen_threadid;
	}

	public void setepgen_threadid(Integer epgen_threadid) {
		this.epgen_threadid = epgen_threadid;
	}
	public String getepgen_polltimetolive() {
		return epgen_polltimetolive;
	}

	public void setepgen_polltimetolive(String epgen_polltimetolive) {
		this.epgen_polltimetolive = epgen_polltimetolive;
	}

}
