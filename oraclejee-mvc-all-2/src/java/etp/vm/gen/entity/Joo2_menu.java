
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
@Table(name = "joo2_menu", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_menu implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="menutype")
    private String epgen_menutype;
    @Column(name="title")
    private String epgen_title;
    @Column(name="alias")
    private String epgen_alias;
    @Column(name="note")
    private String epgen_note;
    @Column(name="path")
    private String epgen_path;
    @Column(name="link")
    private String epgen_link;
    @Column(name="type")
    private String epgen_type;
    @Column(name="published")
    private Integer epgen_published;
    @Column(name="parent_id")
    private Integer epgen_parent_id;
    @Column(name="level")
    private Integer epgen_level;
    @Column(name="component_id")
    private Integer epgen_component_id;
    @Column(name="ordering")
    private Integer epgen_ordering;
    @Column(name="checked_out")
    private Integer epgen_checked_out;
    @Column(name="browserNav")
    private Integer epgen_browserNav;
    @Column(name="access")
    private Integer epgen_access;
    @Column(name="img")
    private String epgen_img;
    @Column(name="template_style_id")
    private Integer epgen_template_style_id;
    @Column(name="params")
    private String epgen_params;
    @Column(name="lft")
    private Integer epgen_lft;
    @Column(name="rgt")
    private Integer epgen_rgt;
    @Column(name="home")
    private Integer epgen_home;
    @Column(name="language")
    private String epgen_language;
    @Column(name="client_id")
    private Integer epgen_client_id;
    @Column(name="ep_catid")
    private Integer epgen_ep_catid;
    @Column(name="ep_copy_from")
    private Integer epgen_ep_copy_from;
    @Column(name="ep_refresh")
    private String epgen_ep_refresh;
    @Column(name="ep_ordering")
    private Integer epgen_ep_ordering;
    @Column(name="ept_lft")
    private String epgen_ept_lft;
    @Column(name="ept_rgt")
    private String epgen_ept_rgt;
    @Column(name="ept_count")
    private String epgen_ept_count;
    @Column(name="ep_rgt")
    private String epgen_ep_rgt;
    @Column(name="ep_count")
    private String epgen_ep_count;
    @Column(name="ep_lft")
    private Integer epgen_ep_lft;
    @Column(name="ep_lft_bck")
    private Integer epgen_ep_lft_bck;
    @Column(name="ep_rgt_bck")
    private Integer epgen_ep_rgt_bck;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public String getepgen_menutype() {
		return epgen_menutype;
	}

	public void setepgen_menutype(String epgen_menutype) {
		this.epgen_menutype = epgen_menutype;
	}
	public String getepgen_title() {
		return epgen_title;
	}

	public void setepgen_title(String epgen_title) {
		this.epgen_title = epgen_title;
	}
	public String getepgen_alias() {
		return epgen_alias;
	}

	public void setepgen_alias(String epgen_alias) {
		this.epgen_alias = epgen_alias;
	}
	public String getepgen_note() {
		return epgen_note;
	}

	public void setepgen_note(String epgen_note) {
		this.epgen_note = epgen_note;
	}
	public String getepgen_path() {
		return epgen_path;
	}

	public void setepgen_path(String epgen_path) {
		this.epgen_path = epgen_path;
	}
	public String getepgen_link() {
		return epgen_link;
	}

	public void setepgen_link(String epgen_link) {
		this.epgen_link = epgen_link;
	}
	public String getepgen_type() {
		return epgen_type;
	}

	public void setepgen_type(String epgen_type) {
		this.epgen_type = epgen_type;
	}
	public Integer getepgen_published() {
		return epgen_published;
	}

	public void setepgen_published(Integer epgen_published) {
		this.epgen_published = epgen_published;
	}
	public Integer getepgen_parent_id() {
		return epgen_parent_id;
	}

	public void setepgen_parent_id(Integer epgen_parent_id) {
		this.epgen_parent_id = epgen_parent_id;
	}
	public Integer getepgen_level() {
		return epgen_level;
	}

	public void setepgen_level(Integer epgen_level) {
		this.epgen_level = epgen_level;
	}
	public Integer getepgen_component_id() {
		return epgen_component_id;
	}

	public void setepgen_component_id(Integer epgen_component_id) {
		this.epgen_component_id = epgen_component_id;
	}
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
	}
	public Integer getepgen_checked_out() {
		return epgen_checked_out;
	}

	public void setepgen_checked_out(Integer epgen_checked_out) {
		this.epgen_checked_out = epgen_checked_out;
	}
	public Integer getepgen_browserNav() {
		return epgen_browserNav;
	}

	public void setepgen_browserNav(Integer epgen_browserNav) {
		this.epgen_browserNav = epgen_browserNav;
	}
	public Integer getepgen_access() {
		return epgen_access;
	}

	public void setepgen_access(Integer epgen_access) {
		this.epgen_access = epgen_access;
	}
	public String getepgen_img() {
		return epgen_img;
	}

	public void setepgen_img(String epgen_img) {
		this.epgen_img = epgen_img;
	}
	public Integer getepgen_template_style_id() {
		return epgen_template_style_id;
	}

	public void setepgen_template_style_id(Integer epgen_template_style_id) {
		this.epgen_template_style_id = epgen_template_style_id;
	}
	public String getepgen_params() {
		return epgen_params;
	}

	public void setepgen_params(String epgen_params) {
		this.epgen_params = epgen_params;
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
	public Integer getepgen_home() {
		return epgen_home;
	}

	public void setepgen_home(Integer epgen_home) {
		this.epgen_home = epgen_home;
	}
	public String getepgen_language() {
		return epgen_language;
	}

	public void setepgen_language(String epgen_language) {
		this.epgen_language = epgen_language;
	}
	public Integer getepgen_client_id() {
		return epgen_client_id;
	}

	public void setepgen_client_id(Integer epgen_client_id) {
		this.epgen_client_id = epgen_client_id;
	}
	public Integer getepgen_ep_catid() {
		return epgen_ep_catid;
	}

	public void setepgen_ep_catid(Integer epgen_ep_catid) {
		this.epgen_ep_catid = epgen_ep_catid;
	}
	public Integer getepgen_ep_copy_from() {
		return epgen_ep_copy_from;
	}

	public void setepgen_ep_copy_from(Integer epgen_ep_copy_from) {
		this.epgen_ep_copy_from = epgen_ep_copy_from;
	}
	public String getepgen_ep_refresh() {
		return epgen_ep_refresh;
	}

	public void setepgen_ep_refresh(String epgen_ep_refresh) {
		this.epgen_ep_refresh = epgen_ep_refresh;
	}
	public Integer getepgen_ep_ordering() {
		return epgen_ep_ordering;
	}

	public void setepgen_ep_ordering(Integer epgen_ep_ordering) {
		this.epgen_ep_ordering = epgen_ep_ordering;
	}
	public String getepgen_ept_lft() {
		return epgen_ept_lft;
	}

	public void setepgen_ept_lft(String epgen_ept_lft) {
		this.epgen_ept_lft = epgen_ept_lft;
	}
	public String getepgen_ept_rgt() {
		return epgen_ept_rgt;
	}

	public void setepgen_ept_rgt(String epgen_ept_rgt) {
		this.epgen_ept_rgt = epgen_ept_rgt;
	}
	public String getepgen_ept_count() {
		return epgen_ept_count;
	}

	public void setepgen_ept_count(String epgen_ept_count) {
		this.epgen_ept_count = epgen_ept_count;
	}
	public String getepgen_ep_rgt() {
		return epgen_ep_rgt;
	}

	public void setepgen_ep_rgt(String epgen_ep_rgt) {
		this.epgen_ep_rgt = epgen_ep_rgt;
	}
	public String getepgen_ep_count() {
		return epgen_ep_count;
	}

	public void setepgen_ep_count(String epgen_ep_count) {
		this.epgen_ep_count = epgen_ep_count;
	}
	public Integer getepgen_ep_lft() {
		return epgen_ep_lft;
	}

	public void setepgen_ep_lft(Integer epgen_ep_lft) {
		this.epgen_ep_lft = epgen_ep_lft;
	}
	public Integer getepgen_ep_lft_bck() {
		return epgen_ep_lft_bck;
	}

	public void setepgen_ep_lft_bck(Integer epgen_ep_lft_bck) {
		this.epgen_ep_lft_bck = epgen_ep_lft_bck;
	}
	public Integer getepgen_ep_rgt_bck() {
		return epgen_ep_rgt_bck;
	}

	public void setepgen_ep_rgt_bck(Integer epgen_ep_rgt_bck) {
		this.epgen_ep_rgt_bck = epgen_ep_rgt_bck;
	}

}
