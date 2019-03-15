
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
@Table(name = "joo2_banners", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_banners implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="cid")
    private Integer epgen_cid;
    @Column(name="type")
    private Integer epgen_type;
    @Column(name="name")
    private String epgen_name;
    @Column(name="alias")
    private String epgen_alias;
    @Column(name="imptotal")
    private Integer epgen_imptotal;
    @Column(name="impmade")
    private Integer epgen_impmade;
    @Column(name="clicks")
    private Integer epgen_clicks;
    @Column(name="clickurl")
    private String epgen_clickurl;
    @Column(name="state")
    private Integer epgen_state;
    @Column(name="catid")
    private Integer epgen_catid;
    @Column(name="description")
    private String epgen_description;
    @Column(name="custombannercode")
    private String epgen_custombannercode;
    @Column(name="sticky")
    private Integer epgen_sticky;
    @Column(name="ordering")
    private Integer epgen_ordering;
    @Column(name="metakey")
    private String epgen_metakey;
    @Column(name="params")
    private String epgen_params;
    @Column(name="own_prefix")
    private Integer epgen_own_prefix;
    @Column(name="metakey_prefix")
    private String epgen_metakey_prefix;
    @Column(name="purchase_type")
    private Integer epgen_purchase_type;
    @Column(name="track_clicks")
    private Integer epgen_track_clicks;
    @Column(name="track_impressions")
    private Integer epgen_track_impressions;
    @Column(name="checked_out")
    private Integer epgen_checked_out;
    
    @Column(name = "checked_out_time", columnDefinition="VARCHAR")
    private String epgen_checked_out_time;
    
    @Column(name = "publish_up", columnDefinition="VARCHAR")
    private String epgen_publish_up;
    
    @Column(name = "publish_down", columnDefinition="VARCHAR")
    private String epgen_publish_down;
    
    @Column(name = "reset", columnDefinition="VARCHAR")
    private String epgen_reset;
    
    @Column(name = "created", columnDefinition="VARCHAR")
    private String epgen_created;
    @Column(name="language")
    private String epgen_language;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public Integer getepgen_cid() {
		return epgen_cid;
	}

	public void setepgen_cid(Integer epgen_cid) {
		this.epgen_cid = epgen_cid;
	}
	public Integer getepgen_type() {
		return epgen_type;
	}

	public void setepgen_type(Integer epgen_type) {
		this.epgen_type = epgen_type;
	}
	public String getepgen_name() {
		return epgen_name;
	}

	public void setepgen_name(String epgen_name) {
		this.epgen_name = epgen_name;
	}
	public String getepgen_alias() {
		return epgen_alias;
	}

	public void setepgen_alias(String epgen_alias) {
		this.epgen_alias = epgen_alias;
	}
	public Integer getepgen_imptotal() {
		return epgen_imptotal;
	}

	public void setepgen_imptotal(Integer epgen_imptotal) {
		this.epgen_imptotal = epgen_imptotal;
	}
	public Integer getepgen_impmade() {
		return epgen_impmade;
	}

	public void setepgen_impmade(Integer epgen_impmade) {
		this.epgen_impmade = epgen_impmade;
	}
	public Integer getepgen_clicks() {
		return epgen_clicks;
	}

	public void setepgen_clicks(Integer epgen_clicks) {
		this.epgen_clicks = epgen_clicks;
	}
	public String getepgen_clickurl() {
		return epgen_clickurl;
	}

	public void setepgen_clickurl(String epgen_clickurl) {
		this.epgen_clickurl = epgen_clickurl;
	}
	public Integer getepgen_state() {
		return epgen_state;
	}

	public void setepgen_state(Integer epgen_state) {
		this.epgen_state = epgen_state;
	}
	public Integer getepgen_catid() {
		return epgen_catid;
	}

	public void setepgen_catid(Integer epgen_catid) {
		this.epgen_catid = epgen_catid;
	}
	public String getepgen_description() {
		return epgen_description;
	}

	public void setepgen_description(String epgen_description) {
		this.epgen_description = epgen_description;
	}
	public String getepgen_custombannercode() {
		return epgen_custombannercode;
	}

	public void setepgen_custombannercode(String epgen_custombannercode) {
		this.epgen_custombannercode = epgen_custombannercode;
	}
	public Integer getepgen_sticky() {
		return epgen_sticky;
	}

	public void setepgen_sticky(Integer epgen_sticky) {
		this.epgen_sticky = epgen_sticky;
	}
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
	}
	public String getepgen_metakey() {
		return epgen_metakey;
	}

	public void setepgen_metakey(String epgen_metakey) {
		this.epgen_metakey = epgen_metakey;
	}
	public String getepgen_params() {
		return epgen_params;
	}

	public void setepgen_params(String epgen_params) {
		this.epgen_params = epgen_params;
	}
	public Integer getepgen_own_prefix() {
		return epgen_own_prefix;
	}

	public void setepgen_own_prefix(Integer epgen_own_prefix) {
		this.epgen_own_prefix = epgen_own_prefix;
	}
	public String getepgen_metakey_prefix() {
		return epgen_metakey_prefix;
	}

	public void setepgen_metakey_prefix(String epgen_metakey_prefix) {
		this.epgen_metakey_prefix = epgen_metakey_prefix;
	}
	public Integer getepgen_purchase_type() {
		return epgen_purchase_type;
	}

	public void setepgen_purchase_type(Integer epgen_purchase_type) {
		this.epgen_purchase_type = epgen_purchase_type;
	}
	public Integer getepgen_track_clicks() {
		return epgen_track_clicks;
	}

	public void setepgen_track_clicks(Integer epgen_track_clicks) {
		this.epgen_track_clicks = epgen_track_clicks;
	}
	public Integer getepgen_track_impressions() {
		return epgen_track_impressions;
	}

	public void setepgen_track_impressions(Integer epgen_track_impressions) {
		this.epgen_track_impressions = epgen_track_impressions;
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
	public String getepgen_publish_up() {
		return epgen_publish_up;
	}

	public void setepgen_publish_up(String epgen_publish_up) {
		this.epgen_publish_up = epgen_publish_up;
	}
	public String getepgen_publish_down() {
		return epgen_publish_down;
	}

	public void setepgen_publish_down(String epgen_publish_down) {
		this.epgen_publish_down = epgen_publish_down;
	}
	public String getepgen_reset() {
		return epgen_reset;
	}

	public void setepgen_reset(String epgen_reset) {
		this.epgen_reset = epgen_reset;
	}
	public String getepgen_created() {
		return epgen_created;
	}

	public void setepgen_created(String epgen_created) {
		this.epgen_created = epgen_created;
	}
	public String getepgen_language() {
		return epgen_language;
	}

	public void setepgen_language(String epgen_language) {
		this.epgen_language = epgen_language;
	}

}
