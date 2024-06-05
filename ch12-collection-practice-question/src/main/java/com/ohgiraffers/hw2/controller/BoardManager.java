package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.InputBoard;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.util.ArrayList;
import java.util.Comparator;

public class BoardManager {
    private ArrayList<BoardDTO> boardList = new ArrayList<>();
    private ResultPrinter rp = new ResultPrinter();

    public void insertBoard(BoardDTO b){
        // 글번호 0으로 초기화
        b.setBoardNo(0);

        // 조회내역이 있는 경우 - 조회 내역이 있는 경우 기존 리스트의 마지막 인덱스의 글번호 조회
        if (!boardList.isEmpty()){
            boardList.get(boardList.size()-1).setReadCount(boardList.get(boardList.size()-1).getReadCount() + 1);
        }

        // 글 번호를 1로 변경
        b.setBoardNo(boardList.size());
        boardList.add(b);

        // 출력값 결정(successPage)
        rp.successPage("insertBoard");
    }

    public void selectAllList(){
        // 게시글 전체 조회 후 전체 출력 (printAllList() 이용)
        rp.printAllList(boardList);
    }

    public void selectOneBoard(int boardNo){
        // 전체 게시물을 조회

        // 조회에 성공하면 게시물 번호와 일치하는 게시물을 리스트에서 탐색
        boolean flag = false;
        for (BoardDTO b : boardList){
            if(b.getBoardNo() == boardNo){
                // 조회 성공 시 조회수 1 증가
                b.setReadCount(b.getReadCount() + 1);
                flag = true;
//                rp.successPage("selectOne");
                System.out.println(b);
                break;
            }
        }

        if (!flag){
            // 일치하는 게시물이 없으면 에러출력
            rp.errorPage("selectOne");
        }
    }

    public void updateBoardTitle(int boardNo, String title){
        // 전체 리스트 조회

        // 일치하는 게시물 조회
        boolean flag = false;
        for (BoardDTO b : boardList){
            if(b.getBoardNo() == boardNo){
                // 조회 결과가 있는 경우 제목 수정
//                title = new InputBoard().inputBoardTitle();
                b.setBoardTitle(title);
                rp.successPage("updateTitle");
                flag = true;
                break;
            }
        }

        // 결과 출력
        if (!flag){
            rp.errorPage("updateTitle");
        }
    }

    public void updateBoardContent(int boardNo, String content){
        // 전체 리스트 조회

        // 일치하는 게시물 조회
        boolean flag = false;
        for (BoardDTO b : boardList){
            if(b.getBoardNo() == boardNo){
                // 조회 결과가 있는 경우 내용 수정
                b.setBoardTitle(content);
                flag = true;
                rp.successPage("updateTitle");
                break;
            }
        }

        // 결과 출력
        if (!flag){
            rp.errorPage("updateTitle");
        }
    }

    public void deleteBoard(int boardNo){
        // 전체 리스트 조회

        // 일치하는 게시물 조회
        boolean flag = false;
        for (int i = 0; i < boardList.size(); i++){
            if(boardList.get(i).getBoardNo() == boardNo){
                // 일치하는 게시물이 있는경우 삭제
                boardList.remove(i);
                flag = true;
                rp.successPage("deleteBoard");
                break;
            }
        }

        // 결과 출력
        if (!flag){
            rp.errorPage("deleteBoard");
        }
    }

    public void searchBoard(String title) {
        // 전체 게시물 조회

        // 검색 결과를 담을 리스트 생성
        ArrayList<BoardDTO> searchResultList = new ArrayList<>();

        // 제목을 포함하고 있는 게시물을 결과 리스트에 저장
        for (BoardDTO b : boardList){
            if (b.getBoardTitle().contains(title)){
                searchResultList.add(b);
            }
        }

        // 검색결과 리스트가 비어있는 경우 에러 출력, 비어 있지 않은 경우 결과 출력
        if (searchResultList.isEmpty()){
            rp.noSearchResult();
        } else {
            rp.printAllList(searchResultList);
        }
    }

    public void sortList(Comparator<BoardDTO> c) {
        // 리스트 전체 조회

        // 정렬
        boardList.sort(c);

        // 출력
        rp.printAllList(boardList);
    }
}
