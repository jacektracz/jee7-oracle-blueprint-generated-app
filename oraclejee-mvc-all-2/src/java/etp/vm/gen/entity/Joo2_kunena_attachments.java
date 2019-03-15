
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
@Table(name = "joo2_kunena_attachments", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_kunena_attachments implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="mesid")
    private Integer epgen_mesid;
    @Column(name="userid")
    private Integer epgen_userid;
    @Column(name="hash")
    private String epgen_hash;
    @Column(name="size")
    private Integer epgen_size;
    @Column(name="folder")
    private String epgen_folder;
    @Column(name="filetype")
    private String epgen_filetype;
    @Column(name="filename")
    private String epgen_filename;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public Integer getepgen_mesid() {
		return epgen_mesid;
	}

	public void setepgen_mesid(Integer epgen_mesid) {
		this.epgen_mesid = epgen_mesid;
	}
	public Integer getepgen_userid() {
		return epgen_userid;
	}

	public void setepgen_userid(Integer epgen_userid) {
		this.epgen_userid = epgen_userid;
	}
	public String getepgen_hash() {
		return epgen_hash;
	}

	public void setepgen_hash(String epgen_hash) {
		this.epgen_hash = epgen_hash;
	}
	public Integer getepgen_size() {
		return epgen_size;
	}

	public void setepgen_size(Integer epgen_size) {
		this.epgen_size = epgen_size;
	}
	public String getepgen_folder() {
		return epgen_folder;
	}

	public void setepgen_folder(String epgen_folder) {
		this.epgen_folder = epgen_folder;
	}
	public String getepgen_filetype() {
		return epgen_filetype;
	}

	public void setepgen_filetype(String epgen_filetype) {
		this.epgen_filetype = epgen_filetype;
	}
	public String getepgen_filename() {
		return epgen_filename;
	}

	public void setepgen_filename(String epgen_filename) {
		this.epgen_filename = epgen_filename;
	}

}
