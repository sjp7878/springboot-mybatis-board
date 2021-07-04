package com.practice.board.service;

import java.util.List;

import com.practice.board.model.Board;

public interface BoardService {

    /**
     * 게시판 조회
     */
    List<Board> getBoardList() throws Exception;

    /**
     * 게시판 등록
     */
    void saveBoard(Board board) throws Exception;

}
