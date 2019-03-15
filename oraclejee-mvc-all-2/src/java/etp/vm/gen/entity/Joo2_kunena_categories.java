
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
@Table(name = "joo2_kunena_categories", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_kunena_categories implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="parent")
    private Integer epgen_parent;
    @Column(name="name")
    private String epgen_name;
    @Column(name="cat_emoticon")
    private Integer epgen_cat_emoticon;
    @Column(name="locked")
    private Integer epgen_locked;
    @Column(name="alert_admin")
    private Integer epgen_alert_admin;
    @Column(name="moderated")
    private Integer epgen_moderated;
    @Column(name="moderators")
    private String epgen_moderators;
    @Column(name="accesstype")
    private String epgen_accesstype;
    @Column(name="access")
    private Integer epgen_access;
    @Column(name="pub_access")
    private Integer epgen_pub_access;
    @Column(name="pub_recurse")
    private Integer epgen_pub_recurse;
    @Column(name="admin_access")
    private Integer epgen_admin_access;
    @Column(name="admin_recurse")
    private Integer epgen_admin_recurse;
    @Column(name="ordering")
    private Integer epgen_ordering;
    @Column(name="future2")
    private Integer epgen_future2;
    @Column(name="published")
    private Integer epgen_published;
    @Column(name="checked_out")
    private Integer epgen_checked_out;
    
    @Column(name = "checked_out_time", columnDefinition="VARCHAR")
    private String epgen_checked_out_time;
    @Column(name="review")
    private Integer epgen_review;
    @Column(name="allow_anonymous")
    private Integer epgen_allow_anonymous;
    @Column(name="post_anonymous")
    private Integer epgen_post_anonymous;
    @Column(name="hits")
    private Integer epgen_hits;
    @Column(name="description")
    private String epgen_description;
    @Column(name="headerdesc")
    private String epgen_headerdesc;
    @Column(name="class_sfx")
    private String epgen_class_sfx;
    @Column(name="allow_polls")
    private Integer epgen_allow_polls;
    @Column(name="id_last_msg")
    private Integer epgen_id_last_msg;
    @Column(name="numTopics")
    private double epgen_numTopics;
    @Column(name="numPosts")
    private double epgen_numPosts;
    @Column(name="time_last_msg")
    private Integer epgen_time_last_msg;
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
	public String getepgen_name() {
		return epgen_name;
	}

	public void setepgen_name(String epgen_name) {
		this.epgen_name = epgen_name;
	}
	public Integer getepgen_cat_emoticon() {
		return epgen_cat_emoticon;
	}

	public void setepgen_cat_emoticon(Integer epgen_cat_emoticon) {
		this.epgen_cat_emoticon = epgen_cat_emoticon;
	}
	public Integer getepgen_locked() {
		return epgen_locked;
	}

	public void setepgen_locked(Integer epgen_locked) {
		this.epgen_locked = epgen_locked;
	}
	public Integer getepgen_alert_admin() {
		return epgen_alert_admin;
	}

	public void setepgen_alert_admin(Integer epgen_alert_admin) {
		this.epgen_alert_admin = epgen_alert_admin;
	}
	public Integer getepgen_moderated() {
		return epgen_moderated;
	}

	public void setepgen_moderated(Integer epgen_moderated) {
		this.epgen_moderated = epgen_moderated;
	}
	public String getepgen_moderators() {
		return epgen_moderators;
	}

	public void setepgen_moderators(String epgen_moderators) {
		this.epgen_moderators = epgen_moderators;
	}
	public String getepgen_accesstype() {
		return epgen_accesstype;
	}

	public void setepgen_accesstype(String epgen_accesstype) {
		this.epgen_accesstype = epgen_accesstype;
	}
	public Integer getepgen_access() {
		return epgen_access;
	}

	public void setepgen_access(Integer epgen_access) {
		this.epgen_access = epgen_access;
	}
	public Integer getepgen_pub_access() {
		return epgen_pub_access;
	}

	public void setepgen_pub_access(Integer epgen_pub_access) {
		this.epgen_pub_access = epgen_pub_access;
	}
	public Integer getepgen_pub_recurse() {
		return epgen_pub_recurse;
	}

	public void setepgen_pub_recurse(Integer epgen_pub_recurse) {
		this.epgen_pub_recurse = epgen_pub_recurse;
	}
	public Integer getepgen_admin_access() {
		return epgen_admin_access;
	}

	public void setepgen_admin_access(Integer epgen_admin_access) {
		this.epgen_admin_access = epgen_admin_access;
	}
	public Integer getepgen_admin_recurse() {
		return epgen_admin_recurse;
	}

	public void setepgen_admin_recurse(Integer epgen_admin_recurse) {
		this.epgen_admin_recurse = epgen_admin_recurse;
	}
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
	}
	public Integer getepgen_future2() {
		return epgen_future2;
	}

	public void setepgen_future2(Integer epgen_future2) {
		this.epgen_future2 = epgen_future2;
	}
	public Integer getepgen_published() {
		return epgen_published;
	}

	public void setepgen_published(Integer epgen_published) {
		this.epgen_published = epgen_published;
	}
	public Integer getepgen_checked_out() {
		return epgen_checked_out;
	}

	public void setepgen_checked_out(Integer epgen_checked_out) {
		this.epgen_checked_out = epgen_checked_out;
	}
	public String getepgen_checked_out_time() {
		return epgen_checked_out_time;
	}

	public void setepgen_checked_out_time(String epgen_checked_out_time) {
		this.epgen_checked_out_time = epgen_checked_out_time;
	}
	public Integer getepgen_review() {
		return epgen_review;
	}

	public void setepgen_review(Integer epgen_review) {
		this.epgen_review = epgen_review;
	}
	public Integer getepgen_allow_anonymous() {
		return epgen_allow_anonymous;
	}

	public void setepgen_allow_anonymous(Integer epgen_allow_anonymous) {
		this.epgen_allow_anonymous = epgen_allow_anonymous;
	}
	public Integer getepgen_post_anonymous() {
		return epgen_post_anonymous;
	}

	public void setepgen_post_anonymous(Integer epgen_post_anonymous) {
		this.epgen_post_anonymous = epgen_post_anonymous;
	}
	public Integer getepgen_hits() {
		return epgen_hits;
	}

	public void setepgen_hits(Integer epgen_hits) {
		this.epgen_hits = epgen_hits;
	}
	public String getepgen_description() {
		return epgen_description;
	}

	public void setepgen_description(String epgen_description) {
		this.epgen_description = epgen_description;
	}
	public String getepgen_headerdesc() {
		return epgen_headerdesc;
	}

	public void setepgen_headerdesc(String epgen_headerdesc) {
		this.epgen_headerdesc = epgen_headerdesc;
	}
	public String getepgen_class_sfx() {
		return epgen_class_sfx;
	}

	public void setepgen_class_sfx(String epgen_class_sfx) {
		this.epgen_class_sfx = epgen_class_sfx;
	}
	public Integer getepgen_allow_polls() {
		return epgen_allow_polls;
	}

	public void setepgen_allow_polls(Integer epgen_allow_polls) {
		this.epgen_allow_polls = epgen_allow_polls;
	}
	public Integer getepgen_id_last_msg() {
		return epgen_id_last_msg;
	}

	public void setepgen_id_last_msg(Integer epgen_id_last_msg) {
		this.epgen_id_last_msg = epgen_id_last_msg;
	}
	public double getepgen_numTopics() {
		return epgen_numTopics;
	}

	public void setepgen_numTopics(double epgen_numTopics) {
		this.epgen_numTopics = epgen_numTopics;
	}
	public double getepgen_numPosts() {
		return epgen_numPosts;
	}

	public void setepgen_numPosts(double epgen_numPosts) {
		this.epgen_numPosts = epgen_numPosts;
	}
	public Integer getepgen_time_last_msg() {
		return epgen_time_last_msg;
	}

	public void setepgen_time_last_msg(Integer epgen_time_last_msg) {
		this.epgen_time_last_msg = epgen_time_last_msg;
	}

}
