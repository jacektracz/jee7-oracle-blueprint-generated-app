
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
@Table(name = "joo2_kunena_thankyou", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_kunena_thankyou implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="postid")
    private Integer epgen_postid;
    @Column(name="userid")
    private Integer epgen_userid;
    @Column(name="targetuserid")
    private Integer epgen_targetuserid;
	public Integer getepgen_postid() {
		return epgen_postid;
	}

	public void setepgen_postid(Integer epgen_postid) {
		this.epgen_postid = epgen_postid;
	}
	public Integer getepgen_userid() {
		return epgen_userid;
	}

	public void setepgen_userid(Integer epgen_userid) {
		this.epgen_userid = epgen_userid;
	}
	public Integer getepgen_targetuserid() {
		return epgen_targetuserid;
	}

	public void setepgen_targetuserid(Integer epgen_targetuserid) {
		this.epgen_targetuserid = epgen_targetuserid;
	}

}
