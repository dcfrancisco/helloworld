package actions;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jahia.bin.Action;
import org.jahia.bin.ActionResult;
import org.jahia.services.content.JCRSessionWrapper;
import org.jahia.services.render.RenderContext;
import org.jahia.services.render.Resource;
import org.jahia.services.render.URLResolver;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ActionReturnExample extends Action {

	private static Logger logger = LoggerFactory.getLogger(ActionReturnExample.class);

	@Override
	public ActionResult doExecute(HttpServletRequest httpServletRequest, RenderContext renderContext, Resource resource,
			JCRSessionWrapper jcrSessionWrapper, Map<String, List<String>> map, URLResolver urlResolver)
			throws Exception {
		JSONObject response = new JSONObject();
		response.put("message", "action executed");
		ActionResult action = new ActionResult(HttpServletResponse.SC_OK, "/en/sites/Testsite/home.html?test1=Testing&test2=test2",
				response);

		logger.info(action.getUrl());
		return action;
	}
}