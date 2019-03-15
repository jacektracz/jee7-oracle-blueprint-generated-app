
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
@Table(name = "joo2_virtuemart_currencies", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_currencies implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_currency_id")
    private Integer epgen_virtuemart_currency_id;
    @Column(name="virtuemart_vendor_id")
    private Integer epgen_virtuemart_vendor_id;
    @Column(name="currency_name")
    private String epgen_currency_name;
    @Column(name="currency_code_2")
    private String epgen_currency_code_2;
    @Column(name="currency_code_3")
    private String epgen_currency_code_3;
    @Column(name="currency_numeric_code")
    private Integer epgen_currency_numeric_code;
    @Column(name="currency_symbol")
    private String epgen_currency_symbol;
    @Column(name="currency_decimal_place")
    private String epgen_currency_decimal_place;
    @Column(name="currency_decimal_symbol")
    private String epgen_currency_decimal_symbol;
    @Column(name="currency_thousands")
    private String epgen_currency_thousands;
    @Column(name="currency_positive_style")
    private String epgen_currency_positive_style;
    @Column(name="currency_negative_style")
    private String epgen_currency_negative_style;
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
	public Integer getepgen_virtuemart_currency_id() {
		return epgen_virtuemart_currency_id;
	}

	public void setepgen_virtuemart_currency_id(Integer epgen_virtuemart_currency_id) {
		this.epgen_virtuemart_currency_id = epgen_virtuemart_currency_id;
	}
	public Integer getepgen_virtuemart_vendor_id() {
		return epgen_virtuemart_vendor_id;
	}

	public void setepgen_virtuemart_vendor_id(Integer epgen_virtuemart_vendor_id) {
		this.epgen_virtuemart_vendor_id = epgen_virtuemart_vendor_id;
	}
	public String getepgen_currency_name() {
		return epgen_currency_name;
	}

	public void setepgen_currency_name(String epgen_currency_name) {
		this.epgen_currency_name = epgen_currency_name;
	}
	public String getepgen_currency_code_2() {
		return epgen_currency_code_2;
	}

	public void setepgen_currency_code_2(String epgen_currency_code_2) {
		this.epgen_currency_code_2 = epgen_currency_code_2;
	}
	public String getepgen_currency_code_3() {
		return epgen_currency_code_3;
	}

	public void setepgen_currency_code_3(String epgen_currency_code_3) {
		this.epgen_currency_code_3 = epgen_currency_code_3;
	}
	public Integer getepgen_currency_numeric_code() {
		return epgen_currency_numeric_code;
	}

	public void setepgen_currency_numeric_code(Integer epgen_currency_numeric_code) {
		this.epgen_currency_numeric_code = epgen_currency_numeric_code;
	}
	public String getepgen_currency_symbol() {
		return epgen_currency_symbol;
	}

	public void setepgen_currency_symbol(String epgen_currency_symbol) {
		this.epgen_currency_symbol = epgen_currency_symbol;
	}
	public String getepgen_currency_decimal_place() {
		return epgen_currency_decimal_place;
	}

	public void setepgen_currency_decimal_place(String epgen_currency_decimal_place) {
		this.epgen_currency_decimal_place = epgen_currency_decimal_place;
	}
	public String getepgen_currency_decimal_symbol() {
		return epgen_currency_decimal_symbol;
	}

	public void setepgen_currency_decimal_symbol(String epgen_currency_decimal_symbol) {
		this.epgen_currency_decimal_symbol = epgen_currency_decimal_symbol;
	}
	public String getepgen_currency_thousands() {
		return epgen_currency_thousands;
	}

	public void setepgen_currency_thousands(String epgen_currency_thousands) {
		this.epgen_currency_thousands = epgen_currency_thousands;
	}
	public String getepgen_currency_positive_style() {
		return epgen_currency_positive_style;
	}

	public void setepgen_currency_positive_style(String epgen_currency_positive_style) {
		this.epgen_currency_positive_style = epgen_currency_positive_style;
	}
	public String getepgen_currency_negative_style() {
		return epgen_currency_negative_style;
	}

	public void setepgen_currency_negative_style(String epgen_currency_negative_style) {
		this.epgen_currency_negative_style = epgen_currency_negative_style;
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
