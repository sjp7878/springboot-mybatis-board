package com.practice.board.controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.board.model.Board;
import com.practice.board.service.BoardService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/api")
@RestController
@Api(tags = "게시판 API")
public class BoardRestController {

    @Autowired
    BoardService boardService;

    /**
     * 게시판 조회
     */
    @GetMapping("/boards")
    @ApiOperation(value = "게시판 조회", notes = "게시판을 조회합니다.")
    public ResponseEntity<List<Board>> getBoardList() {
        ResponseEntity<List<Board>> boardResponse = null;

        try {
            List<Board> boardList = boardService.getBoardList();

            if (boardList.isEmpty()) {
                boardResponse = new ResponseEntity<List<Board>>(HttpStatus.NO_CONTENT);
            }

            boardResponse = new ResponseEntity<List<Board>>(boardList, HttpStatus.OK);

        } catch(Exception ex) {
            boardResponse = new ResponseEntity<List<Board>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return boardResponse;
    }

    /**
     * 게시판 등록
     */
    @PostMapping("/boards")
    @ApiOperation(value = "게시판 등", notes = "게시판을 등록합니다.")
    public ResponseEntity<Board> saveBoard(@RequestBody Board board) {
        log.debug("=============saveBoard==============");
        ResponseEntity<Board> boardResponse = null;

        try {
            boardService.saveBoard(board);

            boardResponse = new ResponseEntity<Board>(board, HttpStatus.CREATED);

        } catch(Exception ex) {
            boardResponse = new ResponseEntity<Board>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return boardResponse;
    }




}
