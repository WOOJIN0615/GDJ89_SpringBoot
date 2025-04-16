package com.woojin.app.board.notice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.woojin.app.board.BoardVO;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class NoticeDAOTest {
	
	@Autowired
	private NoticeDAO noticeDAO;

	
	void testGetList() throws Exception {
		List<BoardVO> ar = noticeDAO.getList();
		for (BoardVO boardVO : ar) {
			log.info("data : {}",boardVO);
		}
		
	}

	@Test
	void testGetDetail(BoardVO boardVO) throws Exception {
		boardVO = noticeDAO.getDetail(boardVO);
		log.info("data : "+ boardVO);
	}

	
	void testAdd(BoardVO boardVO) throws Exception {
		boardVO.setBoardContents("test");
		boardVO.setBoardTitle("test");
		boardVO.setBoardNum(0L);
		boardVO.setBoardHit(0L);
		boardVO.setUserName("test");
		int result = noticeDAO.add(boardVO);
		log.info("result : "+result);
	}

}
