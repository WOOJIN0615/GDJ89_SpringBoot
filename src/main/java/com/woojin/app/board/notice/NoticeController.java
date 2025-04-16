package com.woojin.app.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.woojin.app.board.BoardService;
import com.woojin.app.board.BoardVO;



@Controller
@RequestMapping(value = "/notice/*")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@Value("${menu.board.notice.name}")
	private String name;
	
	@ModelAttribute("kind")
	public String getName() throws Exception{
		return this.name;
	}
	
	@GetMapping("list")
	public String getList(Model model) throws Exception{
		
		List<BoardVO> ar = noticeService.getList();
		
		model.addAttribute("list", ar);
		
		return "/board/list";
	}

}
