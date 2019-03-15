
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
@Table(name = "joo2_redirect_links", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_redirect_links implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="old_url")
    private String epgen_old_url;
    @Column(name="new_url")
    private String epgen_new_url;
    @Column(name="referer")
    private String epgen_referer;
    @Column(name="comment")
    private String epgen_comment;
    @Column(name="published")
    private Integer epgen_published;
    
    @Column(name = "created_date", columnDefinition="VARCHAR")
    private String epgen_created_date;
    
    @Column(name = "modified_date", columnDefinition="VARCHAR")
    private String epgen_modified_date;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public String getepgen_old_url() {
		return epgen_old_url;
	}

	public void setepgen_old_url(String epgen_old_url) {
		this.epgen_old_url = epgen_old_url;
	}
	public String getepgen_new_url() {
		return epgen_new_url;
	}

	public void setepgen_new_url(String epgen_new_url) {
		this.epgen_new_url = epgen_new_url;
	}
	public String getepgen_referer() {
		return epgen_referer;
	}

	public void setepgen_referer(String epgen_referer) {
		this.epgen_referer = epgen_referer;
	}
	public String getepgen_comment() {
		return epgen_comment;
	}

	public void setepgen_comment(String epgen_comment) {
		this.epgen_comment = epgen_comment;
	}
	public Integer getepgen_published() {
		return epgen_published;
	}

	public void setepgen_published(Integer epgen_published) {
		this.epgen_published = epgen_published;
	}
	public String getepgen_created_date() {
		return epgen_created_date;
	}

	public void setepgen_created_date(String epgen_created_date) {
		this.epgen_created_date = epgen_created_date;
	}
	public String getepgen_modified_date() {
		return epgen_modified_date;
	}

	public void setepgen_modified_date(String epgen_modified_date) {
		this.epgen_modified_date = epgen_modified_date;
	}

}
