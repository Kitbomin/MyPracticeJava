package org.example.rpg_charactor.repository;

import org.example.rpg_charactor.charactor.Charactor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharactorRepository {

    private static final CharactorRepository instance = new CharactorRepository();

    private Map<String, Charactor> charactorStorage = new HashMap<>();

    private CharactorRepository() {}

    public static CharactorRepository getInstance() {return instance;}

    // 캐릭터 저장
    public Charactor save(Charactor charactor) {
        if (charactorStorage.containsKey(charactor.getName())){
            System.out.printf(charactor.getName() + "이미 존재하는 이름입니다. 다시 입력해주세요");
            return null;
        }
        charactorStorage.put(charactor.getName(), charactor);
        return charactor;

    }

    // 캐릭터 이름 조회
    public Charactor findByName(String name){
        return charactorStorage.get(name);
    }

    // 캐릭터 전체 조회
    public List<Charactor> findAll() {
        return new ArrayList<>(charactorStorage.values());
    }

    // 캐릭터 삭제
    public boolean delete(String name) {
        if (charactorStorage.containsKey(name)) {
            System.out.printf("해당 캐릭터가 존재하지 않습니다.");
            return false;
        }
        charactorStorage.remove(name);
        return true;
    }

}
