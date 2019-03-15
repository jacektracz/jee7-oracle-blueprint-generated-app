
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
@Table(name = "joo2_jf_content", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_jf_content implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="language_id")
    private Integer epgen_language_id;
    @Column(name="reference_id")
    private Integer epgen_reference_id;
    @Column(name="reference_table")
    private String epgen_reference_table;
    @Column(name="reference_field")
    private String epgen_reference_field;
    @Column(name="value")
    private String epgen_value;
    @Column(name="original_value")
    private String epgen_original_value;
    @Column(name="original_text")
    private String epgen_original_text;
    
    @Column(name = "modified", columnDefinition="VARCHAR")
    private String epgen_modified;
    @Column(name="modified_by")
    private Integer epgen_modified_by;
    @Column(name="published")
    private Integer epgen_published;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public Integer getepgen_language_id() {
		return epgen_language_id;
	}

	public void setepgen_language_id(Integer epgen_language_id) {
		this.epgen_language_id = epgen_language_id;
	}
	public Integer getepgen_reference_id() {
		return epgen_reference_id;
	}

	public void setepgen_reference_id(Integer epgen_reference_id) {
		this.epgen_reference_id = epgen_reference_id;
	}
	public String getepgen_reference_table() {
		return epgen_reference_table;
	}

	public void setepgen_reference_table(String epgen_reference_table) {
		this.epgen_reference_table = epgen_reference_table;
	}
	public String getepgen_reference_field() {
		return epgen_reference_field;
	}

	public void setepgen_reference_field(String epgen_reference_field) {
		this.epgen_reference_field = epgen_reference_field;
	}
	public String getepgen_value() {
		return epgen_value;
	}

	public void setepgen_value(String epgen_value) {
		this.epgen_value = epgen_value;
	}
	public String getepgen_original_value() {
		return epgen_original_value;
	}

	public void setepgen_original_value(String epgen_original_value) {
		this.epgen_original_value = epgen_original_value;
	}
	public String getepgen_original_text() {
		return epgen_original_text;
	}

	public void setepgen_original_text(String epgen_original_text) {
		this.epgen_original_text = epgen_original_text;
	}
	public String getepgen_modified() {
		return epgen_modified;
	}

	public void setepgen_modified(String epgen_modified) {
		this.epgen_modified = epgen_modified;
	}
	public Integer getepgen_modified_by() {
		return epgen_modified_by;
	}

	public void setepgen_modified_by(Integer epgen_modified_by) {
		this.epgen_modified_by = epgen_modified_by;
	}
	public Integer getepgen_published() {
		return epgen_published;
	}

	public void setepgen_published(Integer epgen_published) {
		this.epgen_published = epgen_published;
	}

}
