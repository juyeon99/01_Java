package com.ohgiraffers.hw2.model.comparator;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Comparator;

public class DescBoardTitle implements Comparator<BoardDTO> {
    @Override
    public int compare(BoardDTO o1, BoardDTO o2) {
        int result = 0;
        int n = o1.getBoardTitle().length();
        if(o1.getBoardTitle().length() < o2.getBoardTitle().length()){
            n = o1.getBoardTitle().length();
            result = 1;
        } else if(o1.getBoardTitle().length() > o2.getBoardTitle().length()){
            n = o2.getBoardTitle().length();
            result = -1;
        }

        for (int i = 0; i < n; i++){
            if(o1.getBoardTitle().charAt(i) > o2.getBoardTitle().charAt(i)){
                return -1;
            } else if (o1.getBoardTitle().charAt(i) < o2.getBoardTitle().charAt(i)){
                return 1;
            }
        }

        return result;
    }
}
