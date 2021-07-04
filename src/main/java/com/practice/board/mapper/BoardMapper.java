package com.practice.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.practice.board.model.Board;

@Mapper
public interface BoardMapper {

    /**
     * 게시판 조회
     */
    List<Board> selectBoards() throws Exception;

    /**
     * 게시판 등록
     */
    int insertBoard(Board board) throws Exception;

}
