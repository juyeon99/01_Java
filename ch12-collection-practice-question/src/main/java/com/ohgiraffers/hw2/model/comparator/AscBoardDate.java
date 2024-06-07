package com.ohgiraffers.hw2.model.comparator;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Comparator;

public class AscBoardDate implements Comparator<BoardDTO>{
    @Override
    public int compare(BoardDTO o1, BoardDTO o2) {
        int result = 0;
        if(o1.getBoardDate().after(o2.getBoardDate())){
            result = 1;
        } else if (o1.getBoardDate().before(o2.getBoardDate())){
            result = -1;
        }
        return result;
    }
}

