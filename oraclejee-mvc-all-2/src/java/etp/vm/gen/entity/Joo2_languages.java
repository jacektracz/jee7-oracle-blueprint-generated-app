
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
@Table(name = "joo2_languages", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_languages implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="lang_id")
    private Integer epgen_lang_id;
    @Column(name="lang_code")
    private String epgen_lang_code;
    @Column(name="title")
    private String epgen_title;
    @Column(name="title_native")
    private String epgen_title_native;
    @Column(name="sef")
    private String epgen_sef;
    @Column(name="image")
    private String epgen_image;
    @Column(name="description")
    private String epgen_description;
    @Column(name="metakey")
    private String epgen_metakey;
    @Column(name="metadesc")
    private String epgen_metadesc;
    @Column(name="sitename")
    private String epgen_sitename;
    @Column(name="published")
    private Integer epgen_published;
    @Column(name="ordering")
    private Integer epgen_ordering;
	public Integer getepgen_lang_id() {
		return epgen_lang_id;
	}

	public void setepgen_lang_id(Integer epgen_lang_id) {
		this.epgen_lang_id = epgen_lang_id;
	}
	public String getepgen_lang_code() {
		return epgen_lang_code;
	}

	public void setepgen_lang_code(String epgen_lang_code) {
		this.epgen_lang_code = epgen_lang_code;
	}
	public String getepgen_title() {
		return epgen_title;
	}

	public void setepgen_title(String epgen_title) {
		this.epgen_title = epgen_title;
	}
	public String getepgen_title_native() {
		return epgen_title_native;
	}

	public void setepgen_title_native(String epgen_title_native) {
		this.epgen_title_native = epgen_title_native;
	}
	public String getepgen_sef() {
		return epgen_sef;
	}

	public void setepgen_sef(String epgen_sef) {
		this.epgen_sef = epgen_sef;
	}
	public String getepgen_image() {
		return epgen_image;
	}

	public void setepgen_image(String epgen_image) {
		this.epgen_image = epgen_image;
	}
	public String getepgen_description() {
		return epgen_description;
	}

	public void setepgen_description(String epgen_description) {
		this.epgen_description = epgen_description;
	}
	public String getepgen_metakey() {
		return epgen_metakey;
	}

	public void setepgen_metakey(String epgen_metakey) {
		this.epgen_metakey = epgen_metakey;
	}
	public String getepgen_metadesc() {
		return epgen_metadesc;
	}

	public void setepgen_metadesc(String epgen_metadesc) {
		this.epgen_metadesc = epgen_metadesc;
	}
	public String getepgen_sitename() {
		return epgen_sitename;
	}

	public void setepgen_sitename(String epgen_sitename) {
		this.epgen_sitename = epgen_sitename;
	}
	public Integer getepgen_published() {
		return epgen_published;
	}

	public void setepgen_published(Integer epgen_published) {
		this.epgen_published = epgen_published;
	}
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
	}

}
