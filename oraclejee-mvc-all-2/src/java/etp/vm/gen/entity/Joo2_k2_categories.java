
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
@Table(name = "joo2_k2_categories", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_k2_categories implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="name")
    private String epgen_name;
    @Column(name="alias")
    private String epgen_alias;
    @Column(name="description")
    private String epgen_description;
    @Column(name="parent")
    private Integer epgen_parent;
    @Column(name="extraFieldsGroup")
    private Integer epgen_extraFieldsGroup;
    @Column(name="published")
    private Integer epgen_published;
    @Column(name="access")
    private Integer epgen_access;
    @Column(name="ordering")
    private Integer epgen_ordering;
    @Column(name="image")
    private String epgen_image;
    @Column(name="params")
    private String epgen_params;
    @Column(name="trash")
    private Integer epgen_trash;
    @Column(name="plugins")
    private String epgen_plugins;
    @Column(name="language")
    private String epgen_language;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public String getepgen_name() {
		return epgen_name;
	}

	public void setepgen_name(String epgen_name) {
		this.epgen_name = epgen_name;
	}
	public String getepgen_alias() {
		return epgen_alias;
	}

	public void setepgen_alias(String epgen_alias) {
		this.epgen_alias = epgen_alias;
	}
	public String getepgen_description() {
		return epgen_description;
	}

	public void setepgen_description(String epgen_description) {
		this.epgen_description = epgen_description;
	}
	public Integer getepgen_parent() {
		return epgen_parent;
	}

	public void setepgen_parent(Integer epgen_parent) {
		this.epgen_parent = epgen_parent;
	}
	public Integer getepgen_extraFieldsGroup() {
		return epgen_extraFieldsGroup;
	}

	public void setepgen_extraFieldsGroup(Integer epgen_extraFieldsGroup) {
		this.epgen_extraFieldsGroup = epgen_extraFieldsGroup;
	}
	public Integer getepgen_published() {
		return epgen_published;
	}

	public void setepgen_published(Integer epgen_published) {
		this.epgen_published = epgen_published;
	}
	public Integer getepgen_access() {
		return epgen_access;
	}

	public void setepgen_access(Integer epgen_access) {
		this.epgen_access = epgen_access;
	}
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
	}
	public String getepgen_image() {
		return epgen_image;
	}

	public void setepgen_image(String epgen_image) {
		this.epgen_image = epgen_image;
	}
	public String getepgen_params() {
		return epgen_params;
	}

	public void setepgen_params(String epgen_params) {
		this.epgen_params = epgen_params;
	}
	public Integer getepgen_trash() {
		return epgen_trash;
	}

	public void setepgen_trash(Integer epgen_trash) {
		this.epgen_trash = epgen_trash;
	}
	public String getepgen_plugins() {
		return epgen_plugins;
	}

	public void setepgen_plugins(String epgen_plugins) {
		this.epgen_plugins = epgen_plugins;
	}
	public String getepgen_language() {
		return epgen_language;
	}

	public void setepgen_language(String epgen_language) {
		this.epgen_language = epgen_language;
	}

}
