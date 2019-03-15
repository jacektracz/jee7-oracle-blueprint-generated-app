
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
@Table(name = "joo2_swmenufree_config", catalog = "lakida_03", schema = "", uniqueConstraints = {
@UniqueConstraint(columnNames = {"name"})})
@XmlRootElement
public class Joo2_swmenufree_config implements Serializable 
{
    @Id
    @GeneratedValue
    @Column(name="id")
    private Integer epgen_id;
    @Column(name="main_top")
    private Integer epgen_main_top;
    @Column(name="main_left")
    private Integer epgen_main_left;
    @Column(name="main_height")
    private Integer epgen_main_height;
    @Column(name="sub_border_over")
    private String epgen_sub_border_over;
    @Column(name="main_width")
    private Integer epgen_main_width;
    @Column(name="sub_width")
    private Integer epgen_sub_width;
    @Column(name="main_back")
    private String epgen_main_back;
    @Column(name="main_over")
    private String epgen_main_over;
    @Column(name="sub_back")
    private String epgen_sub_back;
    @Column(name="sub_over")
    private String epgen_sub_over;
    @Column(name="sub_border")
    private String epgen_sub_border;
    @Column(name="main_font_size")
    private Integer epgen_main_font_size;
    @Column(name="sub_font_size")
    private Integer epgen_sub_font_size;
    @Column(name="main_border_over")
    private String epgen_main_border_over;
    @Column(name="sub_font_color")
    private String epgen_sub_font_color;
    @Column(name="main_border")
    private String epgen_main_border;
    @Column(name="main_font_color")
    private String epgen_main_font_color;
    @Column(name="sub_font_color_over")
    private String epgen_sub_font_color_over;
    @Column(name="main_font_color_over")
    private String epgen_main_font_color_over;
    @Column(name="main_align")
    private String epgen_main_align;
    @Column(name="sub_align")
    private String epgen_sub_align;
    @Column(name="sub_height")
    private Integer epgen_sub_height;
    @Column(name="position")
    private String epgen_position;
    @Column(name="orientation")
    private String epgen_orientation;
    @Column(name="font_family")
    private String epgen_font_family;
    @Column(name="font_weight")
    private String epgen_font_weight;
    @Column(name="font_weight_over")
    private String epgen_font_weight_over;
    @Column(name="level2_sub_top")
    private Integer epgen_level2_sub_top;
    @Column(name="level2_sub_left")
    private Integer epgen_level2_sub_left;
    @Column(name="level1_sub_top")
    private Integer epgen_level1_sub_top;
    @Column(name="level1_sub_left")
    private Integer epgen_level1_sub_left;
    @Column(name="main_back_image")
    private String epgen_main_back_image;
    @Column(name="main_back_image_over")
    private String epgen_main_back_image_over;
    @Column(name="sub_back_image")
    private String epgen_sub_back_image;
    @Column(name="sub_back_image_over")
    private String epgen_sub_back_image_over;
    @Column(name="specialA")
    private String epgen_specialA;
    @Column(name="main_padding")
    private String epgen_main_padding;
    @Column(name="sub_padding")
    private String epgen_sub_padding;
    @Column(name="specialB")
    private String epgen_specialB;
    @Column(name="sub_font_family")
    private String epgen_sub_font_family;
    @Column(name="extra")
    private String epgen_extra;
    @Column(name="top_ttf")
    private String epgen_top_ttf;
    @Column(name="sub_ttf")
    private String epgen_sub_ttf;
    @Column(name="active_background")
    private String epgen_active_background;
    @Column(name="active_font")
    private String epgen_active_font;
    @Column(name="top_margin")
    private String epgen_top_margin;
    @Column(name="top_wrap")
    private String epgen_top_wrap;
    @Column(name="sub_wrap")
    private String epgen_sub_wrap;
    @Column(name="corners")
    private String epgen_corners;
    @Column(name="top_font_extra")
    private String epgen_top_font_extra;
    @Column(name="sub_font_extra")
    private String epgen_sub_font_extra;
    @Column(name="complete_padding")
    private String epgen_complete_padding;
    @Column(name="complete_background")
    private String epgen_complete_background;
    @Column(name="complete_background_image")
    private String epgen_complete_background_image;
    @Column(name="active_background_image")
    private String epgen_active_background_image;
    @Column(name="sub_indicator")
    private String epgen_sub_indicator;
	public Integer getepgen_id() {
		return epgen_id;
	}

	public void setepgen_id(Integer epgen_id) {
		this.epgen_id = epgen_id;
	}
	public Integer getepgen_main_top() {
		return epgen_main_top;
	}

	public void setepgen_main_top(Integer epgen_main_top) {
		this.epgen_main_top = epgen_main_top;
	}
	public Integer getepgen_main_left() {
		return epgen_main_left;
	}

	public void setepgen_main_left(Integer epgen_main_left) {
		this.epgen_main_left = epgen_main_left;
	}
	public Integer getepgen_main_height() {
		return epgen_main_height;
	}

	public void setepgen_main_height(Integer epgen_main_height) {
		this.epgen_main_height = epgen_main_height;
	}
	public String getepgen_sub_border_over() {
		return epgen_sub_border_over;
	}

	public void setepgen_sub_border_over(String epgen_sub_border_over) {
		this.epgen_sub_border_over = epgen_sub_border_over;
	}
	public Integer getepgen_main_width() {
		return epgen_main_width;
	}

	public void setepgen_main_width(Integer epgen_main_width) {
		this.epgen_main_width = epgen_main_width;
	}
	public Integer getepgen_sub_width() {
		return epgen_sub_width;
	}

	public void setepgen_sub_width(Integer epgen_sub_width) {
		this.epgen_sub_width = epgen_sub_width;
	}
	public String getepgen_main_back() {
		return epgen_main_back;
	}

	public void setepgen_main_back(String epgen_main_back) {
		this.epgen_main_back = epgen_main_back;
	}
	public String getepgen_main_over() {
		return epgen_main_over;
	}

	public void setepgen_main_over(String epgen_main_over) {
		this.epgen_main_over = epgen_main_over;
	}
	public String getepgen_sub_back() {
		return epgen_sub_back;
	}

	public void setepgen_sub_back(String epgen_sub_back) {
		this.epgen_sub_back = epgen_sub_back;
	}
	public String getepgen_sub_over() {
		return epgen_sub_over;
	}

	public void setepgen_sub_over(String epgen_sub_over) {
		this.epgen_sub_over = epgen_sub_over;
	}
	public String getepgen_sub_border() {
		return epgen_sub_border;
	}

	public void setepgen_sub_border(String epgen_sub_border) {
		this.epgen_sub_border = epgen_sub_border;
	}
	public Integer getepgen_main_font_size() {
		return epgen_main_font_size;
	}

	public void setepgen_main_font_size(Integer epgen_main_font_size) {
		this.epgen_main_font_size = epgen_main_font_size;
	}
	public Integer getepgen_sub_font_size() {
		return epgen_sub_font_size;
	}

	public void setepgen_sub_font_size(Integer epgen_sub_font_size) {
		this.epgen_sub_font_size = epgen_sub_font_size;
	}
	public String getepgen_main_border_over() {
		return epgen_main_border_over;
	}

	public void setepgen_main_border_over(String epgen_main_border_over) {
		this.epgen_main_border_over = epgen_main_border_over;
	}
	public String getepgen_sub_font_color() {
		return epgen_sub_font_color;
	}

	public void setepgen_sub_font_color(String epgen_sub_font_color) {
		this.epgen_sub_font_color = epgen_sub_font_color;
	}
	public String getepgen_main_border() {
		return epgen_main_border;
	}

	public void setepgen_main_border(String epgen_main_border) {
		this.epgen_main_border = epgen_main_border;
	}
	public String getepgen_main_font_color() {
		return epgen_main_font_color;
	}

	public void setepgen_main_font_color(String epgen_main_font_color) {
		this.epgen_main_font_color = epgen_main_font_color;
	}
	public String getepgen_sub_font_color_over() {
		return epgen_sub_font_color_over;
	}

	public void setepgen_sub_font_color_over(String epgen_sub_font_color_over) {
		this.epgen_sub_font_color_over = epgen_sub_font_color_over;
	}
	public String getepgen_main_font_color_over() {
		return epgen_main_font_color_over;
	}

	public void setepgen_main_font_color_over(String epgen_main_font_color_over) {
		this.epgen_main_font_color_over = epgen_main_font_color_over;
	}
	public String getepgen_main_align() {
		return epgen_main_align;
	}

	public void setepgen_main_align(String epgen_main_align) {
		this.epgen_main_align = epgen_main_align;
	}
	public String getepgen_sub_align() {
		return epgen_sub_align;
	}

	public void setepgen_sub_align(String epgen_sub_align) {
		this.epgen_sub_align = epgen_sub_align;
	}
	public Integer getepgen_sub_height() {
		return epgen_sub_height;
	}

	public void setepgen_sub_height(Integer epgen_sub_height) {
		this.epgen_sub_height = epgen_sub_height;
	}
	public String getepgen_position() {
		return epgen_position;
	}

	public void setepgen_position(String epgen_position) {
		this.epgen_position = epgen_position;
	}
	public String getepgen_orientation() {
		return epgen_orientation;
	}

	public void setepgen_orientation(String epgen_orientation) {
		this.epgen_orientation = epgen_orientation;
	}
	public String getepgen_font_family() {
		return epgen_font_family;
	}

	public void setepgen_font_family(String epgen_font_family) {
		this.epgen_font_family = epgen_font_family;
	}
	public String getepgen_font_weight() {
		return epgen_font_weight;
	}

	public void setepgen_font_weight(String epgen_font_weight) {
		this.epgen_font_weight = epgen_font_weight;
	}
	public String getepgen_font_weight_over() {
		return epgen_font_weight_over;
	}

	public void setepgen_font_weight_over(String epgen_font_weight_over) {
		this.epgen_font_weight_over = epgen_font_weight_over;
	}
	public Integer getepgen_level2_sub_top() {
		return epgen_level2_sub_top;
	}

	public void setepgen_level2_sub_top(Integer epgen_level2_sub_top) {
		this.epgen_level2_sub_top = epgen_level2_sub_top;
	}
	public Integer getepgen_level2_sub_left() {
		return epgen_level2_sub_left;
	}

	public void setepgen_level2_sub_left(Integer epgen_level2_sub_left) {
		this.epgen_level2_sub_left = epgen_level2_sub_left;
	}
	public Integer getepgen_level1_sub_top() {
		return epgen_level1_sub_top;
	}

	public void setepgen_level1_sub_top(Integer epgen_level1_sub_top) {
		this.epgen_level1_sub_top = epgen_level1_sub_top;
	}
	public Integer getepgen_level1_sub_left() {
		return epgen_level1_sub_left;
	}

	public void setepgen_level1_sub_left(Integer epgen_level1_sub_left) {
		this.epgen_level1_sub_left = epgen_level1_sub_left;
	}
	public String getepgen_main_back_image() {
		return epgen_main_back_image;
	}

	public void setepgen_main_back_image(String epgen_main_back_image) {
		this.epgen_main_back_image = epgen_main_back_image;
	}
	public String getepgen_main_back_image_over() {
		return epgen_main_back_image_over;
	}

	public void setepgen_main_back_image_over(String epgen_main_back_image_over) {
		this.epgen_main_back_image_over = epgen_main_back_image_over;
	}
	public String getepgen_sub_back_image() {
		return epgen_sub_back_image;
	}

	public void setepgen_sub_back_image(String epgen_sub_back_image) {
		this.epgen_sub_back_image = epgen_sub_back_image;
	}
	public String getepgen_sub_back_image_over() {
		return epgen_sub_back_image_over;
	}

	public void setepgen_sub_back_image_over(String epgen_sub_back_image_over) {
		this.epgen_sub_back_image_over = epgen_sub_back_image_over;
	}
	public String getepgen_specialA() {
		return epgen_specialA;
	}

	public void setepgen_specialA(String epgen_specialA) {
		this.epgen_specialA = epgen_specialA;
	}
	public String getepgen_main_padding() {
		return epgen_main_padding;
	}

	public void setepgen_main_padding(String epgen_main_padding) {
		this.epgen_main_padding = epgen_main_padding;
	}
	public String getepgen_sub_padding() {
		return epgen_sub_padding;
	}

	public void setepgen_sub_padding(String epgen_sub_padding) {
		this.epgen_sub_padding = epgen_sub_padding;
	}
	public String getepgen_specialB() {
		return epgen_specialB;
	}

	public void setepgen_specialB(String epgen_specialB) {
		this.epgen_specialB = epgen_specialB;
	}
	public String getepgen_sub_font_family() {
		return epgen_sub_font_family;
	}

	public void setepgen_sub_font_family(String epgen_sub_font_family) {
		this.epgen_sub_font_family = epgen_sub_font_family;
	}
	public String getepgen_extra() {
		return epgen_extra;
	}

	public void setepgen_extra(String epgen_extra) {
		this.epgen_extra = epgen_extra;
	}
	public String getepgen_top_ttf() {
		return epgen_top_ttf;
	}

	public void setepgen_top_ttf(String epgen_top_ttf) {
		this.epgen_top_ttf = epgen_top_ttf;
	}
	public String getepgen_sub_ttf() {
		return epgen_sub_ttf;
	}

	public void setepgen_sub_ttf(String epgen_sub_ttf) {
		this.epgen_sub_ttf = epgen_sub_ttf;
	}
	public String getepgen_active_background() {
		return epgen_active_background;
	}

	public void setepgen_active_background(String epgen_active_background) {
		this.epgen_active_background = epgen_active_background;
	}
	public String getepgen_active_font() {
		return epgen_active_font;
	}

	public void setepgen_active_font(String epgen_active_font) {
		this.epgen_active_font = epgen_active_font;
	}
	public String getepgen_top_margin() {
		return epgen_top_margin;
	}

	public void setepgen_top_margin(String epgen_top_margin) {
		this.epgen_top_margin = epgen_top_margin;
	}
	public String getepgen_top_wrap() {
		return epgen_top_wrap;
	}

	public void setepgen_top_wrap(String epgen_top_wrap) {
		this.epgen_top_wrap = epgen_top_wrap;
	}
	public String getepgen_sub_wrap() {
		return epgen_sub_wrap;
	}

	public void setepgen_sub_wrap(String epgen_sub_wrap) {
		this.epgen_sub_wrap = epgen_sub_wrap;
	}
	public String getepgen_corners() {
		return epgen_corners;
	}

	public void setepgen_corners(String epgen_corners) {
		this.epgen_corners = epgen_corners;
	}
	public String getepgen_top_font_extra() {
		return epgen_top_font_extra;
	}

	public void setepgen_top_font_extra(String epgen_top_font_extra) {
		this.epgen_top_font_extra = epgen_top_font_extra;
	}
	public String getepgen_sub_font_extra() {
		return epgen_sub_font_extra;
	}

	public void setepgen_sub_font_extra(String epgen_sub_font_extra) {
		this.epgen_sub_font_extra = epgen_sub_font_extra;
	}
	public String getepgen_complete_padding() {
		return epgen_complete_padding;
	}

	public void setepgen_complete_padding(String epgen_complete_padding) {
		this.epgen_complete_padding = epgen_complete_padding;
	}
	public String getepgen_complete_background() {
		return epgen_complete_background;
	}

	public void setepgen_complete_background(String epgen_complete_background) {
		this.epgen_complete_background = epgen_complete_background;
	}
	public String getepgen_complete_background_image() {
		return epgen_complete_background_image;
	}

	public void setepgen_complete_background_image(String epgen_complete_background_image) {
		this.epgen_complete_background_image = epgen_complete_background_image;
	}
	public String getepgen_active_background_image() {
		return epgen_active_background_image;
	}

	public void setepgen_active_background_image(String epgen_active_background_image) {
		this.epgen_active_background_image = epgen_active_background_image;
	}
	public String getepgen_sub_indicator() {
		return epgen_sub_indicator;
	}

	public void setepgen_sub_indicator(String epgen_sub_indicator) {
		this.epgen_sub_indicator = epgen_sub_indicator;
	}

}
