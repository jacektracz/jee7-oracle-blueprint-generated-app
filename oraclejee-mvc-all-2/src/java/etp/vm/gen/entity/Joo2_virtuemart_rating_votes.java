
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
@Table(name = "joo2_virtuemart_rating_votes", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_rating_votes implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_rating_vote_id")
    private Integer epgen_virtuemart_rating_vote_id;
    @Column(name="virtuemart_product_id")
    private Integer epgen_virtuemart_product_id;
    @Column(name="vote")
    private Integer epgen_vote;
    @Column(name="lastip")
    private String epgen_lastip;
    
    @Column(name = "created_on", columnDefinition="VARCHAR")
    private String epgen_created_on;
    @Column(name="created_by")
    private Integer epgen_created_by;
    
    @Column(name = "modified_on", columnDefinition="VARCHAR")
    private String epgen_modified_on;
    @Column(name="modified_by")
    private Integer epgen_modified_by;
	public Integer getepgen_virtuemart_rating_vote_id() {
		return epgen_virtuemart_rating_vote_id;
	}

	public void setepgen_virtuemart_rating_vote_id(Integer epgen_virtuemart_rating_vote_id) {
		this.epgen_virtuemart_rating_vote_id = epgen_virtuemart_rating_vote_id;
	}
	public Integer getepgen_virtuemart_product_id() {
		return epgen_virtuemart_product_id;
	}

	public void setepgen_virtuemart_product_id(Integer epgen_virtuemart_product_id) {
		this.epgen_virtuemart_product_id = epgen_virtuemart_product_id;
	}
	public Integer getepgen_vote() {
		return epgen_vote;
	}

	public void setepgen_vote(Integer epgen_vote) {
		this.epgen_vote = epgen_vote;
	}
	public String getepgen_lastip() {
		return epgen_lastip;
	}

	public void setepgen_lastip(String epgen_lastip) {
		this.epgen_lastip = epgen_lastip;
	}
	public String getepgen_created_on() {
		return epgen_created_on;
	}

	public void setepgen_created_on(String epgen_created_on) {
		this.epgen_created_on = epgen_created_on;
	}
	public Integer getepgen_created_by() {
		return epgen_created_by;
	}

	public void setepgen_created_by(Integer epgen_created_by) {
		this.epgen_created_by = epgen_created_by;
	}
	public String getepgen_modified_on() {
		return epgen_modified_on;
	}

	public void setepgen_modified_on(String epgen_modified_on) {
		this.epgen_modified_on = epgen_modified_on;
	}
	public Integer getepgen_modified_by() {
		return epgen_modified_by;
	}

	public void setepgen_modified_by(Integer epgen_modified_by) {
		this.epgen_modified_by = epgen_modified_by;
	}

}
