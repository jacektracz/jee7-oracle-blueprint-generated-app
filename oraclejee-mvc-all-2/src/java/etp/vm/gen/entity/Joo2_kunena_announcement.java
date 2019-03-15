
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
@Table(name = "joo2_kunena_announcement", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_kunena_announcement implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="title")
    private String epgen_title;
    @Column(name="sdescription")
    private String epgen_sdescription;
    @Column(name="description")
    private String epgen_description;
    
    @Column(name = "created", columnDefinition="VARCHAR")
    private String epgen_created;
    @Column(name="published")
    private Integer epgen_published;
    @Column(name="ordering")
    private Integer epgen_ordering;
    @Column(name="showdate")
    private Integer epgen_showdate;
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
	public String getepgen_sdescription() {
		return epgen_sdescription;
	}

	public void setepgen_sdescription(String epgen_sdescription) {
		this.epgen_sdescription = epgen_sdescription;
	}
	public String getepgen_description() {
		return epgen_description;
	}

	public void setepgen_description(String epgen_description) {
		this.epgen_description = epgen_description;
	}
	public String getepgen_created() {
		return epgen_created;
	}

	public void setepgen_created(String epgen_created) {
		this.epgen_created = epgen_created;
	}
	public Integer getepgen_published() {
		return epgen_published;
	}

	public void setepgen_published(Integer epgen_published) {
		this.epgen_published = epgen_published;
	}
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
	}
	public Integer getepgen_showdate() {
		return epgen_showdate;
	}

	public void setepgen_showdate(Integer epgen_showdate) {
		this.epgen_showdate = epgen_showdate;
	}

}
