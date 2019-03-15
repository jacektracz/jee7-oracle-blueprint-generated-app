
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
@Table(name = "joo2_virtuemart_adminmenuentries", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_adminmenuentries implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="module_id")
    private Integer epgen_module_id;
    @Column(name="parent_id")
    private Integer epgen_parent_id;
    @Column(name="name")
    private String epgen_name;
    @Column(name="link")
    private String epgen_link;
    @Column(name="depends")
    private String epgen_depends;
    @Column(name="icon_class")
    private String epgen_icon_class;
    @Column(name="ordering")
    private Integer epgen_ordering;
    @Column(name="published")
    private Integer epgen_published;
    @Column(name="tooltip")
    private String epgen_tooltip;
    @Column(name="view")
    private String epgen_view;
    @Column(name="task")
    private String epgen_task;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public Integer getepgen_module_id() {
		return epgen_module_id;
	}

	public void setepgen_module_id(Integer epgen_module_id) {
		this.epgen_module_id = epgen_module_id;
	}
	public Integer getepgen_parent_id() {
		return epgen_parent_id;
	}

	public void setepgen_parent_id(Integer epgen_parent_id) {
		this.epgen_parent_id = epgen_parent_id;
	}
	public String getepgen_name() {
		return epgen_name;
	}

	public void setepgen_name(String epgen_name) {
		this.epgen_name = epgen_name;
	}
	public String getepgen_link() {
		return epgen_link;
	}

	public void setepgen_link(String epgen_link) {
		this.epgen_link = epgen_link;
	}
	public String getepgen_depends() {
		return epgen_depends;
	}

	public void setepgen_depends(String epgen_depends) {
		this.epgen_depends = epgen_depends;
	}
	public String getepgen_icon_class() {
		return epgen_icon_class;
	}

	public void setepgen_icon_class(String epgen_icon_class) {
		this.epgen_icon_class = epgen_icon_class;
	}
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
	}
	public Integer getepgen_published() {
		return epgen_published;
	}

	public void setepgen_published(Integer epgen_published) {
		this.epgen_published = epgen_published;
	}
	public String getepgen_tooltip() {
		return epgen_tooltip;
	}

	public void setepgen_tooltip(String epgen_tooltip) {
		this.epgen_tooltip = epgen_tooltip;
	}
	public String getepgen_view() {
		return epgen_view;
	}

	public void setepgen_view(String epgen_view) {
		this.epgen_view = epgen_view;
	}
	public String getepgen_task() {
		return epgen_task;
	}

	public void setepgen_task(String epgen_task) {
		this.epgen_task = epgen_task;
	}

}
