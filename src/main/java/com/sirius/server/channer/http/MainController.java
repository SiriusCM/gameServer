package com.sirius.server.channer.http;

import com.sirius.server.database.entity.Player;
import com.sirius.server.database.mapper.PlayerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MainController {
	
	@Autowired
	private PlayerMapper playerMapper;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("index.html");
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello(int id, String name) {
		return "id:" + id + name;
	}
	
	@ResponseBody
	@RequestMapping(value = "/selectPlayer", method = RequestMethod.POST)
	public Map<String, String> selectPlayer(int id) {
		Player player = playerMapper.selectByPrimaryKey(id);
		Map<String, String> map = new HashMap<>();
		map.put("id", String.valueOf(player.getId()));
		map.put("name", player.getName());
		return map;
	}
}
