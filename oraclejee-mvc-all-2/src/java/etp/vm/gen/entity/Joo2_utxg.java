
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
@Table(name = "joo2_utxg", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_utxg implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="m_uctxg_id")
    private Integer epgen_m_uctxg_id;
    @Column(name="m_uctx_id")
    private Integer epgen_m_uctx_id;
    @Column(name="m_uctxg_key")
    private String epgen_m_uctxg_key;
    @Column(name="m_uctxg_name")
    private String epgen_m_uctxg_name;
    @Column(name="m_uctxg_value")
    private String epgen_m_uctxg_value;
    @Column(name="m_uctxg_title")
    private String epgen_m_uctxg_title;
    @Column(name="m_uctxg_type")
    private String epgen_m_uctxg_type;
	public Integer getepgen_m_uctxg_id() {
		return epgen_m_uctxg_id;
	}

	public void setepgen_m_uctxg_id(Integer epgen_m_uctxg_id) {
		this.epgen_m_uctxg_id = epgen_m_uctxg_id;
	}
	public Integer getepgen_m_uctx_id() {
		return epgen_m_uctx_id;
	}

	public void setepgen_m_uctx_id(Integer epgen_m_uctx_id) {
		this.epgen_m_uctx_id = epgen_m_uctx_id;
	}
	public String getepgen_m_uctxg_key() {
		return epgen_m_uctxg_key;
	}

	public void setepgen_m_uctxg_key(String epgen_m_uctxg_key) {
		this.epgen_m_uctxg_key = epgen_m_uctxg_key;
	}
	public String getepgen_m_uctxg_name() {
		return epgen_m_uctxg_name;
	}

	public void setepgen_m_uctxg_name(String epgen_m_uctxg_name) {
		this.epgen_m_uctxg_name = epgen_m_uctxg_name;
	}
	public String getepgen_m_uctxg_value() {
		return epgen_m_uctxg_value;
	}

	public void setepgen_m_uctxg_value(String epgen_m_uctxg_value) {
		this.epgen_m_uctxg_value = epgen_m_uctxg_value;
	}
	public String getepgen_m_uctxg_title() {
		return epgen_m_uctxg_title;
	}

	public void setepgen_m_uctxg_title(String epgen_m_uctxg_title) {
		this.epgen_m_uctxg_title = epgen_m_uctxg_title;
	}
	public String getepgen_m_uctxg_type() {
		return epgen_m_uctxg_type;
	}

	public void setepgen_m_uctxg_type(String epgen_m_uctxg_type) {
		this.epgen_m_uctxg_type = epgen_m_uctxg_type;
	}

}
