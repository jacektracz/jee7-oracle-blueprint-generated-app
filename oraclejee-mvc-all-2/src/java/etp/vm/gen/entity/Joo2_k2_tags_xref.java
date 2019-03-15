
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
@Table(name = "joo2_k2_tags_xref", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_k2_tags_xref implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="tagID")
    private Integer epgen_tagID;
    @Column(name="itemID")
    private Integer epgen_itemID;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public Integer getepgen_tagID() {
		return epgen_tagID;
	}

	public void setepgen_tagID(Integer epgen_tagID) {
		this.epgen_tagID = epgen_tagID;
	}
	public Integer getepgen_itemID() {
		return epgen_itemID;
	}

	public void setepgen_itemID(Integer epgen_itemID) {
		this.epgen_itemID = epgen_itemID;
	}

}
