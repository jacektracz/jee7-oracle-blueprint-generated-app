
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
@Table(name = "joo2_banner_tracks", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_banner_tracks implements Serializable 
{
    @Id
    @GeneratedValue
    
    @Column(name = "track_date", columnDefinition="VARCHAR")
    private String epgen_track_date;
    @Column(name="track_type")
    private Integer epgen_track_type;
    @Column(name="banner_id")
    private Integer epgen_banner_id;
    @Column(name="count")
    private Integer epgen_count;
	public String getepgen_track_date() {
		return epgen_track_date;
	}

	public void setepgen_track_date(String epgen_track_date) {
		this.epgen_track_date = epgen_track_date;
	}
	public Integer getepgen_track_type() {
		return epgen_track_type;
	}

	public void setepgen_track_type(Integer epgen_track_type) {
		this.epgen_track_type = epgen_track_type;
	}
	public Integer getepgen_banner_id() {
		return epgen_banner_id;
	}

	public void setepgen_banner_id(Integer epgen_banner_id) {
		this.epgen_banner_id = epgen_banner_id;
	}
	public Integer getepgen_count() {
		return epgen_count;
	}

	public void setepgen_count(Integer epgen_count) {
		this.epgen_count = epgen_count;
	}

}
