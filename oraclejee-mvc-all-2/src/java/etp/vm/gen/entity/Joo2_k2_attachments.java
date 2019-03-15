
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
@Table(name = "joo2_k2_attachments", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_k2_attachments implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="itemID")
    private Integer epgen_itemID;
    @Column(name="filename")
    private String epgen_filename;
    @Column(name="title")
    private String epgen_title;
    @Column(name="titleAttribute")
    private String epgen_titleAttribute;
    @Column(name="hits")
    private Integer epgen_hits;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public Integer getepgen_itemID() {
		return epgen_itemID;
	}

	public void setepgen_itemID(Integer epgen_itemID) {
		this.epgen_itemID = epgen_itemID;
	}
	public String getepgen_filename() {
		return epgen_filename;
	}

	public void setepgen_filename(String epgen_filename) {
		this.epgen_filename = epgen_filename;
	}
	public String getepgen_title() {
		return epgen_title;
	}

	public void setepgen_title(String epgen_title) {
		this.epgen_title = epgen_title;
	}
	public String getepgen_titleAttribute() {
		return epgen_titleAttribute;
	}

	public void setepgen_titleAttribute(String epgen_titleAttribute) {
		this.epgen_titleAttribute = epgen_titleAttribute;
	}
	public Integer getepgen_hits() {
		return epgen_hits;
	}

	public void setepgen_hits(Integer epgen_hits) {
		this.epgen_hits = epgen_hits;
	}

}
