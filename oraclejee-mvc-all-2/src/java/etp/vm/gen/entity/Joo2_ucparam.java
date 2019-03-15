
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
@Table(name = "joo2_ucparam", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_ucparam implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="m_ucparam_id")
    private Integer epgen_m_ucparam_id;
    @Column(name="m_uctxc_id")
    private Integer epgen_m_uctxc_id;
    @Column(name="m_ucparam_key")
    private String epgen_m_ucparam_key;
    @Column(name="m_ucparam_name")
    private String epgen_m_ucparam_name;
    @Column(name="m_ucparam_value")
    private String epgen_m_ucparam_value;
    @Column(name="m_ucparam_value_0")
    private String epgen_m_ucparam_value_0;
    @Column(name="m_ucparam_value_1")
    private String epgen_m_ucparam_value_1;
    @Column(name="m_ucparam_value_2")
    private String epgen_m_ucparam_value_2;
    @Column(name="m_ucparam_value_3")
    private String epgen_m_ucparam_value_3;
    @Column(name="m_ucparam_title")
    private String epgen_m_ucparam_title;
    @Column(name="m_ucparam_type")
    private String epgen_m_ucparam_type;
	public Integer getepgen_m_ucparam_id() {
		return epgen_m_ucparam_id;
	}

	public void setepgen_m_ucparam_id(Integer epgen_m_ucparam_id) {
		this.epgen_m_ucparam_id = epgen_m_ucparam_id;
	}
	public Integer getepgen_m_uctxc_id() {
		return epgen_m_uctxc_id;
	}

	public void setepgen_m_uctxc_id(Integer epgen_m_uctxc_id) {
		this.epgen_m_uctxc_id = epgen_m_uctxc_id;
	}
	public String getepgen_m_ucparam_key() {
		return epgen_m_ucparam_key;
	}

	public void setepgen_m_ucparam_key(String epgen_m_ucparam_key) {
		this.epgen_m_ucparam_key = epgen_m_ucparam_key;
	}
	public String getepgen_m_ucparam_name() {
		return epgen_m_ucparam_name;
	}

	public void setepgen_m_ucparam_name(String epgen_m_ucparam_name) {
		this.epgen_m_ucparam_name = epgen_m_ucparam_name;
	}
	public String getepgen_m_ucparam_value() {
		return epgen_m_ucparam_value;
	}

	public void setepgen_m_ucparam_value(String epgen_m_ucparam_value) {
		this.epgen_m_ucparam_value = epgen_m_ucparam_value;
	}
	public String getepgen_m_ucparam_value_0() {
		return epgen_m_ucparam_value_0;
	}

	public void setepgen_m_ucparam_value_0(String epgen_m_ucparam_value_0) {
		this.epgen_m_ucparam_value_0 = epgen_m_ucparam_value_0;
	}
	public String getepgen_m_ucparam_value_1() {
		return epgen_m_ucparam_value_1;
	}

	public void setepgen_m_ucparam_value_1(String epgen_m_ucparam_value_1) {
		this.epgen_m_ucparam_value_1 = epgen_m_ucparam_value_1;
	}
	public String getepgen_m_ucparam_value_2() {
		return epgen_m_ucparam_value_2;
	}

	public void setepgen_m_ucparam_value_2(String epgen_m_ucparam_value_2) {
		this.epgen_m_ucparam_value_2 = epgen_m_ucparam_value_2;
	}
	public String getepgen_m_ucparam_value_3() {
		return epgen_m_ucparam_value_3;
	}

	public void setepgen_m_ucparam_value_3(String epgen_m_ucparam_value_3) {
		this.epgen_m_ucparam_value_3 = epgen_m_ucparam_value_3;
	}
	public String getepgen_m_ucparam_title() {
		return epgen_m_ucparam_title;
	}

	public void setepgen_m_ucparam_title(String epgen_m_ucparam_title) {
		this.epgen_m_ucparam_title = epgen_m_ucparam_title;
	}
	public String getepgen_m_ucparam_type() {
		return epgen_m_ucparam_type;
	}

	public void setepgen_m_ucparam_type(String epgen_m_ucparam_type) {
		this.epgen_m_ucparam_type = epgen_m_ucparam_type;
	}

}
