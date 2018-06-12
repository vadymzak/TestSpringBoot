package ua.javabegin.testboot.test;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.javabegin.testboot.test.domain.Item;
import ua.javabegin.testboot.test.repository.ItemRepository;

@Component
public class MainController {

    @Autowired
    private ItemRepository itemRepository;

    void showData() {
        for (Item item: itemRepository.findAll()) {
            System.out.println("item = " + item.getName());
        } 
    }
}
