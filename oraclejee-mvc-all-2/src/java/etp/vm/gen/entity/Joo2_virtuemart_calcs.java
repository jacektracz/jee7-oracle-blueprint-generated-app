
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
@Table(name = "joo2_virtuemart_calcs", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_calcs implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_calc_id")
    private Integer epgen_virtuemart_calc_id;
    @Column(name="virtuemart_vendor_id")
    private Integer epgen_virtuemart_vendor_id;
    @Column(name="calc_name")
    private String epgen_calc_name;
    @Column(name="calc_descr")
    private String epgen_calc_descr;
    @Column(name="calc_kind")
    private String epgen_calc_kind;
    @Column(name="calc_value_mathop")
    private String epgen_calc_value_mathop;
    @Column(name="calc_currency")
    private Integer epgen_calc_currency;
    @Column(name="calc_shopper_published")
    private Integer epgen_calc_shopper_published;
    @Column(name="calc_vendor_published")
    private Integer epgen_calc_vendor_published;
    
    @Column(name = "publish_up", columnDefinition="VARCHAR")
    private String epgen_publish_up;
    
    @Column(name = "publish_down", columnDefinition="VARCHAR")
    private String epgen_publish_down;
    @Column(name="calc_qualify")
    private Integer epgen_calc_qualify;
    @Column(name="calc_affected")
    private Integer epgen_calc_affected;
    @Column(name="calc_amount_dimunit")
    private String epgen_calc_amount_dimunit;
    @Column(name="for_override")
    private Integer epgen_for_override;
    @Column(name="ordering")
    private Integer epgen_ordering;
    @Column(name="shared")
    private Integer epgen_shared;
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
	public Integer getepgen_virtuemart_calc_id() {
		return epgen_virtuemart_calc_id;
	}

	public void setepgen_virtuemart_calc_id(Integer epgen_virtuemart_calc_id) {
		this.epgen_virtuemart_calc_id = epgen_virtuemart_calc_id;
	}
	public Integer getepgen_virtuemart_vendor_id() {
		return epgen_virtuemart_vendor_id;
	}

	public void setepgen_virtuemart_vendor_id(Integer epgen_virtuemart_vendor_id) {
		this.epgen_virtuemart_vendor_id = epgen_virtuemart_vendor_id;
	}
	public String getepgen_calc_name() {
		return epgen_calc_name;
	}

	public void setepgen_calc_name(String epgen_calc_name) {
		this.epgen_calc_name = epgen_calc_name;
	}
	public String getepgen_calc_descr() {
		return epgen_calc_descr;
	}

	public void setepgen_calc_descr(String epgen_calc_descr) {
		this.epgen_calc_descr = epgen_calc_descr;
	}
	public String getepgen_calc_kind() {
		return epgen_calc_kind;
	}

	public void setepgen_calc_kind(String epgen_calc_kind) {
		this.epgen_calc_kind = epgen_calc_kind;
	}
	public String getepgen_calc_value_mathop() {
		return epgen_calc_value_mathop;
	}

	public void setepgen_calc_value_mathop(String epgen_calc_value_mathop) {
		this.epgen_calc_value_mathop = epgen_calc_value_mathop;
	}
	public Integer getepgen_calc_currency() {
		return epgen_calc_currency;
	}

	public void setepgen_calc_currency(Integer epgen_calc_currency) {
		this.epgen_calc_currency = epgen_calc_currency;
	}
	public Integer getepgen_calc_shopper_published() {
		return epgen_calc_shopper_published;
	}

	public void setepgen_calc_shopper_published(Integer epgen_calc_shopper_published) {
		this.epgen_calc_shopper_published = epgen_calc_shopper_published;
	}
	public Integer getepgen_calc_vendor_published() {
		return epgen_calc_vendor_published;
	}

	public void setepgen_calc_vendor_published(Integer epgen_calc_vendor_published) {
		this.epgen_calc_vendor_published = epgen_calc_vendor_published;
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
	public Integer getepgen_calc_qualify() {
		return epgen_calc_qualify;
	}

	public void setepgen_calc_qualify(Integer epgen_calc_qualify) {
		this.epgen_calc_qualify = epgen_calc_qualify;
	}
	public Integer getepgen_calc_affected() {
		return epgen_calc_affected;
	}

	public void setepgen_calc_affected(Integer epgen_calc_affected) {
		this.epgen_calc_affected = epgen_calc_affected;
	}
	public String getepgen_calc_amount_dimunit() {
		return epgen_calc_amount_dimunit;
	}

	public void setepgen_calc_amount_dimunit(String epgen_calc_amount_dimunit) {
		this.epgen_calc_amount_dimunit = epgen_calc_amount_dimunit;
	}
	public Integer getepgen_for_override() {
		return epgen_for_override;
	}

	public void setepgen_for_override(Integer epgen_for_override) {
		this.epgen_for_override = epgen_for_override;
	}
	public Integer getepgen_ordering() {
		return epgen_ordering;
	}

	public void setepgen_ordering(Integer epgen_ordering) {
		this.epgen_ordering = epgen_ordering;
	}
	public Integer getepgen_shared() {
		return epgen_shared;
	}

	public void setepgen_shared(Integer epgen_shared) {
		this.epgen_shared = epgen_shared;
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
