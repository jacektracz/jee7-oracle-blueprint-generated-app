
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
@Table(name = "joo2_kunena_config", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_kunena_config implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="board_title")
    private String epgen_board_title;
    @Column(name="email")
    private String epgen_email;
    @Column(name="board_offline")
    private Integer epgen_board_offline;
    @Column(name="board_ofset")
    private String epgen_board_ofset;
    @Column(name="offline_message")
    private String epgen_offline_message;
    @Column(name="enablerss")
    private Integer epgen_enablerss;
    @Column(name="enablepdf")
    private Integer epgen_enablepdf;
    @Column(name="threads_per_page")
    private Integer epgen_threads_per_page;
    @Column(name="messages_per_page")
    private Integer epgen_messages_per_page;
    @Column(name="messages_per_page_search")
    private Integer epgen_messages_per_page_search;
    @Column(name="showhistory")
    private Integer epgen_showhistory;
    @Column(name="historylimit")
    private Integer epgen_historylimit;
    @Column(name="shownew")
    private Integer epgen_shownew;
    @Column(name="jmambot")
    private Integer epgen_jmambot;
    @Column(name="disemoticons")
    private Integer epgen_disemoticons;
    @Column(name="template")
    private String epgen_template;
    @Column(name="showannouncement")
    private Integer epgen_showannouncement;
    @Column(name="avataroncat")
    private Integer epgen_avataroncat;
    @Column(name="catimagepath")
    private String epgen_catimagepath;
    @Column(name="showchildcaticon")
    private Integer epgen_showchildcaticon;
    @Column(name="annmodid")
    private String epgen_annmodid;
    @Column(name="rtewidth")
    private Integer epgen_rtewidth;
    @Column(name="rteheight")
    private Integer epgen_rteheight;
    @Column(name="enableforumjump")
    private Integer epgen_enableforumjump;
    @Column(name="reportmsg")
    private Integer epgen_reportmsg;
    @Column(name="username")
    private Integer epgen_username;
    @Column(name="askemail")
    private Integer epgen_askemail;
    @Column(name="showemail")
    private Integer epgen_showemail;
    @Column(name="showuserstats")
    private Integer epgen_showuserstats;
    @Column(name="showkarma")
    private Integer epgen_showkarma;
    @Column(name="useredit")
    private Integer epgen_useredit;
    @Column(name="useredittime")
    private Integer epgen_useredittime;
    @Column(name="useredittimegrace")
    private Integer epgen_useredittimegrace;
    @Column(name="editmarkup")
    private Integer epgen_editmarkup;
    @Column(name="allowsubscriptions")
    private Integer epgen_allowsubscriptions;
    @Column(name="subscriptionschecked")
    private Integer epgen_subscriptionschecked;
    @Column(name="allowfavorites")
    private Integer epgen_allowfavorites;
    @Column(name="maxsubject")
    private Integer epgen_maxsubject;
    @Column(name="maxsig")
    private Integer epgen_maxsig;
    @Column(name="regonly")
    private Integer epgen_regonly;
    @Column(name="changename")
    private Integer epgen_changename;
    @Column(name="pubwrite")
    private Integer epgen_pubwrite;
    @Column(name="floodprotection")
    private Integer epgen_floodprotection;
    @Column(name="mailmod")
    private Integer epgen_mailmod;
    @Column(name="mailadmin")
    private Integer epgen_mailadmin;
    @Column(name="captcha")
    private Integer epgen_captcha;
    @Column(name="mailfull")
    private Integer epgen_mailfull;
    @Column(name="allowavatar")
    private Integer epgen_allowavatar;
    @Column(name="allowavatarupload")
    private Integer epgen_allowavatarupload;
    @Column(name="allowavatargallery")
    private Integer epgen_allowavatargallery;
    @Column(name="avatarquality")
    private Integer epgen_avatarquality;
    @Column(name="avatarsize")
    private Integer epgen_avatarsize;
    @Column(name="allowimageupload")
    private Integer epgen_allowimageupload;
    @Column(name="allowimageregupload")
    private Integer epgen_allowimageregupload;
    @Column(name="imageheight")
    private Integer epgen_imageheight;
    @Column(name="imagewidth")
    private Integer epgen_imagewidth;
    @Column(name="imagesize")
    private Integer epgen_imagesize;
    @Column(name="allowfileupload")
    private Integer epgen_allowfileupload;
    @Column(name="allowfileregupload")
    private Integer epgen_allowfileregupload;
    @Column(name="filetypes")
    private String epgen_filetypes;
    @Column(name="filesize")
    private Integer epgen_filesize;
    @Column(name="showranking")
    private Integer epgen_showranking;
    @Column(name="rankimages")
    private Integer epgen_rankimages;
    @Column(name="avatar_src")
    private String epgen_avatar_src;
    @Column(name="fb_profile")
    private String epgen_fb_profile;
    @Column(name="pm_component")
    private String epgen_pm_component;
    @Column(name="userlist_rows")
    private Integer epgen_userlist_rows;
    @Column(name="userlist_online")
    private Integer epgen_userlist_online;
    @Column(name="userlist_avatar")
    private Integer epgen_userlist_avatar;
    @Column(name="userlist_name")
    private Integer epgen_userlist_name;
    @Column(name="userlist_username")
    private Integer epgen_userlist_username;
    @Column(name="userlist_posts")
    private Integer epgen_userlist_posts;
    @Column(name="userlist_karma")
    private Integer epgen_userlist_karma;
    @Column(name="userlist_email")
    private Integer epgen_userlist_email;
    @Column(name="userlist_usertype")
    private Integer epgen_userlist_usertype;
    @Column(name="userlist_joindate")
    private Integer epgen_userlist_joindate;
    @Column(name="userlist_lastvisitdate")
    private Integer epgen_userlist_lastvisitdate;
    @Column(name="userlist_userhits")
    private Integer epgen_userlist_userhits;
    @Column(name="latestcategory")
    private String epgen_latestcategory;
    @Column(name="showstats")
    private Integer epgen_showstats;
    @Column(name="showwhoisonline")
    private Integer epgen_showwhoisonline;
    @Column(name="showgenstats")
    private Integer epgen_showgenstats;
    @Column(name="showpopuserstats")
    private Integer epgen_showpopuserstats;
    @Column(name="popusercount")
    private Integer epgen_popusercount;
    @Column(name="showpopsubjectstats")
    private Integer epgen_showpopsubjectstats;
    @Column(name="popsubjectcount")
    private Integer epgen_popsubjectcount;
    @Column(name="usernamechange")
    private Integer epgen_usernamechange;
    @Column(name="rules_infb")
    private Integer epgen_rules_infb;
    @Column(name="rules_cid")
    private Integer epgen_rules_cid;
    @Column(name="help_infb")
    private Integer epgen_help_infb;
    @Column(name="help_cid")
    private Integer epgen_help_cid;
    @Column(name="showspoilertag")
    private Integer epgen_showspoilertag;
    @Column(name="showvideotag")
    private Integer epgen_showvideotag;
    @Column(name="showebaytag")
    private Integer epgen_showebaytag;
    @Column(name="trimlongurls")
    private Integer epgen_trimlongurls;
    @Column(name="trimlongurlsfront")
    private Integer epgen_trimlongurlsfront;
    @Column(name="trimlongurlsback")
    private Integer epgen_trimlongurlsback;
    @Column(name="autoembedyoutube")
    private Integer epgen_autoembedyoutube;
    @Column(name="autoembedebay")
    private Integer epgen_autoembedebay;
    @Column(name="ebaylanguagecode")
    private String epgen_ebaylanguagecode;
    @Column(name="fbsessiontimeout")
    private Integer epgen_fbsessiontimeout;
    @Column(name="highlightcode")
    private Integer epgen_highlightcode;
    @Column(name="rss_type")
    private String epgen_rss_type;
    @Column(name="rss_timelimit")
    private String epgen_rss_timelimit;
    @Column(name="rss_limit")
    private Integer epgen_rss_limit;
    @Column(name="rss_included_categories")
    private String epgen_rss_included_categories;
    @Column(name="rss_excluded_categories")
    private String epgen_rss_excluded_categories;
    @Column(name="rss_specification")
    private String epgen_rss_specification;
    @Column(name="rss_allow_html")
    private Integer epgen_rss_allow_html;
    @Column(name="rss_author_format")
    private String epgen_rss_author_format;
    @Column(name="rss_author_in_title")
    private Integer epgen_rss_author_in_title;
    @Column(name="rss_word_count")
    private String epgen_rss_word_count;
    @Column(name="rss_old_titles")
    private Integer epgen_rss_old_titles;
    @Column(name="rss_cache")
    private Integer epgen_rss_cache;
    @Column(name="fbdefaultpage")
    private String epgen_fbdefaultpage;
    @Column(name="default_sort")
    private String epgen_default_sort;
    @Column(name="alphauserpointsnumchars")
    private Integer epgen_alphauserpointsnumchars;
    @Column(name="sef")
    private Integer epgen_sef;
    @Column(name="sefcats")
    private Integer epgen_sefcats;
    @Column(name="sefutf8")
    private Integer epgen_sefutf8;
    @Column(name="showimgforguest")
    private Integer epgen_showimgforguest;
    @Column(name="showfileforguest")
    private Integer epgen_showfileforguest;
    @Column(name="pollnboptions")
    private Integer epgen_pollnboptions;
    @Column(name="pollallowvoteone")
    private Integer epgen_pollallowvoteone;
    @Column(name="pollenabled")
    private Integer epgen_pollenabled;
    @Column(name="poppollscount")
    private Integer epgen_poppollscount;
    @Column(name="showpoppollstats")
    private Integer epgen_showpoppollstats;
    @Column(name="polltimebtvotes")
    private String epgen_polltimebtvotes;
    @Column(name="pollnbvotesbyuser")
    private Integer epgen_pollnbvotesbyuser;
    @Column(name="pollresultsuserslist")
    private Integer epgen_pollresultsuserslist;
    @Column(name="maxpersotext")
    private Integer epgen_maxpersotext;
    @Column(name="ordering_system")
    private String epgen_ordering_system;
    @Column(name="post_dateformat")
    private String epgen_post_dateformat;
    @Column(name="post_dateformat_hover")
    private String epgen_post_dateformat_hover;
    @Column(name="hide_ip")
    private Integer epgen_hide_ip;
    @Column(name="js_actstr_integration")
    private Integer epgen_js_actstr_integration;
    @Column(name="imagetypes")
    private String epgen_imagetypes;
    @Column(name="checkmimetypes")
    private Integer epgen_checkmimetypes;
    @Column(name="imagemimetypes")
    private String epgen_imagemimetypes;
    @Column(name="imagequality")
    private Integer epgen_imagequality;
    @Column(name="thumbheight")
    private Integer epgen_thumbheight;
    @Column(name="thumbwidth")
    private Integer epgen_thumbwidth;
    @Column(name="hideuserprofileinfo")
    private String epgen_hideuserprofileinfo;
    @Column(name="integration_access")
    private String epgen_integration_access;
    @Column(name="integration_login")
    private String epgen_integration_login;
    @Column(name="integration_avatar")
    private String epgen_integration_avatar;
    @Column(name="integration_profile")
    private String epgen_integration_profile;
    @Column(name="integration_private")
    private String epgen_integration_private;
    @Column(name="integration_activity")
    private String epgen_integration_activity;
    @Column(name="boxghostmessage")
    private Integer epgen_boxghostmessage;
    @Column(name="userdeletetmessage")
    private Integer epgen_userdeletetmessage;
    @Column(name="latestcategory_in")
    private Integer epgen_latestcategory_in;
    @Column(name="topicicons")
    private Integer epgen_topicicons;
    @Column(name="onlineusers")
    private Integer epgen_onlineusers;
    @Column(name="debug")
    private Integer epgen_debug;
    @Column(name="catsautosubscribed")
    private Integer epgen_catsautosubscribed;
    @Column(name="showbannedreason")
    private Integer epgen_showbannedreason;
    @Column(name="version_check")
    private Integer epgen_version_check;
    @Column(name="showthankyou")
    private Integer epgen_showthankyou;
    @Column(name="showpopthankyoustats")
    private Integer epgen_showpopthankyoustats;
    @Column(name="popthankscount")
    private Integer epgen_popthankscount;
    @Column(name="mod_see_deleted")
    private Integer epgen_mod_see_deleted;
    @Column(name="bbcode_img_secure")
    private String epgen_bbcode_img_secure;
    @Column(name="listcat_show_moderators")
    private Integer epgen_listcat_show_moderators;
    @Column(name="lightbox")
    private Integer epgen_lightbox;
    @Column(name="activity_limit")
    private Integer epgen_activity_limit;
    @Column(name="show_list_time")
    private Integer epgen_show_list_time;
    @Column(name="show_session_type")
    private Integer epgen_show_session_type;
    @Column(name="show_session_starttime")
    private Integer epgen_show_session_starttime;
    @Column(name="userlist_allowed")
    private Integer epgen_userlist_allowed;
    @Column(name="userlist_count_users")
    private Integer epgen_userlist_count_users;
    @Column(name="enable_threaded_layouts")
    private Integer epgen_enable_threaded_layouts;
    @Column(name="category_subscriptions")
    private String epgen_category_subscriptions;
    @Column(name="topic_subscriptions")
    private String epgen_topic_subscriptions;
    @Column(name="pubprofile")
    private Integer epgen_pubprofile;
    @Column(name="thankyou_max")
    private Integer epgen_thankyou_max;
    @Column(name="email_recipient_count")
    private Integer epgen_email_recipient_count;
    @Column(name="email_recipient_privacy")
    private String epgen_email_recipient_privacy;
    @Column(name="email_visible_address")
    private String epgen_email_visible_address;
    @Column(name="captcha_post_limit")
    private Integer epgen_captcha_post_limit;
    @Column(name="recaptcha_publickey")
    private String epgen_recaptcha_publickey;
    @Column(name="recaptcha_privatekey")
    private String epgen_recaptcha_privatekey;
    @Column(name="recaptcha_theme")
    private String epgen_recaptcha_theme;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public String getepgen_board_title() {
		return epgen_board_title;
	}

	public void setepgen_board_title(String epgen_board_title) {
		this.epgen_board_title = epgen_board_title;
	}
	public String getepgen_email() {
		return epgen_email;
	}

	public void setepgen_email(String epgen_email) {
		this.epgen_email = epgen_email;
	}
	public Integer getepgen_board_offline() {
		return epgen_board_offline;
	}

	public void setepgen_board_offline(Integer epgen_board_offline) {
		this.epgen_board_offline = epgen_board_offline;
	}
	public String getepgen_board_ofset() {
		return epgen_board_ofset;
	}

	public void setepgen_board_ofset(String epgen_board_ofset) {
		this.epgen_board_ofset = epgen_board_ofset;
	}
	public String getepgen_offline_message() {
		return epgen_offline_message;
	}

	public void setepgen_offline_message(String epgen_offline_message) {
		this.epgen_offline_message = epgen_offline_message;
	}
	public Integer getepgen_enablerss() {
		return epgen_enablerss;
	}

	public void setepgen_enablerss(Integer epgen_enablerss) {
		this.epgen_enablerss = epgen_enablerss;
	}
	public Integer getepgen_enablepdf() {
		return epgen_enablepdf;
	}

	public void setepgen_enablepdf(Integer epgen_enablepdf) {
		this.epgen_enablepdf = epgen_enablepdf;
	}
	public Integer getepgen_threads_per_page() {
		return epgen_threads_per_page;
	}

	public void setepgen_threads_per_page(Integer epgen_threads_per_page) {
		this.epgen_threads_per_page = epgen_threads_per_page;
	}
	public Integer getepgen_messages_per_page() {
		return epgen_messages_per_page;
	}

	public void setepgen_messages_per_page(Integer epgen_messages_per_page) {
		this.epgen_messages_per_page = epgen_messages_per_page;
	}
	public Integer getepgen_messages_per_page_search() {
		return epgen_messages_per_page_search;
	}

	public void setepgen_messages_per_page_search(Integer epgen_messages_per_page_search) {
		this.epgen_messages_per_page_search = epgen_messages_per_page_search;
	}
	public Integer getepgen_showhistory() {
		return epgen_showhistory;
	}

	public void setepgen_showhistory(Integer epgen_showhistory) {
		this.epgen_showhistory = epgen_showhistory;
	}
	public Integer getepgen_historylimit() {
		return epgen_historylimit;
	}

	public void setepgen_historylimit(Integer epgen_historylimit) {
		this.epgen_historylimit = epgen_historylimit;
	}
	public Integer getepgen_shownew() {
		return epgen_shownew;
	}

	public void setepgen_shownew(Integer epgen_shownew) {
		this.epgen_shownew = epgen_shownew;
	}
	public Integer getepgen_jmambot() {
		return epgen_jmambot;
	}

	public void setepgen_jmambot(Integer epgen_jmambot) {
		this.epgen_jmambot = epgen_jmambot;
	}
	public Integer getepgen_disemoticons() {
		return epgen_disemoticons;
	}

	public void setepgen_disemoticons(Integer epgen_disemoticons) {
		this.epgen_disemoticons = epgen_disemoticons;
	}
	public String getepgen_template() {
		return epgen_template;
	}

	public void setepgen_template(String epgen_template) {
		this.epgen_template = epgen_template;
	}
	public Integer getepgen_showannouncement() {
		return epgen_showannouncement;
	}

	public void setepgen_showannouncement(Integer epgen_showannouncement) {
		this.epgen_showannouncement = epgen_showannouncement;
	}
	public Integer getepgen_avataroncat() {
		return epgen_avataroncat;
	}

	public void setepgen_avataroncat(Integer epgen_avataroncat) {
		this.epgen_avataroncat = epgen_avataroncat;
	}
	public String getepgen_catimagepath() {
		return epgen_catimagepath;
	}

	public void setepgen_catimagepath(String epgen_catimagepath) {
		this.epgen_catimagepath = epgen_catimagepath;
	}
	public Integer getepgen_showchildcaticon() {
		return epgen_showchildcaticon;
	}

	public void setepgen_showchildcaticon(Integer epgen_showchildcaticon) {
		this.epgen_showchildcaticon = epgen_showchildcaticon;
	}
	public String getepgen_annmodid() {
		return epgen_annmodid;
	}

	public void setepgen_annmodid(String epgen_annmodid) {
		this.epgen_annmodid = epgen_annmodid;
	}
	public Integer getepgen_rtewidth() {
		return epgen_rtewidth;
	}

	public void setepgen_rtewidth(Integer epgen_rtewidth) {
		this.epgen_rtewidth = epgen_rtewidth;
	}
	public Integer getepgen_rteheight() {
		return epgen_rteheight;
	}

	public void setepgen_rteheight(Integer epgen_rteheight) {
		this.epgen_rteheight = epgen_rteheight;
	}
	public Integer getepgen_enableforumjump() {
		return epgen_enableforumjump;
	}

	public void setepgen_enableforumjump(Integer epgen_enableforumjump) {
		this.epgen_enableforumjump = epgen_enableforumjump;
	}
	public Integer getepgen_reportmsg() {
		return epgen_reportmsg;
	}

	public void setepgen_reportmsg(Integer epgen_reportmsg) {
		this.epgen_reportmsg = epgen_reportmsg;
	}
	public Integer getepgen_username() {
		return epgen_username;
	}

	public void setepgen_username(Integer epgen_username) {
		this.epgen_username = epgen_username;
	}
	public Integer getepgen_askemail() {
		return epgen_askemail;
	}

	public void setepgen_askemail(Integer epgen_askemail) {
		this.epgen_askemail = epgen_askemail;
	}
	public Integer getepgen_showemail() {
		return epgen_showemail;
	}

	public void setepgen_showemail(Integer epgen_showemail) {
		this.epgen_showemail = epgen_showemail;
	}
	public Integer getepgen_showuserstats() {
		return epgen_showuserstats;
	}

	public void setepgen_showuserstats(Integer epgen_showuserstats) {
		this.epgen_showuserstats = epgen_showuserstats;
	}
	public Integer getepgen_showkarma() {
		return epgen_showkarma;
	}

	public void setepgen_showkarma(Integer epgen_showkarma) {
		this.epgen_showkarma = epgen_showkarma;
	}
	public Integer getepgen_useredit() {
		return epgen_useredit;
	}

	public void setepgen_useredit(Integer epgen_useredit) {
		this.epgen_useredit = epgen_useredit;
	}
	public Integer getepgen_useredittime() {
		return epgen_useredittime;
	}

	public void setepgen_useredittime(Integer epgen_useredittime) {
		this.epgen_useredittime = epgen_useredittime;
	}
	public Integer getepgen_useredittimegrace() {
		return epgen_useredittimegrace;
	}

	public void setepgen_useredittimegrace(Integer epgen_useredittimegrace) {
		this.epgen_useredittimegrace = epgen_useredittimegrace;
	}
	public Integer getepgen_editmarkup() {
		return epgen_editmarkup;
	}

	public void setepgen_editmarkup(Integer epgen_editmarkup) {
		this.epgen_editmarkup = epgen_editmarkup;
	}
	public Integer getepgen_allowsubscriptions() {
		return epgen_allowsubscriptions;
	}

	public void setepgen_allowsubscriptions(Integer epgen_allowsubscriptions) {
		this.epgen_allowsubscriptions = epgen_allowsubscriptions;
	}
	public Integer getepgen_subscriptionschecked() {
		return epgen_subscriptionschecked;
	}

	public void setepgen_subscriptionschecked(Integer epgen_subscriptionschecked) {
		this.epgen_subscriptionschecked = epgen_subscriptionschecked;
	}
	public Integer getepgen_allowfavorites() {
		return epgen_allowfavorites;
	}

	public void setepgen_allowfavorites(Integer epgen_allowfavorites) {
		this.epgen_allowfavorites = epgen_allowfavorites;
	}
	public Integer getepgen_maxsubject() {
		return epgen_maxsubject;
	}

	public void setepgen_maxsubject(Integer epgen_maxsubject) {
		this.epgen_maxsubject = epgen_maxsubject;
	}
	public Integer getepgen_maxsig() {
		return epgen_maxsig;
	}

	public void setepgen_maxsig(Integer epgen_maxsig) {
		this.epgen_maxsig = epgen_maxsig;
	}
	public Integer getepgen_regonly() {
		return epgen_regonly;
	}

	public void setepgen_regonly(Integer epgen_regonly) {
		this.epgen_regonly = epgen_regonly;
	}
	public Integer getepgen_changename() {
		return epgen_changename;
	}

	public void setepgen_changename(Integer epgen_changename) {
		this.epgen_changename = epgen_changename;
	}
	public Integer getepgen_pubwrite() {
		return epgen_pubwrite;
	}

	public void setepgen_pubwrite(Integer epgen_pubwrite) {
		this.epgen_pubwrite = epgen_pubwrite;
	}
	public Integer getepgen_floodprotection() {
		return epgen_floodprotection;
	}

	public void setepgen_floodprotection(Integer epgen_floodprotection) {
		this.epgen_floodprotection = epgen_floodprotection;
	}
	public Integer getepgen_mailmod() {
		return epgen_mailmod;
	}

	public void setepgen_mailmod(Integer epgen_mailmod) {
		this.epgen_mailmod = epgen_mailmod;
	}
	public Integer getepgen_mailadmin() {
		return epgen_mailadmin;
	}

	public void setepgen_mailadmin(Integer epgen_mailadmin) {
		this.epgen_mailadmin = epgen_mailadmin;
	}
	public Integer getepgen_captcha() {
		return epgen_captcha;
	}

	public void setepgen_captcha(Integer epgen_captcha) {
		this.epgen_captcha = epgen_captcha;
	}
	public Integer getepgen_mailfull() {
		return epgen_mailfull;
	}

	public void setepgen_mailfull(Integer epgen_mailfull) {
		this.epgen_mailfull = epgen_mailfull;
	}
	public Integer getepgen_allowavatar() {
		return epgen_allowavatar;
	}

	public void setepgen_allowavatar(Integer epgen_allowavatar) {
		this.epgen_allowavatar = epgen_allowavatar;
	}
	public Integer getepgen_allowavatarupload() {
		return epgen_allowavatarupload;
	}

	public void setepgen_allowavatarupload(Integer epgen_allowavatarupload) {
		this.epgen_allowavatarupload = epgen_allowavatarupload;
	}
	public Integer getepgen_allowavatargallery() {
		return epgen_allowavatargallery;
	}

	public void setepgen_allowavatargallery(Integer epgen_allowavatargallery) {
		this.epgen_allowavatargallery = epgen_allowavatargallery;
	}
	public Integer getepgen_avatarquality() {
		return epgen_avatarquality;
	}

	public void setepgen_avatarquality(Integer epgen_avatarquality) {
		this.epgen_avatarquality = epgen_avatarquality;
	}
	public Integer getepgen_avatarsize() {
		return epgen_avatarsize;
	}

	public void setepgen_avatarsize(Integer epgen_avatarsize) {
		this.epgen_avatarsize = epgen_avatarsize;
	}
	public Integer getepgen_allowimageupload() {
		return epgen_allowimageupload;
	}

	public void setepgen_allowimageupload(Integer epgen_allowimageupload) {
		this.epgen_allowimageupload = epgen_allowimageupload;
	}
	public Integer getepgen_allowimageregupload() {
		return epgen_allowimageregupload;
	}

	public void setepgen_allowimageregupload(Integer epgen_allowimageregupload) {
		this.epgen_allowimageregupload = epgen_allowimageregupload;
	}
	public Integer getepgen_imageheight() {
		return epgen_imageheight;
	}

	public void setepgen_imageheight(Integer epgen_imageheight) {
		this.epgen_imageheight = epgen_imageheight;
	}
	public Integer getepgen_imagewidth() {
		return epgen_imagewidth;
	}

	public void setepgen_imagewidth(Integer epgen_imagewidth) {
		this.epgen_imagewidth = epgen_imagewidth;
	}
	public Integer getepgen_imagesize() {
		return epgen_imagesize;
	}

	public void setepgen_imagesize(Integer epgen_imagesize) {
		this.epgen_imagesize = epgen_imagesize;
	}
	public Integer getepgen_allowfileupload() {
		return epgen_allowfileupload;
	}

	public void setepgen_allowfileupload(Integer epgen_allowfileupload) {
		this.epgen_allowfileupload = epgen_allowfileupload;
	}
	public Integer getepgen_allowfileregupload() {
		return epgen_allowfileregupload;
	}

	public void setepgen_allowfileregupload(Integer epgen_allowfileregupload) {
		this.epgen_allowfileregupload = epgen_allowfileregupload;
	}
	public String getepgen_filetypes() {
		return epgen_filetypes;
	}

	public void setepgen_filetypes(String epgen_filetypes) {
		this.epgen_filetypes = epgen_filetypes;
	}
	public Integer getepgen_filesize() {
		return epgen_filesize;
	}

	public void setepgen_filesize(Integer epgen_filesize) {
		this.epgen_filesize = epgen_filesize;
	}
	public Integer getepgen_showranking() {
		return epgen_showranking;
	}

	public void setepgen_showranking(Integer epgen_showranking) {
		this.epgen_showranking = epgen_showranking;
	}
	public Integer getepgen_rankimages() {
		return epgen_rankimages;
	}

	public void setepgen_rankimages(Integer epgen_rankimages) {
		this.epgen_rankimages = epgen_rankimages;
	}
	public String getepgen_avatar_src() {
		return epgen_avatar_src;
	}

	public void setepgen_avatar_src(String epgen_avatar_src) {
		this.epgen_avatar_src = epgen_avatar_src;
	}
	public String getepgen_fb_profile() {
		return epgen_fb_profile;
	}

	public void setepgen_fb_profile(String epgen_fb_profile) {
		this.epgen_fb_profile = epgen_fb_profile;
	}
	public String getepgen_pm_component() {
		return epgen_pm_component;
	}

	public void setepgen_pm_component(String epgen_pm_component) {
		this.epgen_pm_component = epgen_pm_component;
	}
	public Integer getepgen_userlist_rows() {
		return epgen_userlist_rows;
	}

	public void setepgen_userlist_rows(Integer epgen_userlist_rows) {
		this.epgen_userlist_rows = epgen_userlist_rows;
	}
	public Integer getepgen_userlist_online() {
		return epgen_userlist_online;
	}

	public void setepgen_userlist_online(Integer epgen_userlist_online) {
		this.epgen_userlist_online = epgen_userlist_online;
	}
	public Integer getepgen_userlist_avatar() {
		return epgen_userlist_avatar;
	}

	public void setepgen_userlist_avatar(Integer epgen_userlist_avatar) {
		this.epgen_userlist_avatar = epgen_userlist_avatar;
	}
	public Integer getepgen_userlist_name() {
		return epgen_userlist_name;
	}

	public void setepgen_userlist_name(Integer epgen_userlist_name) {
		this.epgen_userlist_name = epgen_userlist_name;
	}
	public Integer getepgen_userlist_username() {
		return epgen_userlist_username;
	}

	public void setepgen_userlist_username(Integer epgen_userlist_username) {
		this.epgen_userlist_username = epgen_userlist_username;
	}
	public Integer getepgen_userlist_posts() {
		return epgen_userlist_posts;
	}

	public void setepgen_userlist_posts(Integer epgen_userlist_posts) {
		this.epgen_userlist_posts = epgen_userlist_posts;
	}
	public Integer getepgen_userlist_karma() {
		return epgen_userlist_karma;
	}

	public void setepgen_userlist_karma(Integer epgen_userlist_karma) {
		this.epgen_userlist_karma = epgen_userlist_karma;
	}
	public Integer getepgen_userlist_email() {
		return epgen_userlist_email;
	}

	public void setepgen_userlist_email(Integer epgen_userlist_email) {
		this.epgen_userlist_email = epgen_userlist_email;
	}
	public Integer getepgen_userlist_usertype() {
		return epgen_userlist_usertype;
	}

	public void setepgen_userlist_usertype(Integer epgen_userlist_usertype) {
		this.epgen_userlist_usertype = epgen_userlist_usertype;
	}
	public Integer getepgen_userlist_joindate() {
		return epgen_userlist_joindate;
	}

	public void setepgen_userlist_joindate(Integer epgen_userlist_joindate) {
		this.epgen_userlist_joindate = epgen_userlist_joindate;
	}
	public Integer getepgen_userlist_lastvisitdate() {
		return epgen_userlist_lastvisitdate;
	}

	public void setepgen_userlist_lastvisitdate(Integer epgen_userlist_lastvisitdate) {
		this.epgen_userlist_lastvisitdate = epgen_userlist_lastvisitdate;
	}
	public Integer getepgen_userlist_userhits() {
		return epgen_userlist_userhits;
	}

	public void setepgen_userlist_userhits(Integer epgen_userlist_userhits) {
		this.epgen_userlist_userhits = epgen_userlist_userhits;
	}
	public String getepgen_latestcategory() {
		return epgen_latestcategory;
	}

	public void setepgen_latestcategory(String epgen_latestcategory) {
		this.epgen_latestcategory = epgen_latestcategory;
	}
	public Integer getepgen_showstats() {
		return epgen_showstats;
	}

	public void setepgen_showstats(Integer epgen_showstats) {
		this.epgen_showstats = epgen_showstats;
	}
	public Integer getepgen_showwhoisonline() {
		return epgen_showwhoisonline;
	}

	public void setepgen_showwhoisonline(Integer epgen_showwhoisonline) {
		this.epgen_showwhoisonline = epgen_showwhoisonline;
	}
	public Integer getepgen_showgenstats() {
		return epgen_showgenstats;
	}

	public void setepgen_showgenstats(Integer epgen_showgenstats) {
		this.epgen_showgenstats = epgen_showgenstats;
	}
	public Integer getepgen_showpopuserstats() {
		return epgen_showpopuserstats;
	}

	public void setepgen_showpopuserstats(Integer epgen_showpopuserstats) {
		this.epgen_showpopuserstats = epgen_showpopuserstats;
	}
	public Integer getepgen_popusercount() {
		return epgen_popusercount;
	}

	public void setepgen_popusercount(Integer epgen_popusercount) {
		this.epgen_popusercount = epgen_popusercount;
	}
	public Integer getepgen_showpopsubjectstats() {
		return epgen_showpopsubjectstats;
	}

	public void setepgen_showpopsubjectstats(Integer epgen_showpopsubjectstats) {
		this.epgen_showpopsubjectstats = epgen_showpopsubjectstats;
	}
	public Integer getepgen_popsubjectcount() {
		return epgen_popsubjectcount;
	}

	public void setepgen_popsubjectcount(Integer epgen_popsubjectcount) {
		this.epgen_popsubjectcount = epgen_popsubjectcount;
	}
	public Integer getepgen_usernamechange() {
		return epgen_usernamechange;
	}

	public void setepgen_usernamechange(Integer epgen_usernamechange) {
		this.epgen_usernamechange = epgen_usernamechange;
	}
	public Integer getepgen_rules_infb() {
		return epgen_rules_infb;
	}

	public void setepgen_rules_infb(Integer epgen_rules_infb) {
		this.epgen_rules_infb = epgen_rules_infb;
	}
	public Integer getepgen_rules_cid() {
		return epgen_rules_cid;
	}

	public void setepgen_rules_cid(Integer epgen_rules_cid) {
		this.epgen_rules_cid = epgen_rules_cid;
	}
	public Integer getepgen_help_infb() {
		return epgen_help_infb;
	}

	public void setepgen_help_infb(Integer epgen_help_infb) {
		this.epgen_help_infb = epgen_help_infb;
	}
	public Integer getepgen_help_cid() {
		return epgen_help_cid;
	}

	public void setepgen_help_cid(Integer epgen_help_cid) {
		this.epgen_help_cid = epgen_help_cid;
	}
	public Integer getepgen_showspoilertag() {
		return epgen_showspoilertag;
	}

	public void setepgen_showspoilertag(Integer epgen_showspoilertag) {
		this.epgen_showspoilertag = epgen_showspoilertag;
	}
	public Integer getepgen_showvideotag() {
		return epgen_showvideotag;
	}

	public void setepgen_showvideotag(Integer epgen_showvideotag) {
		this.epgen_showvideotag = epgen_showvideotag;
	}
	public Integer getepgen_showebaytag() {
		return epgen_showebaytag;
	}

	public void setepgen_showebaytag(Integer epgen_showebaytag) {
		this.epgen_showebaytag = epgen_showebaytag;
	}
	public Integer getepgen_trimlongurls() {
		return epgen_trimlongurls;
	}

	public void setepgen_trimlongurls(Integer epgen_trimlongurls) {
		this.epgen_trimlongurls = epgen_trimlongurls;
	}
	public Integer getepgen_trimlongurlsfront() {
		return epgen_trimlongurlsfront;
	}

	public void setepgen_trimlongurlsfront(Integer epgen_trimlongurlsfront) {
		this.epgen_trimlongurlsfront = epgen_trimlongurlsfront;
	}
	public Integer getepgen_trimlongurlsback() {
		return epgen_trimlongurlsback;
	}

	public void setepgen_trimlongurlsback(Integer epgen_trimlongurlsback) {
		this.epgen_trimlongurlsback = epgen_trimlongurlsback;
	}
	public Integer getepgen_autoembedyoutube() {
		return epgen_autoembedyoutube;
	}

	public void setepgen_autoembedyoutube(Integer epgen_autoembedyoutube) {
		this.epgen_autoembedyoutube = epgen_autoembedyoutube;
	}
	public Integer getepgen_autoembedebay() {
		return epgen_autoembedebay;
	}

	public void setepgen_autoembedebay(Integer epgen_autoembedebay) {
		this.epgen_autoembedebay = epgen_autoembedebay;
	}
	public String getepgen_ebaylanguagecode() {
		return epgen_ebaylanguagecode;
	}

	public void setepgen_ebaylanguagecode(String epgen_ebaylanguagecode) {
		this.epgen_ebaylanguagecode = epgen_ebaylanguagecode;
	}
	public Integer getepgen_fbsessiontimeout() {
		return epgen_fbsessiontimeout;
	}

	public void setepgen_fbsessiontimeout(Integer epgen_fbsessiontimeout) {
		this.epgen_fbsessiontimeout = epgen_fbsessiontimeout;
	}
	public Integer getepgen_highlightcode() {
		return epgen_highlightcode;
	}

	public void setepgen_highlightcode(Integer epgen_highlightcode) {
		this.epgen_highlightcode = epgen_highlightcode;
	}
	public String getepgen_rss_type() {
		return epgen_rss_type;
	}

	public void setepgen_rss_type(String epgen_rss_type) {
		this.epgen_rss_type = epgen_rss_type;
	}
	public String getepgen_rss_timelimit() {
		return epgen_rss_timelimit;
	}

	public void setepgen_rss_timelimit(String epgen_rss_timelimit) {
		this.epgen_rss_timelimit = epgen_rss_timelimit;
	}
	public Integer getepgen_rss_limit() {
		return epgen_rss_limit;
	}

	public void setepgen_rss_limit(Integer epgen_rss_limit) {
		this.epgen_rss_limit = epgen_rss_limit;
	}
	public String getepgen_rss_included_categories() {
		return epgen_rss_included_categories;
	}

	public void setepgen_rss_included_categories(String epgen_rss_included_categories) {
		this.epgen_rss_included_categories = epgen_rss_included_categories;
	}
	public String getepgen_rss_excluded_categories() {
		return epgen_rss_excluded_categories;
	}

	public void setepgen_rss_excluded_categories(String epgen_rss_excluded_categories) {
		this.epgen_rss_excluded_categories = epgen_rss_excluded_categories;
	}
	public String getepgen_rss_specification() {
		return epgen_rss_specification;
	}

	public void setepgen_rss_specification(String epgen_rss_specification) {
		this.epgen_rss_specification = epgen_rss_specification;
	}
	public Integer getepgen_rss_allow_html() {
		return epgen_rss_allow_html;
	}

	public void setepgen_rss_allow_html(Integer epgen_rss_allow_html) {
		this.epgen_rss_allow_html = epgen_rss_allow_html;
	}
	public String getepgen_rss_author_format() {
		return epgen_rss_author_format;
	}

	public void setepgen_rss_author_format(String epgen_rss_author_format) {
		this.epgen_rss_author_format = epgen_rss_author_format;
	}
	public Integer getepgen_rss_author_in_title() {
		return epgen_rss_author_in_title;
	}

	public void setepgen_rss_author_in_title(Integer epgen_rss_author_in_title) {
		this.epgen_rss_author_in_title = epgen_rss_author_in_title;
	}
	public String getepgen_rss_word_count() {
		return epgen_rss_word_count;
	}

	public void setepgen_rss_word_count(String epgen_rss_word_count) {
		this.epgen_rss_word_count = epgen_rss_word_count;
	}
	public Integer getepgen_rss_old_titles() {
		return epgen_rss_old_titles;
	}

	public void setepgen_rss_old_titles(Integer epgen_rss_old_titles) {
		this.epgen_rss_old_titles = epgen_rss_old_titles;
	}
	public Integer getepgen_rss_cache() {
		return epgen_rss_cache;
	}

	public void setepgen_rss_cache(Integer epgen_rss_cache) {
		this.epgen_rss_cache = epgen_rss_cache;
	}
	public String getepgen_fbdefaultpage() {
		return epgen_fbdefaultpage;
	}

	public void setepgen_fbdefaultpage(String epgen_fbdefaultpage) {
		this.epgen_fbdefaultpage = epgen_fbdefaultpage;
	}
	public String getepgen_default_sort() {
		return epgen_default_sort;
	}

	public void setepgen_default_sort(String epgen_default_sort) {
		this.epgen_default_sort = epgen_default_sort;
	}
	public Integer getepgen_alphauserpointsnumchars() {
		return epgen_alphauserpointsnumchars;
	}

	public void setepgen_alphauserpointsnumchars(Integer epgen_alphauserpointsnumchars) {
		this.epgen_alphauserpointsnumchars = epgen_alphauserpointsnumchars;
	}
	public Integer getepgen_sef() {
		return epgen_sef;
	}

	public void setepgen_sef(Integer epgen_sef) {
		this.epgen_sef = epgen_sef;
	}
	public Integer getepgen_sefcats() {
		return epgen_sefcats;
	}

	public void setepgen_sefcats(Integer epgen_sefcats) {
		this.epgen_sefcats = epgen_sefcats;
	}
	public Integer getepgen_sefutf8() {
		return epgen_sefutf8;
	}

	public void setepgen_sefutf8(Integer epgen_sefutf8) {
		this.epgen_sefutf8 = epgen_sefutf8;
	}
	public Integer getepgen_showimgforguest() {
		return epgen_showimgforguest;
	}

	public void setepgen_showimgforguest(Integer epgen_showimgforguest) {
		this.epgen_showimgforguest = epgen_showimgforguest;
	}
	public Integer getepgen_showfileforguest() {
		return epgen_showfileforguest;
	}

	public void setepgen_showfileforguest(Integer epgen_showfileforguest) {
		this.epgen_showfileforguest = epgen_showfileforguest;
	}
	public Integer getepgen_pollnboptions() {
		return epgen_pollnboptions;
	}

	public void setepgen_pollnboptions(Integer epgen_pollnboptions) {
		this.epgen_pollnboptions = epgen_pollnboptions;
	}
	public Integer getepgen_pollallowvoteone() {
		return epgen_pollallowvoteone;
	}

	public void setepgen_pollallowvoteone(Integer epgen_pollallowvoteone) {
		this.epgen_pollallowvoteone = epgen_pollallowvoteone;
	}
	public Integer getepgen_pollenabled() {
		return epgen_pollenabled;
	}

	public void setepgen_pollenabled(Integer epgen_pollenabled) {
		this.epgen_pollenabled = epgen_pollenabled;
	}
	public Integer getepgen_poppollscount() {
		return epgen_poppollscount;
	}

	public void setepgen_poppollscount(Integer epgen_poppollscount) {
		this.epgen_poppollscount = epgen_poppollscount;
	}
	public Integer getepgen_showpoppollstats() {
		return epgen_showpoppollstats;
	}

	public void setepgen_showpoppollstats(Integer epgen_showpoppollstats) {
		this.epgen_showpoppollstats = epgen_showpoppollstats;
	}
	public String getepgen_polltimebtvotes() {
		return epgen_polltimebtvotes;
	}

	public void setepgen_polltimebtvotes(String epgen_polltimebtvotes) {
		this.epgen_polltimebtvotes = epgen_polltimebtvotes;
	}
	public Integer getepgen_pollnbvotesbyuser() {
		return epgen_pollnbvotesbyuser;
	}

	public void setepgen_pollnbvotesbyuser(Integer epgen_pollnbvotesbyuser) {
		this.epgen_pollnbvotesbyuser = epgen_pollnbvotesbyuser;
	}
	public Integer getepgen_pollresultsuserslist() {
		return epgen_pollresultsuserslist;
	}

	public void setepgen_pollresultsuserslist(Integer epgen_pollresultsuserslist) {
		this.epgen_pollresultsuserslist = epgen_pollresultsuserslist;
	}
	public Integer getepgen_maxpersotext() {
		return epgen_maxpersotext;
	}

	public void setepgen_maxpersotext(Integer epgen_maxpersotext) {
		this.epgen_maxpersotext = epgen_maxpersotext;
	}
	public String getepgen_ordering_system() {
		return epgen_ordering_system;
	}

	public void setepgen_ordering_system(String epgen_ordering_system) {
		this.epgen_ordering_system = epgen_ordering_system;
	}
	public String getepgen_post_dateformat() {
		return epgen_post_dateformat;
	}

	public void setepgen_post_dateformat(String epgen_post_dateformat) {
		this.epgen_post_dateformat = epgen_post_dateformat;
	}
	public String getepgen_post_dateformat_hover() {
		return epgen_post_dateformat_hover;
	}

	public void setepgen_post_dateformat_hover(String epgen_post_dateformat_hover) {
		this.epgen_post_dateformat_hover = epgen_post_dateformat_hover;
	}
	public Integer getepgen_hide_ip() {
		return epgen_hide_ip;
	}

	public void setepgen_hide_ip(Integer epgen_hide_ip) {
		this.epgen_hide_ip = epgen_hide_ip;
	}
	public Integer getepgen_js_actstr_integration() {
		return epgen_js_actstr_integration;
	}

	public void setepgen_js_actstr_integration(Integer epgen_js_actstr_integration) {
		this.epgen_js_actstr_integration = epgen_js_actstr_integration;
	}
	public String getepgen_imagetypes() {
		return epgen_imagetypes;
	}

	public void setepgen_imagetypes(String epgen_imagetypes) {
		this.epgen_imagetypes = epgen_imagetypes;
	}
	public Integer getepgen_checkmimetypes() {
		return epgen_checkmimetypes;
	}

	public void setepgen_checkmimetypes(Integer epgen_checkmimetypes) {
		this.epgen_checkmimetypes = epgen_checkmimetypes;
	}
	public String getepgen_imagemimetypes() {
		return epgen_imagemimetypes;
	}

	public void setepgen_imagemimetypes(String epgen_imagemimetypes) {
		this.epgen_imagemimetypes = epgen_imagemimetypes;
	}
	public Integer getepgen_imagequality() {
		return epgen_imagequality;
	}

	public void setepgen_imagequality(Integer epgen_imagequality) {
		this.epgen_imagequality = epgen_imagequality;
	}
	public Integer getepgen_thumbheight() {
		return epgen_thumbheight;
	}

	public void setepgen_thumbheight(Integer epgen_thumbheight) {
		this.epgen_thumbheight = epgen_thumbheight;
	}
	public Integer getepgen_thumbwidth() {
		return epgen_thumbwidth;
	}

	public void setepgen_thumbwidth(Integer epgen_thumbwidth) {
		this.epgen_thumbwidth = epgen_thumbwidth;
	}
	public String getepgen_hideuserprofileinfo() {
		return epgen_hideuserprofileinfo;
	}

	public void setepgen_hideuserprofileinfo(String epgen_hideuserprofileinfo) {
		this.epgen_hideuserprofileinfo = epgen_hideuserprofileinfo;
	}
	public String getepgen_integration_access() {
		return epgen_integration_access;
	}

	public void setepgen_integration_access(String epgen_integration_access) {
		this.epgen_integration_access = epgen_integration_access;
	}
	public String getepgen_integration_login() {
		return epgen_integration_login;
	}

	public void setepgen_integration_login(String epgen_integration_login) {
		this.epgen_integration_login = epgen_integration_login;
	}
	public String getepgen_integration_avatar() {
		return epgen_integration_avatar;
	}

	public void setepgen_integration_avatar(String epgen_integration_avatar) {
		this.epgen_integration_avatar = epgen_integration_avatar;
	}
	public String getepgen_integration_profile() {
		return epgen_integration_profile;
	}

	public void setepgen_integration_profile(String epgen_integration_profile) {
		this.epgen_integration_profile = epgen_integration_profile;
	}
	public String getepgen_integration_private() {
		return epgen_integration_private;
	}

	public void setepgen_integration_private(String epgen_integration_private) {
		this.epgen_integration_private = epgen_integration_private;
	}
	public String getepgen_integration_activity() {
		return epgen_integration_activity;
	}

	public void setepgen_integration_activity(String epgen_integration_activity) {
		this.epgen_integration_activity = epgen_integration_activity;
	}
	public Integer getepgen_boxghostmessage() {
		return epgen_boxghostmessage;
	}

	public void setepgen_boxghostmessage(Integer epgen_boxghostmessage) {
		this.epgen_boxghostmessage = epgen_boxghostmessage;
	}
	public Integer getepgen_userdeletetmessage() {
		return epgen_userdeletetmessage;
	}

	public void setepgen_userdeletetmessage(Integer epgen_userdeletetmessage) {
		this.epgen_userdeletetmessage = epgen_userdeletetmessage;
	}
	public Integer getepgen_latestcategory_in() {
		return epgen_latestcategory_in;
	}

	public void setepgen_latestcategory_in(Integer epgen_latestcategory_in) {
		this.epgen_latestcategory_in = epgen_latestcategory_in;
	}
	public Integer getepgen_topicicons() {
		return epgen_topicicons;
	}

	public void setepgen_topicicons(Integer epgen_topicicons) {
		this.epgen_topicicons = epgen_topicicons;
	}
	public Integer getepgen_onlineusers() {
		return epgen_onlineusers;
	}

	public void setepgen_onlineusers(Integer epgen_onlineusers) {
		this.epgen_onlineusers = epgen_onlineusers;
	}
	public Integer getepgen_debug() {
		return epgen_debug;
	}

	public void setepgen_debug(Integer epgen_debug) {
		this.epgen_debug = epgen_debug;
	}
	public Integer getepgen_catsautosubscribed() {
		return epgen_catsautosubscribed;
	}

	public void setepgen_catsautosubscribed(Integer epgen_catsautosubscribed) {
		this.epgen_catsautosubscribed = epgen_catsautosubscribed;
	}
	public Integer getepgen_showbannedreason() {
		return epgen_showbannedreason;
	}

	public void setepgen_showbannedreason(Integer epgen_showbannedreason) {
		this.epgen_showbannedreason = epgen_showbannedreason;
	}
	public Integer getepgen_version_check() {
		return epgen_version_check;
	}

	public void setepgen_version_check(Integer epgen_version_check) {
		this.epgen_version_check = epgen_version_check;
	}
	public Integer getepgen_showthankyou() {
		return epgen_showthankyou;
	}

	public void setepgen_showthankyou(Integer epgen_showthankyou) {
		this.epgen_showthankyou = epgen_showthankyou;
	}
	public Integer getepgen_showpopthankyoustats() {
		return epgen_showpopthankyoustats;
	}

	public void setepgen_showpopthankyoustats(Integer epgen_showpopthankyoustats) {
		this.epgen_showpopthankyoustats = epgen_showpopthankyoustats;
	}
	public Integer getepgen_popthankscount() {
		return epgen_popthankscount;
	}

	public void setepgen_popthankscount(Integer epgen_popthankscount) {
		this.epgen_popthankscount = epgen_popthankscount;
	}
	public Integer getepgen_mod_see_deleted() {
		return epgen_mod_see_deleted;
	}

	public void setepgen_mod_see_deleted(Integer epgen_mod_see_deleted) {
		this.epgen_mod_see_deleted = epgen_mod_see_deleted;
	}
	public String getepgen_bbcode_img_secure() {
		return epgen_bbcode_img_secure;
	}

	public void setepgen_bbcode_img_secure(String epgen_bbcode_img_secure) {
		this.epgen_bbcode_img_secure = epgen_bbcode_img_secure;
	}
	public Integer getepgen_listcat_show_moderators() {
		return epgen_listcat_show_moderators;
	}

	public void setepgen_listcat_show_moderators(Integer epgen_listcat_show_moderators) {
		this.epgen_listcat_show_moderators = epgen_listcat_show_moderators;
	}
	public Integer getepgen_lightbox() {
		return epgen_lightbox;
	}

	public void setepgen_lightbox(Integer epgen_lightbox) {
		this.epgen_lightbox = epgen_lightbox;
	}
	public Integer getepgen_activity_limit() {
		return epgen_activity_limit;
	}

	public void setepgen_activity_limit(Integer epgen_activity_limit) {
		this.epgen_activity_limit = epgen_activity_limit;
	}
	public Integer getepgen_show_list_time() {
		return epgen_show_list_time;
	}

	public void setepgen_show_list_time(Integer epgen_show_list_time) {
		this.epgen_show_list_time = epgen_show_list_time;
	}
	public Integer getepgen_show_session_type() {
		return epgen_show_session_type;
	}

	public void setepgen_show_session_type(Integer epgen_show_session_type) {
		this.epgen_show_session_type = epgen_show_session_type;
	}
	public Integer getepgen_show_session_starttime() {
		return epgen_show_session_starttime;
	}

	public void setepgen_show_session_starttime(Integer epgen_show_session_starttime) {
		this.epgen_show_session_starttime = epgen_show_session_starttime;
	}
	public Integer getepgen_userlist_allowed() {
		return epgen_userlist_allowed;
	}

	public void setepgen_userlist_allowed(Integer epgen_userlist_allowed) {
		this.epgen_userlist_allowed = epgen_userlist_allowed;
	}
	public Integer getepgen_userlist_count_users() {
		return epgen_userlist_count_users;
	}

	public void setepgen_userlist_count_users(Integer epgen_userlist_count_users) {
		this.epgen_userlist_count_users = epgen_userlist_count_users;
	}
	public Integer getepgen_enable_threaded_layouts() {
		return epgen_enable_threaded_layouts;
	}

	public void setepgen_enable_threaded_layouts(Integer epgen_enable_threaded_layouts) {
		this.epgen_enable_threaded_layouts = epgen_enable_threaded_layouts;
	}
	public String getepgen_category_subscriptions() {
		return epgen_category_subscriptions;
	}

	public void setepgen_category_subscriptions(String epgen_category_subscriptions) {
		this.epgen_category_subscriptions = epgen_category_subscriptions;
	}
	public String getepgen_topic_subscriptions() {
		return epgen_topic_subscriptions;
	}

	public void setepgen_topic_subscriptions(String epgen_topic_subscriptions) {
		this.epgen_topic_subscriptions = epgen_topic_subscriptions;
	}
	public Integer getepgen_pubprofile() {
		return epgen_pubprofile;
	}

	public void setepgen_pubprofile(Integer epgen_pubprofile) {
		this.epgen_pubprofile = epgen_pubprofile;
	}
	public Integer getepgen_thankyou_max() {
		return epgen_thankyou_max;
	}

	public void setepgen_thankyou_max(Integer epgen_thankyou_max) {
		this.epgen_thankyou_max = epgen_thankyou_max;
	}
	public Integer getepgen_email_recipient_count() {
		return epgen_email_recipient_count;
	}

	public void setepgen_email_recipient_count(Integer epgen_email_recipient_count) {
		this.epgen_email_recipient_count = epgen_email_recipient_count;
	}
	public String getepgen_email_recipient_privacy() {
		return epgen_email_recipient_privacy;
	}

	public void setepgen_email_recipient_privacy(String epgen_email_recipient_privacy) {
		this.epgen_email_recipient_privacy = epgen_email_recipient_privacy;
	}
	public String getepgen_email_visible_address() {
		return epgen_email_visible_address;
	}

	public void setepgen_email_visible_address(String epgen_email_visible_address) {
		this.epgen_email_visible_address = epgen_email_visible_address;
	}
	public Integer getepgen_captcha_post_limit() {
		return epgen_captcha_post_limit;
	}

	public void setepgen_captcha_post_limit(Integer epgen_captcha_post_limit) {
		this.epgen_captcha_post_limit = epgen_captcha_post_limit;
	}
	public String getepgen_recaptcha_publickey() {
		return epgen_recaptcha_publickey;
	}

	public void setepgen_recaptcha_publickey(String epgen_recaptcha_publickey) {
		this.epgen_recaptcha_publickey = epgen_recaptcha_publickey;
	}
	public String getepgen_recaptcha_privatekey() {
		return epgen_recaptcha_privatekey;
	}

	public void setepgen_recaptcha_privatekey(String epgen_recaptcha_privatekey) {
		this.epgen_recaptcha_privatekey = epgen_recaptcha_privatekey;
	}
	public String getepgen_recaptcha_theme() {
		return epgen_recaptcha_theme;
	}

	public void setepgen_recaptcha_theme(String epgen_recaptcha_theme) {
		this.epgen_recaptcha_theme = epgen_recaptcha_theme;
	}

}
