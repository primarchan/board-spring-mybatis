package com.primarchan.board.dao;

import com.primarchan.board.domain.BoardDto;
import com.primarchan.board.domain.SearchCondition;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class BoardDaoImpl implements BoardDao {
    @Autowired
    SqlSession session;

    String namespace = "com.primarchan.board.dao.BoardMapper.";

    @Override
    public int count() throws Exception {
        return session.selectOne(namespace + "count");
    } // T selectOne(String statement)

    @Override
    public int deleteAll() {
        return session.delete(namespace + "deleteAll");
    } // int delete(String statement)

    @Override
    public int delete(Integer bno, String writer) throws Exception {
        Map map = new HashMap();
        map.put("bno", bno);
        map.put("writer", writer);
        return session.delete(namespace + "delete", map);
    } // int delete(String statement, Object parameter)

    @Override
    public int insert(BoardDto dto) throws Exception {
        return session.insert(namespace + "insert", dto);
    } // int insert(String statement, Object parameter)

    @Override
    public List<BoardDto> selectAll() throws Exception {
        return session.selectList(namespace + "selectAll");
    } // List<E> selectList(String statement)

    @Override
    public BoardDto select(Integer bno) throws Exception {
        return session.selectOne(namespace + "select", bno);
    } // T selectOne(String statement, Object parameter)

    @Override
    public List<BoardDto> selectPage(Map map) throws Exception {
        return session.selectList(namespace + "selectPage", map);
    } // List<E> selectList(String statement, Object parameter)

    @Override
    public int update(BoardDto dto) throws Exception {
        return session.update(namespace + "update", dto);
    } // int update(String statement, Object parameter)

    @Override
    public int increaseViewCnt(Integer bno) throws Exception {
        return session.update(namespace + "increaseViewCnt", bno);
    } // int update(String statement, Object parameter)

    @Override
    public List<BoardDto> searchSelectPage(SearchCondition sc) throws Exception {
        return session.selectList(namespace + "searchSelectPage", sc);
    } // List<E> selectList(String statement, Object parameter)

    @Override
    public int searchResultCnt(SearchCondition sc) throws Exception {
        System.out.println("sc in searchResultCnt() = " + sc);
        System.out.println("session = " + session);
        return session.selectOne(namespace + "searchResultCnt", sc);
    } // T selectOne(String statement, Object parameter)

}
