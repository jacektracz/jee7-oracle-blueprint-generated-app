
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
@Table(name = "joo2_kunena_messages_text", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_kunena_messages_text implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="mesid")
    private Integer epgen_mesid;
    @Column(name="message")
    private String epgen_message;
	public Integer getepgen_mesid() {
		return epgen_mesid;
	}

	public void setepgen_mesid(Integer epgen_mesid) {
		this.epgen_mesid = epgen_mesid;
	}
	public String getepgen_message() {
		return epgen_message;
	}

	public void setepgen_message(String epgen_message) {
		this.epgen_message = epgen_message;
	}

}
