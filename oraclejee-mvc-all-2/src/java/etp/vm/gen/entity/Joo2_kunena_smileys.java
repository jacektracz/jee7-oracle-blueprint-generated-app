
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
@Table(name = "joo2_kunena_smileys", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_kunena_smileys implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="code")
    private String epgen_code;
    @Column(name="location")
    private String epgen_location;
    @Column(name="greylocation")
    private String epgen_greylocation;
    @Column(name="emoticonbar")
    private Integer epgen_emoticonbar;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public String getepgen_code() {
		return epgen_code;
	}

	public void setepgen_code(String epgen_code) {
		this.epgen_code = epgen_code;
	}
	public String getepgen_location() {
		return epgen_location;
	}

	public void setepgen_location(String epgen_location) {
		this.epgen_location = epgen_location;
	}
	public String getepgen_greylocation() {
		return epgen_greylocation;
	}

	public void setepgen_greylocation(String epgen_greylocation) {
		this.epgen_greylocation = epgen_greylocation;
	}
	public Integer getepgen_emoticonbar() {
		return epgen_emoticonbar;
	}

	public void setepgen_emoticonbar(Integer epgen_emoticonbar) {
		this.epgen_emoticonbar = epgen_emoticonbar;
	}

}
