
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
@Table(name = "joo2_messages", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_messages implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="message_id")
    private Integer epgen_message_id;
    @Column(name="user_id_from")
    private Integer epgen_user_id_from;
    @Column(name="user_id_to")
    private Integer epgen_user_id_to;
    @Column(name="folder_id")
    private Integer epgen_folder_id;
    
    @Column(name = "date_time", columnDefinition="VARCHAR")
    private String epgen_date_time;
    @Column(name="state")
    private Integer epgen_state;
    @Column(name="priority")
    private Integer epgen_priority;
    @Column(name="subject")
    private String epgen_subject;
    @Column(name="message")
    private String epgen_message;
	public Integer getepgen_message_id() {
		return epgen_message_id;
	}

	public void setepgen_message_id(Integer epgen_message_id) {
		this.epgen_message_id = epgen_message_id;
	}
	public Integer getepgen_user_id_from() {
		return epgen_user_id_from;
	}

	public void setepgen_user_id_from(Integer epgen_user_id_from) {
		this.epgen_user_id_from = epgen_user_id_from;
	}
	public Integer getepgen_user_id_to() {
		return epgen_user_id_to;
	}

	public void setepgen_user_id_to(Integer epgen_user_id_to) {
		this.epgen_user_id_to = epgen_user_id_to;
	}
	public Integer getepgen_folder_id() {
		return epgen_folder_id;
	}

	public void setepgen_folder_id(Integer epgen_folder_id) {
		this.epgen_folder_id = epgen_folder_id;
	}
	public String getepgen_date_time() {
		return epgen_date_time;
	}

	public void setepgen_date_time(String epgen_date_time) {
		this.epgen_date_time = epgen_date_time;
	}
	public Integer getepgen_state() {
		return epgen_state;
	}

	public void setepgen_state(Integer epgen_state) {
		this.epgen_state = epgen_state;
	}
	public Integer getepgen_priority() {
		return epgen_priority;
	}

	public void setepgen_priority(Integer epgen_priority) {
		this.epgen_priority = epgen_priority;
	}
	public String getepgen_subject() {
		return epgen_subject;
	}

	public void setepgen_subject(String epgen_subject) {
		this.epgen_subject = epgen_subject;
	}
	public String getepgen_message() {
		return epgen_message;
	}

	public void setepgen_message(String epgen_message) {
		this.epgen_message = epgen_message;
	}

}
