
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
@Table(name = "joo2_k2_rating", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_k2_rating implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="itemID")
    private Integer epgen_itemID;
    @Column(name="rating_sum")
    private Integer epgen_rating_sum;
    @Column(name="rating_count")
    private Integer epgen_rating_count;
    @Column(name="lastip")
    private String epgen_lastip;
	public Integer getepgen_itemID() {
		return epgen_itemID;
	}

	public void setepgen_itemID(Integer epgen_itemID) {
		this.epgen_itemID = epgen_itemID;
	}
	public Integer getepgen_rating_sum() {
		return epgen_rating_sum;
	}

	public void setepgen_rating_sum(Integer epgen_rating_sum) {
		this.epgen_rating_sum = epgen_rating_sum;
	}
	public Integer getepgen_rating_count() {
		return epgen_rating_count;
	}

	public void setepgen_rating_count(Integer epgen_rating_count) {
		this.epgen_rating_count = epgen_rating_count;
	}
	public String getepgen_lastip() {
		return epgen_lastip;
	}

	public void setepgen_lastip(String epgen_lastip) {
		this.epgen_lastip = epgen_lastip;
	}

}
