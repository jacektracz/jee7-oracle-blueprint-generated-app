
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
@Table(name = "no_class", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class No_class implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="epvm_id")
    private Integer epgen_epvm_id;
	public Integer getepgen_epvm_id() {
		return epgen_epvm_id;
	}

	public void setepgen_epvm_id(Integer epgen_epvm_id) {
		this.epgen_epvm_id = epgen_epvm_id;
	}

}
