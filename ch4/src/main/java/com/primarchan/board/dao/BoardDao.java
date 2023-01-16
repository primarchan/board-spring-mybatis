package com.primarchan.board.dao;

import com.primarchan.board.domain.BoardDto;

public interface BoardDao {
    BoardDto select(int bno) throws Exception;

}
