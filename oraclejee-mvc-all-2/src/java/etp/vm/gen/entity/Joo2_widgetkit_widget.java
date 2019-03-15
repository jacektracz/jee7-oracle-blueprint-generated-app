
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
@Table(name = "joo2_widgetkit_widget", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_widgetkit_widget implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="type")
    private String epgen_type;
    @Column(name="style")
    private String epgen_style;
    @Column(name="name")
    private String epgen_name;
    @Column(name="content")
    private String epgen_content;
    
    @Column(name = "created", columnDefinition="VARCHAR")
    private String epgen_created;
    
    @Column(name = "modified", columnDefinition="VARCHAR")
    private String epgen_modified;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public String getepgen_type() {
		return epgen_type;
	}

	public void setepgen_type(String epgen_type) {
		this.epgen_type = epgen_type;
	}
	public String getepgen_style() {
		return epgen_style;
	}

	public void setepgen_style(String epgen_style) {
		this.epgen_style = epgen_style;
	}
	public String getepgen_name() {
		return epgen_name;
	}

	public void setepgen_name(String epgen_name) {
		this.epgen_name = epgen_name;
	}
	public String getepgen_content() {
		return epgen_content;
	}

	public void setepgen_content(String epgen_content) {
		this.epgen_content = epgen_content;
	}
	public String getepgen_created() {
		return epgen_created;
	}

	public void setepgen_created(String epgen_created) {
		this.epgen_created = epgen_created;
	}
	public String getepgen_modified() {
		return epgen_modified;
	}

	public void setepgen_modified(String epgen_modified) {
		this.epgen_modified = epgen_modified;
	}

}
