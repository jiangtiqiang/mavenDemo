package controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class User {
	@Value("${chengdu.address}")
	private String address;

	@Value("${get_all_user}")
	private String sqlstring;

	@Value("${users}")
	private String userstring;

	@RequestMapping("api/userinfo")
	@ResponseBody
	public String userinfo() {
		// System.out.println(address);
		String name = "tristan";
		return name + "  " + sqlstring + "  " + userstring;
	}
}
