package etp.vm.gen.managedbeans;

import etp.vm.gen.entity.Joo2_virtuemart_vmusers;
import etp.vm.gen.managedbeans.util.JsfUtil;
import etp.vm.gen.managedbeans.util.PaginationHelper;
import etp.vm.gen.session.Joo2_virtuemart_vmusersFacade;

import java.io.Serializable;
import java.util.ResourceBundle;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;

@Named("joo2_virtuemart_vmusersController")
@SessionScoped
public class Joo2_virtuemart_vmusersController implements Serializable {

    private Joo2_virtuemart_vmusers current;
    private DataModel items = null;
    @EJB
    private etp.vm.gen.session.Joo2_virtuemart_vmusersFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;

    public Joo2_virtuemart_vmusersController() {
    }

    public Joo2_virtuemart_vmusers getSelected() {
        if (current == null) {
            current = new Joo2_virtuemart_vmusers();
            selectedItemIndex = -1;
        }
        return current;
    }

    private Joo2_virtuemart_vmusersFacade getFacade() {
        return ejbFacade;
    }

    public PaginationHelper getPagination() {
        if (pagination == null) {
            pagination = new PaginationHelper(10) {

                @Override
                public int getItemsCount() {
                    return getFacade().count();
                }

                @Override
                public DataModel createPageDataModel() {
                    return new ListDataModel(getFacade().findRange(new int[]{getPageFirstItem(), getPageFirstItem() + getPageSize()}));
                }
            };
        }
        return pagination;
    }

    public String prepareList() {
        recreateModel();
        return "List";
    }

    public String prepareView() {
        current = (Joo2_virtuemart_vmusers) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new Joo2_virtuemart_vmusers();
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            getFacade().create(current);
            JsfUtil.addSuccessMessage(JsfUtil.getM("Joo2_virtuemart_vmusers Created"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, JsfUtil.getM("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (Joo2_virtuemart_vmusers) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(JsfUtil.getM("Joo2_virtuemart_vmusers Updated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, JsfUtil.getM("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (Joo2_virtuemart_vmusers) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        performDestroy();
        recreatePagination();
        recreateModel();
        return "List";
    }

    public String destroyAndView() {
        performDestroy();
        recreateModel();
        updateCurrentItem();
        if (selectedItemIndex >= 0) {
            return "View";
        } else {
            // all items were removed - go back to list
            recreateModel();
            return "List";
        }
    }

    private void performDestroy() {
        try {
            getFacade().remove(current);
            JsfUtil.addSuccessMessage(JsfUtil.getM("Joo2_virtuemart_vmusers Deleted"));
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, JsfUtil.getM("PersistenceErrorOccured"));
        }
    }

    private void updateCurrentItem() {
        int count = getFacade().count();
        if (selectedItemIndex >= count) {
            // selected index cannot be bigger than number of items:
            selectedItemIndex = count - 1;
            // go to previous page if last page disappeared:
            if (pagination.getPageFirstItem() >= count) {
                pagination.previousPage();
            }
        }
        if (selectedItemIndex >= 0) {
            current = getFacade().findRange(new int[]{selectedItemIndex, selectedItemIndex + 1}).get(0);
        }
    }

    public DataModel getItems() {
        if (items == null) {
            items = getPagination().createPageDataModel();
        }
        return items;
    }

    private void recreateModel() {
        items = null;
    }

    private void recreatePagination() {
        pagination = null;
    }

    public String next() {
        getPagination().nextPage();
        recreateModel();
        return "List";
    }

    public String previous() {
        getPagination().previousPage();
        recreateModel();
        return "List";
    }

    public SelectItem[] getItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), false);
    }

    public SelectItem[] getItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), true);
    }

    public Joo2_virtuemart_vmusers getJoo2_virtuemart_vmusers(java.lang.Integer id) {
        return ejbFacade.find(id);
    }

    @FacesConverter(forClass = Joo2_virtuemart_vmusers.class)
    public static class Joo2_virtuemart_vmusersControllerConverter implements Converter {
        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
if (value == null || value.length() == 0) {
                return null;
            }
            Joo2_virtuemart_vmusersController controller = (Joo2_virtuemart_vmusersController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "joo2_virtuemart_vmusersController");
            return controller.getJoo2_virtuemart_vmusers(getKey(value));
        }

        java.lang.Integer getKey(String value) {
            java.lang.Integer key;
            key = Integer.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Integer value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
if (object == null) {
                return null;
            }
            if (object instanceof Joo2_virtuemart_vmusers) {
                Joo2_virtuemart_vmusers o = (Joo2_virtuemart_vmusers) object;
                return getStringKey(JsfUtil.getPrimaryInt(o.getepgen_virtuemart_user_id()));
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + Joo2_virtuemart_vmusers.class.getName());
            }
        }

    }

}
