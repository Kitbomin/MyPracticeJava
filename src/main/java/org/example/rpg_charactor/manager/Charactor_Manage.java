package org.example.rpg_charactor.manager;

import java.util.List;

public interface Charactor_Manage<T> {

    // C
    void addCharactor(T chractor);


    // R
    // name 으로 찾기
    T findByName(String name);

    // 전체 조회
    List<T> findAll();

    // U
    void updateCharactor(String name, T updatedCharactor);

    // D
    void deleteCharactor(String name);
}
