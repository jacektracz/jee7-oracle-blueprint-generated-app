
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
@Table(name = "joo2_associations", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_associations implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private String epgen_id;
    @Column(name="context")
    private String epgen_context;
    @Column(name="key")
    private String epgen_key;
	public String getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(String epgen_id) {
		this.epgen_id = epgen_id;
	}
	public String getepgen_context() {
		return epgen_context;
	}

	public void setepgen_context(String epgen_context) {
		this.epgen_context = epgen_context;
	}
	public String getepgen_key() {
		return epgen_key;
	}

	public void setepgen_key(String epgen_key) {
		this.epgen_key = epgen_key;
	}

}
