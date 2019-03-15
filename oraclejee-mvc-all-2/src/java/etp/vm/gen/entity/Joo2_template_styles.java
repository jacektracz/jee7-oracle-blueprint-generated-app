
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
@Table(name = "joo2_template_styles", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_template_styles implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="template")
    private String epgen_template;
    @Column(name="client_id")
    private Integer epgen_client_id;
    @Column(name="home")
    private String epgen_home;
    @Column(name="title")
    private String epgen_title;
    @Column(name="params")
    private String epgen_params;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public String getepgen_template() {
		return epgen_template;
	}

	public void setepgen_template(String epgen_template) {
		this.epgen_template = epgen_template;
	}
	public Integer getepgen_client_id() {
		return epgen_client_id;
	}

	public void setepgen_client_id(Integer epgen_client_id) {
		this.epgen_client_id = epgen_client_id;
	}
	public String getepgen_home() {
		return epgen_home;
	}

	public void setepgen_home(String epgen_home) {
		this.epgen_home = epgen_home;
	}
	public String getepgen_title() {
		return epgen_title;
	}

	public void setepgen_title(String epgen_title) {
		this.epgen_title = epgen_title;
	}
	public String getepgen_params() {
		return epgen_params;
	}

	public void setepgen_params(String epgen_params) {
		this.epgen_params = epgen_params;
	}

}
