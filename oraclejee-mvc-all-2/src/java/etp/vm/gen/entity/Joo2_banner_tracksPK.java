
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_banner_tracksPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="track_date")
    private String epgen_track_date;
	public String getepgen_track_date() {
		return epgen_track_date;
	}

	public void setepgen_track_date(String epgen_track_date) {
		this.epgen_track_date = epgen_track_date;
	}

}
