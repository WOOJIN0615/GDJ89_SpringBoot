package com.woojin.app.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woojin.app.board.BoardService;
import com.woojin.app.board.BoardVO;
import com.woojin.app.home.util.Pager;

@Service
public class NoticeService implements BoardService {
	
	@Autowired
	private NoticeDAO noticeDAO;

	@Override
	public List<BoardVO> getList(Pager pager) throws Exception {
		Long totalCount = noticeDAO.getTotalCount(pager);
		System.out.println(totalCount);
		pager.make(totalCount);
		pager.makeNum();
		List<BoardVO> ar = noticeDAO.getList(pager);
		return ar;
	}

	@Override
	public BoardVO getDetail(BoardVO boardVO) throws Exception {
		boardVO = noticeDAO.getDetail(boardVO);
		return boardVO;
	}

	@Override
	public int add(BoardVO boardVO) throws Exception {
		int result = noticeDAO.add(boardVO);
		return result;
	}

	@Override
	public int update(BoardVO boardVO) throws Exception {
			int result = noticeDAO.update(boardVO);
		return result;
	}

	@Override
	public int delete(BoardVO boardVO) throws Exception {
			int result = noticeDAO.delete(boardVO);
		return result;
	}
	
	
}
