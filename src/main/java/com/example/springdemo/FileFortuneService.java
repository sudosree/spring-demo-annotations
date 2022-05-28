package com.example.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService {

    private List<String> fortunes;

    public FileFortuneService() {
        System.out.println("FileFortuneService: Inside no args constructor");
        this.fortunes = new ArrayList<>();
    }

    @PostConstruct
    public void readFortunes() {
        System.out.println("FileFortuneService: Inside readFortunes method");
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("fortunes.txt");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                fortunes.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Random random = new Random();

    @Override
    public String getFortune() {
        int index = random.nextInt(fortunes.size());
        return fortunes.get(index);
    }
}
