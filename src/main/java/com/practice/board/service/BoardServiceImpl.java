package com.practice.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.board.mapper.BoardMapper;
import com.practice.board.model.Board;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardMapper boardMapper;

    /**
     * 게시판 조회
     */
    public List<Board> getBoardList() throws Exception {
        return boardMapper.selectBoards();
    }

    /**
     * 게시판 등록
     */
    public void saveBoard(Board board) throws Exception {
        boardMapper.insertBoard(board);
    }
}
