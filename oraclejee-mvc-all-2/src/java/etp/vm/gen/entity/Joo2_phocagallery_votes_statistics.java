
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
@Table(name = "joo2_phocagallery_votes_statistics", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_phocagallery_votes_statistics implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="catid")
    private Integer epgen_catid;
    @Column(name="count")
    private Integer epgen_count;
    @Column(name="language")
    private String epgen_language;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public Integer getepgen_catid() {
		return epgen_catid;
	}

	public void setepgen_catid(Integer epgen_catid) {
		this.epgen_catid = epgen_catid;
	}
	public Integer getepgen_count() {
		return epgen_count;
	}

	public void setepgen_count(Integer epgen_count) {
		this.epgen_count = epgen_count;
	}
	public String getepgen_language() {
		return epgen_language;
	}

	public void setepgen_language(String epgen_language) {
		this.epgen_language = epgen_language;
	}

}
