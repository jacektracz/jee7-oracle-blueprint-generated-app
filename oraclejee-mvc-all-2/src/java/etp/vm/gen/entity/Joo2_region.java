
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
@Table(name = "joo2_region", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_region implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="m_region_id")
    private Integer epgen_m_region_id;
    @Column(name="m_parent_id")
    private Integer epgen_m_parent_id;
    @Column(name="m_layer_id")
    private Integer epgen_m_layer_id;
    @Column(name="m_short_name")
    private String epgen_m_short_name;
    @Column(name="m_title")
    private String epgen_m_title;
    @Column(name="m_collapsible")
    private String epgen_m_collapsible;
    @Column(name="m_open_content")
    private String epgen_m_open_content;
    @Column(name="m_region_type")
    private String epgen_m_region_type;
    @Column(name="m_region_position")
    private String epgen_m_region_position;
    @Column(name="m_region_ordering")
    private Integer epgen_m_region_ordering;
    @Column(name="m_region_name")
    private String epgen_m_region_name;
    @Column(name="m_region_title")
    private String epgen_m_region_title;
    @Column(name="region_display")
    private Integer epgen_region_display;
    @Column(name="m_region_display")
    private Integer epgen_m_region_display;
	public Integer getepgen_m_region_id() {
		return epgen_m_region_id;
	}

	public void setepgen_m_region_id(Integer epgen_m_region_id) {
		this.epgen_m_region_id = epgen_m_region_id;
	}
	public Integer getepgen_m_parent_id() {
		return epgen_m_parent_id;
	}

	public void setepgen_m_parent_id(Integer epgen_m_parent_id) {
		this.epgen_m_parent_id = epgen_m_parent_id;
	}
	public Integer getepgen_m_layer_id() {
		return epgen_m_layer_id;
	}

	public void setepgen_m_layer_id(Integer epgen_m_layer_id) {
		this.epgen_m_layer_id = epgen_m_layer_id;
	}
	public String getepgen_m_short_name() {
		return epgen_m_short_name;
	}

	public void setepgen_m_short_name(String epgen_m_short_name) {
		this.epgen_m_short_name = epgen_m_short_name;
	}
	public String getepgen_m_title() {
		return epgen_m_title;
	}

	public void setepgen_m_title(String epgen_m_title) {
		this.epgen_m_title = epgen_m_title;
	}
	public String getepgen_m_collapsible() {
		return epgen_m_collapsible;
	}

	public void setepgen_m_collapsible(String epgen_m_collapsible) {
		this.epgen_m_collapsible = epgen_m_collapsible;
	}
	public String getepgen_m_open_content() {
		return epgen_m_open_content;
	}

	public void setepgen_m_open_content(String epgen_m_open_content) {
		this.epgen_m_open_content = epgen_m_open_content;
	}
	public String getepgen_m_region_type() {
		return epgen_m_region_type;
	}

	public void setepgen_m_region_type(String epgen_m_region_type) {
		this.epgen_m_region_type = epgen_m_region_type;
	}
	public String getepgen_m_region_position() {
		return epgen_m_region_position;
	}

	public void setepgen_m_region_position(String epgen_m_region_position) {
		this.epgen_m_region_position = epgen_m_region_position;
	}
	public Integer getepgen_m_region_ordering() {
		return epgen_m_region_ordering;
	}

	public void setepgen_m_region_ordering(Integer epgen_m_region_ordering) {
		this.epgen_m_region_ordering = epgen_m_region_ordering;
	}
	public String getepgen_m_region_name() {
		return epgen_m_region_name;
	}

	public void setepgen_m_region_name(String epgen_m_region_name) {
		this.epgen_m_region_name = epgen_m_region_name;
	}
	public String getepgen_m_region_title() {
		return epgen_m_region_title;
	}

	public void setepgen_m_region_title(String epgen_m_region_title) {
		this.epgen_m_region_title = epgen_m_region_title;
	}
	public Integer getepgen_region_display() {
		return epgen_region_display;
	}

	public void setepgen_region_display(Integer epgen_region_display) {
		this.epgen_region_display = epgen_region_display;
	}
	public Integer getepgen_m_region_display() {
		return epgen_m_region_display;
	}

	public void setepgen_m_region_display(Integer epgen_m_region_display) {
		this.epgen_m_region_display = epgen_m_region_display;
	}

}
