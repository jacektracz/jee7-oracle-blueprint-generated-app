
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
@Table(name = "joo2_virtuemart_order_histories", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_order_histories implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_order_history_id")
    private Integer epgen_virtuemart_order_history_id;
    @Column(name="virtuemart_order_id")
    private Integer epgen_virtuemart_order_id;
    @Column(name="order_status_code")
    private String epgen_order_status_code;
    
    @Column(name = "date_added", columnDefinition="VARCHAR")
    private String epgen_date_added;
    @Column(name="customer_notified")
    private Integer epgen_customer_notified;
    @Column(name="comments")
    private String epgen_comments;
    @Column(name="published")
    private Integer epgen_published;
    
    @Column(name = "created_on", columnDefinition="VARCHAR")
    private String epgen_created_on;
    @Column(name="created_by")
    private Integer epgen_created_by;
    
    @Column(name = "modified_on", columnDefinition="VARCHAR")
    private String epgen_modified_on;
    @Column(name="modified_by")
    private Integer epgen_modified_by;
    
    @Column(name = "locked_on", columnDefinition="VARCHAR")
    private String epgen_locked_on;
    @Column(name="locked_by")
    private Integer epgen_locked_by;
	public Integer getepgen_virtuemart_order_history_id() {
		return epgen_virtuemart_order_history_id;
	}

	public void setepgen_virtuemart_order_history_id(Integer epgen_virtuemart_order_history_id) {
		this.epgen_virtuemart_order_history_id = epgen_virtuemart_order_history_id;
	}
	public Integer getepgen_virtuemart_order_id() {
		return epgen_virtuemart_order_id;
	}

	public void setepgen_virtuemart_order_id(Integer epgen_virtuemart_order_id) {
		this.epgen_virtuemart_order_id = epgen_virtuemart_order_id;
	}
	public String getepgen_order_status_code() {
		return epgen_order_status_code;
	}

	public void setepgen_order_status_code(String epgen_order_status_code) {
		this.epgen_order_status_code = epgen_order_status_code;
	}
	public String getepgen_date_added() {
		return epgen_date_added;
	}

	public void setepgen_date_added(String epgen_date_added) {
		this.epgen_date_added = epgen_date_added;
	}
	public Integer getepgen_customer_notified() {
		return epgen_customer_notified;
	}

	public void setepgen_customer_notified(Integer epgen_customer_notified) {
		this.epgen_customer_notified = epgen_customer_notified;
	}
	public String getepgen_comments() {
		return epgen_comments;
	}

	public void setepgen_comments(String epgen_comments) {
		this.epgen_comments = epgen_comments;
	}
	public Integer getepgen_published() {
		return epgen_published;
	}

	public void setepgen_published(Integer epgen_published) {
		this.epgen_published = epgen_published;
	}
	public String getepgen_created_on() {
		return epgen_created_on;
	}

	public void setepgen_created_on(String epgen_created_on) {
		this.epgen_created_on = epgen_created_on;
	}
	public Integer getepgen_created_by() {
		return epgen_created_by;
	}

	public void setepgen_created_by(Integer epgen_created_by) {
		this.epgen_created_by = epgen_created_by;
	}
	public String getepgen_modified_on() {
		return epgen_modified_on;
	}

	public void setepgen_modified_on(String epgen_modified_on) {
		this.epgen_modified_on = epgen_modified_on;
	}
	public Integer getepgen_modified_by() {
		return epgen_modified_by;
	}

	public void setepgen_modified_by(Integer epgen_modified_by) {
		this.epgen_modified_by = epgen_modified_by;
	}
	public String getepgen_locked_on() {
		return epgen_locked_on;
	}

	public void setepgen_locked_on(String epgen_locked_on) {
		this.epgen_locked_on = epgen_locked_on;
	}
	public Integer getepgen_locked_by() {
		return epgen_locked_by;
	}

	public void setepgen_locked_by(Integer epgen_locked_by) {
		this.epgen_locked_by = epgen_locked_by;
	}

}
