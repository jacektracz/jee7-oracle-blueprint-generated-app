
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
@Table(name = "joo2_assets", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_assets implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="parent_id")
    private Integer epgen_parent_id;
    @Column(name="lft")
    private Integer epgen_lft;
    @Column(name="rgt")
    private Integer epgen_rgt;
    @Column(name="level")
    private Integer epgen_level;
    @Column(name="name")
    private String epgen_name;
    @Column(name="title")
    private String epgen_title;
    @Column(name="rules")
    private String epgen_rules;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public Integer getepgen_parent_id() {
		return epgen_parent_id;
	}

	public void setepgen_parent_id(Integer epgen_parent_id) {
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
	public Integer getepgen_level() {
		return epgen_level;
	}

	public void setepgen_level(Integer epgen_level) {
		this.epgen_level = epgen_level;
	}
	public String getepgen_name() {
		return epgen_name;
	}

	public void setepgen_name(String epgen_name) {
		this.epgen_name = epgen_name;
	}
	public String getepgen_title() {
		return epgen_title;
	}

	public void setepgen_title(String epgen_title) {
		this.epgen_title = epgen_title;
	}
	public String getepgen_rules() {
		return epgen_rules;
	}

	public void setepgen_rules(String epgen_rules) {
		this.epgen_rules = epgen_rules;
	}

}
