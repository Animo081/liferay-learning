package com.vector.testtask;

import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.UserLocalServiceWrapper;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.osgi.service.component.annotations.Component;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.List;
import java.util.Locale;

@Component(
	immediate = true,
	service = ServiceWrapper.class
)
public class MyWrapperOverride extends UserLocalServiceWrapper {

	private static final Log LOGGER = LogFactoryUtil.getLog(MyWrapperOverride.class.getName());

	private static final String ADMIN_GOOGLE_EMAIL = "xakerok24@gmail.com";

	public MyWrapperOverride() {
		super(null);
	}

	@Override
	public User addUserWithWorkflow(
			long creatorUserId, long companyId, boolean autoPassword,
			String password1, String password2, boolean autoScreenName,
			String screenName, String emailAddress, long facebookId,
			String openId, Locale locale, String firstName,
			String middleName, String lastName, long prefixId,
			long suffixId, boolean male, int birthdayMonth,
			int birthdayDay, int birthdayYear, String jobTitle,
			long[] groupIds, long[] organizationIds, long[] roleIds,
			long[] userGroupIds, boolean sendEmail, ServiceContext serviceContext
	) throws PortalException {

		User newUser = super.addUserWithWorkflow(
				creatorUserId, companyId, autoPassword,
				password1, password2, autoScreenName,
				screenName, emailAddress, facebookId,
				openId, locale, firstName,
				middleName, lastName, prefixId,
				suffixId, male, birthdayMonth,
				birthdayDay, birthdayYear, jobTitle,
				groupIds, organizationIds, roleIds,
				userGroupIds, sendEmail, serviceContext
		);

		if (serviceContext.getAttribute("showPreferences").equals("true")) {
			notifyUsersByPreference(getUsers(0, getUsersCount()), serviceContext.getAttribute("preferences").toString());
		}
		newUser.getExpandoBridge().setAttribute("Preferences", serviceContext.getAttribute("preferences"));

		return newUser;
	}

	private void notifyUsersByPreference(List<User> users, String preference){

		for (User user : users) {
			if (user.getExpandoBridge().getAttribute("Preferences").toString().equals(preference)) {
				MailServiceUtil.getService().sendEmail(buildUserNotificationMessage(user));
			}
		}
	}

	private MailMessage buildUserNotificationMessage(User user){

		MailMessage message = new MailMessage();
		try {
			message.setFrom(new InternetAddress(ADMIN_GOOGLE_EMAIL));
			message.setTo(new InternetAddress(user.getEmailAddress()));
			message.setHTMLFormat(true);
			message.setSubject("Behold the chosen one");
			message.setBody("We have a new member");
		} catch (AddressException e) {
			LOGGER.error("MailMessage could not be built correctly", e);
		}
		return message;
	}
}
