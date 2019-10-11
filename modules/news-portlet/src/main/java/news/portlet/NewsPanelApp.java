package news.portlet;

import com.liferay.application.list.PanelApp;
import com.liferay.application.list.adapter.PortletPanelAppAdapter;
import com.liferay.application.list.constants.PanelCategoryKeys;
import com.liferay.portal.kernel.model.Portlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(
        immediate = true,
        property = {
                "panel.app.order:Integer=1250",
                "panel.category.key=" + PanelCategoryKeys.SITE_ADMINISTRATION_CONTENT,
        },
        service = PanelApp.class
)
public class NewsPanelApp extends PortletPanelAppAdapter {

        public NewsPanelApp() {
                super(NewsMVCPortletKeys.FULL_NAME);
        }

        @Override
        @Reference(
                target = "(javax.portlet.name="+NewsMVCPortletKeys.FULL_NAME+")",
                unbind = "-"
        )
        public void setPortlet(Portlet portlet) {
                super.setPortlet(portlet);
        }
}
