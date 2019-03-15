
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
@Table(name = "joo2_virtuemart_userinfos", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_virtuemart_userinfos implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="virtuemart_userinfo_id")
    private String epgen_virtuemart_userinfo_id;
    @Column(name="virtuemart_user_id")
    private Integer epgen_virtuemart_user_id;
    @Column(name="address_type")
    private String epgen_address_type;
    @Column(name="address_type_name")
    private String epgen_address_type_name;
    @Column(name="name")
    private String epgen_name;
    @Column(name="company")
    private String epgen_company;
    @Column(name="title")
    private String epgen_title;
    @Column(name="last_name")
    private String epgen_last_name;
    @Column(name="first_name")
    private String epgen_first_name;
    @Column(name="middle_name")
    private String epgen_middle_name;
    @Column(name="phone_1")
    private String epgen_phone_1;
    @Column(name="phone_2")
    private String epgen_phone_2;
    @Column(name="fax")
    private String epgen_fax;
    @Column(name="address_1")
    private String epgen_address_1;
    @Column(name="address_2")
    private String epgen_address_2;
    @Column(name="city")
    private String epgen_city;
    @Column(name="virtuemart_state_id")
    private Integer epgen_virtuemart_state_id;
    @Column(name="virtuemart_country_id")
    private Integer epgen_virtuemart_country_id;
    @Column(name="zip")
    private String epgen_zip;
    @Column(name="extra_field_1")
    private String epgen_extra_field_1;
    @Column(name="extra_field_2")
    private String epgen_extra_field_2;
    @Column(name="extra_field_3")
    private String epgen_extra_field_3;
    @Column(name="extra_field_4")
    private String epgen_extra_field_4;
    @Column(name="extra_field_5")
    private String epgen_extra_field_5;
    
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
	public String getepgen_virtuemart_userinfo_id() {
		return epgen_virtuemart_userinfo_id;
	}

	public void setepgen_virtuemart_userinfo_id(String epgen_virtuemart_userinfo_id) {
		this.epgen_virtuemart_userinfo_id = epgen_virtuemart_userinfo_id;
	}
	public Integer getepgen_virtuemart_user_id() {
		return epgen_virtuemart_user_id;
	}

	public void setepgen_virtuemart_user_id(Integer epgen_virtuemart_user_id) {
		this.epgen_virtuemart_user_id = epgen_virtuemart_user_id;
	}
	public String getepgen_address_type() {
		return epgen_address_type;
	}

	public void setepgen_address_type(String epgen_address_type) {
		this.epgen_address_type = epgen_address_type;
	}
	public String getepgen_address_type_name() {
		return epgen_address_type_name;
	}

	public void setepgen_address_type_name(String epgen_address_type_name) {
		this.epgen_address_type_name = epgen_address_type_name;
	}
	public String getepgen_name() {
		return epgen_name;
	}

	public void setepgen_name(String epgen_name) {
		this.epgen_name = epgen_name;
	}
	public String getepgen_company() {
		return epgen_company;
	}

	public void setepgen_company(String epgen_company) {
		this.epgen_company = epgen_company;
	}
	public String getepgen_title() {
		return epgen_title;
	}

	public void setepgen_title(String epgen_title) {
		this.epgen_title = epgen_title;
	}
	public String getepgen_last_name() {
		return epgen_last_name;
	}

	public void setepgen_last_name(String epgen_last_name) {
		this.epgen_last_name = epgen_last_name;
	}
	public String getepgen_first_name() {
		return epgen_first_name;
	}

	public void setepgen_first_name(String epgen_first_name) {
		this.epgen_first_name = epgen_first_name;
	}
	public String getepgen_middle_name() {
		return epgen_middle_name;
	}

	public void setepgen_middle_name(String epgen_middle_name) {
		this.epgen_middle_name = epgen_middle_name;
	}
	public String getepgen_phone_1() {
		return epgen_phone_1;
	}

	public void setepgen_phone_1(String epgen_phone_1) {
		this.epgen_phone_1 = epgen_phone_1;
	}
	public String getepgen_phone_2() {
		return epgen_phone_2;
	}

	public void setepgen_phone_2(String epgen_phone_2) {
		this.epgen_phone_2 = epgen_phone_2;
	}
	public String getepgen_fax() {
		return epgen_fax;
	}

	public void setepgen_fax(String epgen_fax) {
		this.epgen_fax = epgen_fax;
	}
	public String getepgen_address_1() {
		return epgen_address_1;
	}

	public void setepgen_address_1(String epgen_address_1) {
		this.epgen_address_1 = epgen_address_1;
	}
	public String getepgen_address_2() {
		return epgen_address_2;
	}

	public void setepgen_address_2(String epgen_address_2) {
		this.epgen_address_2 = epgen_address_2;
	}
	public String getepgen_city() {
		return epgen_city;
	}

	public void setepgen_city(String epgen_city) {
		this.epgen_city = epgen_city;
	}
	public Integer getepgen_virtuemart_state_id() {
		return epgen_virtuemart_state_id;
	}

	public void setepgen_virtuemart_state_id(Integer epgen_virtuemart_state_id) {
		this.epgen_virtuemart_state_id = epgen_virtuemart_state_id;
	}
	public Integer getepgen_virtuemart_country_id() {
		return epgen_virtuemart_country_id;
	}

	public void setepgen_virtuemart_country_id(Integer epgen_virtuemart_country_id) {
		this.epgen_virtuemart_country_id = epgen_virtuemart_country_id;
	}
	public String getepgen_zip() {
		return epgen_zip;
	}

	public void setepgen_zip(String epgen_zip) {
		this.epgen_zip = epgen_zip;
	}
	public String getepgen_extra_field_1() {
		return epgen_extra_field_1;
	}

	public void setepgen_extra_field_1(String epgen_extra_field_1) {
		this.epgen_extra_field_1 = epgen_extra_field_1;
	}
	public String getepgen_extra_field_2() {
		return epgen_extra_field_2;
	}

	public void setepgen_extra_field_2(String epgen_extra_field_2) {
		this.epgen_extra_field_2 = epgen_extra_field_2;
	}
	public String getepgen_extra_field_3() {
		return epgen_extra_field_3;
	}

	public void setepgen_extra_field_3(String epgen_extra_field_3) {
		this.epgen_extra_field_3 = epgen_extra_field_3;
	}
	public String getepgen_extra_field_4() {
		return epgen_extra_field_4;
	}

	public void setepgen_extra_field_4(String epgen_extra_field_4) {
		this.epgen_extra_field_4 = epgen_extra_field_4;
	}
	public String getepgen_extra_field_5() {
		return epgen_extra_field_5;
	}

	public void setepgen_extra_field_5(String epgen_extra_field_5) {
		this.epgen_extra_field_5 = epgen_extra_field_5;
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
