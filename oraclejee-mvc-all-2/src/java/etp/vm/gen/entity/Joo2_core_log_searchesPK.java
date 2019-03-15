
package etp.vm.gen.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Embeddable
public class Joo2_core_log_searchesPK implements Serializable 
{
   @Basic(optional = false)
    @Column(name="search_term")
    private String epgen_search_term;
	public String getepgen_search_term() {
		return epgen_search_term;
	}

	public void setepgen_search_term(String epgen_search_term) {
		this.epgen_search_term = epgen_search_term;
	}

}
