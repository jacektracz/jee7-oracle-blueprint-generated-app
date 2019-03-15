
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
@Table(name = "joo2_phocagallery_tags_ref", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_phocagallery_tags_ref implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="imgid")
    private Integer epgen_imgid;
    @Column(name="tagid")
    private Integer epgen_tagid;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public Integer getepgen_imgid() {
		return epgen_imgid;
	}

	public void setepgen_imgid(Integer epgen_imgid) {
		this.epgen_imgid = epgen_imgid;
	}
	public Integer getepgen_tagid() {
		return epgen_tagid;
	}

	public void setepgen_tagid(Integer epgen_tagid) {
		this.epgen_tagid = epgen_tagid;
	}

}
