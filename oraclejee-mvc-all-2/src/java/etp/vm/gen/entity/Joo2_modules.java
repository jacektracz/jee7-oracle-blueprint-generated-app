
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
@Table(name = "joo2_modules", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_modules implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="title")
    private String epgen_title;
    @Column(name="note")
    private String epgen_note;
    @Column(name="content")
    private String epgen_content;
    @Column(name="ordering")
    private Integer epgen_ordering;
    @Column(name="position")
    private String epgen_position;
    @Column(name="checked_out")
    private Integer epgen_checked_out;
    
    @Column(name = "checked_out_time", columnDefinition="VARCHAR")
    private String epgen_checked_out_time;
    
    @Column(name = "publish_up", columnDefinition="VARCHAR")
    private String epgen_publish_up;
    
    @Column(name = "publish_down", columnDefinition="VARCHAR")
    private String epgen_publish_down;
    @Column(name="published")
    private Integer epgen_published;
    @Column(name="module")
    private String epgen_module;
    @Column(name="access")
    private Integer epgen_access;
    @Column(name="showtitle")
    private Integer epgen_showtitle;
    @Column(name="params")
    private String epgen_params;
    @Column(name="client_id")
    private Integer epgen_client_id;
    @Column(name="language")
    private String epgen_language;
    @Column(name="ep_root_cat_id")
    private Integer epgen_ep_root_cat_id;
    @Column(name="ep_root_menu_id")
    private Integer epgen_ep_root_menu_id;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public String getepgen_title() {
		return epgen_title;
	}

	public void setepgen_title(String epgen_title) {
		this.epgen_title = epgen_title;
	}
	public String getepgen_note() {
		return epgen_note;
	}

	public void setepgen_note(String epgen_note) {
		this.epgen_note = epgen_note;
	}
	public String getepgen_content() {
		return epgen_content;
	}

	public void setepgen_content(String epgen_content) {
		this.epgen_content = epgen_content;
	}
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
	}
	public String getepgen_position() {
		return epgen_position;
	}

	public void setepgen_position(String epgen_position) {
		this.epgen_position = epgen_position;
	}
	public Integer getepgen_checked_out() {
		return epgen_checked_out;
	}

	public void setepgen_checked_out(Integer epgen_checked_out) {
		this.epgen_checked_out = epgen_checked_out;
	}
	public String getepgen_checked_out_time() {
		return epgen_checked_out_time;
	}

	public void setepgen_checked_out_time(String epgen_checked_out_time) {
		this.epgen_checked_out_time = epgen_checked_out_time;
	}
	public String getepgen_publish_up() {
		return epgen_publish_up;
	}

	public void setepgen_publish_up(String epgen_publish_up) {
		this.epgen_publish_up = epgen_publish_up;
	}
	public String getepgen_publish_down() {
		return epgen_publish_down;
	}

	public void setepgen_publish_down(String epgen_publish_down) {
		this.epgen_publish_down = epgen_publish_down;
	}
	public Integer getepgen_published() {
		return epgen_published;
	}

	public void setepgen_published(Integer epgen_published) {
		this.epgen_published = epgen_published;
	}
	public String getepgen_module() {
		return epgen_module;
	}

	public void setepgen_module(String epgen_module) {
		this.epgen_module = epgen_module;
	}
	public Integer getepgen_access() {
		return epgen_access;
	}

	public void setepgen_access(Integer epgen_access) {
		this.epgen_access = epgen_access;
	}
	public Integer getepgen_showtitle() {
		return epgen_showtitle;
	}

	public void setepgen_showtitle(Integer epgen_showtitle) {
		this.epgen_showtitle = epgen_showtitle;
	}
	public String getepgen_params() {
		return epgen_params;
	}

	public void setepgen_params(String epgen_params) {
		this.epgen_params = epgen_params;
	}
	public Integer getepgen_client_id() {
		return epgen_client_id;
	}

	public void setepgen_client_id(Integer epgen_client_id) {
		this.epgen_client_id = epgen_client_id;
	}
	public String getepgen_language() {
		return epgen_language;
	}

	public void setepgen_language(String epgen_language) {
		this.epgen_language = epgen_language;
	}
	public Integer getepgen_ep_root_cat_id() {
		return epgen_ep_root_cat_id;
	}

	public void setepgen_ep_root_cat_id(Integer epgen_ep_root_cat_id) {
		this.epgen_ep_root_cat_id = epgen_ep_root_cat_id;
	}
	public Integer getepgen_ep_root_menu_id() {
		return epgen_ep_root_menu_id;
	}

	public void setepgen_ep_root_menu_id(Integer epgen_ep_root_menu_id) {
		this.epgen_ep_root_menu_id = epgen_ep_root_menu_id;
	}

}
