package news.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import news.builder.service.NewsLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import java.io.IOException;

/**
 * @author animo
 */
@Component(
		immediate = true,
		property = {
				"com.liferay.portlet.display-category=category.hidden",
				"com.liferay.portlet.header-portlet-css=/css/main.css",
//                "com.liferay.portlet.instanceable=true",
				"javax.portlet.title." + NewsMVCPortletKeys.FULL_NAME + "=event.portlet-title",
				"javax.portlet.portlet-name=" + NewsMVCPortletKeys.NAME,
				"javax.portlet.display-name=" + NewsMVCPortletKeys.TITLE,
				"javax.portlet.init-param.template-path=/",
				"javax.portlet.init-param.view-template=/view.jsp",
				"com.liferay.portlet.preferences-company-wide=false",
				"com.liferay.portlet.preferences-unique-per-layout=false",
				"com.liferay.portlet.preferences-owned-by-group=true",
				"javax.portlet.resource-bundle=content.Language",
				"javax.portlet.supported-locale=de_DE,en_US",
				"javax.portlet.security-role-ref=administrator,power-user,user",
				"javax.portlet.name=" + NewsMVCPortletKeys.FULL_NAME
		},
		service = Portlet.class
)
public class NewsMVCPortlet extends MVCPortlet {

	@Reference
	private volatile NewsLocalService newsLocalService;

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		renderRequest.setAttribute("newsLocalService", newsLocalService);
		super.render(renderRequest, renderResponse);
	}
}