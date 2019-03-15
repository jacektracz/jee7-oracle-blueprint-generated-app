
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
@Table(name = "joo2_virtuemart_rating_reviews", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_rating_reviews implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_rating_review_id")
    private Integer epgen_virtuemart_rating_review_id;
    @Column(name="virtuemart_product_id")
    private Integer epgen_virtuemart_product_id;
    @Column(name="comment")
    private String epgen_comment;
    @Column(name="review_ok")
    private Integer epgen_review_ok;
    @Column(name="review_rates")
    private Integer epgen_review_rates;
    @Column(name="review_ratingcount")
    private Integer epgen_review_ratingcount;
    @Column(name="lastip")
    private String epgen_lastip;
    @Column(name="published")
    private Integer epgen_published;
    
    @Column(name = "created_on", columnDefinition="VARCHAR")
    private String epgen_created_on;
    @Column(name="created_by")
    private Integer epgen_created_by;
    
    @Column(name = "modified_on", columnDefinition="VARCHAR")
    private String epgen_modified_on;
    @Column(name="modified_by")
    private Integer epgen_modified_by;
    
    @Column(name = "locked_on", columnDefinition="VARCHAR")
    private String epgen_locked_on;
    @Column(name="locked_by")
    private Integer epgen_locked_by;
	public Integer getepgen_virtuemart_rating_review_id() {
		return epgen_virtuemart_rating_review_id;
	}

	public void setepgen_virtuemart_rating_review_id(Integer epgen_virtuemart_rating_review_id) {
		this.epgen_virtuemart_rating_review_id = epgen_virtuemart_rating_review_id;
	}
	public Integer getepgen_virtuemart_product_id() {
		return epgen_virtuemart_product_id;
	}

	public void setepgen_virtuemart_product_id(Integer epgen_virtuemart_product_id) {
		this.epgen_virtuemart_product_id = epgen_virtuemart_product_id;
	}
	public String getepgen_comment() {
		return epgen_comment;
	}

	public void setepgen_comment(String epgen_comment) {
		this.epgen_comment = epgen_comment;
	}
	public Integer getepgen_review_ok() {
		return epgen_review_ok;
	}

	public void setepgen_review_ok(Integer epgen_review_ok) {
		this.epgen_review_ok = epgen_review_ok;
	}
	public Integer getepgen_review_rates() {
		return epgen_review_rates;
	}

	public void setepgen_review_rates(Integer epgen_review_rates) {
		this.epgen_review_rates = epgen_review_rates;
	}
	public Integer getepgen_review_ratingcount() {
		return epgen_review_ratingcount;
	}

	public void setepgen_review_ratingcount(Integer epgen_review_ratingcount) {
		this.epgen_review_ratingcount = epgen_review_ratingcount;
	}
	public String getepgen_lastip() {
		return epgen_lastip;
	}

	public void setepgen_lastip(String epgen_lastip) {
		this.epgen_lastip = epgen_lastip;
	}
	public Integer getepgen_published() {
		return epgen_published;
	}

	public void setepgen_published(Integer epgen_published) {
		this.epgen_published = epgen_published;
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
	public String getepgen_locked_on() {
		return epgen_locked_on;
	}

	public void setepgen_locked_on(String epgen_locked_on) {
		this.epgen_locked_on = epgen_locked_on;
	}
	public Integer getepgen_locked_by() {
		return epgen_locked_by;
	}

	public void setepgen_locked_by(Integer epgen_locked_by) {
		this.epgen_locked_by = epgen_locked_by;
	}

}
