package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String  Home()
	{
		System.out.println("home view...");
		return "home";
	}
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox")String query) {
		
		String url="https://www.google.com/search?q="+query;
		if(query.isBlank())
		{
		 return new RedirectView("home");
		}
	 RedirectView redirect = new RedirectView();
	 redirect.setUrl(url);
		return redirect;
		
	}

}
