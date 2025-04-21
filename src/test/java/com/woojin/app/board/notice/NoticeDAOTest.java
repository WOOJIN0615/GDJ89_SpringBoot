package com.woojin.app.board.notice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.woojin.app.board.BoardVO;
import com.woojin.app.home.util.Pager;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class NoticeDAOTest {
	
	@Autowired
	private NoticeDAO noticeDAO;
	

	
	
	void testTest() throws Exception{
		List<BoardVO> ar = new ArrayList<>();
		for (int i=0; i<100; i++) {
			BoardVO boardVO = new BoardVO();
			
			boardVO.setBoardTitle("title"+i);
			boardVO.setBoardContents("contents"+i);
			boardVO.setUserName("user"+i);
			
			ar.add(boardVO);
		}
		
		int result=noticeDAO.test(ar);
		
		//assertNotEquals(0, result);
		log.info("result : {}", result);
	}
	
	@Test
	void testGetList(Pager pager) throws Exception {
		
		  
		
		List<BoardVO> ar = noticeDAO.getList(pager);
		
		for (BoardVO boardVO : ar) {
			log.info("data : {}",boardVO);
		}
		
	}

	
	void testGetDetail(BoardVO boardVO) throws Exception {
		boardVO = noticeDAO.getDetail(boardVO);
		log.info("data : "+ boardVO);
	}


}
