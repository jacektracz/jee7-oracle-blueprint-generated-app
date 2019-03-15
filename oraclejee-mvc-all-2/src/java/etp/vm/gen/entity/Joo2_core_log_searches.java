
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
@Table(name = "joo2_core_log_searches", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_core_log_searches implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="search_term")
    private String epgen_search_term;
    @Column(name="hits")
    private Integer epgen_hits;
	public String getepgen_search_term() {
		return epgen_search_term;
	}

	public void setepgen_search_term(String epgen_search_term) {
		this.epgen_search_term = epgen_search_term;
	}
	public Integer getepgen_hits() {
		return epgen_hits;
	}

	public void setepgen_hits(Integer epgen_hits) {
		this.epgen_hits = epgen_hits;
	}

}
