package com.ohgiraffers.section04.use2;

public class FileSaveProvider implements SaveProvider{
    @Override
    public boolean save(String data) {
        System.out.println("[" + data + "] 내용을 파일 저장에 실패");
        return false;
    }
}
