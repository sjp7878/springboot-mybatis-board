package com.practice.board.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "게시판", description = "게판을 등록, 숴정, 삭제하는데 사용됩니다.")
public class Board {

    /**
     * 게시판 ID
     */
    @ApiModelProperty(value = "게시판 ID")
    private String boardId;

    /**
     * 번호
     */
    @ApiModelProperty(value = "번호")
    private String no;

    /**
     * 제목
     */
    @ApiModelProperty(value = "제목")
    private String title;

    /**
     * 내용
     */
    @ApiModelProperty(value = "내용")
    private String content;

    /**
     * 작성자
     */
    @ApiModelProperty(value = "작성자")
    private String creator;

    /**
     * 작성일시
     */
    @ApiModelProperty(value = "작성일시")
    private String created;

    /**
     * 조회수
     */
    @ApiModelProperty(value = "조회수")
    private int count;

}