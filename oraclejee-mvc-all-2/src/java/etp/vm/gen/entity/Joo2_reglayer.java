
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
@Table(name = "joo2_reglayer", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_reglayer implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="m_RegLayer_id")
    private Integer epgen_m_RegLayer_id;
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
    @Column(name="m_RegLayer_type")
    private String epgen_m_RegLayer_type;
    @Column(name="m_RegLayer_position")
    private String epgen_m_RegLayer_position;
    @Column(name="m_RegLayer_ordering")
    private Integer epgen_m_RegLayer_ordering;
    @Column(name="m_RegLayer_name")
    private String epgen_m_RegLayer_name;
    @Column(name="m_RegLayer_title")
    private String epgen_m_RegLayer_title;
    @Column(name="RegLayer_display")
    private Integer epgen_RegLayer_display;
    @Column(name="m_RegLayer_display")
    private Integer epgen_m_RegLayer_display;
    @Column(name="m_theme_team")
    private String epgen_m_theme_team;
    @Column(name="m_theme_ept")
    private String epgen_m_theme_ept;
    @Column(name="m_reglayer_themes_path")
    private String epgen_m_reglayer_themes_path;
    @Column(name="m_reglayer_theme_default")
    private String epgen_m_reglayer_theme_default;
    @Column(name="m_reglayer_theme_last")
    private String epgen_m_reglayer_theme_last;
    @Column(name="m_reglayer_lead_theme")
    private String epgen_m_reglayer_lead_theme;
    @Column(name="m_reglayer_three_tab_theme")
    private String epgen_m_reglayer_three_tab_theme;
	public Integer getepgen_m_RegLayer_id() {
		return epgen_m_RegLayer_id;
	}

	public void setepgen_m_RegLayer_id(Integer epgen_m_RegLayer_id) {
		this.epgen_m_RegLayer_id = epgen_m_RegLayer_id;
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
	public String getepgen_m_RegLayer_type() {
		return epgen_m_RegLayer_type;
	}

	public void setepgen_m_RegLayer_type(String epgen_m_RegLayer_type) {
		this.epgen_m_RegLayer_type = epgen_m_RegLayer_type;
	}
	public String getepgen_m_RegLayer_position() {
		return epgen_m_RegLayer_position;
	}

	public void setepgen_m_RegLayer_position(String epgen_m_RegLayer_position) {
		this.epgen_m_RegLayer_position = epgen_m_RegLayer_position;
	}
	public Integer getepgen_m_RegLayer_ordering() {
		return epgen_m_RegLayer_ordering;
	}

	public void setepgen_m_RegLayer_ordering(Integer epgen_m_RegLayer_ordering) {
		this.epgen_m_RegLayer_ordering = epgen_m_RegLayer_ordering;
	}
	public String getepgen_m_RegLayer_name() {
		return epgen_m_RegLayer_name;
	}

	public void setepgen_m_RegLayer_name(String epgen_m_RegLayer_name) {
		this.epgen_m_RegLayer_name = epgen_m_RegLayer_name;
	}
	public String getepgen_m_RegLayer_title() {
		return epgen_m_RegLayer_title;
	}

	public void setepgen_m_RegLayer_title(String epgen_m_RegLayer_title) {
		this.epgen_m_RegLayer_title = epgen_m_RegLayer_title;
	}
	public Integer getepgen_RegLayer_display() {
		return epgen_RegLayer_display;
	}

	public void setepgen_RegLayer_display(Integer epgen_RegLayer_display) {
		this.epgen_RegLayer_display = epgen_RegLayer_display;
	}
	public Integer getepgen_m_RegLayer_display() {
		return epgen_m_RegLayer_display;
	}

	public void setepgen_m_RegLayer_display(Integer epgen_m_RegLayer_display) {
		this.epgen_m_RegLayer_display = epgen_m_RegLayer_display;
	}
	public String getepgen_m_theme_team() {
		return epgen_m_theme_team;
	}

	public void setepgen_m_theme_team(String epgen_m_theme_team) {
		this.epgen_m_theme_team = epgen_m_theme_team;
	}
	public String getepgen_m_theme_ept() {
		return epgen_m_theme_ept;
	}

	public void setepgen_m_theme_ept(String epgen_m_theme_ept) {
		this.epgen_m_theme_ept = epgen_m_theme_ept;
	}
	public String getepgen_m_reglayer_themes_path() {
		return epgen_m_reglayer_themes_path;
	}

	public void setepgen_m_reglayer_themes_path(String epgen_m_reglayer_themes_path) {
		this.epgen_m_reglayer_themes_path = epgen_m_reglayer_themes_path;
	}
	public String getepgen_m_reglayer_theme_default() {
		return epgen_m_reglayer_theme_default;
	}

	public void setepgen_m_reglayer_theme_default(String epgen_m_reglayer_theme_default) {
		this.epgen_m_reglayer_theme_default = epgen_m_reglayer_theme_default;
	}
	public String getepgen_m_reglayer_theme_last() {
		return epgen_m_reglayer_theme_last;
	}

	public void setepgen_m_reglayer_theme_last(String epgen_m_reglayer_theme_last) {
		this.epgen_m_reglayer_theme_last = epgen_m_reglayer_theme_last;
	}
	public String getepgen_m_reglayer_lead_theme() {
		return epgen_m_reglayer_lead_theme;
	}

	public void setepgen_m_reglayer_lead_theme(String epgen_m_reglayer_lead_theme) {
		this.epgen_m_reglayer_lead_theme = epgen_m_reglayer_lead_theme;
	}
	public String getepgen_m_reglayer_three_tab_theme() {
		return epgen_m_reglayer_three_tab_theme;
	}

	public void setepgen_m_reglayer_three_tab_theme(String epgen_m_reglayer_three_tab_theme) {
		this.epgen_m_reglayer_three_tab_theme = epgen_m_reglayer_three_tab_theme;
	}

}
