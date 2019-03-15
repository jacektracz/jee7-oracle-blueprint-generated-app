
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
@Table(name = "joo2_kunena_messages", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_kunena_messages implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="parent")
    private Integer epgen_parent;
    @Column(name="thread")
    private Integer epgen_thread;
    @Column(name="catid")
    private Integer epgen_catid;
    @Column(name="name")
    private String epgen_name;
    @Column(name="userid")
    private Integer epgen_userid;
    @Column(name="email")
    private String epgen_email;
    @Column(name="subject")
    private String epgen_subject;
    @Column(name="time")
    private Integer epgen_time;
    @Column(name="ip")
    private String epgen_ip;
    @Column(name="topic_emoticon")
    private Integer epgen_topic_emoticon;
    @Column(name="locked")
    private Integer epgen_locked;
    @Column(name="hold")
    private Integer epgen_hold;
    @Column(name="ordering")
    private Integer epgen_ordering;
    @Column(name="hits")
    private Integer epgen_hits;
    @Column(name="moved")
    private Integer epgen_moved;
    @Column(name="modified_by")
    private Integer epgen_modified_by;
    @Column(name="modified_time")
    private Integer epgen_modified_time;
    @Column(name="modified_reason")
    private String epgen_modified_reason;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public Integer getepgen_parent() {
		return epgen_parent;
	}

	public void setepgen_parent(Integer epgen_parent) {
		this.epgen_parent = epgen_parent;
	}
	public Integer getepgen_thread() {
		return epgen_thread;
	}

	public void setepgen_thread(Integer epgen_thread) {
		this.epgen_thread = epgen_thread;
	}
	public Integer getepgen_catid() {
		return epgen_catid;
	}

	public void setepgen_catid(Integer epgen_catid) {
		this.epgen_catid = epgen_catid;
	}
	public String getepgen_name() {
		return epgen_name;
	}

	public void setepgen_name(String epgen_name) {
		this.epgen_name = epgen_name;
	}
	public Integer getepgen_userid() {
		return epgen_userid;
	}

	public void setepgen_userid(Integer epgen_userid) {
		this.epgen_userid = epgen_userid;
	}
	public String getepgen_email() {
		return epgen_email;
	}

	public void setepgen_email(String epgen_email) {
		this.epgen_email = epgen_email;
	}
	public String getepgen_subject() {
		return epgen_subject;
	}

	public void setepgen_subject(String epgen_subject) {
		this.epgen_subject = epgen_subject;
	}
	public Integer getepgen_time() {
		return epgen_time;
	}

	public void setepgen_time(Integer epgen_time) {
		this.epgen_time = epgen_time;
	}
	public String getepgen_ip() {
		return epgen_ip;
	}

	public void setepgen_ip(String epgen_ip) {
		this.epgen_ip = epgen_ip;
	}
	public Integer getepgen_topic_emoticon() {
		return epgen_topic_emoticon;
	}

	public void setepgen_topic_emoticon(Integer epgen_topic_emoticon) {
		this.epgen_topic_emoticon = epgen_topic_emoticon;
	}
	public Integer getepgen_locked() {
		return epgen_locked;
	}

	public void setepgen_locked(Integer epgen_locked) {
		this.epgen_locked = epgen_locked;
	}
	public Integer getepgen_hold() {
		return epgen_hold;
	}

	public void setepgen_hold(Integer epgen_hold) {
		this.epgen_hold = epgen_hold;
	}
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
	}
	public Integer getepgen_hits() {
		return epgen_hits;
	}

	public void setepgen_hits(Integer epgen_hits) {
		this.epgen_hits = epgen_hits;
	}
	public Integer getepgen_moved() {
		return epgen_moved;
	}

	public void setepgen_moved(Integer epgen_moved) {
		this.epgen_moved = epgen_moved;
	}
	public Integer getepgen_modified_by() {
		return epgen_modified_by;
	}

	public void setepgen_modified_by(Integer epgen_modified_by) {
		this.epgen_modified_by = epgen_modified_by;
	}
	public Integer getepgen_modified_time() {
		return epgen_modified_time;
	}

	public void setepgen_modified_time(Integer epgen_modified_time) {
		this.epgen_modified_time = epgen_modified_time;
	}
	public String getepgen_modified_reason() {
		return epgen_modified_reason;
	}

	public void setepgen_modified_reason(String epgen_modified_reason) {
		this.epgen_modified_reason = epgen_modified_reason;
	}

}
