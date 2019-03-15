
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
@Table(name = "joo2_virtuemart_carts", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_carts implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_user_id")
    private Integer epgen_virtuemart_user_id;
    @Column(name="cart_content")
    private String epgen_cart_content;
	public Integer getepgen_virtuemart_user_id() {
		return epgen_virtuemart_user_id;
	}

	public void setepgen_virtuemart_user_id(Integer epgen_virtuemart_user_id) {
		this.epgen_virtuemart_user_id = epgen_virtuemart_user_id;
	}
	public String getepgen_cart_content() {
		return epgen_cart_content;
	}

	public void setepgen_cart_content(String epgen_cart_content) {
		this.epgen_cart_content = epgen_cart_content;
	}

}
