
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
@Table(name = "joo2_utxc", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_utxc implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="m_uctxc_id")
    private Integer epgen_m_uctxc_id;
    @Column(name="m_uctxc_cookie")
    private String epgen_m_uctxc_cookie;
    @Column(name="m_uctxc_name")
    private String epgen_m_uctxc_name;
    @Column(name="m_uctxc_title")
    private String epgen_m_uctxc_title;
    @Column(name="m_uctxc_theme")
    private String epgen_m_uctxc_theme;
    @Column(name="m_uctxc_generic_data")
    private String epgen_m_uctxc_generic_data;
	public Integer getepgen_m_uctxc_id() {
		return epgen_m_uctxc_id;
	}

	public void setepgen_m_uctxc_id(Integer epgen_m_uctxc_id) {
		this.epgen_m_uctxc_id = epgen_m_uctxc_id;
	}
	public String getepgen_m_uctxc_cookie() {
		return epgen_m_uctxc_cookie;
	}

	public void setepgen_m_uctxc_cookie(String epgen_m_uctxc_cookie) {
		this.epgen_m_uctxc_cookie = epgen_m_uctxc_cookie;
	}
	public String getepgen_m_uctxc_name() {
		return epgen_m_uctxc_name;
	}

	public void setepgen_m_uctxc_name(String epgen_m_uctxc_name) {
		this.epgen_m_uctxc_name = epgen_m_uctxc_name;
	}
	public String getepgen_m_uctxc_title() {
		return epgen_m_uctxc_title;
	}

	public void setepgen_m_uctxc_title(String epgen_m_uctxc_title) {
		this.epgen_m_uctxc_title = epgen_m_uctxc_title;
	}
	public String getepgen_m_uctxc_theme() {
		return epgen_m_uctxc_theme;
	}

	public void setepgen_m_uctxc_theme(String epgen_m_uctxc_theme) {
		this.epgen_m_uctxc_theme = epgen_m_uctxc_theme;
	}
	public String getepgen_m_uctxc_generic_data() {
		return epgen_m_uctxc_generic_data;
	}

	public void setepgen_m_uctxc_generic_data(String epgen_m_uctxc_generic_data) {
		this.epgen_m_uctxc_generic_data = epgen_m_uctxc_generic_data;
	}

}
