package news.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import news.builder.model.News;
import news.builder.service.NewsLocalService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import java.util.Date;

@Component(
        immediate = true,
        property = {
                "javax.portlet.name=" + NewsMVCPortletKeys.FULL_NAME,
                "mvc.command.name=" + NewsMVCPortletKeys.ACTION_EDIT_EVENT
        },
        service = MVCActionCommand.class
)
public class EditEventMVCActionCommand extends BaseMVCActionCommand {

    @Reference
    protected volatile NewsLocalService newsService;

    @Override
    protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) {

        ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

        long userId = themeDisplay.getUserId();

        String title = actionRequest.getParameter("title");
        String description = actionRequest.getParameter("description");
        String content = actionRequest.getParameter("content");
        Date date = new Date(System.currentTimeMillis());

        News news = newsService.createNews(newsService.getNewsesCount()+1);

        news.setUserId(userId);

        news.setTitle(title);
        news.setDescription(description);
        news.setContent(content);
        news.setCreateDate(date);

        newsService.addNews(news);
    }
}
