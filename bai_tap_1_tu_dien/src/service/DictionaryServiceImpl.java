package service;

import org.springframework.stereotype.Service;

@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Override
    public String translation(String word) {
        if (word.equals("apple"))
            return "Táo";
        else if(word.equals("Dragon"))
                return "Rồng";
        return "Không tìm thấy";
    }
}
