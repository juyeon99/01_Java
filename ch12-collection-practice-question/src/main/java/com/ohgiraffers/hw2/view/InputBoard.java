package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Date;
import java.util.Scanner;

public class InputBoard {
    public BoardDTO inputBoard() {
        // 게시글 등록
//        int boardNo = inputBoardNo();
        String boardTitle = inputBoardTitle();
        String boardWriter = inputBoardWriter();
        String boardContent = inputBoardContent();
        return new BoardDTO(-1,boardTitle,boardWriter,new Date(),boardContent,0);
    }

    public int inputBoardNo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("글 번호 입력: ");
        int boardNo = sc.nextInt();
        sc.nextLine();
        return boardNo;
    }

    public String inputBoardTitle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("글 제목 입력: ");
        String boardTitle = sc.nextLine();
        return boardTitle;
    }

    public String inputBoardWriter(){
        Scanner sc = new Scanner(System.in);
        System.out.print("작성자 입력: ");
        String boardWriter = sc.nextLine();
        return boardWriter;
    }

    public String inputBoardContent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("글 내용 입력 (멈추려면 exit): ");
        String boardContent = "";
        while(true){
            String line = sc.nextLine();
            if (line.equals("exit")){
                break;
            } else {
                boardContent = line + "\n";
            }
        }
        return boardContent;
    }
}
