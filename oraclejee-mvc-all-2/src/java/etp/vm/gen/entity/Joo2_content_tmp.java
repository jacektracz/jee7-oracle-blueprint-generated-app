
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
@Table(name = "joo2_content_tmp", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_content_tmp implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="fulltext")
    private String epgen_fulltext;
    @Column(name="introtext")
    private String epgen_introtext;
    @Column(name="ep_href_main")
    private String epgen_ep_href_main;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public String getepgen_fulltext() {
		return epgen_fulltext;
	}

	public void setepgen_fulltext(String epgen_fulltext) {
		this.epgen_fulltext = epgen_fulltext;
	}
	public String getepgen_introtext() {
		return epgen_introtext;
	}

	public void setepgen_introtext(String epgen_introtext) {
		this.epgen_introtext = epgen_introtext;
	}
	public String getepgen_ep_href_main() {
		return epgen_ep_href_main;
	}

	public void setepgen_ep_href_main(String epgen_ep_href_main) {
		this.epgen_ep_href_main = epgen_ep_href_main;
	}

}
