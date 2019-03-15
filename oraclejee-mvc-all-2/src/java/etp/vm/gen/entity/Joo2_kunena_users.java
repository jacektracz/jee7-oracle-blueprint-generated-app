
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
@Table(name = "joo2_kunena_users", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_kunena_users implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="userid")
    private Integer epgen_userid;
    @Column(name="view")
    private String epgen_view;
    @Column(name="signature")
    private String epgen_signature;
    @Column(name="moderator")
    private Integer epgen_moderator;
    
    @Column(name = "banned", columnDefinition="VARCHAR")
    private String epgen_banned;
    @Column(name="ordering")
    private Integer epgen_ordering;
    @Column(name="posts")
    private Integer epgen_posts;
    @Column(name="avatar")
    private String epgen_avatar;
    @Column(name="karma")
    private Integer epgen_karma;
    @Column(name="karma_time")
    private Integer epgen_karma_time;
    @Column(name="group_id")
    private Integer epgen_group_id;
    @Column(name="uhits")
    private Integer epgen_uhits;
    @Column(name="personalText")
    private String epgen_personalText;
    @Column(name="gender")
    private Integer epgen_gender;
    @Column(name="location")
    private String epgen_location;
    @Column(name="ICQ")
    private String epgen_ICQ;
    @Column(name="AIM")
    private String epgen_AIM;
    @Column(name="YIM")
    private String epgen_YIM;
    @Column(name="MSN")
    private String epgen_MSN;
    @Column(name="SKYPE")
    private String epgen_SKYPE;
    @Column(name="TWITTER")
    private String epgen_TWITTER;
    @Column(name="FACEBOOK")
    private String epgen_FACEBOOK;
    @Column(name="GTALK")
    private String epgen_GTALK;
    @Column(name="MYSPACE")
    private String epgen_MYSPACE;
    @Column(name="LINKEDIN")
    private String epgen_LINKEDIN;
    @Column(name="DELICIOUS")
    private String epgen_DELICIOUS;
    @Column(name="FRIENDFEED")
    private String epgen_FRIENDFEED;
    @Column(name="DIGG")
    private String epgen_DIGG;
    @Column(name="BLOGSPOT")
    private String epgen_BLOGSPOT;
    @Column(name="FLICKR")
    private String epgen_FLICKR;
    @Column(name="BEBO")
    private String epgen_BEBO;
    @Column(name="websitename")
    private String epgen_websitename;
    @Column(name="websiteurl")
    private String epgen_websiteurl;
    @Column(name="rank")
    private Integer epgen_rank;
    @Column(name="hideEmail")
    private Integer epgen_hideEmail;
    @Column(name="showOnline")
    private Integer epgen_showOnline;
	public Integer getepgen_userid() {
		return epgen_userid;
	}

	public void setepgen_userid(Integer epgen_userid) {
		this.epgen_userid = epgen_userid;
	}
	public String getepgen_view() {
		return epgen_view;
	}

	public void setepgen_view(String epgen_view) {
		this.epgen_view = epgen_view;
	}
	public String getepgen_signature() {
		return epgen_signature;
	}

	public void setepgen_signature(String epgen_signature) {
		this.epgen_signature = epgen_signature;
	}
	public Integer getepgen_moderator() {
		return epgen_moderator;
	}

	public void setepgen_moderator(Integer epgen_moderator) {
		this.epgen_moderator = epgen_moderator;
	}
	public String getepgen_banned() {
		return epgen_banned;
	}

	public void setepgen_banned(String epgen_banned) {
		this.epgen_banned = epgen_banned;
	}
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
	}
	public Integer getepgen_posts() {
		return epgen_posts;
	}

	public void setepgen_posts(Integer epgen_posts) {
		this.epgen_posts = epgen_posts;
	}
	public String getepgen_avatar() {
		return epgen_avatar;
	}

	public void setepgen_avatar(String epgen_avatar) {
		this.epgen_avatar = epgen_avatar;
	}
	public Integer getepgen_karma() {
		return epgen_karma;
	}

	public void setepgen_karma(Integer epgen_karma) {
		this.epgen_karma = epgen_karma;
	}
	public Integer getepgen_karma_time() {
		return epgen_karma_time;
	}

	public void setepgen_karma_time(Integer epgen_karma_time) {
		this.epgen_karma_time = epgen_karma_time;
	}
	public Integer getepgen_group_id() {
		return epgen_group_id;
	}

	public void setepgen_group_id(Integer epgen_group_id) {
		this.epgen_group_id = epgen_group_id;
	}
	public Integer getepgen_uhits() {
		return epgen_uhits;
	}

	public void setepgen_uhits(Integer epgen_uhits) {
		this.epgen_uhits = epgen_uhits;
	}
	public String getepgen_personalText() {
		return epgen_personalText;
	}

	public void setepgen_personalText(String epgen_personalText) {
		this.epgen_personalText = epgen_personalText;
	}
	public Integer getepgen_gender() {
		return epgen_gender;
	}

	public void setepgen_gender(Integer epgen_gender) {
		this.epgen_gender = epgen_gender;
	}
	public String getepgen_location() {
		return epgen_location;
	}

	public void setepgen_location(String epgen_location) {
		this.epgen_location = epgen_location;
	}
	public String getepgen_ICQ() {
		return epgen_ICQ;
	}

	public void setepgen_ICQ(String epgen_ICQ) {
		this.epgen_ICQ = epgen_ICQ;
	}
	public String getepgen_AIM() {
		return epgen_AIM;
	}

	public void setepgen_AIM(String epgen_AIM) {
		this.epgen_AIM = epgen_AIM;
	}
	public String getepgen_YIM() {
		return epgen_YIM;
	}

	public void setepgen_YIM(String epgen_YIM) {
		this.epgen_YIM = epgen_YIM;
	}
	public String getepgen_MSN() {
		return epgen_MSN;
	}

	public void setepgen_MSN(String epgen_MSN) {
		this.epgen_MSN = epgen_MSN;
	}
	public String getepgen_SKYPE() {
		return epgen_SKYPE;
	}

	public void setepgen_SKYPE(String epgen_SKYPE) {
		this.epgen_SKYPE = epgen_SKYPE;
	}
	public String getepgen_TWITTER() {
		return epgen_TWITTER;
	}

	public void setepgen_TWITTER(String epgen_TWITTER) {
		this.epgen_TWITTER = epgen_TWITTER;
	}
	public String getepgen_FACEBOOK() {
		return epgen_FACEBOOK;
	}

	public void setepgen_FACEBOOK(String epgen_FACEBOOK) {
		this.epgen_FACEBOOK = epgen_FACEBOOK;
	}
	public String getepgen_GTALK() {
		return epgen_GTALK;
	}

	public void setepgen_GTALK(String epgen_GTALK) {
		this.epgen_GTALK = epgen_GTALK;
	}
	public String getepgen_MYSPACE() {
		return epgen_MYSPACE;
	}

	public void setepgen_MYSPACE(String epgen_MYSPACE) {
		this.epgen_MYSPACE = epgen_MYSPACE;
	}
	public String getepgen_LINKEDIN() {
		return epgen_LINKEDIN;
	}

	public void setepgen_LINKEDIN(String epgen_LINKEDIN) {
		this.epgen_LINKEDIN = epgen_LINKEDIN;
	}
	public String getepgen_DELICIOUS() {
		return epgen_DELICIOUS;
	}

	public void setepgen_DELICIOUS(String epgen_DELICIOUS) {
		this.epgen_DELICIOUS = epgen_DELICIOUS;
	}
	public String getepgen_FRIENDFEED() {
		return epgen_FRIENDFEED;
	}

	public void setepgen_FRIENDFEED(String epgen_FRIENDFEED) {
		this.epgen_FRIENDFEED = epgen_FRIENDFEED;
	}
	public String getepgen_DIGG() {
		return epgen_DIGG;
	}

	public void setepgen_DIGG(String epgen_DIGG) {
		this.epgen_DIGG = epgen_DIGG;
	}
	public String getepgen_BLOGSPOT() {
		return epgen_BLOGSPOT;
	}

	public void setepgen_BLOGSPOT(String epgen_BLOGSPOT) {
		this.epgen_BLOGSPOT = epgen_BLOGSPOT;
	}
	public String getepgen_FLICKR() {
		return epgen_FLICKR;
	}

	public void setepgen_FLICKR(String epgen_FLICKR) {
		this.epgen_FLICKR = epgen_FLICKR;
	}
	public String getepgen_BEBO() {
		return epgen_BEBO;
	}

	public void setepgen_BEBO(String epgen_BEBO) {
		this.epgen_BEBO = epgen_BEBO;
	}
	public String getepgen_websitename() {
		return epgen_websitename;
	}

	public void setepgen_websitename(String epgen_websitename) {
		this.epgen_websitename = epgen_websitename;
	}
	public String getepgen_websiteurl() {
		return epgen_websiteurl;
	}

	public void setepgen_websiteurl(String epgen_websiteurl) {
		this.epgen_websiteurl = epgen_websiteurl;
	}
	public Integer getepgen_rank() {
		return epgen_rank;
	}

	public void setepgen_rank(Integer epgen_rank) {
		this.epgen_rank = epgen_rank;
	}
	public Integer getepgen_hideEmail() {
		return epgen_hideEmail;
	}

	public void setepgen_hideEmail(Integer epgen_hideEmail) {
		this.epgen_hideEmail = epgen_hideEmail;
	}
	public Integer getepgen_showOnline() {
		return epgen_showOnline;
	}

	public void setepgen_showOnline(Integer epgen_showOnline) {
		this.epgen_showOnline = epgen_showOnline;
	}

}
