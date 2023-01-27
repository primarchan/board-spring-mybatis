package com.primarchan.board.dao;

import com.primarchan.board.domain.BoardDto;
import com.primarchan.board.domain.SearchCondition;

import java.util.List;
import java.util.Map;

public interface BoardDao {
    int count() throws Exception // T selectOne(String statement)
    ;

    int deleteAll() // int delete(String statement)
    ;

    int delete(Integer bno, String writer) throws Exception // int delete(String statement, Object parameter)
    ;

    int insert(BoardDto dto) throws Exception // int insert(String statement, Object parameter)
    ;

    List<BoardDto> selectAll() throws Exception // List<E> selectList(String statement)
    ;

    BoardDto select(Integer bno) throws Exception // T selectOne(String statement, Object parameter)
    ;

    List<BoardDto> selectPage(Map map) throws Exception // List<E> selectList(String statement, Object parameter)
    ;

    int update(BoardDto dto) throws Exception // int update(String statement, Object parameter)
    ;

    int increaseViewCnt(Integer bno) throws Exception // int update(String statement, Object parameter)
    ;

    List<BoardDto> searchSelectPage(SearchCondition sc) throws Exception // List<E> selectList(String statement, Object parameter)
    ;


    int searchResultCnt(SearchCondition sc) throws Exception // T selectOne(String statement, Object parameter)
    ;
}
