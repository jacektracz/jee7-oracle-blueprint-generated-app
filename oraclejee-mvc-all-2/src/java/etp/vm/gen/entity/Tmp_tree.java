
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
@Table(name = "tmp_tree", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Tmp_tree implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private String epgen_id;
    @Column(name="parent_id")
    private String epgen_parent_id;
    @Column(name="lft")
    private Integer epgen_lft;
    @Column(name="rgt")
    private Integer epgen_rgt;
	public String getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(String epgen_id) {
		this.epgen_id = epgen_id;
	}
	public String getepgen_parent_id() {
		return epgen_parent_id;
	}

	public void setepgen_parent_id(String epgen_parent_id) {
		this.epgen_parent_id = epgen_parent_id;
	}
	public Integer getepgen_lft() {
		return epgen_lft;
	}

	public void setepgen_lft(Integer epgen_lft) {
		this.epgen_lft = epgen_lft;
	}
	public Integer getepgen_rgt() {
		return epgen_rgt;
	}

	public void setepgen_rgt(Integer epgen_rgt) {
		this.epgen_rgt = epgen_rgt;
	}

}
