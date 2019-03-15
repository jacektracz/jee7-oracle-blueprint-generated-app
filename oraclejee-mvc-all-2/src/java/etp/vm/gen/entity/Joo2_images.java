
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
@Table(name = "joo2_images", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_images implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="ep_image_id")
    private Integer epgen_ep_image_id;
    @Column(name="ep_image_small_path")
    private String epgen_ep_image_small_path;
    @Column(name="ep_image_big_path")
    private String epgen_ep_image_big_path;
    @Column(name="ep_source_class")
    private String epgen_ep_source_class;
    @Column(name="ep_size_small")
    private Integer epgen_ep_size_small;
    @Column(name="ep_size_bigl")
    private Integer epgen_ep_size_bigl;
    @Column(name="ep_size_big")
    private Integer epgen_ep_size_big;
    @Column(name="ep_size_small_db")
    private Integer epgen_ep_size_small_db;
    @Column(name="ep_size_big_db")
    private Integer epgen_ep_size_big_db;
    @Column(name="ep_size_type")
    private String epgen_ep_size_type;
    @Column(name="ep_big_size_type")
    private String epgen_ep_big_size_type;
    @Column(name="ep_small_size_type")
    private String epgen_ep_small_size_type;
    @Column(name="ep_big_width")
    private Integer epgen_ep_big_width;
    @Column(name="ep_big_height")
    private Integer epgen_ep_big_height;
    @Column(name="ep_small_width")
    private Integer epgen_ep_small_width;
    @Column(name="ep_small_height")
    private Integer epgen_ep_small_height;
	public Integer getepgen_ep_image_id() {
		return epgen_ep_image_id;
	}

	public void setepgen_ep_image_id(Integer epgen_ep_image_id) {
		this.epgen_ep_image_id = epgen_ep_image_id;
	}
	public String getepgen_ep_image_small_path() {
		return epgen_ep_image_small_path;
	}

	public void setepgen_ep_image_small_path(String epgen_ep_image_small_path) {
		this.epgen_ep_image_small_path = epgen_ep_image_small_path;
	}
	public String getepgen_ep_image_big_path() {
		return epgen_ep_image_big_path;
	}

	public void setepgen_ep_image_big_path(String epgen_ep_image_big_path) {
		this.epgen_ep_image_big_path = epgen_ep_image_big_path;
	}
	public String getepgen_ep_source_class() {
		return epgen_ep_source_class;
	}

	public void setepgen_ep_source_class(String epgen_ep_source_class) {
		this.epgen_ep_source_class = epgen_ep_source_class;
	}
	public Integer getepgen_ep_size_small() {
		return epgen_ep_size_small;
	}

	public void setepgen_ep_size_small(Integer epgen_ep_size_small) {
		this.epgen_ep_size_small = epgen_ep_size_small;
	}
	public Integer getepgen_ep_size_bigl() {
		return epgen_ep_size_bigl;
	}

	public void setepgen_ep_size_bigl(Integer epgen_ep_size_bigl) {
		this.epgen_ep_size_bigl = epgen_ep_size_bigl;
	}
	public Integer getepgen_ep_size_big() {
		return epgen_ep_size_big;
	}

	public void setepgen_ep_size_big(Integer epgen_ep_size_big) {
		this.epgen_ep_size_big = epgen_ep_size_big;
	}
	public Integer getepgen_ep_size_small_db() {
		return epgen_ep_size_small_db;
	}

	public void setepgen_ep_size_small_db(Integer epgen_ep_size_small_db) {
		this.epgen_ep_size_small_db = epgen_ep_size_small_db;
	}
	public Integer getepgen_ep_size_big_db() {
		return epgen_ep_size_big_db;
	}

	public void setepgen_ep_size_big_db(Integer epgen_ep_size_big_db) {
		this.epgen_ep_size_big_db = epgen_ep_size_big_db;
	}
	public String getepgen_ep_size_type() {
		return epgen_ep_size_type;
	}

	public void setepgen_ep_size_type(String epgen_ep_size_type) {
		this.epgen_ep_size_type = epgen_ep_size_type;
	}
	public String getepgen_ep_big_size_type() {
		return epgen_ep_big_size_type;
	}

	public void setepgen_ep_big_size_type(String epgen_ep_big_size_type) {
		this.epgen_ep_big_size_type = epgen_ep_big_size_type;
	}
	public String getepgen_ep_small_size_type() {
		return epgen_ep_small_size_type;
	}

	public void setepgen_ep_small_size_type(String epgen_ep_small_size_type) {
		this.epgen_ep_small_size_type = epgen_ep_small_size_type;
	}
	public Integer getepgen_ep_big_width() {
		return epgen_ep_big_width;
	}

	public void setepgen_ep_big_width(Integer epgen_ep_big_width) {
		this.epgen_ep_big_width = epgen_ep_big_width;
	}
	public Integer getepgen_ep_big_height() {
		return epgen_ep_big_height;
	}

	public void setepgen_ep_big_height(Integer epgen_ep_big_height) {
		this.epgen_ep_big_height = epgen_ep_big_height;
	}
	public Integer getepgen_ep_small_width() {
		return epgen_ep_small_width;
	}

	public void setepgen_ep_small_width(Integer epgen_ep_small_width) {
		this.epgen_ep_small_width = epgen_ep_small_width;
	}
	public Integer getepgen_ep_small_height() {
		return epgen_ep_small_height;
	}

	public void setepgen_ep_small_height(Integer epgen_ep_small_height) {
		this.epgen_ep_small_height = epgen_ep_small_height;
	}

}
