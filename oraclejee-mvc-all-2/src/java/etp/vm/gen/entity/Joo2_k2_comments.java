
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
@Table(name = "joo2_k2_comments", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_k2_comments implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="itemID")
    private Integer epgen_itemID;
    @Column(name="userID")
    private Integer epgen_userID;
    @Column(name="userName")
    private String epgen_userName;
    
    @Column(name = "commentDate", columnDefinition="VARCHAR")
    private String epgen_commentDate;
    @Column(name="commentText")
    private String epgen_commentText;
    @Column(name="commentEmail")
    private String epgen_commentEmail;
    @Column(name="commentURL")
    private String epgen_commentURL;
    @Column(name="published")
    private Integer epgen_published;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public Integer getepgen_itemID() {
		return epgen_itemID;
	}

	public void setepgen_itemID(Integer epgen_itemID) {
		this.epgen_itemID = epgen_itemID;
	}
	public Integer getepgen_userID() {
		return epgen_userID;
	}

	public void setepgen_userID(Integer epgen_userID) {
		this.epgen_userID = epgen_userID;
	}
	public String getepgen_userName() {
		return epgen_userName;
	}

	public void setepgen_userName(String epgen_userName) {
		this.epgen_userName = epgen_userName;
	}
	public String getepgen_commentDate() {
		return epgen_commentDate;
	}

	public void setepgen_commentDate(String epgen_commentDate) {
		this.epgen_commentDate = epgen_commentDate;
	}
	public String getepgen_commentText() {
		return epgen_commentText;
	}

	public void setepgen_commentText(String epgen_commentText) {
		this.epgen_commentText = epgen_commentText;
	}
	public String getepgen_commentEmail() {
		return epgen_commentEmail;
	}

	public void setepgen_commentEmail(String epgen_commentEmail) {
		this.epgen_commentEmail = epgen_commentEmail;
	}
	public String getepgen_commentURL() {
		return epgen_commentURL;
	}

	public void setepgen_commentURL(String epgen_commentURL) {
		this.epgen_commentURL = epgen_commentURL;
	}
	public Integer getepgen_published() {
		return epgen_published;
	}

	public void setepgen_published(Integer epgen_published) {
		this.epgen_published = epgen_published;
	}

}
