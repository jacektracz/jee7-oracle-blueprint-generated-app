
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
@Table(name = "joo2_kunena_ranks", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_kunena_ranks implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="rank_id")
    private double epgen_rank_id;
    @Column(name="rank_title")
    private String epgen_rank_title;
    @Column(name="rank_min")
    private double epgen_rank_min;
    @Column(name="rank_special")
    private Integer epgen_rank_special;
    @Column(name="rank_image")
    private String epgen_rank_image;
	public double getepgen_rank_id() {
		return epgen_rank_id;
	}

	public void setepgen_rank_id(double epgen_rank_id) {
		this.epgen_rank_id = epgen_rank_id;
	}
	public String getepgen_rank_title() {
		return epgen_rank_title;
	}

	public void setepgen_rank_title(String epgen_rank_title) {
		this.epgen_rank_title = epgen_rank_title;
	}
	public double getepgen_rank_min() {
		return epgen_rank_min;
	}

	public void setepgen_rank_min(double epgen_rank_min) {
		this.epgen_rank_min = epgen_rank_min;
	}
	public Integer getepgen_rank_special() {
		return epgen_rank_special;
	}

	public void setepgen_rank_special(Integer epgen_rank_special) {
		this.epgen_rank_special = epgen_rank_special;
	}
	public String getepgen_rank_image() {
		return epgen_rank_image;
	}

	public void setepgen_rank_image(String epgen_rank_image) {
		this.epgen_rank_image = epgen_rank_image;
	}

}
