package com.primarchan.board.dao;

import com.primarchan.board.domain.BoardDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDaoImpl implements BoardDao {
    @Autowired
    SqlSession session;

    String namespace = "com.primarchan.board.dao.BoardMapper.";

    @Override
    public BoardDto select(int bno) throws Exception {
        return session.selectOne(namespace + "select", bno);
    }

}
